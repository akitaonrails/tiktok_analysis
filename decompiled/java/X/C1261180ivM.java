package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: renamed from: X.0ivM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261180ivM implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLILZ = 0;
    public final Aweme LL;
    public final C0HTT<C737030Svd> LLILLJJLI;
    public final C1372730lpH LLILLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_2pt_person_x_mark;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_person_x_mark;
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
    public final int LJJLIIIJJIZ() {
        return R.string.user_action_unfollow;
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
        return "unfollow";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            X.0Sti r3 = X.C735840Sti.LIZ
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            java.lang.String r0 = "to_user_id"
            r2.LJIIIIZZ(r0, r1)
            X.0lpH r0 = r4.LLILLL
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "dot_button"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r1 = "previous_page"
            java.lang.String r0 = ""
            r2.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            java.lang.String r0 = "author_id"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            java.lang.String r1 = X.C735370Ssx.LIZJ(r0)
            java.lang.String r0 = "group_id"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L81
            boolean r0 = r0.isSecret()
            r1 = 1
            if (r0 != r1) goto L81
        L4e:
            java.lang.String r0 = "is_private"
            r2.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r0.nowPostInfo
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.nowMediaType
        L5b:
            java.lang.String r0 = "now_type"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.service.INowsTabService r1 = X.C591970NJr.LIZIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            java.lang.String r1 = r1.LIZJ(r0)
            java.lang.String r0 = "now_card_type"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LL
            r3.getClass()
            X.C735840Sti.LIZIZ(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "follow_cancel"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L7f:
            r1 = 0
            goto L5b
        L81:
            r1 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1261180ivM.LIZ():void");
    }

    public final void LIZIZ() {
        String friendTypeStr;
        MatchedFriendStruct matchedFriendStruct;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(this.LLILLL.LIZ);
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.ITEM;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = EnumC1260930iux.FOLLOW_CANCEL;
        String aid = this.LL.getAid();
        if (aid == null) {
            aid = "";
        }
        c1260910iuv.LJJLIIIJLLLLLLLZ = aid;
        c1260910iuv.LJJJJZI(this.LL.getAuthor());
        User author = this.LL.getAuthor();
        if (author == null || (friendTypeStr = author.getFriendTypeStr()) == null) {
            User author2 = this.LL.getAuthor();
            friendTypeStr = (author2 == null || (matchedFriendStruct = author2.getMatchedFriendStruct()) == null) ? null : matchedFriendStruct.relationType;
        }
        c1260910iuv.LJJJJL(friendTypeStr);
        User author3 = this.LL.getAuthor();
        c1260910iuv.LJJJJJL(author3 != null ? author3.getAccurateRecType() : null);
        c1260910iuv.LJJIL("dot_button");
        NowPostInfo nowPostInfo = this.LL.nowPostInfo;
        String str = nowPostInfo != null ? nowPostInfo.nowMediaType : null;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c1260910iuv.LJFF("now_type", str, c2082308Dt);
        c1260910iuv.LJFF("now_card_type", C591970NJr.LIZIZ().LIZJ(this.LL), c2082308Dt);
        Object objLJIIIZ = c19651011uW.LJIIIZ(this.LL, c1260910iuv);
        Aweme aweme = this.LL;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
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
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LL));
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", "click_dot_button");
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(this.LL));
        NowPostInfo nowPostInfo = this.LL.nowPostInfo;
        if (nowPostInfo != null) {
            str = nowPostInfo.nowMediaType;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("now_type", str);
        c2344009Gk.LJIIIIZZ("now_card_type", C591970NJr.LIZIZ().LIZJ(this.LL));
        C20684815ws.LJIILLIIL("click_unfollow", c2344009Gk.LIZ);
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(725668246, new AwS668S0100000_19(this, 45), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131857706);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 602));
        new C1397510mTF(c1397580mTM).LIZLLL();
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

    public C1261180ivM(Aweme aweme, C0HTT<C737030Svd> c0htt, C1372730lpH c1372730lpH) {
        this.LL = aweme;
        this.LLILLJJLI = c0htt;
        this.LLILLL = c1372730lpH;
    }
}
