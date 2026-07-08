package X;

import Y.ACListenerS124S0200000_21;
import Y.ACListenerS86S0300000_21;
import Y.ARunnableS44S0300000_11;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0leA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365840leA {
    public static final C1365840leA LIZ = new C1365840leA();
    public static final RunnableC739850T0l LIZIZ = RunnableC739850T0l.LL;
    public static Runnable LIZJ;
    public static final Resources LIZLLL;
    public static String LJ;
    public static final C01GW LJFF;
    public static final RunnableC740710T3t LJI;

    static {
        C844470XAv.LIZ.getClass();
        LIZLLL = C844470XAv.LIZ().getResources();
        LJFF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(612));
        LJI = RunnableC740710T3t.LL;
    }

    public static final boolean LIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        AwemeStatus statusSafety;
        ((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme));
        C735280Sso.LIZ.getClass();
        boolean zLJFF = C735280Sso.LJFF(aweme);
        if (AwemeExtKt.isProhibited(aweme) || AwemeExtKt.isDelete(aweme) || (AwemeExtKt.isSelfSee(aweme) && AwemeExtKt.isReviewed(aweme))) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZIZ = C0OAD.LIZIZ(aweme);
        boolean z3 = !aweme.getAwemeControl().canShare();
        boolean zLJJLIL = C1017070cZd.LJJLIL(aweme);
        if (aweme.isAd() && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && !statusSafety.isAllowShare()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!zLJFF && !z && !zLIZIZ && !z3 && !zLJJLIL && !z2) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(IMContact iMContact) {
        if (iMContact == null) {
            return "";
        }
        if (!(iMContact instanceof IMUser)) {
            String displayName = iMContact.getDisplayName();
            if (displayName == null) {
                return "";
            }
            return displayName;
        }
        String displayName2 = iMContact.getDisplayName();
        if (displayName2 == null) {
            return "";
        }
        return displayName2;
    }

    public static void LIZJ(long j) {
        Handler handlerLIZJ = C799570VYd.LIZJ();
        RunnableC739850T0l runnableC739850T0l = LIZIZ;
        handlerLIZJ.removeCallbacks(runnableC739850T0l);
        C786410Ut5.LJLIIL(j, C799570VYd.LIZJ(), runnableC739850T0l);
    }

    public static boolean LJFF(String str) {
        if (str == null) {
            return false;
        }
        if ((!TextUtils.equals(str, "long_press") && !TextUtils.equals(str, "share_panel")) || C1369210ljb.LIZLLL(str) != EnumC992940bwi.IM_SHARE_UNDO_STYLE_TOAST.ordinal()) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C1365870leD c1365870leD) {
        Object obj;
        if (c1365870leD.LJIIIIZZ) {
            return true;
        }
        IIMChatRoomService iIMChatRoomService = (IIMChatRoomService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomService.class, false, false, false, 14, null);
        if (iIMChatRoomService != null && iIMChatRoomService.LIZ()) {
            return true;
        }
        if ((Intrinsics.LJFF(c1365870leD.LJ, "others_homepage") || Intrinsics.LJFF(c1365870leD.LJ, "personal_homepage")) && c1365870leD.LJI == null) {
            return true;
        }
        if (Intrinsics.LJFF(c1365870leD.LJ, "group") && Intrinsics.LJFF(c1365870leD.LIZLLL, "group")) {
            return true;
        }
        C1365840leA c1365840leA = LIZ;
        String str = c1365870leD.LJFF;
        c1365840leA.getClass();
        if (LJFF(str)) {
            return true;
        }
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "search")) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                obj = abstractC1387200mCcLIZIZ.LIZ;
            } else {
                obj = null;
            }
            if (obj instanceof C0PE2) {
                SAFHelper.LIZ.getClass();
                if (SAFHelper.LJIIJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void LJII(C1365850leB c1365850leB, C0R52 c0r52) {
        C1389910mGz c1389910mGzWQ2;
        String string;
        if (c0r52 == null || c1365850leB.LJIILIIL) {
            return;
        }
        C1365840leA c1365840leA = LIZ;
        String str = c1365850leB.LJII;
        c1365840leA.getClass();
        if (LJFF(str) || (c1389910mGzWQ2 = c0r52.LIZ.wQ2()) == null) {
            return;
        }
        c1389910mGzWQ2.LIZ.LIZLLL = 2;
        c1389910mGzWQ2.LJFF(2131857731);
        c1389910mGzWQ2.LJI(R.style.y0);
        if (!c1365850leB.LJIIIIZZ) {
            c1389910mGzWQ2.LJIIIIZZ(false);
        }
        if (!c1365850leB.LJIIIZ) {
            c1389910mGzWQ2.LJII(false);
        }
        if (c1365850leB.LJ) {
            string = LIZLLL.getString(2131847377, c1365850leB.LIZLLL.getDisplayName());
        } else {
            IMContact iMContact = c1365850leB.LIZLLL;
            if ((iMContact instanceof IMConversation) && c1365850leB.LJIIJ) {
                string = LIZLLL.getString(2131835378);
            } else {
                string = LIZLLL.getString(2131847376, iMContact.getDisplayName());
            }
        }
        c1389910mGzWQ2.LJIIJ(string);
        ACListenerS124S0200000_21 aCListenerS124S0200000_21 = new ACListenerS124S0200000_21(c1365850leB, c1389910mGzWQ2, 85);
        C1360890lWB c1360890lWB = c1389910mGzWQ2.LIZ;
        c1360890lWB.LJIIIIZZ = aCListenerS124S0200000_21;
        c1360890lWB.LIZIZ = 4;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1389910mGzWQ2.LJIIL(c419910GdJ);
        c1389910mGzWQ2.LJ(c1365850leB.LIZJ);
        c1389910mGzWQ2.LJIIJJI();
    }

    public static final void LJIIIIZZ(C1365860leC c1365860leC, C0R52 c0r52) {
        C1389910mGz c1389910mGzWQ2;
        if (c0r52 == null) {
            return;
        }
        C1365840leA c1365840leA = LIZ;
        String str = c1365860leC.LJFF;
        c1365840leA.getClass();
        if (LJFF(str) || c1365860leC.LJI || (c1389910mGzWQ2 = c0r52.LIZ.wQ2()) == null) {
            return;
        }
        if (!c1365860leC.LIZLLL) {
            c1389910mGzWQ2.LJIIIIZZ(false);
        }
        if (!c1365860leC.LJ) {
            c1389910mGzWQ2.LJII(false);
        }
        c1389910mGzWQ2.LJIIJ(LIZLLL.getString(2131822806));
        c1389910mGzWQ2.LIZ.LIZLLL = 3;
        c1389910mGzWQ2.LJI(R.style.y0);
        c1389910mGzWQ2.LIZ.LIZIZ = 1;
        c1389910mGzWQ2.LJ(c1365860leC.LIZJ);
        c1389910mGzWQ2.LJIIJJI();
        LIZJ(c1365860leC.LIZJ);
    }

    public static final void LIZLLL(C1365870leD c1365870leD, C0R52 c0r52, long j, Aweme aweme) {
        if (j != 0) {
            Runnable runnable = LIZJ;
            if (runnable != null) {
                LIZJ = null;
                C799570VYd.LIZJ().removeCallbacks(runnable);
            }
            ARunnableS44S0300000_11 aRunnableS44S0300000_11 = new ARunnableS44S0300000_11(aweme, c1365870leD, c0r52, 25);
            LIZJ = aRunnableS44S0300000_11;
            C786410Ut5.LJLIIL(j, C799570VYd.LIZJ(), aRunnableS44S0300000_11);
            return;
        }
        C2487409ou.LIZJ(new ARunnableS44S0300000_11(aweme, c1365870leD, c0r52, 24));
    }

    public static final void LJ(C1365870leD c1365870leD, C0R52 c0r52, Aweme aweme, long j) {
        C1389910mGz c1389910mGzWQ2;
        IMContact iMContact;
        String string;
        if (c0r52 == null || LJI(c1365870leD) || c1365870leD.LJIILIIL || (c1389910mGzWQ2 = c0r52.LIZ.wQ2()) == null) {
            return;
        }
        c1389910mGzWQ2.LIZ.LJIIIIZZ = new ACListenerS86S0300000_21(new C013C(), c1365870leD, aweme, 15);
        List<IMContact> list = c1365870leD.LIZIZ;
        if (list == null || (iMContact = (IMContact) C13LP.LJJJLL(list)) == null) {
            iMContact = c1365870leD.LIZ;
        }
        if (c1365870leD.LJIIIIZZ) {
            string = LIZLLL.getString(2131832049);
        } else if (c1365870leD.LJIIJ > 2) {
            Resources resources = LIZLLL;
            LIZ.getClass();
            string = resources.getString(2131825153, LIZIZ(iMContact), Integer.valueOf(c1365870leD.LJIIJ - 1));
        } else if (c1365870leD.LIZJ) {
            Resources resources2 = LIZLLL;
            LIZ.getClass();
            string = resources2.getString(2131825152, LIZIZ(iMContact));
        } else if ((c1365870leD.LIZ instanceof IMConversation) && c1365870leD.LJII) {
            string = LIZLLL.getString(2131835378);
        } else {
            Resources resources3 = LIZLLL;
            LIZ.getClass();
            string = resources3.getString(2131835475, LIZIZ(iMContact));
        }
        c1389910mGzWQ2.LJIIJ(string);
        c1389910mGzWQ2.LJI(R.style.y0);
        C1360890lWB c1360890lWB = c1389910mGzWQ2.LIZ;
        c1360890lWB.LIZLLL = 0;
        c1360890lWB.LIZIZ = 0;
        if (j <= 0) {
            if (!c1365870leD.LJIIL) {
                j = 3000;
            } else {
                j = 2147483647L;
            }
        }
        c1389910mGzWQ2.LJ(j);
        LIZ.getClass();
        LIZJ(j);
        C1391850mK7.LIZIZ(c1389910mGzWQ2, "sent_to_message_succeed_bottomwindow");
        c1389910mGzWQ2.LJIIJJI();
        if (Intrinsics.LJFF(c1365870leD.LJFF, "share_panel") || Intrinsics.LJFF(c1365870leD.LJFF, "share_button")) {
            Handler handlerLIZJ = C799570VYd.LIZJ();
            RunnableC740710T3t runnableC740710T3t = LJI;
            handlerLIZJ.removeCallbacks(runnableC740710T3t);
            C786410Ut5.LJLIIL(j + ((long) 200), C799570VYd.LIZJ(), runnableC740710T3t);
        }
    }
}
