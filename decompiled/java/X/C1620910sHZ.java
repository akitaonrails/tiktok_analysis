package X;

import Y.ARunnableS93S0200000_24;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightToolbarIconBridgeAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.business.live.assem.FollowFeedLiveEventTrackAssem;
import com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem;
import com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell;
import com.ss.android.ugc.aweme.business.story.assem.FeedSkylightRerankAssem;
import com.ss.android.ugc.aweme.business.story.assem.SwitchToReportStoryNegativeFeedbackAssem;
import com.ss.android.ugc.aweme.business.story.ui.cell.StorySkylightCell;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel.SleepHourComponentViewModel;
import com.ss.android.ugc.aweme.experiment.SkylightLocalRerankExpData;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.inbox.assem.SwitchInboxToReportStoryNegativeFeedbackAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import com.ss.android.ugc.aweme.tab.tabclean.TabCleanAssem;
import com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh.AlgoRefreshAssem;
import com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh.AlgoRefreshVM;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS33S2000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620910sHZ implements InterfaceC1585190rLx {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        switch (this.$t) {
            case 0:
                p1$0(this, str, str2);
                break;
            case 1:
                p1$1(this, str, str2);
                break;
            case 2:
                p1$2(this, str, str2);
                break;
            case 3:
                p1$3(this, str, str2);
                break;
            case 4:
                p1$4(this, str, str2);
                break;
            case 5:
                p1$5(this, str, str2);
                break;
            case 6:
                p1$6(this, str, str2);
                break;
            case 7:
                p1$7(this, str, str2);
                break;
            case 8:
                p1$8(this, str, str2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                p1$9(this, str, str2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                p1$10(this, str, str2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                p1$11(this, str, str2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                p1$12(this, str, str2);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                p1$13(this, str, str2);
                break;
            case 14:
                p1$14(this, str, str2);
                break;
            case 15:
                p1$15(this, str, str2);
                break;
            case 16:
                p1$16(this, str, str2);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                p1$17(this, str, str2);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                p1$18(this, str, str2);
                break;
            case 19:
                p1$19(this, str, str2);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                p1$20(this, str, str2);
                break;
            case 21:
                p1$21(this, str, str2);
                break;
            case 22:
                p1$22(this, str, str2);
                break;
            case 23:
                p1$23(this, str, str2);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                p1$24(this, str, str2);
                break;
            case 25:
                p1$25(this, str, str2);
                break;
            case 26:
                p1$26(this, str, str2);
                break;
        }
    }

    public C1620910sHZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean LIZ$0(FeedSkylightRerankAssem feedSkylightRerankAssem, String str) {
        int iM166do = feedSkylightRerankAssem.m166do();
        if (iM166do != 0) {
            if (iM166do != 1) {
                if (iM166do != 2) {
                    return false;
                }
                return Intrinsics.LJFF(str, "Following");
            }
            return Intrinsics.LJFF(str, "For You");
        }
        return Intrinsics.LJFF(str, "FRIENDS_FEED");
    }

    public static final void p1$0(C1620910sHZ c1620910sHZ, String str, String str2) {
        boolean z;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLo;
        String str3 = "FRIENDS_FEED";
        if ((C0IVP.LIZ() && !Intrinsics.LJFF(str2, "For You")) || (!C0IVP.LIZ() && !Intrinsics.LJFF(str2, "Following") && !Intrinsics.LJFF(str2, "For You") && !Intrinsics.LJFF(str2, "FRIENDS_FEED"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StoryToolBarIconAbility storyToolBarIconAbilityUo = ((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0).uo();
            if (storyToolBarIconAbilityUo != null) {
                storyToolBarIconAbilityUo.u81(str2, "top_icon", ((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0).ko().xQ2(), false);
                return;
            }
            return;
        }
        int iSo = ((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0).so();
        if (iSo != 0) {
            if (iSo == 1) {
                str3 = "For You";
            } else if (iSo == 2) {
                str3 = "Following";
            } else {
                str3 = "";
            }
        }
        if (!Intrinsics.LJFF(str3, str2) || (viewOnAttachStateChangeListenerC20604515jvLo = ((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0).lo()) == null) {
            return;
        }
        StoryToolBarIconAbility storyToolBarIconAbilityUo2 = ((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0).uo();
        if (storyToolBarIconAbilityUo2 != null) {
            storyToolBarIconAbilityUo2.u81(str2, "top_icon", ((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0).ko().xQ2(), false);
        }
        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvLo, new ARunnableS93S0200000_24((FeedSkylightToolbarIconBridgeAssem) c1620910sHZ.l0, viewOnAttachStateChangeListenerC20604515jvLo, 2));
    }

    public static final void p1$1(C1620910sHZ c1620910sHZ, String str, String str2) {
        FollowFeedLiveEventTrackAssem followFeedLiveEventTrackAssem = (FollowFeedLiveEventTrackAssem) c1620910sHZ.l0;
        followFeedLiveEventTrackAssem.bo(str2, new AwS603S0100000_24(followFeedLiveEventTrackAssem, 33));
    }

    public static final void p1$10(C1620910sHZ c1620910sHZ, String str, String str2) {
        String str3;
        SwitchToReportStoryNegativeFeedbackAssem switchToReportStoryNegativeFeedbackAssem = (SwitchToReportStoryNegativeFeedbackAssem) c1620910sHZ.l0;
        if (str == null) {
            switchToReportStoryNegativeFeedbackAssem.getClass();
            return;
        }
        int iBo = switchToReportStoryNegativeFeedbackAssem.bo();
        if (iBo != 0) {
            if (iBo != 1) {
                if (iBo != 2) {
                    str3 = "";
                } else {
                    str3 = "Following";
                }
            } else {
                str3 = "For You";
            }
        } else {
            str3 = "FRIENDS_FEED";
        }
        if (!Intrinsics.LJFF(str, str3)) {
            return;
        }
        switchToReportStoryNegativeFeedbackAssem.m167do();
    }

    public static final void p1$11(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((StorySkylightCell) c1620910sHZ.l0).i6(str, str2, false);
    }

    public static final void p1$12(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((StorySkylightCell) c1620910sHZ.l0).i6(str, str2, true);
    }

    public static final void p1$13(C1620910sHZ c1620910sHZ, String str, String str2) {
        String str3;
        if (((SleepHourComponent) c1620910sHZ.l0).isShowing()) {
            SleepHourComponentViewModel sleepHourComponentViewModelKp = ((SleepHourComponent) c1620910sHZ.l0).kp();
            if (!Intrinsics.LJFF(str, "HOME") && !Intrinsics.LJFF(str, "For You")) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (sleepHourComponentViewModelKp.LLILLJJLI + 500 > jCurrentTimeMillis) {
                return;
            }
            sleepHourComponentViewModelKp.LLILLJJLI = jCurrentTimeMillis;
            if (sleepHourComponentViewModelKp.getState().LL == EnumC20538815Yk.DISMISS) {
                return;
            }
            C15YX.LIZ.getClass();
            SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
            int i = 0;
            if (sleepHourSettingsLIZJ != null && sleepHourSettingsLIZJ.isFirstShownPrompt) {
                str3 = "return_for_now";
            } else {
                str3 = "manage_sleep_hour";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            SleepHourSettings sleepHourSettingsLIZJ2 = C15YX.LIZJ();
            if (sleepHourSettingsLIZJ2 != null) {
                i = sleepHourSettingsLIZJ2.popupShowTimes;
            }
            c2344009Gk.LIZJ(i, "trigger_time");
            c2344009Gk.LJIIIIZZ("exit_method", str2.toLowerCase(Locale.ROOT));
            c2344009Gk.LJIIIIZZ("version", "meditation");
            c2344009Gk.LJIIIIZZ("reminder_type", str3);
            C20684815ws.LJIILLIIL("change_tab_feed_sleep_hour_reminder", c2344009Gk.LIZ);
            C15YW.LIZ.getClass();
            C15YW.LJ(str2);
        }
    }

    public static final void p1$14(C1620910sHZ c1620910sHZ, String str, String str2) {
        C0J6Q c0j6q = ((FollowTabViewLifecycleObserver) c1620910sHZ.l0).LLJJIJIL;
        if (c0j6q != null) {
            c0j6q.LJFF(str2);
        }
    }

    public static final void p1$15(C1620910sHZ c1620910sHZ, String str, String str2) {
        SwitchInboxToReportStoryNegativeFeedbackAssem switchInboxToReportStoryNegativeFeedbackAssem = (SwitchInboxToReportStoryNegativeFeedbackAssem) c1620910sHZ.l0;
        switchInboxToReportStoryNegativeFeedbackAssem.getClass();
        if (str != null && Intrinsics.LJFF("NOTIFICATION", str)) {
            InterfaceC1569000qvq interfaceC1569000qvq = (InterfaceC1569000qvq) switchInboxToReportStoryNegativeFeedbackAssem.LLILLL.getValue();
            C1569160qw6 c1569160qw6 = C1569160qw6.LIZIZ;
            if (interfaceC1569000qvq.LIZJ(c1569160qw6)) {
                ((InterfaceC1569000qvq) switchInboxToReportStoryNegativeFeedbackAssem.LLILLL.getValue()).LJI(c1569160qw6, C1568970qvn.LIZIZ);
            }
        }
    }

    public static final void p1$16(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((MFBizIconsAssem) c1620910sHZ.l0).So(str2);
    }

    public static final void p1$17(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((BottomPublishObserver) c1620910sHZ.l0).getClass();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().dismissExistingRepostPush("switch_homepage_tab");
    }

    public static final void p1$18(C1620910sHZ c1620910sHZ, String str, String str2) {
        StoryToolBarIconAssem storyToolBarIconAssem = (StoryToolBarIconAssem) c1620910sHZ.l0;
        storyToolBarIconAssem.LLJLLIL = Intrinsics.LJFF(str2, storyToolBarIconAssem.LLJLL.getValue());
        StoryToolBarIconAssem storyToolBarIconAssem2 = (StoryToolBarIconAssem) c1620910sHZ.l0;
        if (storyToolBarIconAssem2.LLJLLIL) {
            storyToolBarIconAssem2.So().yQ2(((StoryToolBarIconAssem) c1620910sHZ.l0).So().LLJ, true);
        }
    }

    public static final void p1$19(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((StoryToolBarIconAssem) c1620910sHZ.l0).LLLFZ = false;
    }

    public static final void p1$2(C1620910sHZ c1620910sHZ, String str, String str2) {
        FollowFeedLiveEventTrackAssem followFeedLiveEventTrackAssem = (FollowFeedLiveEventTrackAssem) c1620910sHZ.l0;
        followFeedLiveEventTrackAssem.bo(str2, new AwS603S0100000_24(followFeedLiveEventTrackAssem, 34));
    }

    public static final void p1$20(C1620910sHZ c1620910sHZ, String str, String str2) {
        C1591140rVY c1591140rVY = ((TabCleanAssem) c1620910sHZ.l0).LL;
        if (c1591140rVY != null && !Intrinsics.LJFF(str, str2) && str != null) {
            c1591140rVY.LJIILLIIL = str2;
            c1591140rVY.LIZJ(str2);
            C1591190rVd c1591190rVd = (C1591190rVd) ((LinkedHashMap) c1591140rVY.LJIIJ).get(str);
            if (c1591190rVd == null) {
                c1591140rVY.LJIIJ.put(str, new C1591190rVd(str, false, c1591140rVY.LJI(str), System.currentTimeMillis()));
            } else {
                c1591190rVd.LIZLLL = System.currentTimeMillis();
            }
            if (((LinkedHashMap) c1591140rVY.LJIIJ).get(str2) == null) {
                c1591140rVY.LJIIJ.put(str2, new C1591190rVd(str2, false, c1591140rVY.LJI(str2), -1L));
            }
            C09AE c09aeRemove = c1591140rVY.LJIILIIL.remove(str2);
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
            }
            c1591140rVY.LJIIJJI(str);
        }
    }

    public static final void p1$21(C1620910sHZ c1620910sHZ, String str, String str2) {
        C1591140rVY c1591140rVY = ((TabCleanAssem) c1620910sHZ.l0).LL;
        if (c1591140rVY != null && !Intrinsics.LJFF(str, str2) && str != null) {
            c1591140rVY.LJIILL = str2;
            c1591140rVY.LIZJ(str2);
            C1591190rVd c1591190rVd = (C1591190rVd) ((LinkedHashMap) c1591140rVY.LJIIJ).get(str);
            if (c1591190rVd == null) {
                c1591140rVY.LJIIJ.put(str, new C1591190rVd(str, true, c1591140rVY.LJI(str), System.currentTimeMillis()));
            } else {
                c1591190rVd.LIZLLL = System.currentTimeMillis();
            }
            if (((LinkedHashMap) c1591140rVY.LJIIJ).get(str2) == null) {
                c1591140rVY.LJIIJ.put(str2, new C1591190rVd(str2, true, c1591140rVY.LJI(str2), -1L));
            }
            C09AE c09aeRemove = c1591140rVY.LJIILIIL.remove(str2);
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
            }
            c1591140rVY.LJIIJJI(str);
        }
    }

    public static final void p1$22(C1620910sHZ c1620910sHZ, String str, String str2) {
        if (((AlgoRefreshAssem) c1620910sHZ.l0).LJJIJL().getVisibility() == 0) {
            ArrayList<String> arrayList = AlgoRefreshVM.LL;
            if (!AlgoRefreshVM.LL.contains(str2)) {
                ((AlgoRefreshAssem) c1620910sHZ.l0).ip();
            }
        }
    }

    public static final void p1$23(C1620910sHZ c1620910sHZ, String str, String str2) {
        int i;
        ((NonPersonalizedAssem) c1620910sHZ.l0).op().LIZIZ(new AwS33S2000000_24(str, str2, 0));
        if (str != null) {
            ((NonPersonalizedAssem) c1620910sHZ.l0).tp().vQ2();
        }
        if (C1567040qsg.LIZIZ() && C13LP.LJJJJ(str, C1567040qsg.LIZ()) && C1567040qsg.LIZ().contains(str2)) {
            if (Intrinsics.LJFF(str, "For You") && Intrinsics.LJFF(str2, "Following")) {
                i = 1;
            } else if (Intrinsics.LJFF(str, "Following") && Intrinsics.LJFF(str2, "For You")) {
                i = 2;
            } else {
                i = 4;
            }
            ((NonPersonalizedAssem) c1620910sHZ.l0).tp().xQ2(i, null);
            ((NonPersonalizedAssem) c1620910sHZ.l0).op().LIZIZ(AFwS213S0000000_24.get$arr$(566));
        }
    }

    public static final void p1$24(C1620910sHZ c1620910sHZ, String str, String str2) {
        int i;
        ((NonPersonalizedAssem) c1620910sHZ.l0).op().LIZIZ(new AwS33S2000000_24(str, str2, 1));
        ((NonPersonalizedAssem) c1620910sHZ.l0).tp().vQ2();
        if (C1567040qsg.LIZIZ()) {
            if ((str == null || C1567040qsg.LIZ().contains(str)) && C1567040qsg.LIZ().contains(str2)) {
                if (str == null) {
                    i = 5;
                } else if (Intrinsics.LJFF(str, "FRIENDS_TAB") && Intrinsics.LJFF(str2, "HOME")) {
                    i = 3;
                } else if (Intrinsics.LJFF(str2, "FRIENDS_TAB") && C319860CgK.LIZ()) {
                    return;
                } else {
                    i = 4;
                }
                ((NonPersonalizedAssem) c1620910sHZ.l0).tp().xQ2(i, null);
                ((NonPersonalizedAssem) c1620910sHZ.l0).op().LIZIZ(AFwS213S0000000_24.get$arr$(567));
            }
        }
    }

    public static final void p1$25(C1620910sHZ c1620910sHZ, String str, String str2) {
        C1594940rbg c1594940rbg = (C1594940rbg) c1620910sHZ.l0;
        c1594940rbg.LLIZ = str2;
        c1594940rbg.LIZIZ();
    }

    public static final void p1$26(C1620910sHZ c1620910sHZ, String str, String str2) {
        C1594940rbg c1594940rbg = (C1594940rbg) c1620910sHZ.l0;
        c1594940rbg.LLILZLL = str2;
        c1594940rbg.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p1$3(X.C1620910sHZ r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem r0 = (com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem) r0
            X.0r17 r2 = r0.m165do()
            if (r2 == 0) goto Lf
            r0 = 0
            r2.LIZIZ(r0)
        Lf:
            java.lang.String r0 = "HOME"
            boolean r2 = android.text.TextUtils.equals(r5, r0)
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem r0 = (com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem) r0
            X.0Ooa r0 = r0.LLIZ
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto L38
            java.lang.String r0 = "Following"
            boolean r1 = r1.ft0(r0)
            r0 = 1
            if (r1 != r0) goto L38
        L2c:
            if (r2 == 0) goto L37
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem r0 = (com.ss.android.ugc.aweme.business.live.assem.InboxToFollowGuideAssem) r0
            r0.bo()
        L37:
            return
        L38:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620910sHZ.p1$3(X.0sHZ, java.lang.String, java.lang.String):void");
    }

    public static final void p1$4(C1620910sHZ c1620910sHZ, String str, String str2) {
        C1572270r17 c1572270r17M165do = ((InboxToFollowGuideAssem) c1620910sHZ.l0).m165do();
        if (c1572270r17M165do != null) {
            c1572270r17M165do.LIZIZ(0L);
        }
        if (TextUtils.equals(str2, "Following")) {
            ((InboxToFollowGuideAssem) c1620910sHZ.l0).bo();
        }
    }

    public static final void p1$5(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((BaseFollowingLiveSkylightCell) c1620910sHZ.l0).d6(str, str2, false);
    }

    public static final void p1$6(C1620910sHZ c1620910sHZ, String str, String str2) {
        ((BaseFollowingLiveSkylightCell) c1620910sHZ.l0).d6(str, str2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p1$7(X.C1620910sHZ r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620910sHZ.p1$7(X.0sHZ, java.lang.String, java.lang.String):void");
    }

    public static final void p1$8(C1620910sHZ c1620910sHZ, String str, String str2) {
        SkylightLocalRerankExpData skylightLocalRerankExpData = C1599000riE.LIZ;
        if (!skylightLocalRerankExpData.enableReorder || !skylightLocalRerankExpData.enableTabChangeRerank || str == null) {
            return;
        }
        if (LIZ$0((FeedSkylightRerankAssem) c1620910sHZ.l0, str)) {
            ((FeedSkylightRerankAssem) c1620910sHZ.l0).LJJJJLI();
        }
        if (LIZ$0((FeedSkylightRerankAssem) c1620910sHZ.l0, str2)) {
            ((FeedSkylightListViewModel) ((FeedSkylightRerankAssem) c1620910sHZ.l0).LLILZ.getValue()).ll0(C641390PDt.LIZ);
        }
    }

    public static final void p1$9(C1620910sHZ c1620910sHZ, String str, String str2) {
        String str3;
        String str4;
        String strCt0;
        SwitchToReportStoryNegativeFeedbackAssem switchToReportStoryNegativeFeedbackAssem = (SwitchToReportStoryNegativeFeedbackAssem) c1620910sHZ.l0;
        if (str == null) {
            switchToReportStoryNegativeFeedbackAssem.getClass();
            return;
        }
        if (switchToReportStoryNegativeFeedbackAssem.bo() == 0 && !FriendsTabTopExperiment.LIZIZ()) {
            str3 = "FRIENDS_TAB";
        } else {
            str3 = "HOME";
        }
        if (!Intrinsics.LJFF(str3, str)) {
            return;
        }
        if (Intrinsics.LJFF(str3, "FRIENDS_TAB")) {
            switchToReportStoryNegativeFeedbackAssem.m167do();
            return;
        }
        int iBo = switchToReportStoryNegativeFeedbackAssem.bo();
        if (iBo != 0) {
            if (iBo != 1) {
                if (iBo != 2) {
                    str4 = "";
                } else {
                    str4 = "Following";
                }
            } else {
                str4 = "For You";
            }
        } else {
            str4 = "FRIENDS_FEED";
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) switchToReportStoryNegativeFeedbackAssem.LLILLL.getValue();
        if (homeTabAbility != null) {
            strCt0 = homeTabAbility.Ct0();
        } else {
            strCt0 = null;
        }
        if (!Intrinsics.LJFF(str4, strCt0)) {
            return;
        }
        switchToReportStoryNegativeFeedbackAssem.m167do();
    }
}
