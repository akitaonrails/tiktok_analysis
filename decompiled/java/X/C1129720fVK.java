package X;

import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* JADX INFO: renamed from: X.0fVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129720fVK {
    public static final C1129720fVK LIZ = new C1129720fVK();

    public static boolean LIZ(GiftPage giftPage) {
        InterfaceC1128210fSt interfaceC1128210fStInst;
        List<Gift> matchGameGifts;
        if (giftPage.pageType != 1 || (interfaceC1128210fStInst = GiftManager.inst()) == null || (matchGameGifts = interfaceC1128210fStInst.getMatchGameGifts(giftPage.pageType)) == null || matchGameGifts.isEmpty()) {
            return false;
        }
        return ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).kg2();
    }
}
