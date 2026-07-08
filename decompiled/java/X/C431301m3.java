package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.01m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C431301m3 extends C0J8P<C01UP, C431401m4> {
    public final Context LIZIZ;
    public final DataChannel LIZJ;
    public final C11NJ LIZLLL;
    public final String LJ = "GuestShowdownRankDialog";
    public final Function0<Unit> LJFF;

    public final void LJIIIIZZ(GuestShowdownUser guestShowdownUser) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Context context = this.LIZIZ;
        C11NJ c11nj = this.LIZLLL;
        c930480aJy.getClass();
        if (!C930480aJy.LJ("openUserProfile", context, c11nj)) {
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(guestShowdownUser.userId, "multi_guest");
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "profile_card";
        userProfileEvent.cardEnterFrom = "guest_ranking_popup";
        User.EnigmaInfo enigmaInfo = guestShowdownUser.enigmaInfo;
        if (enigmaInfo != null) {
            userProfileEvent.setEnigmaOutside(enigmaInfo.isEnigmaMaskOn);
        }
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C01UP c01up) {
        String strValueOf;
        List<String> listLIZ;
        boolean z;
        float f;
        User.EnigmaInfo enigmaInfo;
        int i;
        C431401m4 c431401m4 = (C431401m4) viewHolder;
        C01UP c01up2 = c01up;
        GuestShowdownUser guestShowdownUser = c01up2.LIZ;
        String str = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().dialogIconUrlMap.get(guestShowdownUser.iconName);
        if (str == null) {
            str = "";
        }
        boolean z2 = true;
        if (str.length() == 0 || ((i = guestShowdownUser.userTag) != 2 && i != 3)) {
            C12ES.LJIILL(0, (View) c431401m4.LLILLL.getValue());
            C439101nJ.LJI((View) c431401m4.LLJIJIL.getValue());
            TextView textView = (TextView) c431401m4.LLILLJJLI.getValue();
            int i2 = guestShowdownUser.rank;
            if (i2 > 0) {
                strValueOf = String.valueOf(i2);
            } else {
                strValueOf = "-";
            }
            textView.setText(strValueOf);
        } else {
            C439101nJ.LJI((View) c431401m4.LLILLL.getValue());
            C12ES.LJIILL(0, (View) c431401m4.LLJIJIL.getValue());
            C1819620xS4.LIZ().setUrl(str).LJJI((View) c431401m4.LLJIJIL.getValue());
        }
        C500260Jjc.LJLJLJ((View) c431401m4.LLJ.getValue(), true);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel imageModel = guestShowdownUser.avatarThumb;
        String strLJII = null;
        if (imageModel != null) {
            listLIZ = C842240X2g.LIZ(imageModel);
        } else {
            listLIZ = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
        c1324610kZfLIZJ.LJJI((View) c431401m4.LLILZ.getValue());
        C500260Jjc.LJLIIIL(500L, (View) c431401m4.LLILZ.getValue(), new C020W(this, guestShowdownUser, 79));
        ((TextView) c431401m4.LLILZIL.getValue()).setText(C0KVU.LIZIZ(guestShowdownUser.displayId, guestShowdownUser.nickname));
        C500260Jjc.LJLIIIL(500L, (View) c431401m4.LLILZIL.getValue(), new C020W(this, guestShowdownUser, 80));
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            strLJII = multiGuestDataHolder.LJII();
        }
        if (strLJII != null) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                url.LJIIJJI = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, this.LIZIZ, Integer.valueOf(c431401m4.I5().getWidth()), Integer.valueOf(c431401m4.I5().getHeight()));
            } else {
                url.LJIIIZ = R.drawable.emi;
            }
            url.LJJI(c431401m4.I5());
        } else if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
            c431401m4.I5().setImageDrawable(C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, this.LIZIZ, Integer.valueOf(c431401m4.I5().getWidth()), Integer.valueOf(c431401m4.I5().getHeight())));
        } else {
            c431401m4.I5().setImageResource(R.drawable.emi);
        }
        ((TextView) c431401m4.LLIZ.getValue()).setText(C497740JfY.LJIJJ(2131852938, C1850730yGF.LJFF(guestShowdownUser.score)));
        C12ES.LJIILL(0, (View) c431401m4.LLIZLLLIL.getValue());
        if (guestShowdownUser.userId != UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        ((View) c431401m4.LLIZLLLIL.getValue()).setEnabled(z);
        View view = (View) c431401m4.LLJI.getValue();
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.T4(view, f);
        ((View) c431401m4.LLIZLLLIL.getValue()).setEnabled(z);
        View view2 = (View) c431401m4.LLJI.getValue();
        if (!z) {
            f2 = 0.5f;
        }
        C786410Ut5.T4(view2, f2);
        C500260Jjc.LJLIIIL(500L, (View) c431401m4.LLIZLLLIL.getValue(), new C020W(this, guestShowdownUser, 81));
        if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount()) {
            C500260Jjc.LJLJLJ((View) c431401m4.LLJILJIL.getValue(), true);
            C433001mK c433001mK = (C433001mK) c431401m4.LLJILJILJ.getValue();
            if (c01up2.LIZ.userId != C930540aK4.LJIIL() && !C932290aMt.LIZIZ(c01up2.LIZ.userId, false)) {
                z2 = false;
            }
            User user = new User();
            user.setId(c01up2.LIZ.userId);
            if (z2) {
                C1126540fQC c1126540fQC = c433001mK.LIZ;
                if (c1126540fQC != null) {
                    C439101nJ.LJI(c1126540fQC);
                    c1126540fQC.setEnabled(false);
                }
            } else {
                c433001mK.LIZ(user, "normal");
            }
        } else {
            C500260Jjc.LJLJLJ((View) c431401m4.LLJILJIL.getValue(), false);
        }
        GuestShowdownUser guestShowdownUser2 = c01up2.LIZ;
        if (guestShowdownUser2 != null && (enigmaInfo = guestShowdownUser2.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn) {
            C500260Jjc.LJLJLJ((View) c431401m4.LLJILJIL.getValue(), false);
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C431401m4(viewGroup, this.LJ);
    }

    public C431301m3(Context context, DataChannel dataChannel, C11NJ c11nj, C5182020e c5182020e) {
        this.LIZIZ = context;
        this.LIZJ = dataChannel;
        this.LIZLLL = c11nj;
        this.LJFF = c5182020e;
    }
}
