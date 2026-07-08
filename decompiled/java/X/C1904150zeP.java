package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904150zeP {
    public static final C1904150zeP LIZ = new C1904150zeP();
    public static final AtomicBoolean LIZIZ;
    public static final AtomicBoolean LIZJ;
    public static final AtomicBoolean LIZLLL;
    public static final AtomicBoolean LJ;

    static {
        C2252408s6.LIZ(new C1904160zeQ());
        new AtomicInteger(-1);
        LIZIZ = new AtomicBoolean(false);
        LIZJ = new AtomicBoolean(false);
        LIZLLL = new AtomicBoolean(false);
        LJ = new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    public static void LIZJ() {
        C0W4Y.LIZ("notifyAppOnCreate");
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0zeO
                @Override // X.C09JN
                public final void accept(Object obj) {
                    User userLIZ;
                    C1C7U.LIZ("LandInboxManager@8c28.observeAppStateIfNeed$1");
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("observeAppEnterBackground ");
                        sbLIZ.append(bool);
                        sbLIZ.append(",isInBoxTab= ");
                        AtomicBoolean atomicBoolean = C1904150zeP.LJ;
                        sbLIZ.append(atomicBoolean.get());
                        sbLIZ.append(' ');
                        C0W4Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C1904150zeP.LIZ.getClass();
                        if (C1904150zeP.LIZ() != null && (userLIZ = C1904150zeP.LIZ()) != null && userLIZ.getUid() != null) {
                            User userLIZ2 = C1904150zeP.LIZ();
                            if (userLIZ2 != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("landingInboxAbility,updateLatestLeaveAppTimestamp,uid=  ");
                                sbLIZ2.append(userLIZ2.getUid());
                                C0W4Y.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                IMUserPortraitApi.LIZ.getClass();
                                C1730606q8.LIZ().LIZLLL().LJIJI(System.currentTimeMillis(), userLIZ2.getUid());
                            } else {
                                C0W4Y.LIZ("user==null ,do nothing");
                            }
                        }
                        if (atomicBoolean.get()) {
                            C0W4Y.LIZ("is in inbox Tab,recordLeaveInboxTimestamp");
                            C1904150zeP.LIZLLL();
                            C1904100zeK.LIZ.getClass();
                            C1904100zeK.LIZIZ();
                        }
                    }
                    C1C7U.LIZIZ("LandInboxManager@8c28.observeAppStateIfNeed$1");
                }
            });
        } else {
            C0W4Y.LIZJ("user not login,observeAppStateIfNeed return ");
        }
    }

    public static boolean LJ() {
        boolean z = ((Boolean) LandInboxExperiment.LIZLLL.getValue()).booleanValue() && ((Number) LandInboxExperiment.LJI.getValue()).intValue() == 1;
        int iLIZ = LandInboxExperiment.LIZ();
        if (1 > iLIZ || iLIZ >= 6) {
            return z;
        }
        if (!z) {
            return false;
        }
        C1476605qG.LIZ.getClass();
        return C1476605qG.LIZ();
    }

    public static User LIZ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
    }

    public static void LIZLLL() {
        User userLIZ;
        if (LIZ() == null || (userLIZ = LIZ()) == null || userLIZ.getUid() == null) {
            return;
        }
        User userLIZ2 = LIZ();
        if (userLIZ2 == null) {
            C0W4Y.LIZ("user==null ,do nothing");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("landingInboxAbility,updateLatestLeaveInboxTimestamp,,uid=  ");
        sbLIZ.append(userLIZ2.getUid());
        C0W4Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LIZ.getClass();
        IMUserPortraitApi.LIZ.getClass();
        C1730606q8.LIZ().LIZLLL().LJIIJJI(System.currentTimeMillis(), userLIZ2.getUid());
    }

    public static void LJFF(long j) {
        User userLIZ;
        if (LIZ() != null && (userLIZ = LIZ()) != null && userLIZ.getUid() != null) {
            User userLIZ2 = LIZ();
            if (userLIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("landingInboxAbility,updateLatestUnreadInteractionMessageTimestamp,uid=  ");
                sbLIZ.append(userLIZ2.getUid());
                C0W4Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                LIZ.getClass();
                IMUserPortraitApi.LIZ.getClass();
                C1730606q8.LIZ().LIZLLL().LJIILL(j, userLIZ2.getUid());
                return;
            }
            C0W4Y.LIZ("user==null ,do nothing");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        if (c486550J6f.LIZ == 1) {
            LIZJ.set(false);
        }
    }

    public static void LIZIZ(Context context, String str) {
        Aweme aweme;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        String aid = null;
        if (c19egLIZIZ != null) {
            aweme = C680080Qly.LIZIZ(c19egLIZIZ).LLJILJILJ;
        } else {
            aweme = null;
        }
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://search");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        smartRouteBuildRoute.withParam("group_id", aid);
        smartRouteBuildRoute.withParam("enter_from", "notification_page");
        if (!a0.LJJJIL(str)) {
            smartRouteBuildRoute.withParam("keyword", str);
            smartRouteBuildRoute.withParam("enter_method", "search_icon");
        } else {
            smartRouteBuildRoute.withParam("enter_blank_page", "1");
        }
        smartRouteBuildRoute.open();
    }

    public static void LJI(Long l, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLastUnreadNoticeTimeIfNeed,sceneName =");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(l);
        C0W4Y.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (l != null) {
            l.longValue();
            if (l.longValue() > 0) {
                C1904150zeP c1904150zeP = LIZ;
                long jLongValue = l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                c1904150zeP.getClass();
                LJFF(jLongValue);
            }
            if (l.longValue() == -1) {
                LIZ.getClass();
                LJFF(-1L);
            }
        }
    }
}
