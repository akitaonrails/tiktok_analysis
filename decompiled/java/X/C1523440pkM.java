package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523440pkM {
    public final Map<String, C1523430pkL> LIZ = new LinkedHashMap();

    public final void LIZIZ(String str, Map<String, ? extends Object> map) {
        String str2;
        String str3;
        if (C1507560pKk.LIZ) {
            C1523430pkL c1523430pkL = (C1523430pkL) ((LinkedHashMap) this.LIZ).get(str);
            if (c1523430pkL != null && (str3 = c1523430pkL.LIZIZ) != null) {
                C23250099c.LIZLLL(C1507560pKk.LIZIZ, null, null, new C0CX0(str3, new HashMap(map), null), 3);
                return;
            }
            return;
        }
        C1523430pkL c1523430pkL2 = (C1523430pkL) ((LinkedHashMap) this.LIZ).get(str);
        if (c1523430pkL2 != null && (str2 = c1523430pkL2.LIZIZ) != null) {
            C1523590pkb.LIZ.getClass();
            C1523590pkb.LJFF(str2, map);
        }
    }

    public final void LIZ(String str, String str2, Function0<Unit> function0) {
        if (C1507560pKk.LIZ) {
            C1523430pkL c1523430pkLRemove = this.LIZ.remove(str);
            if (c1523430pkLRemove == null) {
                C1507560pKk.LIZ();
                return;
            }
            c1523430pkLRemove.LIZJ.LIZIZ(null);
            c1523430pkLRemove.LJIIIZ = str2;
            c1523430pkLRemove.LJII = System.currentTimeMillis();
            if (function0 != null) {
                try {
                    function0.invoke();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    new AwS546S0100000_2(e, 1115);
                    C1507560pKk.LIZ();
                    return;
                }
            }
            C23250099c.LIZLLL(C1507560pKk.LIZIZ, null, null, new C1523450pkN(c1523430pkLRemove, null), 3);
            return;
        }
        C1523430pkL c1523430pkLRemove2 = this.LIZ.remove(str);
        if (c1523430pkLRemove2 == null) {
            C1507560pKk.LIZ();
            return;
        }
        try {
            c1523430pkLRemove2.LIZJ.LIZIZ(null);
            c1523430pkLRemove2.LJIIIZ = str2;
            c1523430pkLRemove2.LJII = System.currentTimeMillis();
            if (function0 != null) {
                function0.invoke();
            }
            c1523430pkLRemove2.LIZ();
            String str3 = c1523430pkLRemove2.LIZIZ;
            if (str3 != null) {
                C1523590pkb c1523590pkb = C1523590pkb.LIZ;
                Uri uri = c1523430pkLRemove2.LIZ;
                c1523590pkb.getClass();
                C1523590pkb.LIZLLL(uri, str3, "update_type", false, str2, false);
                Uri uri2 = c1523430pkLRemove2.LIZ;
                Long lValueOf = Long.valueOf(c1523430pkLRemove2.LJII);
                c1523590pkb.getClass();
                C1523590pkb.LIZLLL(uri2, str3, "update_data_time", false, lValueOf, false);
            }
            new AwS567S0100000_23(c1523430pkLRemove2, 183);
            C1507560pKk.LIZ();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            new AwS546S0100000_2(e2, 1114);
            C1507560pKk.LIZ();
        }
    }
}
