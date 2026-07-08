package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204831BQz implements InterfaceC1059350dfp {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ C1BR6 LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Executor LIZLLL;
    public final /* synthetic */ C2204651BQh LJ;

    @Override // X.InterfaceC1059350dfp
    public final void LIZ(final String str) {
        final boolean z;
        C1BR8 c1br8 = C2204711BQn.LJIIIIZZ;
        if (c1br8.LIZ() != null && c1br8.LIZ().LIZ(C1BR4.PERMISSION_CONFIG_SYNC_PARSE_SWITCH)) {
            z = true;
        } else {
            z = false;
        }
        Runnable runnable = new Runnable() { // from class: X.1BQw
            public final void LIZ() {
                if (this.LLILLL.LIZ != null) {
                    C2204811BQx c2204811BQx = new C2204811BQx();
                    c2204811BQx.LIZJ(Boolean.valueOf(!TextUtils.isEmpty(str)), "value");
                    c2204811BQx.LIZ("label_permission_storage", this.LLILLL.LIZ);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C2204831BQz c2204831BQz = this.LLILLL;
                    c2204831BQz.LJ.LIZLLL(c2204831BQz.LIZ, jSONObject);
                    if (!z || this.LLILLL.LIZIZ.LIZ() == null) {
                        return;
                    }
                    ((C1BRK) this.LLILLL.LIZIZ.LIZ()).LIZ(this.LLILLL.LIZJ, jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Parse configurations failed, local storage content: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PermissionConfig@f799.<init>$1$onValue$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PermissionConfig@f799.<init>$1$onValue$1");
            }
        };
        if (z) {
            runnable.run();
        } else {
            this.LIZLLL.execute(runnable);
        }
    }

    public C2204831BQz(C2204651BQh c2204651BQh, List list, C1BR9 c1br9, String str, Executor executor) {
        this.LJ = c2204651BQh;
        this.LIZ = list;
        this.LIZIZ = c1br9;
        this.LIZJ = str;
        this.LIZLLL = executor;
    }
}
