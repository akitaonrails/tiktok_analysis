package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127560fRq implements InterfaceC1127800fSE {
    public final DataChannel LL;
    public final Context LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.TOP2_TOP3;
    public final C01GW LLILZ;

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final C0T8B LJ() {
        return (C1124780fNM) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue() && C1129510fUz.LIZ(this.LL, c1124680fNC.LIZIZ, null) && c1124680fNC.LIZ == 1) {
            return true;
        }
        return false;
    }

    public C1127560fRq(Context context, View view, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = context;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 538));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        boolean z;
        C1124780fNM c1124780fNM = (C1124780fNM) this.LLILZ.getValue();
        String str = C1130100fVw.LIZ.LIZJ;
        if (!Intrinsics.LJFF(str, "no2_booster_popup_click") && !Intrinsics.LJFF(str, "no2_booster_effect_notice")) {
            z = false;
        } else {
            z = true;
        }
        c1124780fNM.s0(z);
        C786410Ut5.D8((C1124780fNM) this.LLILZ.getValue(), new ACListenerS152S0100000_17(this, 164));
        C1129510fUz.LIZLLL(true);
        return (View) this.LLILZ.getValue();
    }
}
