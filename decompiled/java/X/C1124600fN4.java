package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.CampaignProgressChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124600fN4 implements InterfaceC1127800fSE {
    public final DataChannel LL;
    public final LifecycleOwner LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.CAMPAIGN;
    public final C01GW LLILZ;
    public GiftCampaignProgress LLILZIL;
    public AwS226S0300000_17 LLILZLL;
    public LifecycleOwner LLIZ;

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
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final C1117860fCC LJ() {
        return (C1117860fCC) this.LLILZ.getValue();
    }

    public final void LJIIJJI() {
        DataChannel dataChannel;
        AwS226S0300000_17 awS226S0300000_17 = this.LLILZLL;
        if (awS226S0300000_17 != null && (dataChannel = this.LL) != null) {
            dataChannel.GQ2(this.LLIZ, CampaignProgressChannel.class, awS226S0300000_17);
        }
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
        LJIIJJI();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
        LJIIJJI();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        Gift.GiftSeriesInfo giftSeriesInfo;
        Gift gift = c1124680fNC.LJ;
        if (gift == null || (giftSeriesInfo = gift.seriesInfo) == null || !giftSeriesInfo.enabled || LIZLLL(c1124680fNC, c1124680fNC.LJFF, C158B.LIZ()) == null) {
            return false;
        }
        return true;
    }

    public C1124600fN4(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 520));
    }

    public final GiftCampaignProgress LIZLLL(C1124680fNC c1124680fNC, long j, long j2) {
        GiftCampaignProgress giftCampaignProgress;
        GiftCampaignProgress giftCampaignProgress2;
        GiftsInfo giftsInfo;
        GiftsInfo giftsInfo2;
        GiftCampaignProgress[] giftCampaignProgressArr = new GiftCampaignProgress[3];
        giftCampaignProgressArr[0] = this.LLILZIL;
        GiftListResult giftListResult = c1124680fNC.LJI;
        Object obj = null;
        if (giftListResult != null && (giftsInfo2 = giftListResult.giftsInfo) != null) {
            giftCampaignProgress = giftsInfo2.giftCampaignProgress;
        } else {
            giftCampaignProgress = null;
        }
        giftCampaignProgressArr[1] = giftCampaignProgress;
        GiftListResult giftListResult2 = GiftManager.inst().getGiftListResult();
        if (giftListResult2 != null && (giftsInfo = giftListResult2.giftsInfo) != null) {
            giftCampaignProgress2 = giftsInfo.giftCampaignProgress;
        } else {
            giftCampaignProgress2 = null;
        }
        giftCampaignProgressArr[2] = giftCampaignProgress2;
        Iterator it2 = ((ArrayList) C13LQ.LJIJI(giftCampaignProgressArr)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            GiftCampaignProgress giftCampaignProgress3 = (GiftCampaignProgress) next;
            C249200xm.LIZ.getClass();
            if (giftCampaignProgress3 != null && j > 0 && C249200xm.LIZIZ(giftCampaignProgress3, j, Long.valueOf(j2)) != null) {
                obj = next;
                break;
            }
        }
        return (GiftCampaignProgress) obj;
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        long j;
        long jLIZ;
        GiftCampaignProgress giftCampaignProgressLIZLLL;
        LifecycleOwner lifecycleOwner;
        if (c1124680fNC.LJ == null || (giftCampaignProgressLIZLLL = LIZLLL(c1124680fNC, (j = c1124680fNC.LJFF), (jLIZ = C158B.LIZ()))) == null) {
            return null;
        }
        this.LLILZIL = giftCampaignProgressLIZLLL;
        if (!LJ().e0(giftCampaignProgressLIZLLL, j, Long.valueOf(jLIZ))) {
            LJIIJJI();
            return null;
        }
        LJIIJJI();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (lifecycleOwner = this.LLILLJJLI) != null) {
            AwS226S0300000_17 awS226S0300000_17 = new AwS226S0300000_17(this, c1124680fNC, interfaceC1124700fNE, 14);
            this.LLILZLL = awS226S0300000_17;
            this.LLIZ = lifecycleOwner;
            dataChannel.BQ2(lifecycleOwner, CampaignProgressChannel.class, awS226S0300000_17);
        }
        C1117860fCC c1117860fCCLJ = LJ();
        C249200xm.LIZ.getClass();
        c1117860fCCLJ.setCampaignPageUrl(C249200xm.LIZ(giftCampaignProgressLIZLLL, j, jLIZ));
        return LJ();
    }
}
