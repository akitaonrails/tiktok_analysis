package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392980mLw implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final User LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final EnumC1393020mM0 LLILZIL;
    public final Fragment LLILZLL;
    public final Activity LLIZ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return true;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "mute_their_posts";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return C1393100mM8.LIZIZ(this.LL) ? R.raw.icon_eye_fill : R.raw.icon_eye_slash_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return C1393100mM8.LIZIZ(this.LL) ? R.raw.icon_eye : R.raw.icon_eye_slash;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return C1393100mM8.LIZ(this.LL);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String str;
        User user = this.LL;
        if (user != null) {
            boolean zLIZIZ = C1393100mM8.LIZIZ(user);
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILLL;
            String str4 = this.LLILZ;
            int followStatus = this.LL.getFollowStatus();
            C1610870s1N.LIZ.getClass();
            if (C1610870s1N.LIZLLL()) {
                str = "split_3";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C1393110mM9 c1393110mM9 = new C1393110mM9(zLIZIZ, str2, str3, str4, followStatus, "click", str, 192);
            C1587170rP9.LIZ.getClass();
            C1587170rP9.LJIIIZ(c1393110mM9);
            if (C1610870s1N.LIZLLL()) {
                C1589640rT8.LIZIZ.b3(context, this.LLILZLL, user, this.LLILZIL, null, C1393110mM9.LIZ(c1393110mM9, false, "show_step_2", null, 479));
                return;
            }
            if (this.LL.isMuted()) {
                C1589640rT8.LIZIZ.K2(user, this.LLILZLL, this.LLIZ, this.LLILZIL, EnumC1392960mLu.ALL, null, new AwS600S0100000_21(this, 266));
                return;
            }
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            Fragment fragment = this.LLILZLL;
            Activity activity = this.LLIZ;
            EnumC1393020mM0 enumC1393020mM0 = this.LLILZIL;
            c1589640rT8.M2(activity, null, fragment, new C1393190mMH(this.LL.getFollowStatus(), this.LLILLJJLI, this.LLILLL, this.LLILZ, null, 112), enumC1393020mM0, EnumC1392960mLu.ALL, user, new AwS600S0100000_21(this, 267));
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        int followStatus;
        String str;
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        boolean zLIZIZ = C1393100mM8.LIZIZ(this.LL);
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        User user = this.LL;
        if (user != null) {
            followStatus = user.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZLLL()) {
            str = "split_3";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1393110mM9 c1393110mM9 = new C1393110mM9(zLIZIZ, str2, str3, str4, followStatus, "show", str, 192);
        c1587170rP9.getClass();
        C1587170rP9.LJIIIZ(c1393110mM9);
    }

    public C1392980mLw(User user, String str, String str2, String str3, EnumC1393020mM0 enumC1393020mM0, Fragment fragment, Activity activity) {
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = enumC1393020mM0;
        this.LLILZLL = fragment;
        this.LLIZ = activity;
    }
}
