package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.MemeRegInfo;
import com.ss.android.ugc.aweme.feed.model.MemeVideoReg;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.multiapp.IShareExService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C736320SuU implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final Aweme LL;
    public final C0HTT<C737030Svd> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Activity LLILZIL;
    public final Fragment LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
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
    public final int LJJLIIIJJIZ() {
        return R.string.s65;
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
        return "report";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    public void LIZ() {
        C737030Svd c737030Svd = new C737030Svd(1, this.LL);
        c737030Svd.LJIIJ = this.LLILZ;
        c737030Svd.LJIIL = this.LLILLL;
        C0HTT<C737030Svd> c0htt = this.LLILLJJLI;
        if (c0htt != null) {
            c0htt.LLIIL(c737030Svd);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "video_share_panel");
        C20684815ws.LJIILLIIL("tns_report_entrance_show", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        if (PluggableExtentionKt.pluggableSpi$default(IShareExService.class, false, false, false, 14, null) != null) {
            return !this.LLIZ;
        }
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return C736340SuW.LIZJ() ? R.raw.icon_exclamation_mark_triangle_fill : C736340SuW.LIZ() == 3 ? R.raw.icon_exclamation_mark_bubble_fill : R.raw.icon_flag_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return C736340SuW.LIZJ() ? R.raw.icon_exclamation_mark_triangle : C736340SuW.LIZ() == 3 ? R.raw.icon_exclamation_mark_bubble : R.raw.icon_2pt_flag;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        if (C736340SuW.LIZIZ()) {
            return Integer.valueOf(R.attr.a1l);
        }
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        if (C736340SuW.LIZIZ()) {
            return Integer.valueOf(R.attr.a1l);
        }
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        if (C736340SuW.LIZIZ()) {
            return Integer.valueOf(R.attr.zv);
        }
        return null;
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage) {
        int iIsMeme;
        int i;
        String str;
        MemeVideoReg memeVideoReg;
        MemeVideoReg memeVideoReg2;
        int iLJJIII = C0SXF.LJJIII(context, this.LL);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LL));
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(this.LL));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LL)));
        c2344009Gk.LJIIIIZZ("panel_source", this.LLILZ);
        Bundle arguments = null;
        C1359610lU7.LJ(c2344009Gk, this.LL, null);
        Aweme aweme = this.LL;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        C2344009Gk c2344009Gk2 = (C2344009Gk) C1612650s4F.LIZIZ(c2344009Gk, this.LL);
        String string = baseSharePackage.extras.getString("search_id");
        if (string != null) {
            c2344009Gk2.LJFF("search_id", string);
        }
        C1ER1.LIZIZ.LLLF(this.LL, this.LLILLL, c2344009Gk2);
        c2344009Gk2.LIZJ(this.LL.getIsCommentPostVideo() ? 1 : 0, "is_comment_post_video");
        MemeRegInfo memeRegInfo = this.LL.memeRegInfo;
        if (memeRegInfo != null && (memeVideoReg2 = memeRegInfo.memeVideoReg) != null) {
            iIsMeme = memeVideoReg2.isMeme();
        } else {
            iIsMeme = 0;
        }
        c2344009Gk2.LIZJ(iIsMeme, "is_meme");
        MemeRegInfo memeRegInfo2 = this.LL.memeRegInfo;
        if (memeRegInfo2 != null && (memeVideoReg = memeRegInfo2.memeVideoReg) != null) {
            i = memeVideoReg.canBoostMeme;
        } else {
            i = 0;
        }
        c2344009Gk2.LIZJ(i, "can_boost_meme");
        if (this.LL.isAd()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk2.LJFF("is_ads", str);
        C20684815ws.LJIILLIIL("report", c2344009Gk2.LIZ);
        if (C736360SuY.LIZ(this.LL)) {
            if (C729980SkG.LJIIIIZZ(this.LL)) {
                int awemeType = this.LL.getAwemeType();
                if (awemeType != 501) {
                    if (awemeType != 502) {
                        if (awemeType != 504) {
                            C1387490mD5.LJIIIIZZ(context, this.LL, this.LLILLJJLI, null, null, null, null, null, null, 2040);
                            return;
                        }
                    } else {
                        Activity activity = this.LLILZIL;
                        if (activity == null) {
                            return;
                        }
                        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                        Fragment fragment = this.LLILZLL;
                        if (fragment != null) {
                            arguments = fragment.getArguments();
                        }
                        imChatService.LJI(activity, "view_private_video", arguments);
                        return;
                    }
                }
                Activity activity2 = this.LLILZIL;
                if (activity2 == null) {
                    return;
                }
                IIMChatService imChatService2 = C1336205Ku.LIZ(false).getImChatService();
                Fragment fragment2 = this.LLILZLL;
                if (fragment2 != null) {
                    arguments = fragment2.getArguments();
                }
                imChatService2.LJI(activity2, "view_picture", arguments);
                return;
            }
            if (iLJJIII == 0) {
                LIZ();
                return;
            }
            Aweme aweme2 = this.LL;
            ShareDependService.LIZ.getClass();
            ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
            String str2 = this.LLILLL;
            shareDependServiceLJJJJI.LJJIZ(aweme2, str2, context, "", str2, "", "", iLJJIII, null, baseSharePackage.extras.getString("explore_from_group_id", ""));
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(final Context context, final BaseSharePackage baseSharePackage) {
        if (PluggableExtentionKt.pluggableSpi$default(IShareExService.class, false, false, false, 14, null) != null && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Activity activityLIZ = this.LLILZIL;
            if (activityLIZ == null) {
                activityLIZ = C085T.LIZ(context);
            }
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("group_id", this.LL.getAid(), c627150Oin.LIZ);
            C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(this.LL), c627150Oin.LIZ);
            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(this.LL.getAid()), c627150Oin.LIZ);
            Bundle bundle = c627150Oin.LIZ;
            if (activityLIZ != null) {
                this.LLIZ = true;
                C0XPD.LIZIZ(activityLIZ, this.LLILLL, "click_report", bundle, new InterfaceC849390XTt() { // from class: X.0SuV
                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        C736320SuU c736320SuU = this.LIZ;
                        c736320SuU.LLIZ = false;
                        c736320SuU.LIZIZ(context, baseSharePackage);
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZIZ() {
                        this.LIZ.LLIZ = false;
                    }
                });
                return;
            }
        }
        LIZIZ(context, baseSharePackage);
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

    public /* synthetic */ C736320SuU(Aweme aweme, C0HTT c0htt, String str, String str2) {
        this(aweme, c0htt, str, str2, null, null);
    }

    public C736320SuU(Aweme aweme, C0HTT<C737030Svd> c0htt, String str, String str2, Activity activity, Fragment fragment) {
        this.LL = aweme;
        this.LLILLJJLI = c0htt;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = activity;
        this.LLILZLL = fragment;
    }
}
