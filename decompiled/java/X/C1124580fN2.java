package X;

import Y.ACListenerS86S1100000_17;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS133S1200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fN2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124580fN2 implements InterfaceC1127800fSE {
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.TAB;
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
        if (c1124680fNC.LJIIIIZZ != null) {
            return true;
        }
        return false;
    }

    public C1124580fN2(Context context, View view, DataChannel dataChannel) {
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 534));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        String str;
        C1128710fTh c1128710fTh;
        GiftPanelBanner giftPanelBanner = c1124680fNC.LJIIIIZZ;
        if (C500260Jjc.LJIIZILJ(this.LLILLJJLI)) {
            str = "anchor";
        } else {
            str = "user";
        }
        if (giftPanelBanner != null) {
            ((C1124780fNM) this.LLILZ.getValue()).setData(giftPanelBanner);
            C1124780fNM c1124780fNM = (C1124780fNM) this.LLILZ.getValue();
            String str2 = giftPanelBanner.schemaUrl;
            AwS133S1200000_17 awS133S1200000_17 = new AwS133S1200000_17(this, giftPanelBanner, str, 6);
            c1124780fNM.getClass();
            C786410Ut5.D8(c1124780fNM, new ACListenerS86S1100000_17(awS133S1200000_17, str2, 3));
            AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
            if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && c1128710fTh.LLLLLLIL && !Intrinsics.LJFF(c1124680fNC.LIZJ, c1124680fNC.LIZIZ)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_show");
                c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                c474500IjALIZ.LJJII("gift_bar", "show_entrance");
                c474500IjALIZ.LJJII(str, "user_type");
                C518420KUu.LIZIZ(c474500IjALIZ, this.LLILLJJLI);
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                    c474500IjALIZ.LIZ();
                } else {
                    c474500IjALIZ.LJJIJLIJ();
                    c474500IjALIZ.LJJIJIL();
                    c474500IjALIZ.LJJIJL();
                }
            }
        }
        return (View) this.LLILZ.getValue();
    }
}
