package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0C7U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C7U {
    public final Map<String, Object> LIZ = new LinkedHashMap();
    public final String LIZIZ = "configurationFetch";
    public final String LIZJ = "abmock_group_info";
    public final String LIZLLL = "group_hash";
    public final String LJ = "group_key_";
    public final String LJFF = "fetch_request_type";
    public final String LJI = "fetch_ab_request_code";
    public final String LJII = "expired_vids";
    public final String LJIIIIZZ = "user_data_scope_end";
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6317));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 563));

    public final Keva LIZIZ() {
        return (Keva) this.LJIIJ.getValue();
    }

    public final void LIZ() {
        LIZIZ().erase(this.LIZLLL);
        LIZIZ().erase(this.LJIIIIZZ);
        C0CJ1 c0cj1 = (C0CJ1) this.LJIIIZ.getValue();
        ((Keva) c0cj1.LJII.getValue()).erase(c0cj1.LIZJ);
    }

    public final Set<String> LIZJ(int i) {
        String str = this.LIZIZ;
        Set<String> setLLIIIZ = null;
        try {
            Keva kevaLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJ);
            sbLIZ.append(i);
            String string = kevaLIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            if (string != null) {
                setLLIIIZ = C13LP.LLIIIZ(a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6));
                return setLLIIIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append("");
            C0C46.LIZIZ(str, new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
        return setLLIIIZ;
    }
}
