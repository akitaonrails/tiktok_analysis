package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797980wtA {
    public final C1798090wtL LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final C00YA LIZ(JSONObject jSONObject) {
        Object c098200Yq;
        try {
            InterfaceC1797990wtB interfaceC1797990wtB = this.LIZ.LIZIZ;
            String str = this.LIZIZ;
            String str2 = this.LIZJ;
            String str3 = "3.4.0-alpha.3-perm";
            if ("3.4.0-alpha.3-perm".length() == 0) {
                str3 = BuildConfig.VERSION_NAME;
            }
            c098200Yq = new C00YA(interfaceC1797990wtB.LIZ(str, str2, C2097908Jt.LIZJ(new Pair("sdk_version", str3)), jSONObject), null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C00YA(null, thM5exceptionOrNullimpl);
        }
        return (C00YA) c098200Yq;
    }

    public C1797980wtA(C1798090wtL c1798090wtL, String str, String str2) {
        this.LIZ = c1798090wtL;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
