package Y;

import X.C01BK;
import X.C07CQ;
import X.C0PM7;
import X.C0Q3E;
import X.C0SZ8;
import X.C0T0K;
import X.C0T1R;
import X.C0ZDN;
import X.C1110804Wc;
import X.C1483410ohn;
import X.C14S9;
import X.C14TF;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1862330yYx;
import X.C20235314Fr;
import X.C2188811AlT;
import X.C2189821An6;
import X.EnumC1864410ycJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC739770T0d;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.EventItem;
import com.ss.android.ugc.aweme.tako.router.ITakoRouterService;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes31.dex */
public class ACListenerS61S0400000_30 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS61S0400000_30 aCListenerS61S0400000_30, View view) throws JSONException {
        int iXt0;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJ2;
        IViewPagerComponentAbility iViewPagerComponentAbility2;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ2;
        IPhotoSlidesAbility iPhotoSlidesAbility2;
        Context context;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        InterfaceC739770T0d interfaceC739770T0dP2;
        String searchId;
        C20235314Fr c20235314Fr = C20235314Fr.LIZ;
        Aweme aweme = (Aweme) aCListenerS61S0400000_30.l0;
        Fragment fragment = (Fragment) aCListenerS61S0400000_30.l1;
        c20235314Fr.getClass();
        C14TF c14tf = C14TF.LIZIZ;
        Long lValueOf = null;
        if (c14tf.LJIJJ(aweme)) {
            c14tf.LJLLJ(C1483410ohn.LJLJJI().getCurrentPosition(), aweme.getAid());
        } else if (c14tf.LJLIIL(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVideoPlayTime index = ");
            int iXt02 = -1;
            if (fragment != null && (interfaceC665370Q7zLJ2 = C1578630rBN.LJ(fragment)) != null && (iViewPagerComponentAbility2 = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ2, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL2 = iViewPagerComponentAbility2.LJLIL()) != null && (interfaceC665370Q7zLIZ2 = C0T0K.LIZ(c0sz8LJLIL2)) != null && (iPhotoSlidesAbility2 = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ2, IPhotoSlidesAbility.class, null)) != null) {
                iXt0 = iPhotoSlidesAbility2.xt0();
            } else {
                iXt0 = -1;
            }
            sbLIZ.append(iXt0);
            C2188811AlT.LIZIZ(sbLIZ);
            String aid = aweme.getAid();
            if (fragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null && (interfaceC665370Q7zLIZ = C0T0K.LIZ(c0sz8LJLIL)) != null && (iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IPhotoSlidesAbility.class, null)) != null) {
                iXt02 = iPhotoSlidesAbility.xt0();
            }
            c14tf.LJJIJL(iXt02, aid);
        }
        if (C07CQ.LIZ()) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String strLIZIZ = c14tf.LJJLJ().LIZIZ((C2189821An6) aCListenerS61S0400000_30.l2);
            String aid2 = ((Aweme) aCListenerS61S0400000_30.l0).getAid();
            if (aid2 == null) {
                aid2 = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ;
            }
            C2189821An6 c2189821An6 = (C2189821An6) aCListenerS61S0400000_30.l2;
            if (c2189821An6 != null) {
                searchId = c2189821An6.getSearchId();
            } else {
                searchId = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("aweme_type", Integer.valueOf(((Aweme) aCListenerS61S0400000_30.l0).getAwemeType()));
            c1862330yYx.mobTikbotEntranceClick(strLIZIZ, "icon", aid2, null, null, null, null, null, null, null, null, null, null, linkedHashMap, searchId, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        ITakoRouterService iTakoRouterService = (ITakoRouterService) PluggableExtentionKt.pluggableSpi$default(ITakoRouterService.class, false, false, false, 14, null);
        if (iTakoRouterService != null) {
            Context context2 = ((TuxIconView) aCListenerS61S0400000_30.l3).getContext();
            Aweme aweme2 = (Aweme) aCListenerS61S0400000_30.l0;
            C2189821An6 c2189821An62 = (C2189821An6) aCListenerS61S0400000_30.l2;
            Fragment fragment2 = (Fragment) aCListenerS61S0400000_30.l1;
            String aid3 = aweme2.getAid();
            if (aid3 != null && aid3.length() > 0 && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment2)) != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) != null && (interfaceC739770T0dP2 = iPlayerComponentAbilityX32.P2()) != null) {
                lValueOf = Long.valueOf(interfaceC739770T0dP2.LJLJJI(aid3));
            }
            iTakoRouterService.LIZIZ(context2, aweme2, c2189821An62, "click_icon", lValueOf, null, null, EnumC1864410ycJ.FULL_SCREEN, null, null, null, null, null);
        }
        c14tf.LJI().LIZ(true);
        if (C1110804Wc.LIZ() && (context = ((TuxIconView) aCListenerS61S0400000_30.l3).getContext()) != null) {
            new C0ZDN(context).LIZ(0);
        }
    }

    public static final void onClick$1(ACListenerS61S0400000_30 aCListenerS61S0400000_30, View view) {
        C14S9.LIZIZ((View) aCListenerS61S0400000_30.l0, (EventItem) aCListenerS61S0400000_30.l1, (CommonLogParams) aCListenerS61S0400000_30.l2, (C01BK) aCListenerS61S0400000_30.l3);
    }

    public ACListenerS61S0400000_30(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
