package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.GiftChallengeBannerChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127430fRd implements InterfaceC1127800fSE {
    public final DataChannel LL;
    public final LifecycleOwner LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.CHALLENGE;
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
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final C0T8B LJ() {
        return (C1128080fSg) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILLJJLI, GiftChallengeBannerChannel.class, new AwS596S0100000_17(this, 580));
        }
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        boolean z;
        boolean z2;
        GiftLockInfo giftLockInfo;
        boolean z3;
        GiftLockInfo giftLockInfo2;
        GiftsInfo giftsInfo;
        GiftChallengeProgress giftChallengeProgress;
        List<GiftChallengeProgress.StageData> list;
        GiftListResult giftListResult = c1124680fNC.LJI;
        if (giftListResult != null && (giftsInfo = giftListResult.giftsInfo) != null && (giftChallengeProgress = giftsInfo.giftChallengeProgress) != null && (list = giftChallengeProgress.stageData) != null && !list.isEmpty()) {
            for (GiftChallengeProgress.StageData stageData : list) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
                if (abstractC1126600fQI != null && stageData.giftId == abstractC1126600fQI.LJFF()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        GiftPanelBanner giftPanelBanner = c1124680fNC.LJII;
        if (C1128100fSi.LIZIZ(c1124680fNC.LJFF, GiftManager.inst().getGiftChallengeProgress())) {
            GiftPanelBanner giftPanelBanner2 = c1124680fNC.LJII;
            GiftChallengeProgress giftChallengeProgress2 = GiftManager.inst().getGiftChallengeProgress();
            Gift giftFindGiftById = GiftManager.inst().findGiftById(c1124680fNC.LJFF);
            if (giftFindGiftById != null && (giftLockInfo2 = giftFindGiftById.giftSubInfo) != null && giftLockInfo2.mLock) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!LIZLLL(giftPanelBanner2, giftChallengeProgress2, z3)) {
                giftPanelBanner = null;
            }
        }
        if (z) {
            GiftChallengeProgress giftChallengeProgress3 = GiftManager.inst().getGiftChallengeProgress();
            Gift giftFindGiftById2 = GiftManager.inst().findGiftById(c1124680fNC.LJFF);
            if (giftFindGiftById2 != null && (giftLockInfo = giftFindGiftById2.giftSubInfo) != null && giftLockInfo.mLock) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!LIZLLL(giftPanelBanner, giftChallengeProgress3, z2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1127430fRd(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 524));
    }

    public static boolean LIZLLL(GiftPanelBanner giftPanelBanner, GiftChallengeProgress giftChallengeProgress, boolean z) {
        String str;
        if (!z && giftChallengeProgress != null) {
            if ((giftChallengeProgress.status == 1 || giftChallengeProgress.status == 2 || giftChallengeProgress.status == 3) && giftPanelBanner != null && giftPanelBanner.bannerLynxExtra != null && (str = giftPanelBanner.bannerLynxExtra) != null && str.length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    @Override // X.InterfaceC1127800fSE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJI(X.C1124680fNC r6, X.InterfaceC1124700fNE r7, X.InterfaceC1123410fL9 r8) {
        /*
            r5 = this;
            X.0fSt r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            com.bytedance.android.livesdk.gift.model.GiftChallengeProgress r4 = r0.getGiftChallengeProgress()
            X.0ek7 r1 = r6.LJIIJ
            boolean r0 = r1 instanceof X.C1128710fTh
            if (r0 == 0) goto L37
            X.0fTh r1 = (X.C1128710fTh) r1
            r3 = 1
            if (r1 == 0) goto L37
            boolean r0 = r1.LLLLLLIL
            if (r0 != r3) goto L37
            X.0fQI<? extends X.0054> r1 = r6.LIZJ
            X.0fQI<? extends X.0054> r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L37
        L21:
            X.01GW r0 = r5.LLILZ
            java.lang.Object r2 = r0.getValue()
            X.0fSg r2 = (X.C1128080fSg) r2
            long r0 = r6.LJFF
            r2.i0(r0, r4, r3)
            X.01GW r0 = r5.LLILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            return r0
        L37:
            r3 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127430fRd.LJI(X.0fNC, X.0fNE, X.0fL9):android.view.View");
    }
}
