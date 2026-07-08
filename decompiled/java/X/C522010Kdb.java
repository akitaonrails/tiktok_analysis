package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveE2EFullScreenFallbackSetting;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.PcsCourseDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522010Kdb implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            case 3:
                return onApplyWindowInsets$3(this, view, c20246014Ju);
            case 4:
                return onApplyWindowInsets$4(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C522010Kdb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C522010Kdb c522010Kdb, View view, C20246014Ju c20246014Ju) {
        int paddingTop;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        int i = c20244914JjLIZ.LIZ;
        C1836920xty c1836920xtyNR = ((PcsCourseDetailFragment) c522010Kdb.l0).NR();
        if (c1836920xtyNR != null && c1836920xtyNR.LLIZLLLIL) {
            paddingTop = c20244914JjLIZ.LIZIZ;
        } else {
            paddingTop = view.getPaddingTop();
        }
        view.setPadding(i, paddingTop, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C522010Kdb c522010Kdb, View view, C20246014Ju c20246014Ju) {
        Integer numLIZJ;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        view.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
        Context context = ((DetailSafRootFragment) c522010Kdb.l0).getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$2(C522010Kdb c522010Kdb, View view, C20246014Ju c20246014Ju) {
        LivePlayActivity livePlayActivity = (LivePlayActivity) c522010Kdb.l0;
        String str = LivePlayActivity._pnsPageId;
        livePlayActivity.getClass();
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        if (LiveE2EFullScreenFallbackSetting.INSTANCE.getValue()) {
            livePlayActivity.LLILLJJLI.getLayoutParams().height = c20244914JjLIZ.LIZIZ;
            livePlayActivity.LLILLL.getLayoutParams().height = c20244914JjLIZ.LIZLLL;
            livePlayActivity.LLILZ.getLayoutParams().width = c20244914JjLIZ.LIZ;
            livePlayActivity.LLILZIL.getLayoutParams().width = c20244914JjLIZ.LIZJ;
            return c20246014Ju;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("portraitTopInsetHeight =");
        sbLIZ.append(c20244914JjLIZ.LIZIZ);
        C20441214yg.LIZIZ("LivePlayE2E", C2188811AlT.LIZIZ(sbLIZ));
        if (c20244914JjLIZ.LIZIZ > 0 && !C500260Jjc.LJJII(livePlayActivity.getRequestedOrientation())) {
            livePlayActivity.LLILZLL = c20244914JjLIZ.LIZIZ;
        }
        if ((livePlayActivity.getWindow().getAttributes().flags & 1024) != 0) {
            livePlayActivity.LLILZLL = 0;
        }
        if (!C500260Jjc.LJJII(livePlayActivity.getRequestedOrientation())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("portraitTopInsetHeight -- 1 =");
            sbLIZ2.append(livePlayActivity.LLILZLL);
            C20441214yg.LIZIZ("LivePlayE2E", C2188811AlT.LIZIZ(sbLIZ2));
            livePlayActivity.LLILLJJLI.getLayoutParams().height = livePlayActivity.LLILZLL;
            livePlayActivity.LLILLL.getLayoutParams().height = c20244914JjLIZ.LIZLLL;
            livePlayActivity.LLILZ.getLayoutParams().width = 0;
            livePlayActivity.LLILZIL.getLayoutParams().width = 0;
            return c20246014Ju;
        }
        livePlayActivity.LLILLJJLI.getLayoutParams().height = 0;
        livePlayActivity.LLILLL.getLayoutParams().height = 0;
        livePlayActivity.LLILZ.getLayoutParams().width = c20244914JjLIZ.LIZ;
        livePlayActivity.LLILZIL.getLayoutParams().width = c20244914JjLIZ.LIZJ;
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$3(C522010Kdb c522010Kdb, View view, C20246014Ju c20246014Ju) {
        C0KXU c0kxu = (C0KXU) c522010Kdb.l0;
        if (c0kxu.LL) {
            c0kxu.e0(c20246014Ju.LIZ(2).LIZLLL);
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$4(C522010Kdb c522010Kdb, View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) c522010Kdb.l0;
        subscriptionPrivilegeDetailFragment.LLLLIILLL = c20244914JjLIZ.LIZIZ;
        subscriptionPrivilegeDetailFragment.LLLLIL = c20244914JjLIZ.LIZLLL;
        subscriptionPrivilegeDetailFragment.FS();
        ((SubscriptionPrivilegeDetailFragment) c522010Kdb.l0).ES();
        return c20246014Ju;
    }
}
