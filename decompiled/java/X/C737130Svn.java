package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Svn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737130Svn extends AbstractC737180Svs {
    public final C735210Ssh LL;
    public Function2<? super Boolean, ? super Exception, Unit> LLILLJJLI;
    public final WeakReference<C0HTT<C737030Svd>> LLILLL;

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_pin_video_action";
    }

    @Override // X.AbstractC737180Svs
    public final boolean LIZIZ() {
        if (AwemeExtKt.isPrivate(this.LL.LIZ) && !LJJIJLIJ()) {
            return false;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = this.LL.LIZ.getCommerceVideoAuthInfo();
        return commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1 || LJJIJLIJ();
    }

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        C734080Sqs c734080Sqs = C734080Sqs.LIZ;
        String value = this.LL.LJI.getValue();
        String str = this.LL.LJFF ? "user" : "visitor";
        String str2 = LJJIJLIJ() ? "unpin" : "pin_to_top";
        String str3 = this.LL.LJIIIZ;
        c734080Sqs.getClass();
        C734080Sqs.LIZ(value, str, str2, str3);
        LJJIIZ();
    }

    public final boolean LJJIJLIJ() {
        return AwemeExtKt.isTop(this.LL.LIZ);
    }

    @Override // X.AbstractC737180Svs
    public final View LIZ() {
        int i = !LJJIJLIJ() ? 2131836868 : 2131836871;
        int i2 = !LJJIJLIJ() ? R.raw.icon_pin : R.raw.icon_pin_slash;
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL.LIZIZ, R.layout.efk, null);
        if (viewLJLLJ == null) {
            return null;
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setIconRes(i2);
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(i);
        }
        C427760Gpy c427760Gpy = (C427760Gpy) viewLJLLJ.findViewById(R.id.bkc);
        if (c427760Gpy != null) {
            C786410Ut5.LLLLLL(c427760Gpy, 8);
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        C1378990lzN.LIZIZ(viewLJLLJ, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        return viewLJLLJ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return !LJJIJLIJ() ? R.raw.icon_pin_fill : R.raw.icon_pin_slash_fill;
    }

    public final void LJJIIZ() {
        final boolean z = !LJJIJLIJ();
        LongPressAwemeApi longPressAwemeApi = (LongPressAwemeApi) C737170Svr.LIZ.getValue();
        if (longPressAwemeApi != null) {
            String aid = this.LL.LIZ.getAid();
            (z ? longPressAwemeApi.pinVideo(aid) : longPressAwemeApi.unpinVideo(aid)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<BaseResponse>() { // from class: X.0Svp
                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th) {
                    String errorMsg;
                    C0XIR c0xir;
                    C0XIR c0xir2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PinVideoAction doPinVideoAction, onError with e as ");
                    boolean z2 = th instanceof C0XIR;
                    String errorMsg2 = null;
                    Throwable th2 = null;
                    errorMsg2 = null;
                    if (z2 && (c0xir2 = (C0XIR) th) != null) {
                        errorMsg = c0xir2.getErrorMsg();
                    } else {
                        errorMsg = null;
                    }
                    sbLIZ.append(errorMsg);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C737130Svn c737130Svn = this.LL;
                    if (c737130Svn.LL.LJIIIIZZ) {
                        Function2<? super Boolean, ? super Exception, Unit> function2 = c737130Svn.LLILLJJLI;
                        if (function2 != null) {
                            Boolean bool = Boolean.FALSE;
                            if (z2) {
                                th2 = th;
                            }
                            function2.invoke(bool, th2);
                            return;
                        }
                        return;
                    }
                    boolean z3 = z;
                    if (z2 && (c0xir = (C0XIR) th) != null) {
                        errorMsg2 = c0xir.getErrorMsg();
                    }
                    C737030Svd c737030Svd = new C737030Svd(97, new C737080Svi(z3, false, errorMsg2));
                    C0HTT<C737030Svd> c0htt = this.LL.LLILLL.get();
                    if (c0htt == null) {
                        return;
                    }
                    c0htt.LLIIL(c737030Svd);
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
                @Override // X.InterfaceC19474811He
                public final void onSuccess(BaseResponse baseResponse) {
                    String uid;
                    String str;
                    int i;
                    User author;
                    this.LL.LL.LIZ.setIsTop(z ? 1 : 0);
                    AwemeBizExtKt.setAttrUpdated(this.LL.LL.LIZ, true);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("group_id", this.LL.LL.LIZ.getAid());
                    Aweme aweme = this.LL.LL.LIZ;
                    if (aweme != null && (author = aweme.getAuthor()) != null) {
                        uid = author.getUid();
                    } else {
                        uid = null;
                    }
                    c2344009Gk.LJIIIIZZ("author_id", uid);
                    c2344009Gk.LJIIIIZZ("enter_from", "profile_long_press");
                    c2344009Gk.LJIIIIZZ("panel_source", "profile_long_press");
                    if (z) {
                        str = "top";
                    } else {
                        str = "top_cancel";
                    }
                    c2344009Gk.LJIIIIZZ("final_status", str);
                    c2344009Gk.LIZJ(this.LL.LL.LIZ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
                    C737130Svn c737130Svn = this.LL;
                    if (C298650BnD.LIZ()) {
                        if (c737130Svn.LL.LIZ.isSubOnlyVideo() && AwemeExtKt.isPhotoMode(c737130Svn.LL.LIZ)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c2344009Gk.LIZJ(i, "is_sub_only_photo");
                    }
                    C20684815ws.LJIILLIIL("click_video_top", c2344009Gk.LIZ);
                    C1440005kM.LIZ(new C517240KQg());
                    C737130Svn c737130Svn2 = this.LL;
                    if (c737130Svn2.LL.LJIIIIZZ) {
                        Function2<? super Boolean, ? super Exception, Unit> function2 = c737130Svn2.LLILLJJLI;
                        if (function2 != null) {
                            function2.invoke(Boolean.TRUE, null);
                            return;
                        }
                        return;
                    }
                    C737030Svd c737030Svd = new C737030Svd(97, new C737080Svi(z, true, null));
                    C0HTT<C737030Svd> c0htt = this.LL.LLILLL.get();
                    if (c0htt == null) {
                        return;
                    }
                    c0htt.LLIIL(c737030Svd);
                }
            });
            return;
        }
        if (this.LL.LJIIIIZZ) {
            Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, null);
                return;
            }
            return;
        }
        C737030Svd c737030Svd = new C737030Svd(97, new C737080Svi(z, false, null));
        C0HTT<C737030Svd> c0htt = this.LLILLL.get();
        if (c0htt != null) {
            c0htt.LLIIL(c737030Svd);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return !LJJIJLIJ() ? 2131836868 : 2131836871;
    }

    public C737130Svn(C735210Ssh c735210Ssh, C0HTT<C737030Svd> c0htt) {
        this.LL = c735210Ssh;
        this.LLILLL = new WeakReference<>(c0htt);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LJJIIZ();
    }
}
