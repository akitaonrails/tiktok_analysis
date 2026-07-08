package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591860rWi {
    public static final boolean LIZIZ(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || C20286514Zj.LJFF(aweme) || C1594680rbG.LJII(aweme) || C1594680rbG.LJI(aweme) || C1594680rbG.LJIIJ(aweme)) {
            return false;
        }
        if ((aweme.getAwemeRawAd() != null && ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJI(aweme)) || AwemeSaaSExtKt.isLive(aweme) || AwemeExtKt.isPhotoMode(aweme)) {
            return false;
        }
        C1387620mDI.LIZ.getClass();
        if (C1387620mDI.LJI(aweme)) {
            return false;
        }
        C01GW c01gw = C0AHK.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue() && (((Boolean) c01gw.getValue()).booleanValue() || (videoControl = aweme.getVideoControl()) == null || videoControl.draftProgressBar == 0)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.showProgressBar == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZLLL(Fragment fragment) {
        if (fragment instanceof InterfaceC1591870rWj) {
            InterfaceC1591870rWj interfaceC1591870rWj = (InterfaceC1591870rWj) fragment;
            if (Intrinsics.LJFF("FeedFollowFragment", interfaceC1591870rWj.wm()) || Intrinsics.LJFF("FeedRecommendFragment", interfaceC1591870rWj.wm()) || Intrinsics.LJFF("FeedLearnFragment", interfaceC1591870rWj.wm()) || Intrinsics.LJFF("FeedPopularFragment", interfaceC1591870rWj.wm()) || Intrinsics.LJFF("NearByFragment", interfaceC1591870rWj.wm()) || Intrinsics.LJFF("SocialFriendsFeedFragment", interfaceC1591870rWj.wm()) || Intrinsics.LJFF("RepostFeedFragment", interfaceC1591870rWj.wm()) || C2277711EDh.LIZIZ.LJJIJL(interfaceC1591870rWj.wm()) || C1591530rWB.LIZIZ.M7(interfaceC1591870rWj.wm())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJ(String str) {
        Object obj;
        String str2;
        if (!Intrinsics.LJFF("homepage_hot", str) && !Intrinsics.LJFF("homepage_playmode_new", str) && !Intrinsics.LJFF("homepage_playmode_top", str) && !Intrinsics.LJFF("homepage_playmode_moodboost", str) && !Intrinsics.LJFF("homepage_follow", str) && !Intrinsics.LJFF("homepage_learn", str) && !Intrinsics.LJFF("homepage_friends", str) && !Intrinsics.LJFF("homepage_popular", str)) {
            C1591530rWB c1591530rWB = C1591530rWB.LIZIZ;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            if (!c1591530rWB.N7(str2) && !Intrinsics.LJFF("homepage_nearby", str) && !C0R93.LJI(str) && !C2277711EDh.LIZIZ.LJJIII(str) && !Intrinsics.LJFF("repost_feed", str)) {
                return false;
            }
        }
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null) {
            obj = abstractC1387200mCcLJFF.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC1603190roz) {
            return true;
        }
        return false;
    }

    public static final void LIZ(View view, Function1<? super View, Boolean> function1) {
        view.addOnLayoutChangeListener(new C0IDP(function1, 10));
    }

    public static final void LJFF(int i, View view) {
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void LJI(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (Intrinsics.LJFF(layoutParams, layoutParams2)) {
            layoutParams2.width = i2;
            layoutParams2.height = i;
            layoutParams2.gravity = i4;
            layoutParams2.bottomMargin = i3;
        } else {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (Intrinsics.LJFF(layoutParams, layoutParams3)) {
                layoutParams2.width = i2;
                layoutParams2.height = i;
                if ((i4 & 80) != 0) {
                    layoutParams3.addRule(12);
                }
                if ((i4 & 1) != 0) {
                    layoutParams3.addRule(14);
                }
                layoutParams2.bottomMargin = i3;
            } else {
                layoutParams2.width = i2;
                layoutParams2.height = i;
                layoutParams2.bottomMargin = i3;
            }
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
