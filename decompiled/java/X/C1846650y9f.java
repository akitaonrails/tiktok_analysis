package X;

import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0y9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846650y9f implements InterfaceC1846720y9m<C1119430fEj> {
    public final LinearLayout LIZ;
    public final C1846630y9d LIZIZ;
    public final C1324720kZq LIZJ;
    public final C1846630y9d LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC1846720y9m
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        String strLJIIL = C497740JfY.LJIIL(this.LJ, 99, '*', 99, Integer.valueOf(LivePopularityRankingBonusTimeConfig.INSTANCE.getValue().pointMultiple));
        int iLJJIZ = a0.LJJIZ(strLJIIL, '*', 0, false, 6);
        if (iLJJIZ >= 0) {
            this.LIZIZ.setText(strLJIIL.substring(0, iLJJIZ));
            this.LIZLLL.setText(strLJIIL.substring(iLJJIZ + 1, strLJIIL.length()));
        }
        C1846800y9u.LJIIJJI(this.LIZ);
        this.LIZIZ.setText("");
        this.LIZLLL.setText("");
        return new Pair<>(Integer.valueOf(this.LIZ.getMeasuredWidth()), Integer.valueOf(this.LIZ.getMeasuredHeight()));
    }

    public final void LIZJ() {
        String strLJIIL;
        int iLJJIZ;
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        LivePopularityRankingBonusTimeConfig livePopularityRankingBonusTimeConfig = LivePopularityRankingBonusTimeConfig.INSTANCE;
        Gift giftFindGiftById = iGiftService.findGiftById(livePopularityRankingBonusTimeConfig.getValue().giftId);
        if (giftFindGiftById == null || (iLJJIZ = a0.LJJIZ((strLJIIL = C497740JfY.LJIIL(this.LJ, giftFindGiftById.diamondCount, '*', Integer.valueOf(giftFindGiftById.diamondCount), Integer.valueOf(livePopularityRankingBonusTimeConfig.getValue().pointMultiple))), '*', 0, false, 6)) < 0) {
            return;
        }
        this.LIZIZ.setText(strLJIIL.substring(0, iLJJIZ));
        this.LIZLLL.setText(strLJIIL.substring(iLJJIZ + 1, strLJIIL.length()));
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel imageModel = giftFindGiftById.icon;
        c0jbnLIZ.LIZJ(imageModel != null ? imageModel.getUrls() : null).LJJI(this.LIZJ);
    }

    public C1846650y9f(C1091250eVH c1091250eVH) {
        int i;
        LinearLayout linearLayout = (LinearLayout) c1091250eVH.findViewById(R.id.c8o);
        this.LIZ = linearLayout;
        this.LIZIZ = (C1846630y9d) linearLayout.findViewById(R.id.c8l);
        this.LIZJ = (C1324720kZq) linearLayout.findViewById(R.id.c8m);
        this.LIZLLL = (C1846630y9d) linearLayout.findViewById(R.id.c8n);
        if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
            i = 2131755933;
        } else {
            i = 2131755932;
        }
        this.LJ = i;
    }

    @Override // X.InterfaceC1846720y9m
    public final /* bridge */ /* synthetic */ void LIZIZ(C1119420fEi c1119420fEi) {
        LIZJ();
    }
}
