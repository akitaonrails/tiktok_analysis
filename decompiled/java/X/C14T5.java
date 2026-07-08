package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.router.ITakoRouterService;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.14T5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14T5 {
    public static final void LIZIZ(Aweme aweme, C2189821An6 c2189821An6) {
        String searchId;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String strLIZIZ = C14TF.LIZIZ.LJJLJ().LIZIZ(c2189821An6);
        String aid = aweme.getAid();
        if (c2189821An6 != null) {
            searchId = c2189821An6.getSearchId();
        } else {
            searchId = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
        c1862330yYx.mobTikbotEntranceShow(strLIZIZ, "icon", aid, searchId, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, false);
    }

    public static final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Context context, C2189821An6 c2189821An6, Aweme aweme) {
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        int iFj1;
        if (c2189821An6 == null || aweme == null) {
            return;
        }
        Long lValueOf = null;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null) {
            C14TF c14tf = C14TF.LIZIZ;
            if (c14tf.LJIJJ(aweme)) {
                c14tf.LJLLJ(iPlayerComponentAbilityX32.getPlayerManager().getCurrentPosition(), aweme.getAid());
            } else if (c14tf.LJLIIL(aweme)) {
                String aid = aweme.getAid();
                IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPhotoModeAbility.class, null);
                if (iPhotoModeAbility != null) {
                    iFj1 = iPhotoModeAbility.fj1();
                } else {
                    iFj1 = -1;
                }
                c14tf.LJJIJL(iFj1, aid);
            }
            if (C07CQ.LIZ()) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String strLIZIZ = c14tf.LJJLJ().LIZIZ(c2189821An6);
                String aid2 = aweme.getAid();
                String searchId = c2189821An6.getSearchId();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
                c1862330yYx.mobTikbotEntranceClick(strLIZIZ, "icon", aid2, null, null, null, null, null, null, null, null, null, null, linkedHashMap, searchId, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            String strLIZIZ2 = c14tf.LJJLJ().LIZIZ(c2189821An6);
            if (c14tf.LJIIIIZZ(context, c2189821An6, strLIZIZ2, "click_icon")) {
                c14tf.LJZI(context, null, strLIZIZ2, "click_icon", false, null, "full_screen", null);
            } else {
                ITakoRouterService iTakoRouterService = (ITakoRouterService) PluggableExtentionKt.pluggableSpi$default(ITakoRouterService.class, false, false, false, 14, null);
                if (iTakoRouterService != null) {
                    InterfaceC739770T0d interfaceC739770T0dP2 = iPlayerComponentAbilityX32.P2();
                    if (interfaceC739770T0dP2 != null) {
                        lValueOf = Long.valueOf(interfaceC739770T0dP2.LJLJJI(aweme.getAid()));
                    }
                    iTakoRouterService.LIZIZ(context, aweme, c2189821An6, "click_icon", lValueOf, null, null, EnumC1864410ycJ.FULL_SCREEN, null, null, null, null, null);
                }
            }
            if (C1110804Wc.LIZ()) {
                new C0ZDN(context).LIZ(0);
            }
        }
    }
}
