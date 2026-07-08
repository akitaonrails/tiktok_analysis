package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210450hbX implements InterfaceC1370310llN {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_lock_large_fill;
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
    public final void LJJIJ(ImageView imageView, View view, int i) {
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
        return false;
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
        return "privacy";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("post_type", C729510SjV.LJJ(this.LL) ? "story" : "post");
        C20684815ws.LJIILLIIL("video_privacy_setting_button_show", c2344009Gk.LIZ);
        return R.raw.icon_2pt_lock;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return C729510SjV.LJJIJIL(this.LL) ? 2131849415 : 2131845181;
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
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String string = baseSharePackage.extras.getString("tab_name", "");
        String string2 = baseSharePackage.extras.getString("impr_id", "");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getAid());
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("panel_source", this.LLILLL);
        c2344009Gk.LJIIIIZZ("impr_id", string2);
        if (TextUtils.equals(this.LLILLJJLI, "personal_homepage")) {
            c2344009Gk.LJFF("tab_name", string);
        }
        if (C591970NJr.LIZIZ().LIZIZ(this.LL)) {
            NowPostInfo nowPostInfo = this.LL.nowPostInfo;
            if (nowPostInfo != null) {
                str3 = nowPostInfo.nowMediaType;
            } else {
                str3 = null;
            }
            c2344009Gk.LJFF("now_type", str3);
        }
        if (C729510SjV.LJJIJIL(this.LL)) {
            str = "story";
        } else {
            str = "post";
        }
        c2344009Gk.LJFF("story_type", str);
        c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isSecret() ? 1 : 0, "is_private");
        c2344009Gk.LJFF("enter_method", "share_panel");
        if (C1210510hbd.LIZIZ(this.LL)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_allow_pugc_template", str2);
        C20684815ws.LJIILLIIL("click_privacy_setting_video", c2344009Gk.LIZ);
        if (baseSharePackage.extras.getBoolean("is_from_long_press_panel", false) && Intrinsics.LJFF(this.LLILLJJLI, "profile_long_press")) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(this.LLILLJJLI, "homepage_friends") && C319860CgK.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJIJJ(context, this.LL, string, this.LLILLJJLI, "share_panel", string2, z, z2);
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

    public C1210450hbX(Aweme aweme, String str, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
