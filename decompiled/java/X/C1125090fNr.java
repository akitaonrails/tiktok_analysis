package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS41S0200100_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125090fNr implements InterfaceC1127800fSE {
    public final DataChannel LL;
    public final Context LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.RANDOM;
    public final C01GW LLILZ;
    public GiftRandomEffectInfo LLILZIL;

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
        return (C1124840fNS) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        GiftRandomEffectInfo giftRandomEffectInfo;
        Gift giftFindGiftById;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        if (abstractC1126600fQI != null && (giftFindGiftById = GiftManager.inst().findGiftById(abstractC1126600fQI.LJFF())) != null) {
            giftRandomEffectInfo = giftFindGiftById.randomEffectInfo;
        } else {
            giftRandomEffectInfo = null;
        }
        this.LLILZIL = giftRandomEffectInfo;
        if (giftRandomEffectInfo != null) {
            return true;
        }
        return false;
    }

    public C1125090fNr(Context context, View view, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = context;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 529));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        RandomGiftPanelBanner randomGiftPanelBanner;
        C1128710fTh c1128710fTh;
        GiftRandomEffectInfo giftRandomEffectInfo = this.LLILZIL;
        if (giftRandomEffectInfo != null && (randomGiftPanelBanner = giftRandomEffectInfo.randomGiftPanelBanner) != null) {
            String str = randomGiftPanelBanner.displayText;
            if (str != null && !a0.LJJJIL(str)) {
                ((C1124840fNS) this.LLILZ.getValue()).setData(randomGiftPanelBanner);
                long j = c1124680fNC.LJFF;
                ((C1124840fNS) this.LLILZ.getValue()).setBannerClickListener(new AwS41S0200100_17(j, this, randomGiftPanelBanner, 1));
                AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
                if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && c1128710fTh.LLLLLLIL && !Intrinsics.LJFF(c1124680fNC.LIZJ, c1124680fNC.LIZIZ)) {
                    C150400hq.LIZJ(j);
                }
            } else {
                return (View) this.LLILZ.getValue();
            }
        }
        return (View) this.LLILZ.getValue();
    }
}
