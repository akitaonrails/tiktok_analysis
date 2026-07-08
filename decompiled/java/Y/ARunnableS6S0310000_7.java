package Y;

import X.C0IJT;
import X.C0IVS;
import X.C1121670fIL;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C1C7U;
import X.C474500IjA;
import X.C497740JfY;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.livesetting.performance.LivePreloadRoomImageSetting;
import com.bytedance.android.livesdk.userinfowidget.UserInfoLikeHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS6S0310000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS6S0310000_7 aRunnableS6S0310000_7) {
        boolean z;
        UserInfoLikeHelper userInfoLikeHelper = (UserInfoLikeHelper) aRunnableS6S0310000_7.l0;
        Room room = (Room) aRunnableS6S0310000_7.l1;
        boolean z2 = aRunnableS6S0310000_7.z3;
        ImageView imageView = (ImageView) aRunnableS6S0310000_7.l2;
        userInfoLikeHelper.getClass();
        C1C7U.LIZ("UserInfoLikeHelper@baf5.<init>$1L");
        if (room != null && room.getOwner() != null && room.getOwner().getAvatarThumb() != null) {
            IUserInfoWidgetService iUserInfoWidgetService = (IUserInfoWidgetService) C1161920gLG.LIZJ(IUserInfoWidgetService.class);
            if (iUserInfoWidgetService != null && !iUserInfoWidgetService.YI0(room) && !((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !z2) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(room.getOwner().getAvatarThumb().getUrls());
                Boolean bool = Boolean.TRUE;
                c1324610kZfLIZJ.LJIILIIL = bool;
                c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
                if (!LivePreloadRoomImageSetting.INSTANCE.getConfig().preloadAvatar) {
                    int iLIZIZ = (int) C497740JfY.LIZIZ(32.0f);
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(32.0f);
                    c1324610kZfLIZJ.LJI = iLIZIZ;
                    c1324610kZfLIZJ.LJII = iLIZIZ2;
                    c1324610kZfLIZJ.LJJ = bool;
                }
                c1324610kZfLIZJ.LJJI(imageView);
            } else {
                C1121670fIL.LJIIL(imageView, room.getOwner().getAvatarThumb(), R.drawable.el_);
            }
            C1C7U.LIZIZ("UserInfoLikeHelper@baf5.<init>$1L");
            return;
        }
        C1C7U.LIZIZ("UserInfoLikeHelper@baf5.<init>$1L");
    }

    public static final void run$1(ARunnableS6S0310000_7 aRunnableS6S0310000_7) {
        String str;
        C0IVS c0ivs = (C0IVS) aRunnableS6S0310000_7.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aRunnableS6S0310000_7.l1;
        EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) aRunnableS6S0310000_7.l2;
        boolean z = aRunnableS6S0310000_7.z3;
        c0ivs.getClass();
        C1C7U.LIZ("LiveRoomLog@51df.logRoomDraw$1L");
        if (enterRoomConfig.drawParams.openLiveFromDrawer && !TextUtils.isEmpty(enterRoomConfig.mRoomsData.openLiveFromDrawerTab) && enterRoomConfig.mRoomsData.drawerTabInnerFeedSuggest != enterRoomConfig2.mRoomsData.drawerTabInnerFeedSuggest) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_draw_to_recommend_success");
            c474500IjALIZ.LJJII(enterRoomConfig.mRoomsData.openLiveFromDrawerTab, "from_drawer_tab");
            c474500IjALIZ.LJJII(enterRoomConfig.mRoomsData.enterFromMerge, "enter_from_merge");
            c474500IjALIZ.LJJII(enterRoomConfig.mRoomsData.enterMethod, "enter_method");
            if (z) {
                str = "down";
            } else {
                str = "up";
            }
            c474500IjALIZ.LJJII(str, "draw_action");
            c474500IjALIZ.LIZ();
        }
        C1C7U.LIZIZ("LiveRoomLog@51df.logRoomDraw$1L");
    }

    public ARunnableS6S0310000_7(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
    }
}
