package X;

import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0KMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516310KMr extends AbstractC516340KMu<CreateSubOrderResult> {
    public final /* synthetic */ C516440KNe LIZ;

    public C516310KMr(C516440KNe c516440KNe) {
        this.LIZ = c516440KNe;
    }

    public final C11NZ<C470590Icr<CreateSubOrderResult>> LJ(C0KNX c0knx) {
        C480460Ism.LIZ().getClass();
        C0KJK c0kjk = (C0KJK) c0knx;
        return C510380Jzw.LJIILJJIL(((IapApi) C480460Ism.LIZLLL(IapApi.class)).subscribeOrder(c0kjk.LJIIIZ, c0kjk.LJIJJ, c0kjk.LJIJJLI, TimeZone.getDefault().getID(), c0kjk.LJIIZILJ, c0kjk.LJJ, Boolean.valueOf(c0kjk.LJIIJ), c0kjk.LJIILLIIL, c0kjk.LJIILL, C0KKY.LIZ(true), c0kjk.LJJIIJ, c0kjk.LJJIIJZLJL, this.LIZ.LIZIZ.LIZIZ), EnumC510330Jzr.GENERAL, c0knx.LIZLLL, "sub/contract/create", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0());
    }
}
