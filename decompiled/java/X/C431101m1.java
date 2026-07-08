package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllUser;

/* JADX INFO: renamed from: X.01m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C431101m1 extends C0J8P<C00UP, C431201m2> {
    public final Context LIZIZ;
    public final CountdownForAllConfig LIZJ;
    public final C11NJ LIZLLL;
    public final DataChannel LJ;
    public final CountDownForAllV2ScoreDialog LJFF;

    public final void LJIIIIZZ(CountdownForAllUser countdownForAllUser) {
        User.EnigmaInfo enigmaInfo;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Context context = this.LIZIZ;
        C11NJ c11nj = this.LIZLLL;
        c930480aJy.getClass();
        if (!C930480aJy.LJ("openUserProfile", context, c11nj)) {
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(countdownForAllUser.userId, "multi_guest");
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "profile_card";
        userProfileEvent.cardEnterFrom = "guest_ranking_popup";
        User.EnigmaInfo enigmaInfo2 = countdownForAllUser.enigmaInfo;
        if (enigmaInfo2 != null) {
            userProfileEvent.setEnigmaOutside(enigmaInfo2.isEnigmaMaskOn);
        } else {
            User user = countdownForAllUser.user;
            if (user != null && (enigmaInfo = user.enigmaInfo) != null) {
                userProfileEvent.setEnigmaOutside(enigmaInfo.isEnigmaMaskOn);
            }
        }
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C00UP c00up) {
        List<String> listLIZ;
        long j;
        boolean z;
        long j2;
        String str;
        boolean z2;
        boolean z3;
        int i;
        Resources.Theme theme;
        int i2;
        Resources.Theme theme2;
        C431201m2 c431201m2 = (C431201m2) viewHolder;
        C00UP c00up2 = c00up;
        CountdownForAllUser countdownForAllUser = c00up2.LIZ;
        ((TextView) c431201m2.LL.getValue()).setText(String.valueOf(countdownForAllUser.rank));
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel imageModel = countdownForAllUser.avatarThumb;
        if (imageModel != null) {
            listLIZ = C842240X2g.LIZ(imageModel);
        } else {
            listLIZ = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
        c1324610kZfLIZJ.LJJI((View) c431201m2.LLILLJJLI.getValue());
        C500260Jjc.LJLIIIL(500L, (View) c431201m2.LLILLJJLI.getValue(), new C020W(this, countdownForAllUser, 32));
        ((TextView) c431201m2.LLILLL.getValue()).setText(C0KVU.LIZIZ(countdownForAllUser.displayId, countdownForAllUser.nickname));
        C500260Jjc.LJLIIIL(500L, (View) c431201m2.LLILLL.getValue(), new C020W(this, countdownForAllUser, 33));
        CountdownForAllConfig countdownForAllConfig = this.LIZJ;
        long j3 = 0;
        if (countdownForAllConfig != null) {
            j = countdownForAllConfig.targetScore;
        } else {
            j = 0;
        }
        boolean z4 = false;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, (View) c431201m2.LLJI.getValue());
            C786410Ut5.LJLLLLLL(0, (View) c431201m2.LLILZIL.getValue());
            CountdownForAllConfig countdownForAllConfig2 = this.LIZJ;
            if (countdownForAllConfig2 != null) {
                j2 = countdownForAllConfig2.targetScore;
            } else {
                j2 = 1;
            }
            ((ProgressBar) c431201m2.LLIZ.getValue()).setProgress((int) ((countdownForAllUser.score / j2) * 100));
            CountdownForAllConfig countdownForAllConfig3 = this.LIZJ;
            if (countdownForAllConfig3 == null || (str = countdownForAllConfig3.resourceId) == null) {
                str = "";
            }
            if (!a0.LJJJIL(str) && !Intrinsics.LJFF(str, "")) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j4 = countdownForAllUser.score;
            CountdownForAllConfig countdownForAllConfig4 = this.LIZJ;
            if (countdownForAllConfig4 != null) {
                j3 = countdownForAllConfig4.targetScore;
            }
            if (j4 >= j3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && !z3) {
                C786410Ut5.LJZI(0, (ImageView) c431201m2.LLILZLL.getValue());
                C01JX.LIZJ(str, true, new C5185020h(c431201m2, 23));
            } else {
                C786410Ut5.LJZI(8, (ImageView) c431201m2.LLILZLL.getValue());
            }
            if (countdownForAllUser.score >= j2) {
                TypedValue typedValue = new TypedValue();
                Context context = this.LIZIZ;
                if (context != null && (theme2 = context.getTheme()) != null && theme2.resolveAttribute(R.attr.ezq, typedValue, true)) {
                    i2 = typedValue.data;
                } else {
                    i2 = -16777216;
                }
                ((TextView) c431201m2.LLIZLLLIL.getValue()).setTextColor(i2);
                C786410Ut5.LLJJIJIL((LiveIconView) c431201m2.LLJ.getValue(), 0);
            } else {
                TypedValue typedValue2 = new TypedValue();
                Context context2 = this.LIZIZ;
                if (context2 != null && (theme = context2.getTheme()) != null && theme.resolveAttribute(R.attr.ezy, typedValue2, true)) {
                    i = typedValue2.data;
                } else {
                    i = -7829368;
                }
                ((TextView) c431201m2.LLIZLLLIL.getValue()).setTextColor(i);
                C786410Ut5.LLJJIJIL((LiveIconView) c431201m2.LLJ.getValue(), 8);
            }
            TextView textView = (TextView) c431201m2.LLIZLLLIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1850730yGF.LJFF(countdownForAllUser.score));
            sbLIZ.append('/');
            sbLIZ.append(C1850730yGF.LJFF(j2));
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C786410Ut5.LJLLLLLL(8, (View) c431201m2.LLILZIL.getValue());
            C786410Ut5.LJZI(8, (ImageView) c431201m2.LLILZLL.getValue());
            C786410Ut5.LJLLLLLL(0, (View) c431201m2.LLJI.getValue());
            ((TextView) c431201m2.LLJIJIL.getValue()).setText(C1850730yGF.LJFF(countdownForAllUser.score));
        }
        int i3 = c00up2.LIZIZ;
        if (i3 != 1 && i3 != 2) {
            C12ES.LJIILL(4, c431201m2.I5());
            return;
        }
        C12ES.LJIILL(0, c431201m2.I5());
        View viewI5 = c431201m2.I5();
        if (countdownForAllUser.userId != UserService.getInstance().user().getCurrentUserId()) {
            z4 = true;
        }
        viewI5.setEnabled(z4);
        if (!c431201m2.I5().isEnabled()) {
            C786410Ut5.T4(c431201m2.I5(), 0.5f);
        }
        C500260Jjc.LJLIIIL(500L, c431201m2.I5(), new C020W(this, countdownForAllUser, 31));
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C431201m2(viewGroup);
    }

    public C431101m1(Context context, CountdownForAllConfig countdownForAllConfig, C11NJ c11nj, DataChannel dataChannel, CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog) {
        this.LIZIZ = context;
        this.LIZJ = countdownForAllConfig;
        this.LIZLLL = c11nj;
        this.LJ = dataChannel;
        this.LJFF = countDownForAllV2ScoreDialog;
    }
}
