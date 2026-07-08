package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.coin.incentive.UgPointsBalanceChangeEvent;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124710fNF implements InterfaceC1127800fSE {
    public final DataChannel LL;
    public final LifecycleOwner LLILLJJLI;
    public final Context LLILLL;
    public final EnumC1127500fRk LLILZ = EnumC1127500fRk.UG_POINT;
    public final C01GW LLILZIL;

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
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1124720fNG LJ() {
        return (C1124720fNG) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILLJJLI, UgPointsBalanceChangeEvent.class, new AwS596S0100000_17(this, 581));
        }
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LIZ == 17) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        GiftPanelBanner giftPanelBanner;
        Gift gift = c1124680fNC.LJ;
        if (gift != null && (giftPanelBanner = gift.giftPanelBanner) != null) {
            LJ().h0(giftPanelBanner, c1124680fNC.LJFF);
            LJ().setBannerClickListener(new AwS418S0200000_17(this, c1124680fNC, 92));
        }
        return LJ();
    }

    public C1124710fNF(View view, DataChannel dataChannel, LifecycleOwner lifecycleOwner, Context context) {
        this.LL = dataChannel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = context;
        this.LLILZIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 541));
    }
}
