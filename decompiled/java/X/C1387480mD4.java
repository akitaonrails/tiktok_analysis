package X;

import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0mD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387480mD4 implements InterfaceC1370310llN, InterfaceC1387630mDJ<Object> {
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
    public final String key() {
        return "top";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return !AwemeExtKt.isTop(this.LL) ? R.raw.icon_pin_fill : R.raw.icon_pin_slash_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return !AwemeExtKt.isTop(this.LL) ? R.raw.icon_2pt_pin : R.raw.icon_2pt_pin_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return AwemeExtKt.isTop(this.LL) ? 2131840055 : 2131840053;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        AwemeCommerceStruct commerceVideoAuthInfo = this.LL.getCommerceVideoAuthInfo();
        boolean z = false;
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
            z = true;
        }
        return !z;
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

    @Override // X.InterfaceC1387630mDJ
    public final void LIZ(Exception exc) {
        String str;
        C844470XAv.LIZ.getClass();
        C1354920lMY.LIZLLL(C844470XAv.LIZ(), exc, 2131837962);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getAid());
        c2344009Gk.LJIIIIZZ("author_id", this.LL.getAuthor().getUid());
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("panel_source", this.LLILLL);
        if (AwemeExtKt.isTop(this.LL)) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        c2344009Gk.LJIIIIZZ("final_status", str);
        c2344009Gk.LIZJ(this.LL.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        C20684815ws.LJIILLIIL("click_video_top", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1387630mDJ
    public final void onComplete(Object obj) {
        int i;
        String str;
        Aweme aweme = this.LL;
        int i2 = 1;
        aweme.setIsTop(!AwemeExtKt.isTop(aweme) ? 1 : 0);
        AwemeBizExtKt.setAttrUpdated(this.LL, true);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (AwemeExtKt.isTop(this.LL)) {
            i = 2131840054;
        } else {
            i = 2131840056;
        }
        String string = contextLIZ.getString(i);
        C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
        c1233040iBy.LIZJ(string);
        c1233040iBy.LIZLLL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getAid());
        c2344009Gk.LJIIIIZZ("author_id", this.LL.getAuthor().getUid());
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("panel_source", this.LLILLL);
        if (AwemeExtKt.isTop(this.LL)) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        c2344009Gk.LJIIIIZZ("final_status", str);
        c2344009Gk.LIZJ(this.LL.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        if (C298650BnD.LIZ()) {
            if (!this.LL.isSubOnlyVideo() || !AwemeExtKt.isPhotoMode(this.LL)) {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_sub_only_photo");
        }
        if (C298640BnC.LIZ()) {
            c2344009Gk.LIZJ(C1447940nma.LIZIZ(this.LL), "preview_photo_cnt");
        }
        C20684815ws.LJIILLIIL("click_video_top", c2344009Gk.LIZ);
        C1440005kM.LIZ(new C517240KQg());
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String str;
        if (AwemeExtKt.isPrivate(this.LL) && !AwemeExtKt.isTop(this.LL)) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131845246);
            c1233040iBy.LIZLLL();
            return;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = this.LL.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1 && !AwemeExtKt.isTop(this.LL)) {
            C1233040iBy c1233040iBy2 = new C1233040iBy(context);
            c1233040iBy2.LIZIZ(2131830484);
            c1233040iBy2.LIZLLL();
            return;
        }
        String str2 = C737160Svq.LIZ;
        String aid = this.LL.getAid();
        boolean z = !AwemeExtKt.isTop(this.LL);
        boolean zLJI = MethodIDManager.LJI(202179);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2259691DcV("item_id", aid));
        if (z) {
            str = C737160Svq.LIZ;
        } else {
            str = C737160Svq.LIZIZ;
        }
        C1387650mDL c1387650mDL = new C1387650mDL(str, EnumC1387660mDM.POST, arrayList, String.class);
        c1387650mDL.LIZ = this;
        c1387650mDL.LJI = false;
        C844470XAv.LIZ.getClass();
        C810560Vqw.LJ(new ARunnableS90S0200000_21(c1387650mDL, C844470XAv.LIZ(), 26));
        if (zLJI) {
            MethodIDManager.LJ();
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

    public C1387480mD4(Aweme aweme, String str, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
