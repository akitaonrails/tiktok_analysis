package X;

import Y.ACallableS429S0100000_24;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost;
import com.ss.android.ugc.aweme.notice.api.services.IProfileRedDotService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0sDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618510sDh implements INoticeCountTabBadgePresentHost {
    public static boolean LJII;
    public AbsFragment LIZ;
    public final TabChangeManager LIZIZ;
    public final ScrollSwitchStateManager LIZJ;
    public String LIZLLL;
    public long LJ;
    public final IProfileRedDotService LJFF;
    public final C1618530sDj LJI;

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final void onPopupClick() {
        C19EG activity;
        Bundle extras;
        LJ(true);
        if (!C1585030rLh.LJIJI("NOTIFICATION")) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.LIZJ;
            if (scrollSwitchStateManager != null) {
                LJII(scrollSwitchStateManager);
                return;
            }
            return;
        }
        C19212010Ec.LIZJ.LJJI();
        AbsFragment absFragment = this.LIZ;
        if (absFragment == null || (activity = absFragment.getActivity()) == null) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras == null) {
                extras = new Bundle();
            }
        } else {
            extras = new Bundle();
        }
        C786410Ut5.LJJJI("fromStart", "RootNode", extras);
        extras.putBoolean("isSmoothScroll", true);
        Hox.LLJILJIL.LIZ(activity).TQ2(extras, "NOTIFICATION", false);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final void onPopupShow() {
    }

    public final InterfaceC1570600qyQ LIZIZ() {
        C19EG activity;
        AbsFragment absFragment = this.LIZ;
        if (absFragment == null || (activity = absFragment.getActivity()) == null) {
            return null;
        }
        return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(activity);
    }

    public final void LIZJ() {
        AbsFragment absFragment;
        C19EG activity;
        AbsFragment absFragment2 = this.LIZ;
        if (absFragment2 == null || !absFragment2.isViewValid()) {
            return;
        }
        if (!C1618580sDo.LJI && (absFragment = this.LIZ) != null && (activity = absFragment.getActivity()) != null) {
            C1591250rVj.LIZJ(activity, LIZIZ());
        }
        LJII = false;
    }

    public final Pair<Boolean, Boolean> LJFF() {
        boolean zNeedShowRedDotOnMyProfileMore = C19296410eQ.LIZIZ.needShowRedDotOnMyProfileMore();
        boolean z = false;
        if (SharePrefCache.inst().getEnableProfileActivityLink().LIZ().booleanValue()) {
            AbsFragment absFragment = this.LIZ;
            InterfaceC1594010raB interfaceC1594010raB = (InterfaceC1594010raB) C2419309dv.LIZ(absFragment != null ? absFragment.getContext() : null, InterfaceC1594010raB.class);
            if (interfaceC1594010raB == null || !TextUtils.equals(interfaceC1594010raB.LJIIIZ(), String.valueOf(true))) {
                z = true;
            }
        }
        return new Pair<>(Boolean.valueOf(zNeedShowRedDotOnMyProfileMore), Boolean.valueOf(z));
    }

    public final void LJI() {
        AbsFragment absFragment;
        C19EG activity;
        AbsFragment absFragment2 = this.LIZ;
        if (absFragment2 == null || !absFragment2.isViewValid()) {
            return;
        }
        if (!C1618580sDo.LJI && (absFragment = this.LIZ) != null && (activity = absFragment.getActivity()) != null) {
            C1591250rVj.LIZLLL(activity, LIZIZ());
        }
        LJII = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final String getDmFragmentInfo() {
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZJ;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.vQ2();
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LIZJ;
        if (!((scrollSwitchStateManager2 != null ? scrollSwitchStateManager2.vQ2() : null) instanceof InterfaceC1593630rZZ)) {
            return "";
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = this.LIZJ;
        if ((scrollSwitchStateManager3 != null ? scrollSwitchStateManager3.OQ2() : null) instanceof InterfaceC1566480qrm) {
            return "homepage_hot";
        }
        ScrollSwitchStateManager scrollSwitchStateManager4 = this.LIZJ;
        return (scrollSwitchStateManager4 != null ? scrollSwitchStateManager4.OQ2() : null) instanceof InterfaceC1570670qyX ? "homepage_follow" : "";
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final boolean interceptPopup() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prior_to_safe_info_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (!repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) && !C1618670sDx.LIZIZ()) {
                return false;
            }
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NCTBPManager", "checkShowNotification blocked by privacy");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentHost
    public final void onPopupDismiss() {
        this.LJ = System.currentTimeMillis();
    }

    public final void LJ(boolean z) {
        C128Y c128yKi;
        String strCQ2;
        C1618540sDk.LIZ();
        TabChangeManager tabChangeManager = this.LIZIZ;
        if (tabChangeManager != null) {
            c128yKi = tabChangeManager.Ki("NOTIFICATION");
        } else {
            c128yKi = null;
        }
        TabChangeManager tabChangeManager2 = this.LIZIZ;
        if (tabChangeManager2 != null) {
            strCQ2 = tabChangeManager2.CQ2();
        } else {
            strCQ2 = null;
        }
        int iLJIIIZ = C1903780zdo.LJIIIZ(260);
        if (!(c128yKi instanceof InterfaceC1255270ilp) || ((InterfaceC1255270ilp) c128yKi).P9() || !Intrinsics.LJFF(strCQ2, "NOTIFICATION")) {
            LIZLLL(iLJIIIZ, z);
        } else {
            ((InterfaceC1586310rNl) c128yKi).Zu(((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI());
        }
        C1904360zek.LLILLJJLI.LJ(260, null, true);
    }

    public final void LJII(ScrollSwitchStateManager scrollSwitchStateManager) {
        String strCQ2;
        InterfaceC1618570sDn interfaceC1618570sDn;
        TabChangeManager tabChangeManager = this.LIZIZ;
        C19EG activity = null;
        if (tabChangeManager != null) {
            strCQ2 = tabChangeManager.CQ2();
        } else {
            strCQ2 = null;
        }
        if (!Intrinsics.LJFF("NOTIFICATION", strCQ2)) {
            TabChangeManager tabChangeManager2 = this.LIZIZ;
            if (tabChangeManager2 != null) {
                TabChangeManager.xQ2(tabChangeManager2, "NOTIFICATION", true, null, 26);
            }
            C1483410ohn.LJLJJI().LIZ();
            C755980Tl6.LIZ().LIZLLL();
            AbsFragment absFragment = this.LIZ;
            if (absFragment != null) {
                activity = absFragment.getActivity();
            }
            C1564620qom.LIZ(activity);
            scrollSwitchStateManager.KQ2(false);
            C128Y c128y = this.LIZ;
            if ((c128y instanceof InterfaceC1618570sDn) && (interfaceC1618570sDn = (InterfaceC1618570sDn) c128y) != null) {
                interfaceC1618570sDn.Db(true);
            }
            C1514430pVp.LJFF(EnumC1584370rKd.NOTICE);
        }
        C1618630sDt.LIZIZ.LIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDoubleClickInbox(C1592330rXT c1592330rXT) {
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0sDi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NoticeCountTabBadgePresentHostImpl@e05f.onDoubleClickInbox$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NoticeCountTabBadgePresentHostImpl@e05f.onDoubleClickInbox$1");
            }

            public static void LIZ() {
                int iLJIIIIZZ = C1903780zdo.LJIIIIZZ();
                int iLJIILL = C1903780zdo.LJII().LJIILL();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "notification_page");
                if (iLJIIIIZZ > 0) {
                    linkedHashMap.put("notice_type", "number_dot");
                    linkedHashMap.put("show_cnt", String.valueOf(iLJIIIIZZ));
                } else if (C1903780zdo.LJII().LIZ() > 0) {
                    linkedHashMap.put("notice_type", "yellow_dot");
                    linkedHashMap.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
                } else {
                    linkedHashMap.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
                }
                linkedHashMap.put("show_conv_cnt", String.valueOf(iLJIILL));
                C20684815ws.LJIILLIIL("double_click_tab_name", linkedHashMap);
            }
        });
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void receiveLandInboxEvent(AnonymousClass0358 anonymousClass0358) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive event = ");
        sbLIZ.append(anonymousClass0358);
        C1720106oR.LJI("NCTBPManager", C2188811AlT.LIZIZ(sbLIZ));
        if (anonymousClass0358.LIZ) {
            LJ(false);
        } else {
            LIZ(anonymousClass0358.LIZIZ, this.LIZLLL, C1903780zdo.LJIIIZ(260), false, false);
        }
    }

    public final void LIZLLL(int i, boolean z) {
        String strLJJLIIIJJI = ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI();
        this.LIZLLL = strLJJLIIIJJI;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logEnterHomePageMessage enterFrom ");
        sbLIZ.append(strLJJLIIIJJI);
        C1720106oR.LJI("NCTBPManager", C2188811AlT.LIZIZ(sbLIZ));
        C15O7.LIZJ(new ACallableS429S0100000_24(new C1618550sDl(this, z, i, strLJJLIIIJJI), (Function0<Object>) 8));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0sDj] */
    public C1618510sDh(AbsFragment absFragment, TabChangeManager tabChangeManager, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LIZ = absFragment;
        this.LIZIZ = tabChangeManager;
        this.LIZJ = scrollSwitchStateManager;
        EventBus.LIZLLL().LJIJJ(this);
        LJII = false;
        this.LIZLLL = "";
        IProfileRedDotService iProfileRedDotService = (IProfileRedDotService) PluggableExtentionKt.pluggableSpi$default(IProfileRedDotService.class, false, false, false, 14, null);
        this.LJFF = iProfileRedDotService == null ? new IProfileRedDotService.DowngradeInstance() : iProfileRedDotService;
        this.LJI = new Object() { // from class: X.0sDj
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    public final void LIZ(final long j, final String str, final int i, final boolean z, final boolean z2) {
        C19EG activity;
        final String str2;
        C19EG activity2;
        final int iLJIIIIZZ = C1903780zdo.LJIIIIZZ();
        final int iLIZ = C1903780zdo.LJII().LIZ();
        final int iLJIILL = C1903780zdo.LJII().LJIILL();
        final C259800zU c259800zU = new C259800zU();
        String str3 = "";
        c259800zU.element = "";
        final C259800zU c259800zU2 = new C259800zU();
        AbsFragment absFragment = this.LIZ;
        final Fragment fragmentKi = null;
        if (absFragment != null && (activity2 = absFragment.getActivity()) != null) {
            C128Y c128yFindTopFragment = NavigationUtils.findTopFragment(Hox.LLJILJIL.LIZ(activity2).Ki("NOTIFICATION"));
            T t = str3;
            if (c128yFindTopFragment instanceof InterfaceC1581830rGX) {
                InterfaceC1581830rGX interfaceC1581830rGX = (InterfaceC1581830rGX) c128yFindTopFragment;
                t = str3;
                if (interfaceC1581830rGX != null) {
                    String pageName = interfaceC1581830rGX.getPageName();
                    t = str3;
                    if (pageName != null) {
                        t = pageName;
                    }
                }
            }
            c259800zU.element = t;
            if (z2) {
                c259800zU2.element = C1589640rT8.LIZIZ.B2(activity2, null, str);
            }
        }
        EnumC1903590zdV enumC1903590zdV = EnumC1903590zdV.CONTACTS;
        AbsFragment absFragment2 = this.LIZ;
        if (absFragment2 != null) {
            activity = absFragment2.getActivity();
        } else {
            activity = null;
        }
        if (enumC1903590zdV.decideDisplay(activity, this.LIZ) != EnumC1903600zdW.GONE) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        TabChangeManager tabChangeManager = this.LIZIZ;
        if (tabChangeManager != null) {
            fragmentKi = tabChangeManager.Ki("NOTIFICATION");
        }
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0sDr
            public final void LIZ() {
                HashMap map = new HashMap();
                if (iLJIIIIZZ > 0) {
                    map.put("notice_type", "number_dot");
                    map.put("show_cnt", String.valueOf(iLJIIIIZZ));
                } else if (iLIZ > 0) {
                    map.put("notice_type", "yellow_dot");
                    map.put("show_cnt", String.valueOf(iLIZ));
                } else {
                    map.put("notice_type", "report_null");
                    map.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
                }
                map.put("show_conv_cnt", String.valueOf(iLJIILL));
                String str4 = c259800zU2.element;
                if (str4 != null && C123100dR.LIZ(str4)) {
                    map.put("group_id", c259800zU2.element);
                }
                map.put("is_live", i > 0 ? "1" : CardStruct.IStatusCode.DEFAULT);
                map.put("is_from_following_live_guide", (i <= 0 || (!z && System.currentTimeMillis() - this.LJ >= 1000)) ? CardStruct.IStatusCode.DEFAULT : "1");
                map.put("message_cnt", String.valueOf(C1903780zdo.LJIIJ(99)));
                map.put("recommended_chat_cnt", CardStruct.IStatusCode.DEFAULT);
                Fragment fragment = fragmentKi;
                map.put("tab_name", ((fragment instanceof InterfaceC1593560rZS) || (fragment instanceof InterfaceC1255270ilp)) ? "chat" : "all");
                map.put("is_auth_show", str2);
                map.put("enter_from", str);
                map.put("previous_page", str);
                map.put("to_inbox_page", c259800zU.element);
                C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
                map.put("enter_method", c19212010Ec.LJLLL());
                C05RV c05rvLIZJ = c19212010Ec.LIZJ();
                if (c19212010Ec.LJJZZI()) {
                    map.put("creator_inbox_status", c05rvLIZJ == C05RV.PRO_CREATOR_INBOX ? "on" : "off");
                }
                if (c19212010Ec.LJJLIIIJLJLI()) {
                    map.put("activity_classification_status", "1");
                }
                if (c19212010Ec.LJIIJ()) {
                    map.put("enter_from", "default_landing");
                }
                long j2 = j;
                if (j2 > 0) {
                    map.put("duration", String.valueOf(j2));
                }
                map.put("inbox_mode", c05rvLIZJ.getMobValue());
                String str5 = C0NBD.LIZ;
                if (str5 == null) {
                    str5 = "";
                }
                map.put("inbox_session_id", str5);
                C20684815ws.LJIILLIIL(z2 ? "enter_homepage_message" : "exit_homepage_message", map);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NoticeCountTabBadgePresentHostImpl@e05f.doLogHomPageMessage$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NoticeCountTabBadgePresentHostImpl@e05f.doLogHomPageMessage$2");
            }
        });
    }
}
