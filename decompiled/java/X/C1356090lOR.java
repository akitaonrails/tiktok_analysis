package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.LemonCommentSyncSharedVM;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.viewmodel.LemonPostShareViewModel;
import com.ss.android.ugc.aweme.lemon.share.Lemon8ShareConfiguration;
import com.ss.android.ugc.aweme.lemon.share.Lemon8ShareModel;
import com.ss.android.ugc.aweme.lemon.share.Lemon8SharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS67S0100000_21;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0lOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356090lOR implements InterfaceC2262561Dh8, InterfaceC724530SbT {
    public final C442430HWn LL;
    public final LemonPostShareViewModel LLILLJJLI;
    public final C2262551Dh7 LLILLL;
    public final C736950SvV LLILZ;

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

    @Override // X.InterfaceC2262561Dh8
    public final void LIZ() {
        LIZJ(EnumC1356100lOS.CLICK_LIKE);
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        C442430HWn c442430HWn = this.LL;
        Aweme aweme = c442430HWn.LIZJ;
        PostModeDetailParams postModeDetailParams = c442430HWn.LJI;
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZJ(c2344009Gk, postModeDetailParams);
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(postModeDetailParams != null ? postModeDetailParams.eventType : null, ""));
        c2344009Gk.LJFF("enter_method", "click_like");
        C20684815ws.LJIILLIIL("like", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC2262561Dh8
    public final void LIZIZ() {
        this.LL.LJII.LLILLL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC2262561Dh8
    public final void LIZLLL() {
        LIZJ(EnumC1356100lOS.FAVORITE);
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        C442430HWn c442430HWn = this.LL;
        Aweme aweme = c442430HWn.LIZJ;
        PostModeDetailParams postModeDetailParams = c442430HWn.LJI;
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZJ(c2344009Gk, postModeDetailParams);
        c2344009Gk.LJFF("enter_method", postModeDetailParams != null ? postModeDetailParams.enterMethod : null);
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(postModeDetailParams != null ? postModeDetailParams.eventType : null, ""));
        c2344009Gk.LJFF("enter_method", "actionbar");
        C20684815ws.LJIILLIIL("favourite_video", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC2262561Dh8
    public final void LJI() {
        C442430HWn c442430HWn = this.LL;
        Aweme aweme = c442430HWn.LIZJ;
        C19EG c19eg = c442430HWn.LIZIZ;
        final Lemon8ShareModel lemon8ShareModel = new Lemon8ShareModel(aweme, c442430HWn.LJI);
        C621180OYa.LIZ.LJIIZILJ(new Lemon8SharePackage(new AbstractC1377610lx9(lemon8ShareModel) { // from class: X.0lOc
            public final Lemon8ShareModel LIZ;

            @Override // X.AbstractC1377630lxB
            public final String LIZJ() {
                return "aweme";
            }

            @Override // X.AbstractC1377630lxB
            public final String LIZ() {
                ShareInfo shareInfo;
                String shareDesc;
                Aweme aweme2 = this.LIZ.aweme;
                return (aweme2 == null || (shareInfo = aweme2.getShareInfo()) == null || (shareDesc = shareInfo.getShareDesc()) == null) ? "" : shareDesc;
            }

            @Override // X.AbstractC1377630lxB
            public final String LIZIZ() {
                Aweme aweme2 = this.LIZ.aweme;
                return String.valueOf(aweme2 != null ? aweme2.getAid() : null);
            }

            @Override // X.AbstractC1377630lxB
            public final Bundle LJFF() {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "post_mode_detail_params", this.LIZ.postModeDetailParams);
                return bundle;
            }

            @Override // X.AbstractC1377630lxB
            public final String LJI() {
                ShareInfo shareInfo;
                String shareTitle;
                Aweme aweme2 = this.LIZ.aweme;
                return (aweme2 == null || (shareInfo = aweme2.getShareInfo()) == null || (shareTitle = shareInfo.getShareTitle()) == null) ? "" : shareTitle;
            }

            @Override // X.AbstractC1377630lxB
            public final String LJII() {
                String str;
                PostModeDetailParams postModeDetailParams = this.LIZ.postModeDetailParams;
                return (postModeDetailParams == null || (str = postModeDetailParams.shareUrl) == null) ? "" : UriProtector.parse(str).buildUpon().appendQueryParameter("pid", "tiktok_search_share").toString();
            }

            @Override // X.AbstractC1377630lxB
            public final ShareModel LJ() {
                return this.LIZ;
            }

            {
                this.LIZ = lemon8ShareModel;
            }
        }.LJIIIIZZ()), c19eg, Lemon8ShareConfiguration.LLILLJJLI);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LIZIZ.getLifecycle();
    }

    public final void LIZJ(EnumC1356100lOS enumC1356100lOS) {
        String str;
        C1356140lOW c1356140lOW = C1356140lOW.LIZ;
        C442430HWn c442430HWn = this.LL;
        C19EG c19eg = c442430HWn.LIZIZ;
        Aweme aweme = c442430HWn.LIZJ;
        EnumC1341630l17 enumC1341630l17 = EnumC1341630l17.DETAIL;
        PostModeDetailParams postModeDetailParams = c442430HWn.LJI;
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        C1356140lOW.LIZIZ(c1356140lOW, c19eg, aweme, null, enumC1341630l17, enumC1356100lOS, C2097908Jt.LIZJ(new Pair("enter_from", str)), 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1356090lOR(C442430HWn c442430HWn, LemonPostShareViewModel lemonPostShareViewModel) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        String strLIZ;
        long diggCount;
        AwemeStatistics statistics3;
        ViewGroup viewGroup;
        this.LL = c442430HWn;
        this.LLILLJJLI = lemonPostShareViewModel;
        C2262551Dh7 c2262551Dh7 = new C2262551Dh7(c442430HWn.LIZIZ, this);
        this.LLILLL = c2262551Dh7;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LemonCommentSyncSharedVM.class);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(424);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LLILZ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS259S0000000_21, null, null, null);
        ViewGroup viewGroup2 = c442430HWn.LIZLLL;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.e_t)) != null) {
            viewGroup.addView(c2262551Dh7);
        }
        View viewFindViewById = c2262551Dh7.findViewById(R.id.rk2);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 22), viewFindViewById);
        }
        c2262551Dh7.setCountsVisible$lemon_release(C666010QAl.LIZIZ.showEngagementCount());
        long collectCount = 0;
        try {
            Aweme aweme = c442430HWn.LIZJ;
            if (aweme != null && (statistics3 = aweme.getStatistics()) != null) {
                diggCount = statistics3.getDiggCount();
            } else {
                diggCount = 0;
            }
            c2262551Dh7.setDiggText(C618720OOo.LIZ(diggCount));
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setDiggText(C618720OOo.LIZ(0L));
            C2344809Gs.LJI(e);
        }
        Aweme aweme2 = this.LL.LIZJ;
        if (aweme2 != null && (statistics2 = aweme2.getStatistics()) != null) {
            long commentCount = statistics2.getCommentCount();
            if (C0OAD.LIZIZ(aweme2)) {
                strLIZ = CardStruct.IStatusCode.DEFAULT;
            } else {
                strLIZ = C618720OOo.LIZ(commentCount);
            }
            this.LLILLL.setCommentText(strLIZ);
        }
        C736680Sv4.LJIIIIZZ(this, this.LLILZ.getValue(), new C2217381BqS() { // from class: X.0HW4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HW3) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 179), 4);
        Aweme aweme3 = this.LL.LIZJ;
        if (aweme3 != null && (statistics = aweme3.getStatistics()) != null) {
            collectCount = statistics.getCollectCount();
        }
        this.LLILLL.setFavoriteText(C618720OOo.LIZ(collectCount));
        LemonPostShareViewModel lemonPostShareViewModel2 = this.LLILLJJLI;
        lemonPostShareViewModel2.LL = this.LL.LIZJ;
        lemonPostShareViewModel2.setState(new AwS590S0100000_11(lemonPostShareViewModel2, 391));
        C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI, new C2217381BqS() { // from class: X.0SZ6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SZ7) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 180), 6);
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
