package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCardModel;
import com.bytedance.android.livesdk.game.model.GameDetailLiveInfo;
import com.bytedance.android.livesdk.game.model.GameDetailLiveTabInfo;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0z4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881850z4R implements InterfaceC1878900yzg {
    public final Map<String, String> LIZ;
    public final C1881950z4b LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final List<InterfaceC420801kM> LJ;
    public final Map<String, String> LJFF;

    @Override // X.InterfaceC1878900yzg
    public final void destroy() {
        C20441214yg.LIZIZ("GameMixPageCache", "clear");
        this.LIZLLL = true;
        for (InterfaceC420801kM interfaceC420801kM : (ArrayList) this.LJ) {
            if (!interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
        }
        ((ArrayList) this.LJ).clear();
        ((LinkedHashMap) this.LJFF).clear();
        for (Object obj : (Set) this.LIZIZ.LIZIZ.getValue()) {
            ((C098J) C23218097w.LIZ.getValue()).LIZ(obj);
            ((HashMap) C23218097w.LIZIZ.getValue()).remove(obj);
        }
    }

    public final void LIZ(GameLiveCardModel gameLiveCardModel) {
        GameDetailLiveInfo gameDetailLiveInfo;
        List<GameDetailLiveTabInfo> list;
        GameDetailLiveTabInfo gameDetailLiveTabInfo;
        int iIntValue;
        Integer numLJIIJJI;
        if (gameLiveCardModel != null && (gameDetailLiveInfo = gameLiveCardModel.liveInfo) != null && (list = gameDetailLiveInfo.liveTabs) != null && (gameDetailLiveTabInfo = (GameDetailLiveTabInfo) C13LP.LJJJLL(list)) != null) {
            C1881950z4b c1881950z4b = this.LIZIZ;
            String strValueOf = String.valueOf(((LinkedHashMap) this.LJFF).get("game_tag_id"));
            String strValueOf2 = String.valueOf(((LinkedHashMap) this.LJFF).get("author_id"));
            String str = (String) ((LinkedHashMap) this.LJFF).get(Scene.SCENE_SERVICE);
            if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 99;
            }
            c1881950z4b.requestLiveFeed(strValueOf, strValueOf2, iIntValue, 0, String.valueOf(((LinkedHashMap) this.LJFF).get("game_id")), gameDetailLiveTabInfo.tabType, gameDetailLiveTabInfo.refreshReqFrom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1881850z4R(java.lang.String r31, java.util.Map r32) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881850z4R.<init>(java.lang.String, java.util.Map):void");
    }
}
