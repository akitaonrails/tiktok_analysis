package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;

/* JADX INFO: renamed from: X.0YyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891480YyA implements C0ZCG {
    @Override // X.C0ZCG
    public final long getCurrentUid() {
        return C461720I8s.LIZJ();
    }

    @Override // X.C0ZCG
    public final void LJFF() {
    }

    @Override // X.C0ZCG
    public final String LIZ(String str) {
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        if (iIMContactUtilServiceLIZ != null) {
            return iIMContactUtilServiceLIZ.LJIIJ(str);
        }
        return null;
    }

    @Override // X.C0ZCG
    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        return C0ZDX.LJJJJIZL(c869590Y9l);
    }

    @Override // X.C0ZCG
    public final String LIZLLL(String str) {
        InterfaceC897380ZIi.LIZIZ.getClass();
        return String.valueOf(C897370ZIh.LIZ().LJIIJJI().LIZLLL(str));
    }

    @Override // X.C0ZCG
    public final String LJI(String str) {
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        return String.valueOf(C0ZE8.LIZJ(str));
    }

    @Override // X.C0ZCG
    public final IMUser LJ(String str, String str2) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIIL(str, str2, "im_local_db");
    }

    @Override // X.C0ZCG
    public final Object LIZIZ(String str, String str2, C0ZCE c0zce) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIJ(str, str2, c0zce);
    }
}
