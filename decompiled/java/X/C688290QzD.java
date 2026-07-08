package X;

import Y.ALAdapterS3S0100000_6;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.config.Crowd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.search.passive.feedbar.enhancement.SearchFeedBarVisualEnhancementConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0QzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688290QzD {
    public static final C688290QzD LIZ = new C688290QzD();
    public static final SearchFeedBarVisualEnhancementConfig LIZIZ = new SearchFeedBarVisualEnhancementConfig(false, 0, 0, null, 0, 0.0f, 0, 0, null, 511, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(384));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(376));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(378));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(383));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(377));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(380));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(382));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(379));
    public static final C01GW LJIIJ;
    public static boolean LJIIJJI;
    public static final List<String> LJIIL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(381));
        LJIIJ = c01gwLIZIZ;
        LJIIJJI = LIZLLL().getBoolean((String) c01gwLIZIZ.getValue(), false);
        LJIIL = new ArrayList();
    }

    public static Keva LIZLLL() {
        return (Keva) LJ.getValue();
    }

    public static String LJFF() {
        return (String) LJFF.getValue();
    }

    public static SearchFeedBarVisualEnhancementConfig LJI() {
        return (SearchFeedBarVisualEnhancementConfig) LIZJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688290QzD.LJIIJJI():boolean");
    }

    public static C443120HZe LJIIL() {
        String string;
        Integer num;
        int iIntValue;
        C311300CIe.LIZ.getClass();
        Crowd crowdLIZ = C311300CIe.LIZ();
        boolean z = false;
        if (crowdLIZ != null && (num = crowdLIZ.enableFeedbarSugReason) != null && 100 <= (iIntValue = num.intValue()) && iIntValue < 200) {
            z = true;
        }
        if (z) {
            long jLIZJ = LIZJ();
            return !LJIIIIZZ(jLIZJ) ? new C443120HZe(Boolean.FALSE, "200", EnumC688310QzF.CLICK_EXCEEDED) : !LJIIIZ(jLIZJ) ? new C443120HZe(Boolean.FALSE, "200", EnumC688310QzF.SHOW_EXCEEDED) : new C443120HZe(Boolean.TRUE, null, null);
        }
        Crowd crowdLIZ2 = C311300CIe.LIZ();
        Integer num2 = crowdLIZ2 != null ? crowdLIZ2.enableFeedbarSugReason : null;
        Boolean bool = Boolean.FALSE;
        if (num2 == null || (string = num2.toString()) == null) {
            string = "";
        }
        return new C443120HZe(bool, string, null);
    }

    public static boolean LIZ() {
        Integer numValueOf;
        if (LJI().enhancementStyle == 0 || !(!LJI().enabledEnterFromList.isEmpty())) {
            return false;
        }
        C311300CIe.LIZ.getClass();
        Crowd crowdLIZ = C311300CIe.LIZ();
        return (crowdLIZ == null || (numValueOf = Integer.valueOf(crowdLIZ.showFeedbarSeeMore)) == null || !new IntRange(100, 199).LJLJL(numValueOf.intValue())) ? false : true;
    }

    public static long LIZJ() {
        INetwork iNetwork;
        return C1387330mCp.LIZ((LJI().enableDebug || (iNetwork = (INetwork) LJI.getValue()) == null) ? System.currentTimeMillis() : iNetwork.LIZIZ()).LIZ;
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("x_days_has_shown_for_one_day_exit_");
        sbLIZ.append(LJFF());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIILJJIL() {
        if (LIZ()) {
            return (C301480Brm.LIZ() || C1821207Bi.LIZIZ) ? ((Boolean) LJIIL().getFirst()).booleanValue() : LJIIJJI();
        }
        return false;
    }

    public static String LIZIZ(String[] strArr) {
        Object c098200Yq;
        try {
            c098200Yq = C13LQ.LJJJ(strArr, ",", null, null, AFwS241S0000000_10.get$arr$(409), 30);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }

    public static void LJII(TuxTextView tuxTextView) {
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        if (tuxTextView != null) {
            C786410Ut5.T4(tuxTextView, 0.0f);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = tuxTextView.animate();
            if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null && (interpolator = duration.setInterpolator(new LinearInterpolator())) != null && (listener = interpolator.setListener(new ALAdapterS3S0100000_6(tuxTextView, 28))) != null) {
                listener.start();
            }
        }
    }

    public static boolean LJIIIIZZ(long j) {
        String[] stringArray = LIZLLL().getStringArray((String) LJIIIZ.getValue(), new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            if (true ^ Intrinsics.LJFF(str, String.valueOf(j))) {
                arrayList.add(str);
            }
        }
        if (stringArray.length >= LJI().dailyClickThreshold && !(!arrayList.isEmpty())) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(long j) {
        Integer num = LJI().dailyShowThreshold;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        LIZ.getClass();
        String[] stringArray = LIZLLL().getStringArray(LJ(), new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            if (!Intrinsics.LJFF(str, String.valueOf(j))) {
                arrayList.add(str);
            }
        }
        if (stringArray.length < iIntValue || (!arrayList.isEmpty())) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(String str) {
        try {
            LIZ.getClass();
            Integer num = LJI().dailyShowThreshold;
            Unit unit = null;
            if (num != null) {
                int iIntValue = num.intValue();
                if (str.length() > 0) {
                    List<String> list = LJIIL;
                    if (!((ArrayList) list).contains(str)) {
                        ((ArrayList) list).add(str);
                        long jLIZJ = LIZJ();
                        String[] stringArray = LIZLLL().getStringArray(LJ(), new String[0]);
                        String strValueOf = String.valueOf(jLIZJ);
                        List listLJLI = C13LQ.LJLI(stringArray);
                        ((ArrayList) listLJLI).add(0, strValueOf);
                        LIZLLL().storeStringArray(LJ(), (String[]) C13LP.LL(listLJLI, iIntValue).toArray(new String[0]));
                        if (LJI().enableDebug) {
                            String[] strArr = (String[]) ((ArrayList) C13LQ.LJLI(LIZLLL().getStringArray(LJ(), new String[0]))).toArray(new String[0]);
                            Keva kevaLIZLLL = LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("debug_shows_");
                            sbLIZ.append(LJFF());
                            kevaLIZLLL.storeString(C2188811AlT.LIZIZ(sbLIZ), LIZIZ(strArr));
                        }
                        C20009113Qr.LIZIZ(LIZLLL().getStringArray(LJ(), new String[0]));
                    }
                    unit = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIIJ(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("words_source", "related_search_anchor_v2");
        c2344009Gk.LJFF("words_content", str);
        c2344009Gk.LJFF("search_position", str2);
        c2344009Gk.LJFF("impr_id", str3);
        c2344009Gk.LJFF("group_id", str4);
        c2344009Gk.LJFF("last_from_group_id", str5);
        c2344009Gk.LJFF("last_feed_group_id", str6);
        c2344009Gk.LJFF("words_label", str7);
        c2344009Gk.LJFF("query_recommend", str8);
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_folded", str9);
        }
        C20684815ws.LJIILLIIL("trending_words_label_show", c2344009Gk.LIZ);
    }
}
