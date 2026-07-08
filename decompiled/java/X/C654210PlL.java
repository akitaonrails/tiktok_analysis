package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0PlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654210PlL implements InterfaceC644870PRd, InterfaceC724530SbT {
    public boolean LL;
    public boolean LLILLJJLI;
    public Context LLILLL;
    public Fragment LLILZ;
    public SearchHubNativeViewModel LLILZIL;
    public View LLILZLL;
    public SearchTopBarAssemViewModel LLIZ;
    public View LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public ValueAnimator LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C1357160lQA LLJJIII;
    public int LLJJIJI = -1;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1004));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(480));

    @Override // X.InterfaceC644870PRd
    public final void LIZIZ() {
        this.LLILLJJLI = false;
    }

    @Override // X.InterfaceC644870PRd
    public final void LIZJ() {
        this.LLILLJJLI = false;
    }

    @Override // X.InterfaceC644870PRd
    public final void LIZLLL() {
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    @Override // X.InterfaceC644870PRd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C654210PlL.LJII():void");
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

    public final void LJIIIIZZ() {
        View view = this.LLILZLL;
        C430890Gv1 c430890Gv1 = (C430890Gv1) (view != null ? view.findViewById(R.id.z7z) : null);
        if (c430890Gv1 != null && c430890Gv1.LLJLLL) {
            LJIIIZ();
        }
    }

    public final void LJIIIZ() {
        View view = this.LLILZLL;
        C430890Gv1 c430890Gv1 = (C430890Gv1) (view != null ? view.findViewById(R.id.z7z) : null);
        if (c430890Gv1 == null) {
            return;
        }
        View view2 = this.LLILZLL;
        TuxIconView tuxIconView = (TuxIconView) (view2 != null ? view2.findViewById(R.id.jyd) : null);
        if (tuxIconView != null && c430890Gv1.LLJZIJLIL) {
            AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(tuxIconView, 285);
            if (c430890Gv1.LLJZIJLIL) {
                if (c430890Gv1.LLJLLL) {
                    c430890Gv1.LLJZ = true;
                    c430890Gv1.setText(c430890Gv1.LLJL);
                    awS585S0100000_6.invoke(Boolean.FALSE);
                } else {
                    c430890Gv1.LLJZ = false;
                    c430890Gv1.setText(c430890Gv1.LLJL);
                    awS585S0100000_6.invoke(Boolean.TRUE);
                }
            }
        }
    }

    public final boolean LJIIJ() {
        C01GW c01gw = C07BO.LIZ;
        return (((Number) c01gw.getValue()).intValue() != 0 && this.LLJJ) || (((Number) c01gw.getValue()).intValue() != 0 && this.LLJJI);
    }

    @Override // X.InterfaceC644870PRd
    public final int getHeight() {
        View view = this.LLILZLL;
        C430890Gv1 c430890Gv1 = (C430890Gv1) (view != null ? view.findViewById(R.id.z7z) : null);
        if (c430890Gv1 == null) {
            return 0;
        }
        return c430890Gv1.LLJLLL ? this.LLJI : this.LLJ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycleRegistry;
        C01GW c01gw = C07EU.LIZ;
        if (C07EU.LIZIZ) {
            Fragment fragment = this.LLILZ;
            if (fragment != null) {
                lifecycleRegistry = fragment.getLifecycle();
            }
            return C0J3E.LL.getLifecycleRegistry();
        }
        lifecycleRegistry = C0J3E.LL.getLifecycleRegistry();
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        return C0J3E.LL.getLifecycleRegistry();
    }

    @Override // X.InterfaceC644870PRd
    public final View LJ() {
        return this.LLIZLLLIL;
    }

    public static void LJIIL(C654210PlL c654210PlL) {
        View viewFindViewById;
        View view;
        View view2 = c654210PlL.LLILZLL;
        if (view2 != null) {
            viewFindViewById = view2.findViewById(R.id.z7z);
        } else {
            viewFindViewById = null;
        }
        C430890Gv1 c430890Gv1 = (C430890Gv1) viewFindViewById;
        if (c430890Gv1 != null && (view = c654210PlL.LLILZLL) != null) {
            C430110Gtl.LIZ(view, new AwS254S0300000_10(c654210PlL, (C654210PlL) c430890Gv1, (C430890Gv1) null, (Function0<Unit>) 13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.widget.TextView r17) {
        /*
            r16 = this;
            if (r17 != 0) goto L3
            return
        L3:
            r4 = r16
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel r0 = r4.LLIZ
            if (r0 == 0) goto L7c
            X.002o r0 = r0.getState()
            X.0PGR r0 = (X.C0PGR) r0
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct r0 = r0.LLILLL
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle r3 = r0.topCardInfo
            if (r3 == 0) goto L7c
            int r1 = r3.titleStyle
            X.0Pl7 r0 = X.EnumC654070Pl7.WIKI
            int r0 = r0.getType()
            r7 = 0
            if (r1 == r0) goto L2e
            int r1 = r3.titleStyle
            X.0Pl7 r0 = X.EnumC654070Pl7.IMDB
            int r0 = r0.getType()
            if (r1 != r0) goto L7f
        L2e:
            java.lang.CharSequence r0 = r17.getText()
            if (r0 == 0) goto L7d
            java.lang.String r1 = r0.toString()
        L38:
            X.0PlJ r0 = r3.getSubTitle()
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7f
            java.lang.String r12 = "click_info_structual_information"
        L46:
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel r2 = r4.LLILZIL
            if (r2 == 0) goto L56
            android.content.Context r1 = r17.getContext()
            X.0Pli r0 = X.EnumC654440Pli.COMMON
            androidx.lifecycle.ViewModelKt.getViewModelScope(r2)
            X.C654040Pl4.LIZIZ(r1, r0, r3)
        L56:
            X.0Pl8 r5 = r3.tryGetMobParams()
            if (r5 == 0) goto L70
            r6 = 0
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel r0 = r4.LLILZIL
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = r0.LLIZ
            if (r0 == 0) goto L67
            java.lang.Integer r7 = r0.universalRank
        L67:
            r11 = 3839(0xeff, float:5.38E-42)
            r8 = r6
            r9 = r6
            r10 = r6
            X.0Pl8 r7 = X.C654080Pl8.LIZ(r5, r6, r7, r8, r9, r10, r11)
        L70:
            X.0Pl5 r9 = X.C654050Pl5.LIZ
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo r11 = r3.gameInfo
            r13 = 0
            r15 = 52
            r14 = r13
            r10 = r7
            X.C654050Pl5.LJ(r9, r10, r11, r12, r13, r14, r15)
        L7c:
            return
        L7d:
            r1 = r7
            goto L38
        L7f:
            java.lang.String r12 = "click_info_sub_title"
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C654210PlL.LJIIJJI(android.widget.TextView):void");
    }

    @Override // X.InterfaceC644870PRd
    public final void onConfigurationChanged(Configuration configuration) {
        Context context;
        C0PGR state;
        C291001Au<SearchTopBarStruct> c291001Au;
        SearchTopBarStruct searchTopBarStruct;
        EntityCardTitle entityCardTitle;
        Pair<String, String> pair;
        String first;
        View viewFindViewById;
        if (configuration != null && (context = this.LLILLL) != null && C0BQC.LIZ() && this.LLJJIJI != configuration.orientation) {
            SearchTopBarAssemViewModel searchTopBarAssemViewModel = this.LLIZ;
            if (searchTopBarAssemViewModel != null && (state = searchTopBarAssemViewModel.getState()) != null && (c291001Au = state.LLILZ) != null && (searchTopBarStruct = c291001Au.LIZ) != null && (entityCardTitle = searchTopBarStruct.topCardInfo) != null && (pair = entityCardTitle.getAbstract(context)) != null && (first = pair.getFirst()) != null) {
                View view = this.LLILZLL;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.z7z);
                } else {
                    viewFindViewById = null;
                }
                C430890Gv1 c430890Gv1 = (C430890Gv1) viewFindViewById;
                if (c430890Gv1 != null) {
                    c430890Gv1.LJJJJLI();
                    LJIILJJIL(c430890Gv1, first);
                }
            }
            this.LLJJIJI = configuration.orientation;
        }
    }

    public static void LJIILL(int i, View view) {
        if (C654290PlT.LIZ()) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            if (view == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC644870PRd
    public final boolean LJI(boolean z, EntityCardTitle entityCardTitle) {
        if (z && entityCardTitle.titleStyle != EnumC654070Pl7.GAME.getType()) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(C2217381BqS c2217381BqS, Function1 function1) {
        SearchTopBarAssemViewModel searchTopBarAssemViewModel = this.LLIZ;
        if (searchTopBarAssemViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, searchTopBarAssemViewModel, c2217381BqS, null, new AwS446S0200000_10(this, (C654210PlL) function1, (Function1<Object, Unit>) 6), 6);
        }
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
    public final void LJIILJJIL(C430890Gv1 c430890Gv1, String str) {
        if (((Boolean) C654290PlT.LIZLLL.getValue()).booleanValue()) {
            C1357160lQA c1357160lQA = this.LLJJIII;
            CharSequence charSequence = str;
            if (c1357160lQA != null) {
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                c1357160lQA.LIZ(spannableStringBuilderValueOf);
                charSequence = spannableStringBuilderValueOf;
            }
            c430890Gv1.setText(charSequence);
            return;
        }
        c430890Gv1.setText(str);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC644870PRd
    public final View LIZ(Context context, Fragment fragment, SearchTopBarAssemViewModel searchTopBarAssemViewModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i;
        this.LLIZ = searchTopBarAssemViewModel;
        this.LLILZIL = C654040Pl4.LIZ(fragment);
        this.LLILZLL = viewGroup;
        this.LLILLL = context;
        this.LLILZ = fragment;
        this.LLJJIJI = context.getResources().getConfiguration().orientation;
        if (((Number) C07IS.LIZ.getValue()).intValue() != 0 && !LJIIJ()) {
            i = R.layout.exs;
        } else {
            i = R.layout.exr;
        }
        C650520PfO.LIZ.getClass();
        View viewLIZIZ = C650520PfO.LIZIZ(context, i, viewGroup2, false);
        if (C07EV.LIZ()) {
            C427690Gpr.LJ(viewLIZIZ, 0.0f);
        }
        this.LLJJIII = new C1357160lQA((TextView) viewLIZIZ.findViewById(R.id.z7z), ((Number) this.LLJJIJIIJIL.getValue()).intValue(), ((Number) this.LLJJIJIL.getValue()).floatValue());
        this.LLIZLLLIL = viewLIZIZ;
        return viewLIZIZ;
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
