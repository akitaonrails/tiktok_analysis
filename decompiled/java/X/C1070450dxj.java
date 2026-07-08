package X;

import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;

/* JADX INFO: renamed from: X.0dxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070450dxj {
    public static final boolean LIZ(EnumC1070340dxY enumC1070340dxY) {
        int i = C1070460dxk.LIZ[enumC1070340dxY.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LJ();
                    }
                    throw new C1954807lC();
                }
                return C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.MLBB).LJ();
            }
            if (!SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB)) {
                return true;
            }
            return C1071540dzU.LIZIZ.LIZLLL(EnumC1070410dxf.FACEBOOK).LIZ().LIZLLL;
        }
        if (!SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_CONTACT)) {
            return true;
        }
        return C1071540dzU.LIZIZ.LIZLLL(EnumC1070410dxf.CONTACT).LIZ().LIZLLL;
    }
}
