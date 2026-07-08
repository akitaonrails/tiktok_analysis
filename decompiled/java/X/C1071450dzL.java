package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071450dzL extends AbstractC1071600dza {
    public final IAuthApi LIZ = AuthApiService.LIZIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(460));

    @Override // X.InterfaceC1071510dzR
    public final Object LIZ(C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071240dz0> interfaceC1364105Vn) {
        if (c1071220dyy.LIZ.LIZLLL.LIZIZ) {
            if (!c1071220dyy.LIZIZ.LIZ.LIZIZ) {
                return C09IC.LJJIJ(new C095D(new C1071460dzM(true, this, c1071220dyy, null)), interfaceC1364105Vn);
            }
            new C1071700dzk(c1071220dyy).LIZLLL(null);
            return C1071240dz0.LIZ(c1071220dyy.LIZIZ, EnumC1070220dxM.SYNC);
        }
        return C09IC.LJJIJ(new C095D(new C1071460dzM(false, this, c1071220dyy, null)), interfaceC1364105Vn);
    }
}
