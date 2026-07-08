package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;

/* JADX INFO: renamed from: X.0dzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071490dzP extends AbstractC1071600dza {
    public final IAuthApi LIZ = AuthApiService.LIZIZ;

    @Override // X.InterfaceC1071510dzR
    public final Object LIZ(C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071240dz0> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(202529);
        if (c1071220dyy.LIZ.LIZLLL.LIZIZ) {
            C1071240dz0 c1071240dz0 = c1071220dyy.LIZIZ;
            if (!c1071240dz0.LIZ.LIZIZ) {
                Object objLJJIJ = C09IC.LJJIJ(new C095D(new C1071470dzN(true, this, c1071220dyy, null)), interfaceC1364105Vn);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return objLJJIJ;
            }
            C1071240dz0 c1071240dz0LIZ = C1071240dz0.LIZ(c1071240dz0, EnumC1070220dxM.SYNC);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1071240dz0LIZ;
        }
        Object objLJJIJ2 = C09IC.LJJIJ(new C095D(new C1071470dzN(false, this, c1071220dyy, null)), interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLJJIJ2;
    }
}
