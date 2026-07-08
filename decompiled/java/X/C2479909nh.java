package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2479909nh {
    public static long LIZ() {
        long jLongValue = 0;
        try {
            C844470XAv.LIZ.getClass();
            Iterator it2 = a0.LJJLIIIJILLIZJL(C844470XAv.LJFF(), new String[]{e3.d}, 0, 6).iterator();
            while (it2.hasNext()) {
                jLongValue = CastIntegerProtector.valueOf((String) it2.next()).longValue() + (((long) 100) * jLongValue);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getVersionCode error t = ");
            sbLIZ.append(th.getMessage());
            C1706630uVp.LIZJ("AME-editor", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("versionCode = ");
        sbLIZ2.append(jLongValue);
        sbLIZ2.append(' ');
        C1706630uVp.LIZ("AME-editor", C2188811AlT.LIZIZ(sbLIZ2));
        return jLongValue;
    }

    public static String LIZIZ() {
        C844470XAv.LIZ.getClass();
        String strLJFF = C844470XAv.LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("versionName = ");
        sbLIZ.append(strLJFF);
        sbLIZ.append(' ');
        C1706630uVp.LIZ("AME-editor", C2188811AlT.LIZIZ(sbLIZ));
        return strLJFF;
    }
}
