package Y;

import X.AbstractC848400XPy;
import X.C01U6;
import X.C0T82;
import X.C0XQ7;
import X.C10CC;
import X.C13054058y;
import X.C1619720sFe;
import X.C1868720yjG;
import X.C1894320zOY;
import X.C1896360zRq;
import X.C1897010zSt;
import X.C1897280zTK;
import X.C1899490zWt;
import X.C1899650zX9;
import X.C20684815ws;
import X.C2344009Gk;
import X.C306500Bzs;
import X.InterfaceC1896760zSU;
import X.InterfaceC1897260zTI;
import X.InterfaceC1914580zvE;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.Picture;
import com.bytedance.touchpoint.api.model.PopupView;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.Video;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS62S1200000_28 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        String str;
        ((CreatorToolsActivity) aCListenerS62S1200000_28.l1).LLZZLLIL("click_creator_showcase");
        SmartRouter.buildRoute((CreatorToolsActivity) aCListenerS62S1200000_28.l1, ((ShowCaseModel) aCListenerS62S1200000_28.l2).clickSchema).open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LJIIIIZZ("page_name", "creator_tools");
        c2344009Gk.LJIIIIZZ("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("country", aCListenerS62S1200000_28.s0);
        c2344009Gk.LJIIIIZZ("click_for", "tiktok_showcase");
        boolean z = ((ShowCaseModel) aCListenerS62S1200000_28.l2).havePermission;
        String str2 = "yes";
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        c2344009Gk.LJIIIIZZ("is_onboard_ecom", str);
        if (!C306500Bzs.LIZ()) {
            str2 = "no";
        }
        c2344009Gk.LJIIIIZZ("enable_showcase", str2);
        C20684815ws.LJIILLIIL("tiktokec_creator_tools_module_click", c2344009Gk.LIZ);
    }

    public static final void onClick$1(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        ((C1868720yjG) aCListenerS62S1200000_28.l1).LJ.invoke();
        ((SessionListTopNoticeViewModel) aCListenerS62S1200000_28.l2).zQ2(aCListenerS62S1200000_28.s0);
    }

    public static final void onClick$2(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        ((C10CC) aCListenerS62S1200000_28.l1).LIZIZ().xQ2((VideoPublishEditModel) aCListenerS62S1200000_28.l2, aCListenerS62S1200000_28.s0);
    }

    public static final void onClick$3(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        C1899650zX9 c1899650zX9 = ((C1899490zWt) aCListenerS62S1200000_28.l1).LLLJ;
        if (c1899650zX9 != null) {
            c1899650zX9.LIZ();
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", aCListenerS62S1200000_28.s0);
            interfaceC1897260zTILIZIZ.LIZ("widget_bubble2_close_click", linkedHashMap);
        }
        ArrayList<InterfaceC1896760zSU> arrayList = C1897010zSt.LIZ;
        C1897010zSt.LIZ("close", null, (Bubble) aCListenerS62S1200000_28.l2);
    }

    public static final void onClick$4(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(747));
        C1896360zRq c1896360zRq = (C1896360zRq) aCListenerS62S1200000_28.l1;
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) aCListenerS62S1200000_28.l2;
        c1896360zRq.getClass();
        C13054058y.LIZ(new ARunnableS39S0101000_28(1, referralFeedBanner, 6));
        C0T82.LIZJ(aCListenerS62S1200000_28.s0).LJIIJJI();
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        int i = ((ReferralFeedBanner) aCListenerS62S1200000_28.l2).LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_position", "close");
        c1894320zOY.getClass();
        C1894320zOY.LJIILJJIL(i, linkedHashMap, null, null, null);
    }

    public static final void onClick$5(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        String str;
        FeedButton feedButton;
        PopupView popupView;
        FeedButton feedButton2;
        Video video = (Video) aCListenerS62S1200000_28.l1;
        String str2 = null;
        if (video != null && (popupView = video.popupView) != null && (feedButton2 = popupView.button) != null) {
            str = feedButton2.jumpLink;
        } else {
            str = null;
            if (video != null) {
            }
            ((C1897280zTK) aCListenerS62S1200000_28.l2).LJIIIIZZ(str, aCListenerS62S1200000_28.s0, str2);
        }
        PopupView popupView2 = video.popupView;
        if (popupView2 != null && (feedButton = popupView2.button) != null) {
            str2 = feedButton.taskEventKey;
        }
        ((C1897280zTK) aCListenerS62S1200000_28.l2).LJIIIIZZ(str, aCListenerS62S1200000_28.s0, str2);
    }

    public static final void onClick$6(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        String str;
        FeedButton feedButton;
        Picture picture = (Picture) aCListenerS62S1200000_28.l1;
        String str2 = null;
        if (picture != null && (feedButton = picture.button) != null) {
            str = feedButton.jumpLink;
        } else {
            str = null;
            if (picture != null) {
            }
            ((C1897280zTK) aCListenerS62S1200000_28.l2).LJIIIIZZ(str, aCListenerS62S1200000_28.s0, str2);
        }
        FeedButton feedButton2 = picture.button;
        if (feedButton2 != null) {
            str2 = feedButton2.taskEventKey;
        }
        ((C1897280zTK) aCListenerS62S1200000_28.l2).LJIIIIZZ(str, aCListenerS62S1200000_28.s0, str2);
    }

    public static final void onClick$7(ACListenerS62S1200000_28 aCListenerS62S1200000_28, View view) {
        ((InterfaceC1914580zvE) aCListenerS62S1200000_28.l1).pl(((UniversalPopupBlockElement) aCListenerS62S1200000_28.l2).action, null, aCListenerS62S1200000_28.s0);
    }

    public ACListenerS62S1200000_28(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, C1868720yjG c1868720yjG, int i) {
        this.$t = i;
        this.l1 = c1868720yjG;
        this.l2 = sessionListTopNoticeViewModel;
        this.s0 = "inbox";
    }

    public ACListenerS62S1200000_28(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
