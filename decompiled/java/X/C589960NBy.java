package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589960NBy {
    public static Aweme LIZIZ;
    public static Function2<? super Float, ? super Aweme, Unit> LJ;
    public static boolean LJI;
    public static final C589960NBy LIZ = new C589960NBy();
    public static float LIZJ = 1.0f;
    public static float LIZLLL = 1.0f;
    public static final List<Function2<Float, Aweme, Unit>> LJFF = new ArrayList();
    public static float LJII = 1.0f;

    public static boolean LIZ(Aweme aweme) {
        if (C0BYV.LIZ() == 1) {
            return false;
        }
        if (C1009740cNo.LIZLLL(aweme)) {
            return true;
        }
        if (aweme != null && !AwemeBizExtKt.isSubAweme(aweme) && !AwemeSaaSExtKt.isLive(aweme) && aweme.isCanPlay() && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJI(aweme) && !AwemeExtKt.isImage(aweme) && !AwemeExtKt.isPhotoMode(aweme) && !C729510SjV.LJJIJIL(aweme) && !C0NC0.LIZ(aweme)) {
            C1387620mDI.LIZ.getClass();
            if (!C1387620mDI.LJI(aweme) && aweme.getAwemeType() != 4000 && aweme.getAwemeType() != 4001 && aweme.getAwemeType() != 4003 && !AwemeExtKt.isCommentPostInvisible(aweme) && !Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "inner_search_feed_type_rs") && !Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "virtual_inner_search_feed_type_rs") && !AwemeBizExtKt.isReferralFakeAweme(aweme) && aweme.getAwemeType() != 110) {
                return true;
            }
        }
        return false;
    }

    public static float LIZIZ(Aweme aweme) {
        if (!TextUtils.equals(C729980SkG.LIZJ(LIZIZ), C729980SkG.LIZJ(aweme)) && !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJIJL()) {
            return 1.0f;
        }
        return LIZLLL;
    }

    public static float LIZJ(Aweme aweme) {
        if (!TextUtils.equals(C729980SkG.LIZJ(LIZIZ), C729980SkG.LIZJ(aweme)) && !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJIJL()) {
            return 1.0f;
        }
        return LIZJ;
    }

    public static boolean LIZLLL(float f, Aweme aweme) {
        boolean z;
        if (LIZIZ(aweme) == f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static void LJI(Aweme aweme, String str) {
        if (LJI && LJII != 1.0f && LIZ(aweme)) {
            if (str == null) {
                str = "";
            }
            LJ(LJII, aweme, str, "");
        }
    }

    public static void LJ(float f, Aweme aweme, String str, String str2) {
        int iHashCode;
        float f2 = LIZLLL;
        LIZIZ = aweme;
        LIZLLL = f;
        LIZJ = f;
        Function2<? super Float, ? super Aweme, Unit> function2 = LJ;
        if (function2 != null) {
            function2.invoke(Float.valueOf(f), LIZIZ);
        }
        if (str2 != null && ((iHashCode = str2.hashCode()) == -326696768 ? str2.equals("long_press") : iHashCode == 239135977 ? str2.equals("click_share_button") : iHashCode == 1073142495 && str2.equals("swipe_up_lock_persist"))) {
            LJII = f;
        }
        LIZLLL(f, aweme);
        C1440005kM.LIZ(new C589970NBz(f2, str));
        Iterator it2 = ((ArrayList) LJFF).iterator();
        while (it2.hasNext()) {
            ((Function2) it2.next()).invoke(Float.valueOf(f), aweme);
        }
    }

    public static boolean LJFF(Aweme aweme, String str, boolean z, boolean z2) {
        Function2<? super Float, ? super Aweme, Unit> function2;
        String aid;
        String aid2;
        boolean z3 = true;
        if (LIZIZ(aweme) == 1.0f && !z) {
            z3 = false;
        }
        if (z) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = LIZIZ;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            if (!Intrinsics.LJFF(aid, aid2) || z2) {
                C586390MzF c586390MzF = C586390MzF.LIZ;
                Aweme aweme3 = LIZIZ;
                float f = LIZJ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c586390MzF.getClass();
                C586390MzF.LIZ(aweme3, str, f, jCurrentTimeMillis, null);
            }
        }
        LIZIZ = null;
        LIZLLL = 1.0f;
        LIZJ = 1.0f;
        if (!z && (function2 = LJ) != null) {
            function2.invoke(Float.valueOf(1.0f), LIZIZ);
        }
        return z3;
    }
}
