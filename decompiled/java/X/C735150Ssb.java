package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Ssb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735150Ssb extends AbstractC737180Svs implements InterfaceC724530SbT {
    public final C735210Ssh LL;
    public Function2<? super Boolean, ? super Exception, Unit> LLILLJJLI;

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_repost_tick;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131846359;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_undo_repost_action";
    }

    @Override // X.AbstractC737180Svs
    public final View LIZ() {
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL.LIZIZ, R.layout.efk, null);
        if (viewLJLLJ == null) {
            return null;
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setIconRes(R.raw.icon_repost_tick);
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(2131836876);
        }
        C427760Gpy c427760Gpy = (C427760Gpy) viewLJLLJ.findViewById(R.id.bkc);
        if (c427760Gpy != null) {
            C786410Ut5.LLLLLL(c427760Gpy, 8);
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        C1378990lzN.LIZIZ(viewLJLLJ, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        return viewLJLLJ;
    }

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        C734080Sqs c734080Sqs = C734080Sqs.LIZ;
        String value = this.LL.LJI.getValue();
        C735210Ssh c735210Ssh = this.LL;
        String str = c735210Ssh.LJFF ? "user" : "visitor";
        String str2 = c735210Ssh.LJIIIZ;
        c734080Sqs.getClass();
        C734080Sqs.LIZ(value, str, "undo_repost", str2);
        LJJIIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIZ() {
        String uid;
        String aid = this.LL.LIZ.getAid();
        User author = this.LL.LIZ.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author2 = this.LL.LIZ.getAuthor();
        c735840Sti.getClass();
        String strValueOf = String.valueOf(C735840Sti.LJIIIIZZ(author2));
        String strValueOf2 = String.valueOf(this.LL.LIZ.getAwemeType());
        boolean zLJI = C720360SNm.LJI(this.LL.LIZ);
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        C1360460lVU.LIZIZ.LJ(this.LL.LIZ.getAid(), new UpvotePublishMobParam("profile_long_press", null, aid, uid, strValueOf, 0 == true ? 1 : 0, "long_press_panel", false, 0 == true ? 1 : 0, strValueOf2, zLJI, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, iPoiService != null ? iPoiService.LLIFFJFJJ(this.LL.LIZ) : null, 0.0d, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -2109982, 65535), false, null, null, null, null, null, false);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LIZLLL.getLifecycle();
    }

    public C735150Ssb(C735210Ssh c735210Ssh) {
        C19EG c19eg;
        this.LL = c735210Ssh;
        Activity activity = c735210Ssh.LIZJ;
        AssemViewModel<C1358700lSe> assemViewModelLJJIJ = null;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
            assemViewModelLJJIJ = C1360460lVU.LIZIZ.LJJIJ(c19eg);
        }
        if (c735210Ssh.LJIIIIZZ && assemViewModelLJJIJ != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModelLJJIJ, new C2217381BqS() { // from class: X.0Sse
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1358700lSe) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 127), 4);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LJJIIZ();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
