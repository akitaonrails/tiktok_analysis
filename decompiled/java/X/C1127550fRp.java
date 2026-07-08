package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127550fRp implements InterfaceC1127800fSE, InterfaceC1127990fSX {
    public final DataChannel LL;
    public final Function0<String> LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.MUSIC_GIFT;
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
    public final void LJIIIIZZ() {
        C1142070fpF.LIZ.getClass();
        C1142070fpF.LJIIJJI = true;
        IMusicGiftService iMusicGiftServiceLJIILIIL = C1142070fpF.LJIILIIL();
        if (iMusicGiftServiceLJIILIIL != null) {
            iMusicGiftServiceLJIILIIL.HB2(C1142070fpF.LJIIL);
        }
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
        C1142070fpF.LIZ.getClass();
        C1142070fpF.LJIIJJI = false;
        C1142070fpF.LJIL();
        LJ().setPlaybackState(false);
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final C1132800faI LJ() {
        return (C1132800faI) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
        LJ().setPlaybackState(false);
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127990fSX
    public final void LIZLLL(C1142020fpA c1142020fpA) {
        LJ().i0(c1142020fpA);
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        ImageModel imageModelLJII;
        Gift gift = c1124680fNC.LJ;
        GiftListResult giftListResult = c1124680fNC.LJI;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        if (abstractC1126600fQI != null) {
            imageModelLJII = abstractC1126600fQI.LJFF;
            if (imageModelLJII == null) {
                imageModelLJII = abstractC1126600fQI.LJII();
            }
        } else {
            imageModelLJII = null;
        }
        if (C1136700fga.LIZ(gift, giftListResult, imageModelLJII) != null) {
            return true;
        }
        return false;
    }

    public C1127550fRp(View view, DataChannel dataChannel, AwS561S0100000_17 awS561S0100000_17) {
        this.LL = dataChannel;
        this.LLILLJJLI = awS561S0100000_17;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 526));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        ImageModel imageModelLJII;
        Gift gift = c1124680fNC.LJ;
        GiftListResult giftListResult = c1124680fNC.LJI;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        if (abstractC1126600fQI != null) {
            imageModelLJII = abstractC1126600fQI.LJFF;
            if (imageModelLJII == null) {
                imageModelLJII = abstractC1126600fQI.LJII();
            }
        } else {
            imageModelLJII = null;
        }
        C1132810faJ c1132810faJLIZ = C1136700fga.LIZ(gift, giftListResult, imageModelLJII);
        if (c1132810faJLIZ == null) {
            return null;
        }
        LJ().setOnBannerClickListener(new AwS383S0200000_17(this, c1124680fNC, 105));
        LJ().setData(c1132810faJLIZ);
        return LJ();
    }
}
