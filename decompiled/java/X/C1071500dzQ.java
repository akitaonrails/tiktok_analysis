package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;

/* JADX INFO: renamed from: X.0dzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071500dzQ extends AbstractC1071600dza {
    public final IAuthApi LIZ = AuthApiService.LIZIZ;

    @Override // X.InterfaceC1071510dzR
    public final Object LIZ(C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071240dz0> interfaceC1364105Vn) {
        if (c1071220dyy.LIZ.LIZLLL.LIZIZ) {
            C1071240dz0 c1071240dz0 = c1071220dyy.LIZIZ;
            if (!c1071240dz0.LIZ.LIZIZ) {
                return C09IC.LJJIJ(new C095D(new C1071480dzO(true, this, c1071220dyy, null)), interfaceC1364105Vn);
            }
            return C1071240dz0.LIZ(c1071240dz0, EnumC1070220dxM.SYNC);
        }
        return C09IC.LJJIJ(new C095D(new C1071480dzO(false, this, c1071220dyy, null)), interfaceC1364105Vn);
    }
}
