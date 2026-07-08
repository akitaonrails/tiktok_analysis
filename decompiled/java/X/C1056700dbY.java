package X;

import Y.ACallableS422S0100000_16;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056700dbY {
    public static final C1056700dbY LIZ = new C1056700dbY();

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_relation_e164_format_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(EnumC1074240e3q enumC1074240e3q) {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ() && C1072630e1F.LIZ.LIZJ()) {
                    C15O7.LIZJ(new ACallableS422S0100000_16(enumC1074240e3q, 4));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
