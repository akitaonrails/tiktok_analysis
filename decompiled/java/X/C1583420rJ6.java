package X;

import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.RepostUserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583420rJ6 {
    public static volatile boolean LIZIZ;
    public static C0P0T LIZJ;
    public static C20656615sK LIZLLL;
    public static volatile int LJ;
    public static volatile int LJFF;
    public static volatile int LJI;
    public static final C1583420rJ6 LIZ = new C1583420rJ6();
    public static final C01GW LJII = C452501pT.LIZ(EnumC452301pR.NONE, AFwS213S0000000_24.get$arr$(696));

    public static boolean LIZ() {
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        NewContentResponse latestResponse;
        NewContentResponse.RepostFeedRedDotResponse repostFeedResponse;
        List<RepostUserNewContent> distinctAvatarList;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL;
        if (LIZIZ) {
            return false;
        }
        StateOwner stateOwner = StateOwner.LL;
        C19EG c19egLIZIZ = stateOwner.LIZIZ();
        String strNk0 = null;
        if (c19egLIZIZ == null || (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) == null || !iBottomTabLayoutAbilityLJIIIZ.hv0()) {
            return false;
        }
        C19EG c19egLIZIZ2 = stateOwner.LIZIZ();
        if (c19egLIZIZ2 != null && (iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ2, null))) != null) {
            strNk0 = iFriendsTabLayoutAbilityLIZLLL.nk0();
        }
        return (Intrinsics.LJFF(strNk0, "REPOST_FEED") || (latestResponse = C1595430rcT.LIZIZ.LIZIZ().getLatestResponse()) == null || (repostFeedResponse = latestResponse.getRepostFeedResponse()) == null || (distinctAvatarList = repostFeedResponse.getDistinctAvatarList()) == null || distinctAvatarList.isEmpty()) ? false : true;
    }

    public static void LIZIZ(View view) {
        NewContentResponse.RepostFeedRedDotResponse repostFeedResponse;
        List<RepostUserNewContent> distinctAvatarList;
        RepostUserNewContent repostUserNewContent;
        UrlModel urlModel;
        if (!LIZ()) {
            C20656615sK c20656615sK = LIZLLL;
            if (c20656615sK != null) {
                c20656615sK.LIZ();
                return;
            }
            return;
        }
        C0P0T c0p0t = LIZJ;
        if (c0p0t != null && c0p0t.isShowing()) {
            C20656615sK c20656615sK2 = LIZLLL;
            if (c20656615sK2 != null) {
                c20656615sK2.LIZ();
                return;
            }
            return;
        }
        NewContentResponse latestResponse = C1595430rcT.LIZIZ.LIZIZ().getLatestResponse();
        if (latestResponse != null && (repostFeedResponse = latestResponse.getRepostFeedResponse()) != null && (distinctAvatarList = repostFeedResponse.getDistinctAvatarList()) != null && (repostUserNewContent = (RepostUserNewContent) C13LP.LJJJLZIJ(0, distinctAvatarList)) != null) {
            C013C c013c = new C013C();
            C1391550mJd c1391550mJd = new C1391550mJd(view.getContext());
            Context context = view.getContext();
            FriendsRedDotUser user = repostUserNewContent.getUser();
            if (user != null) {
                urlModel = user.avatarThumb;
            } else {
                urlModel = null;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            layoutParams.gravity = 16;
            linearLayout.addView(imageView, layoutParams);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIIZZ.LJJI(imageView);
            c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.CENTER_CROP;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(61);
            tuxTextView.setTextColorRes(R.attr.ee);
            tuxTextView.setText(2131824782);
            tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(234)));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            linearLayout.addView(tuxTextView, layoutParams2);
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LJIIZILJ = linearLayout;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LJJII = AFwS289S0000000_6.get$arr$(60);
            c1391600mJi.LJIIJ = 300L;
            c1391600mJi.LJII = 3300L;
            c1391550mJd.LJI(C960203pA.LIZ(R.attr.e4, view.getContext()));
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LIZLLL = enumC1235690iGF;
            c1391600mJi2.LJIJJ = false;
            c1391550mJd.LJIIIZ(true, new ACListenerS158S0100000_24(c013c, 133));
            c1391550mJd.LJ(new AwS568S0100000_24(repostUserNewContent, 1911));
            c1391550mJd.LIZJ(new AwS603S0100000_24(c013c, 703));
            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
            LIZJ = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            LIZIZ = true;
            return;
        }
        C20656615sK c20656615sK3 = LIZLLL;
        if (c20656615sK3 != null) {
            c20656615sK3.LIZ();
        }
    }
}
