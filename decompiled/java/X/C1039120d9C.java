package X;

import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;

/* JADX INFO: renamed from: X.0d9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039120d9C {
    public static PreRenderWebViewBusiness LIZ(InterfaceC1039110d9B interfaceC1039110d9B) {
        C1041600dDC params;
        C1039060d96 c1039060d96;
        Integer numLIZJ;
        if (interfaceC1039110d9B != null) {
            params = interfaceC1039110d9B.getParams();
        } else {
            params = null;
        }
        if (!(params instanceof C1038730d8Z) || (c1039060d96 = (C1039060d96) params) == null || (numLIZJ = c1039060d96.LJJL.LIZJ()) == null || numLIZJ.intValue() != 7) {
            return null;
        }
        return (PreRenderWebViewBusiness) interfaceC1039110d9B.LIZIZ(PreRenderWebViewBusiness.class);
    }
}
