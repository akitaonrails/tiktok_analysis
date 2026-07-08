package X;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WYD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYD {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final Function0<C0WYK> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final InterfaceC1493105sv LIZLLL;
    public final Function0<Keva> LJ;
    public final C01GW LJFF;

    public C0WYD(String str, Function0 function0, Function0 function02) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C0WYF c0wyf = new C0WYF();
        this.LIZ = str;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = interfaceC1493505szLIZIZ;
        this.LJ = c0wyf;
        this.LJFF = C452501pT.LIZIZ(new C0WYE(this));
    }

    public final boolean LIZ(Map<String, String> map, Exception exc, boolean z) {
        boolean z2;
        C0WYK c098200Yq;
        Throwable cause = exc;
        while (true) {
            boolean z3 = true;
            z2 = false;
            if (cause != null) {
                if (cause instanceof SQLiteDatabaseCorruptException) {
                    boolean z4 = ((Keva) this.LJFF.getValue()).getBoolean("did_tried_recover", false);
                    map.put("did_tried_recover", String.valueOf(z4));
                    if (!z4) {
                        Function0<Unit> function0 = this.LIZJ;
                        if (function0 != null) {
                            try {
                                function0.invoke();
                                map.put("result", "success");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                map.put("result", "fail");
                                map.putAll(C0OGH.LIZ(e));
                            }
                        }
                        ((Keva) this.LJFF.getValue()).storeBoolean("did_tried_recover", true);
                    } else {
                        z3 = false;
                    }
                    z2 = z3;
                } else {
                    cause = cause.getCause();
                }
            } else if (exc instanceof SQLiteFullException) {
                try {
                    c098200Yq = this.LIZIZ.invoke();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C0WYK c0wyk = new C0WYK();
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = c0wyk;
                }
                C0WYK c0wyk2 = (C0WYK) c098200Yq;
                map.put("appStorageSize", String.valueOf(c0wyk2.LJ));
                map.put("availableExternalSize", String.valueOf(c0wyk2.LIZ));
                map.put("availableInternalSize", String.valueOf(c0wyk2.LIZJ));
                map.put("totalExternalSize", String.valueOf(c0wyk2.LIZIZ));
                map.put("totalInternalSize", String.valueOf(c0wyk2.LIZLLL));
                map.put("isExternalStorage", String.valueOf(c0wyk2.LJII));
            }
        }
        map.put("table", this.LIZ);
        if (z2) {
            this.LIZLLL.sendEvent("im_contact_corruption", map);
            return z2;
        }
        if (z) {
            map.putAll(C0OGH.LIZ(exc));
        }
        this.LIZLLL.sendEvent("im_contact_error", map);
        return z2;
    }
}
