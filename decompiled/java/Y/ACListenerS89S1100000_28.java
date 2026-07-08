package Y;

import X.AbstractC19311610gs;
import X.C0I0B;
import X.C10HS;
import X.C10HZ;
import X.C1161920gLG;
import X.C1391190mJ3;
import X.C1400340mXo;
import X.C1618740sE4;
import X.C19308310gL;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2344009Gk;
import X.C316660CbA;
import X.C343970De7;
import X.C470510Icj;
import X.C495520Jby;
import X.C637380OzI;
import X.C785410UrT;
import X.DialogC19308210gK;
import X.EnumC1874080yru;
import X.EnumC1907470zjl;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlSetting;
import com.bytedance.android.livesdk.sheet.SheetDemoFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS89S1100000_28 implements View.OnClickListener {
    public final int $t;
    public Object l1;
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
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
        }
    }

    public ACListenerS89S1100000_28(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, int i) {
        this.$t = i;
        this.l1 = sessionListTopNoticeViewModel;
        this.s0 = "inbox";
    }

    public static final void onClick$0(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        String strSparkOverlay = LiveSheetDemoLynxUrlSetting.sparkOverlay();
        new C495520Jby(strSparkOverlay).LIZJ("loading_height", aCListenerS89S1100000_28.s0);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((SheetDemoFragment) aCListenerS89S1100000_28.l1).getContext(), strSparkOverlay);
    }

    public static final void onClick$1(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        C10HZ c10hz = C10HZ.LIZ;
        String str = aCListenerS89S1100000_28.s0;
        c10hz.getClass();
        C20684815ws.LJIILLIIL("save_geofencing", C2097908Jt.LIZJ(new Pair("enter_from", str)));
        GeoFencingSelectionFragment geoFencingSelectionFragment = (GeoFencingSelectionFragment) aCListenerS89S1100000_28.l1;
        C10HS c10hs = geoFencingSelectionFragment.LLJILJIL;
        if (c10hs != null) {
            C470510Icj c470510Icj = geoFencingSelectionFragment.LLIZLLLIL;
            if (c470510Icj == null) {
                c470510Icj = null;
            }
            c10hs.LIZ(((GeoFencingSelectionFragment) aCListenerS89S1100000_28.l1).LLJJIJI, c470510Icj.LLLFZ());
        }
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((GeoFencingSelectionFragment) aCListenerS89S1100000_28.l1, C343970De7.LIZ);
    }

    public static final void onClick$10(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) aCListenerS89S1100000_28.l1, aCListenerS89S1100000_28.s0);
        smartRouteBuildRoute.withParam("enter_from", "signup_login_homepage");
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.aa);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$2(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        String noticeCode;
        String str;
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = (SessionListTopNoticeViewModel) aCListenerS89S1100000_28.l1;
        String str2 = aCListenerS89S1100000_28.s0;
        EnumC1874080yru value = sessionListTopNoticeViewModel.LLJJIII.getValue();
        if (value != null) {
            noticeCode = value.getNoticeCode();
        } else {
            noticeCode = null;
        }
        if (SessionListTopNoticeViewModel.wQ2(noticeCode)) {
            str = "inbox_banner";
        } else {
            str = "notification_page";
        }
        ((IRemindUsersAnalytics) ServiceManager.get().getService(IRemindUsersAnalytics.class)).LJ(1, C0I0B.LJFF.LIZIZ(), str, "inbox_top");
        sessionListTopNoticeViewModel.zQ2(str2);
        List<String> list = SessionListTopNoticeViewModel.LLJLLIL;
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        ((ArrayList) list).add(curUserId);
        C637380OzI.LIZ.getClass();
        C637380OzI.LIZIZ("dm_push", null, false);
    }

    public static final void onClick$3(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        ((SessionListTopNoticeViewModel) aCListenerS89S1100000_28.l1).zQ2(aCListenerS89S1100000_28.s0);
        C637380OzI.LIZ.getClass();
        C637380OzI.LIZIZ("dm_push", null, false);
    }

    public static final void onClick$4(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        ((InterfaceC1631620sYq) aCListenerS89S1100000_28.l1).invoke(view, aCListenerS89S1100000_28.s0, EnumC1907470zjl.BOTTOM_ACTION);
    }

    public static final void onClick$5(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        ((InterfaceC1631620sYq) aCListenerS89S1100000_28.l1).invoke(view, aCListenerS89S1100000_28.s0, EnumC1907470zjl.MIDDLE_BANNER);
    }

    public static final void onClick$6(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        ((InterfaceC1631620sYq) aCListenerS89S1100000_28.l1).invoke(view, aCListenerS89S1100000_28.s0, EnumC1907470zjl.RIGHT_COVER);
    }

    public static final void onClick$7(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        String str = aCListenerS89S1100000_28.s0;
        if (Intrinsics.LJFF(str, "back_button")) {
            ((UniversalPopupBlocksUI) aCListenerS89S1100000_28.l1).cS("back_button");
        } else {
            if (!Intrinsics.LJFF(str, "close_button")) {
                return;
            }
            ((UniversalPopupBlocksUI) aCListenerS89S1100000_28.l1).cS("close_button");
        }
    }

    public static final void onClick$8(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        String str;
        ((AbstractC19311610gs) aCListenerS89S1100000_28.l1).LJIJ("click_question_mark");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((AbstractC19311610gs) aCListenerS89S1100000_28.l1).LIZ, aCListenerS89S1100000_28.s0);
        if (((AbstractC19311610gs) aCListenerS89S1100000_28.l1).LJII()) {
            str = "signup_login_homepage";
        } else {
            str = "login_homepage";
        }
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.aa);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$9(ACListenerS89S1100000_28 aCListenerS89S1100000_28, View view) {
        C19308310gL c19308310gL = C19308310gL.LJII;
        String str = aCListenerS89S1100000_28.s0;
        Context context = ((DialogC19308210gK) aCListenerS89S1100000_28.l1).getContext();
        c19308310gL.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.open();
        C1618740sE4.LIZLLL = true;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "feed_popup");
        C20684815ws.LJIILLIIL("enter_activity_page", c2344009Gk.LIZ);
        try {
            if (((DialogC19308210gK) aCListenerS89S1100000_28.l1).LLILZIL) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("toast_type", "coupon_fission");
                c2344009Gk2.LJIIIIZZ("click_position", "start_now");
                C20684815ws.LJIILLIIL("toast_click", c2344009Gk2.LIZ);
            }
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        DialogC19308210gK dialogC19308210gK = (DialogC19308210gK) aCListenerS89S1100000_28.l1;
        dialogC19308210gK.dismiss();
        C785410UrT.LIZ(dialogC19308210gK);
    }

    public ACListenerS89S1100000_28(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
