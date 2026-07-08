package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.01m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C431501m5 extends C0J8P<GuestShowdownUser, C431601m6> {
    public final Context LIZIZ;
    public final String LIZJ = "GuestShowdownEndDialog";
    public final C11NJ LIZLLL = new C11NJ();

    public C431501m5(Context context) {
        this.LIZIZ = context;
    }

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        this.LIZLLL.LJ();
    }

    public final void LJIIIIZZ(GuestShowdownUser guestShowdownUser) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Context context = this.LIZIZ;
        C11NJ c11nj = this.LIZLLL;
        c930480aJy.getClass();
        if (!C930480aJy.LJ("openUserProfile", context, c11nj)) {
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(guestShowdownUser.userId, "live_show_guest");
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "profile_card";
        userProfileEvent.cardEnterFrom = "guest_ranking";
        User.EnigmaInfo enigmaInfo = guestShowdownUser.enigmaInfo;
        if (enigmaInfo != null) {
            userProfileEvent.setEnigmaOutside(enigmaInfo.isEnigmaMaskOn);
        }
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, GuestShowdownUser guestShowdownUser) {
        List<String> listLIZ;
        String strValueOf;
        int i;
        boolean z;
        C431601m6 c431601m6 = (C431601m6) viewHolder;
        GuestShowdownUser guestShowdownUser2 = guestShowdownUser;
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel imageModel = guestShowdownUser2.avatarThumb;
        if (imageModel != null) {
            listLIZ = C842240X2g.LIZ(imageModel);
        } else {
            listLIZ = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
        c1324610kZfLIZJ.LJJI((View) c431601m6.LLILLL.getValue());
        C786410Ut5.Q7((ImageView) c431601m6.LLILLL.getValue(), new ViewOnClickListenerC511801z2(this, guestShowdownUser2, 19));
        if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount()) {
            C433001mK c433001mK = (C433001mK) c431601m6.LLIZLLLIL.getValue();
            if (guestShowdownUser2.userId != C930540aK4.LJIIL() && !C932290aMt.LIZIZ(guestShowdownUser2.userId, false)) {
                z = false;
            } else {
                z = true;
            }
            User user = new User();
            user.setId(guestShowdownUser2.userId);
            if (z) {
                C1126540fQC c1126540fQC = c433001mK.LIZ;
                if (c1126540fQC != null) {
                    C439101nJ.LJI(c1126540fQC);
                    c1126540fQC.setEnabled(false);
                }
            } else {
                c433001mK.LIZ(user, "normal");
            }
        }
        User.EnigmaInfo enigmaInfo = guestShowdownUser2.enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            C500260Jjc.LJLJLJ((View) c431601m6.LLIZ.getValue(), false);
        }
        ((TextView) c431601m6.LLILZ.getValue()).setText(guestShowdownUser2.nickname);
        C786410Ut5.n8((C20743416Fc) c431601m6.LLILZ.getValue(), new ViewOnClickListenerC511801z2(this, guestShowdownUser2, 18));
        String str = "";
        if (guestShowdownUser2.score >= 0) {
            ((TextView) c431601m6.LLILZIL.getValue()).setText(C497740JfY.LJIJJ(2131852938, C1850730yGF.LJFF(guestShowdownUser2.score)));
        } else {
            ((TextView) c431601m6.LLILZIL.getValue()).setText("");
        }
        String str2 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().dialogIconUrlMap.get(guestShowdownUser2.iconName);
        if (str2 != null) {
            str = str2;
        }
        if (str.length() == 0 || ((i = guestShowdownUser2.userTag) != 2 && i != 3)) {
            C12ES.LJIILL(0, (View) c431601m6.LLILLJJLI.getValue());
            C439101nJ.LJI((View) c431601m6.LLILZLL.getValue());
            TextView textView = (TextView) c431601m6.LL.getValue();
            int i2 = guestShowdownUser2.rank;
            if (i2 > 0) {
                strValueOf = String.valueOf(i2);
            } else {
                strValueOf = "-";
            }
            textView.setText(strValueOf);
            return;
        }
        C439101nJ.LJI((View) c431601m6.LLILLJJLI.getValue());
        C12ES.LJIILL(0, (View) c431601m6.LLILZLL.getValue());
        C1819620xS4.LIZ().setUrl(str).LJJI((View) c431601m6.LLILZLL.getValue());
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C431601m6(viewGroup, this.LIZJ);
    }
}
