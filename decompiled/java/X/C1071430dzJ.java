package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;

/* JADX INFO: renamed from: X.0dzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071430dzJ extends AbstractC1071600dza {
    public final IAuthApi LIZ = AuthApiService.LIZIZ;

    @Override // X.InterfaceC1071510dzR
    public final Object LIZ(C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071240dz0> interfaceC1364105Vn) {
        if (c1071220dyy.LIZ.LIZLLL.LIZIZ) {
            if (!c1071220dyy.LIZIZ.LIZ.LIZIZ) {
                return C09IC.LJJIJ(LIZIZ(c1071220dyy, true), interfaceC1364105Vn);
            }
            C1075950e6b.LIZJ();
            new C1071700dzk(c1071220dyy).LIZLLL(null);
            return C1071240dz0.LIZ(c1071220dyy.LIZIZ, EnumC1070220dxM.SYNC);
        }
        return C09IC.LJJIJ(LIZIZ(c1071220dyy, false), interfaceC1364105Vn);
    }

    public final C095D LIZIZ(C1071220dyy c1071220dyy, boolean z) {
        boolean zLIZIZ;
        C1071400dzG.LIZ.getClass();
        boolean zLIZIZ2 = true;
        if (C1071400dzG.LIZIZ(c1071220dyy)) {
            zLIZIZ = false;
        } else if (C1071400dzG.LIZLLL(c1071220dyy)) {
            zLIZIZ = true;
        } else {
            zLIZIZ = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LIZIZ();
        }
        if (C1071400dzG.LIZ(c1071220dyy)) {
            zLIZIZ2 = false;
        } else if (!C1071400dzG.LIZJ(c1071220dyy)) {
            zLIZIZ2 = C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.CONTACT).LIZIZ();
        }
        return new C095D(new C1071440dzK(z, c1071220dyy, this, zLIZIZ, zLIZIZ2, null));
    }
}
