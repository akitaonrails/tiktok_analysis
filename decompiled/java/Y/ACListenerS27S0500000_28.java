package Y;

import X.C013C;
import X.C036E;
import X.C0OBG;
import X.C10G1;
import X.C10I4;
import X.C10I5;
import X.C10IR;
import X.C10LL;
import X.C1157730gEV;
import X.C1260910iuv;
import X.C1389890mGx;
import X.C1843500y4a;
import X.C1876860ywO;
import X.C1915720zx4;
import X.C19216910Fz;
import X.C19218810Gs;
import X.C19EG;
import X.C1E7L;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2276131E7f;
import X.C2344009Gk;
import X.C238400w2;
import X.C688120Qyw;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1778900wOO;
import X.EnumC1876780ywG;
import X.EnumC1915430zwb;
import X.EnumC683800Qry;
import X.InterfaceC1915880zxK;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;
import com.ss.android.ugc.aweme.lemon.profile.Lemon8PopupForContentSyncFragmentV2;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS27S0500000_28 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS27S0500000_28 aCListenerS27S0500000_28, View view) {
        int iIndexOf;
        if (C0OBG.LIZ(500L, (C10LL) aCListenerS27S0500000_28.l0)) {
            int i = C2187451AjH.LIZ;
            return;
        }
        int i2 = C2187451AjH.LIZ;
        Function0<Unit> function0 = ((C10LL) aCListenerS27S0500000_28.l0).LLJJL;
        if (function0 != null) {
            function0.invoke();
        }
        C2276131E7f.LIZIZ(C1E7L.BIG_CARD, new C1157730gEV(EnumC1778900wOO.PASSIVE, false));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C10LL) aCListenerS27S0500000_28.l0).getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam("enter_from", ((C10LL) aCListenerS27S0500000_28.l0).LLJJJJJIL);
        smartRouteBuildRoute.withParam("video_from", "[UserCard]_DETAIL");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((Aweme) aCListenerS27S0500000_28.l1).getAid());
        smartRouteBuildRoute.withParam("userid", ((User) aCListenerS27S0500000_28.l2).getUid());
        smartRouteBuildRoute.withParam("sec_userid", ((User) aCListenerS27S0500000_28.l2).getSecUid());
        smartRouteBuildRoute.withParam("is_show_follow_btn_on_bottom", true);
        smartRouteBuildRoute.withParam("refer", "others_homepage");
        smartRouteBuildRoute.withParam("previous_page", ((C10LL) aCListenerS27S0500000_28.l0).LLJJJJJIL);
        smartRouteBuildRoute.withParam("matched_friend_strcut", ((User) aCListenerS27S0500000_28.l2).getMatchedFriendStruct());
        smartRouteBuildRoute.withParam("is_card", true);
        smartRouteBuildRoute.withParam("is_big_card", true);
        smartRouteBuildRoute.withParam("follow_recommned_enter_from", ((C10LL) aCListenerS27S0500000_28.l0).LLJJJJJIL);
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.CARD;
        smartRouteBuildRoute.withParam("scene_type", enumC1260920iuw.getType());
        smartRouteBuildRoute.withParam("enter_method", "click_follow_card");
        smartRouteBuildRoute.open();
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(((C10LL) aCListenerS27S0500000_28.l0).LLJJJJJIL);
        c1260910iuv.LJJLIIIJILLIZJL = enumC1260920iuw;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.CLICK_COVER;
        String uid = ((User) aCListenerS27S0500000_28.l2).getUid();
        if (uid == null) {
            uid = "";
        }
        c1260910iuv.LJJLIIJ = uid;
        c1260910iuv.LJJJJZI((User) aCListenerS27S0500000_28.l2);
        c1260910iuv.LJLJI = true;
        c1260910iuv.LJIILJJIL();
        C10LL c10ll = (C10LL) aCListenerS27S0500000_28.l0;
        List<UserWithAweme> list = c10ll.LLJJJJ;
        if (list != null) {
            iIndexOf = list.indexOf(c10ll.LLJJJJLIIL);
        } else {
            iIndexOf = -1;
        }
        C19218810Gs.LIZIZ(iIndexOf, (User) aCListenerS27S0500000_28.l2, "enter_profile_video");
        C238400w2 c238400w2 = (C238400w2) aCListenerS27S0500000_28.l3;
        long j = c238400w2.element + 1;
        c238400w2.element = j;
        TuxTextView tuxTextView = (TuxTextView) aCListenerS27S0500000_28.l4;
        C10LL c10ll2 = (C10LL) aCListenerS27S0500000_28.l0;
        String strLIZIZ = C1843500y4a.LIZIZ(j);
        c10ll2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append("  ");
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onClick$1(ACListenerS27S0500000_28 aCListenerS27S0500000_28, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                int i = C10IR.LIZ[((AwemeStatus.MappedMuteStripStatus) aCListenerS27S0500000_28.l1).ordinal()];
                if ((i != 1 && i != 2 && i != 3) || !C10I4.LIZ()) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C688120Qyw) aCListenerS27S0500000_28.l0).LIZ, "//aweme/detail");
                    smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((Aweme) aCListenerS27S0500000_28.l4).getAid());
                    smartRouteBuildRoute.withParam("mute_strip_banner_enter_method", "banner");
                    smartRouteBuildRoute.withParam("enter_from", "personal_homepage");
                    smartRouteBuildRoute.open();
                    ((C10I5) aCListenerS27S0500000_28.l2).LLIZLLLIL = "click";
                    ((C20515215Pi) aCListenerS27S0500000_28.l3).LIZIZ();
                    return;
                }
                C19EG c19egLIZIZ = ((C688120Qyw) aCListenerS27S0500000_28.l0).LIZIZ();
                if (c19egLIZIZ != null) {
                    ((IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class)).LIZ(c19egLIZIZ, ((Aweme) aCListenerS27S0500000_28.l4).getAid(), "personal_homepage", "banner");
                }
                ((C10I5) aCListenerS27S0500000_28.l2).LLIZLLLIL = "click";
                ((C20515215Pi) aCListenerS27S0500000_28.l3).LIZIZ();
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }

    public static final void onClick$2(ACListenerS27S0500000_28 aCListenerS27S0500000_28, View view) {
        String str;
        EnumC1876780ywG enumC1876780ywG;
        int i = 1;
        ((C013C) aCListenerS27S0500000_28.l0).element = true;
        boolean z = ((Lemon8PopupForContentSyncFragmentV2) aCListenerS27S0500000_28.l1).LLILZ;
        C10G1 c10g1 = C10G1.LIZ;
        Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfigLIZ = (Lemon8ProfileContentSyncConfig) aCListenerS27S0500000_28.l2;
        c10g1.getClass();
        if (lemon8ProfileContentSyncConfigLIZ == null) {
            lemon8ProfileContentSyncConfigLIZ = C19216910Fz.LIZ();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (!z) {
            i = 2;
        }
        c2344009Gk.LIZJ(i, "if_sync");
        c2344009Gk.LJIIIIZZ("business_type", "lemon8");
        c2344009Gk.LIZJ(C10G1.LIZ(lemon8ProfileContentSyncConfigLIZ), "show_times");
        c2344009Gk.LIZJ(lemon8ProfileContentSyncConfigLIZ.popupIsFallbackStyle ? 1 : 0, "is_fallback");
        int i2 = lemon8ProfileContentSyncConfigLIZ.showStyle;
        if (i2 != 6) {
            if (i2 != 7) {
                if (i2 != 8) {
                    str = null;
                } else {
                    str = "reward";
                }
            } else {
                str = "content";
            }
        } else {
            str = "relationship";
        }
        c2344009Gk.LJIIIIZZ("show_type", str);
        C20684815ws.LJIILLIIL("tt_phototext_standalone_sync_post_disappear", c2344009Gk.LIZ);
        C10G1.LIZJ((Lemon8ProfileContentSyncConfig) aCListenerS27S0500000_28.l2, "click", "confirm");
        if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) aCListenerS27S0500000_28.l3);
            c1389890mGx.LJIIJ(((Lemon8ProfileContentSyncConfig) aCListenerS27S0500000_28.l2).toastResultSuccessText);
            c1389890mGx.LJIIJJI();
        }
        ((TuxPanel) aCListenerS27S0500000_28.l4).dismiss();
        if (z) {
            enumC1876780ywG = EnumC1876780ywG.APPROVE;
        } else {
            enumC1876780ywG = EnumC1876780ywG.REJECT;
        }
        InterfaceC1915880zxK interfaceC1915880zxK = new InterfaceC1915880zxK() { // from class: X.10G0
            @Override // X.InterfaceC1915880zxK
            public final void LIZ(int i3, String str2) {
            }

            @Override // X.InterfaceC1915880zxK
            public final void onFailure(int i3, String str2) {
            }
        };
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() != null) {
            C1915720zx4.LJIIIIZZ(interfaceC1915880zxK, "personal_homepage", Collections.singletonList(new C1876860ywO(EnumC683800Qry.DATA_POST_SYNC_TO_LEMON8.getKey(), enumC1876780ywG, EnumC1915430zwb.DATA_POST_SYNC_TO_LEMON8.getS(), null, null, null, 120)));
        }
    }

    public ACListenerS27S0500000_28(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
