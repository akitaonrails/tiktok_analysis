package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil$subscribeEventOpt$1", f = "RepostLazyLoadUtil.kt", l = {120}, m = "invokeSuspend")
public final class C1004670cFd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RepostLazyLoadUtil<ReusedUIAssem<?>, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004670cFd(RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil, InterfaceC1364105Vn<? super C1004670cFd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostLazyLoadUtil;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004670cFd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r3v21, types: [X.0cEo] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostLazyLoadUtil@3911.subscribeEventOpt$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!C1359600lU6.LIZIZ() && (C1359600lU6.LIZIZ() || !((Boolean) C274370Ap9.LIZIZ.getValue()).booleanValue())) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RepostLazyLoadUtil@3911.subscribeEventOpt$1");
                return unit;
            }
            C20673215v0.LJII(this.LLILLJJLI.LIZ.getContext(), "upvote_layout_feed_white_bars_opt_v2");
            RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil = this.LLILLJJLI;
            ReusedUIAssem reusedUIAssem = repostLazyLoadUtil.LIZ;
            C736680Sv4.LJIIIIZZ(reusedUIAssem, repostLazyLoadUtil.LIZJ, new C2217381BqS() { // from class: X.0cFe
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1358700lSe) obj2).LLILLL;
                }
            }, null, new C1004180cEq(repostLazyLoadUtil, reusedUIAssem), 6);
            if (!C300940Bqu.LIZIZ() && !C0RSD.LIZ()) {
                C20673215v0.LJII(this.LLILLJJLI.LIZ.getContext(), "upvote_view_white_bar_guide_v2");
            }
            RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil2 = this.LLILLJJLI;
            ReusedUIAssem reusedUIAssem2 = repostLazyLoadUtil2.LIZ;
            C01GW c01gwLIZJ = C737910Sx3.LIZJ(reusedUIAssem2, C13LE.LIZ(VideoViewModel.class), new C1004690cFf());
            C736680Sv4.LJIIIIZZ(reusedUIAssem2, (AssemViewModel) c01gwLIZJ.getValue(), new C2217381BqS() { // from class: X.0Nz8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C709790Rsn) obj2).LLILLL;
                }
            }, null, new C1004780cFo(repostLazyLoadUtil2), 6);
            C736680Sv4.LJIIIIZZ(reusedUIAssem2, (AssemViewModel) c01gwLIZJ.getValue(), new C2217381BqS() { // from class: X.0Nku
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C709790Rsn) obj2).LLILZ;
                }
            }, null, new C1004310cF3(repostLazyLoadUtil2), 6);
            final RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil3 = this.LLILLJJLI;
            ReusedUIAssem reusedUIAssem3 = repostLazyLoadUtil3.LIZ;
            if (!C300940Bqu.LIZIZ() && !C0RSD.LIZ()) {
                C01GW c01gwLIZJ2 = C737910Sx3.LIZJ(reusedUIAssem3, C13LE.LIZ(VideoEventDispatchViewModel.class), new C1004710cFh());
                if (C296820BkG.LIZ()) {
                    if (repostLazyLoadUtil3.LJI == null) {
                        repostLazyLoadUtil3.LJI = new AbstractC608770NuF() { // from class: X.0cEo
                            @Override // X.AbstractC608770NuF
                            public final int LIZ() {
                                return 1;
                            }

                            @Override // X.AbstractC608770NuF
                            public final void LIZIZ(C608820NuK c608820NuK) {
                                int i2 = c608820NuK.LIZ;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        repostLazyLoadUtil3.LJFF(c608820NuK.LIZJ);
                                        return;
                                    }
                                    return;
                                }
                                repostLazyLoadUtil3.LJ(c608820NuK.LIZIZ);
                            }
                        };
                    }
                    InterceptorEventViewModel interceptorEventViewModel = (InterceptorEventViewModel) repostLazyLoadUtil3.LJFF.getValue();
                    interceptorEventViewModel.vQ2(0, repostLazyLoadUtil3.LJI);
                    interceptorEventViewModel.vQ2(1, repostLazyLoadUtil3.LJI);
                } else {
                    C736680Sv4.LJIIIIZZ(reusedUIAssem3, (AssemViewModel) c01gwLIZJ2.getValue(), new C2217381BqS() { // from class: X.0cFi
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((C1ELP) obj2).LLILZIL;
                        }
                    }, null, new AwS630S0100000_16(repostLazyLoadUtil3, (RepostLazyLoadUtil<ReusedUIAssem<?>, Object>) 41), 6);
                }
            }
            RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil4 = this.LLILLJJLI;
            ReusedUIAssem reusedUIAssem4 = repostLazyLoadUtil4.LIZ;
            if (!C300940Bqu.LIZIZ() && !C0RSD.LIZ()) {
                C01GW c01gwLIZJ3 = C737910Sx3.LIZJ(reusedUIAssem4, C13LE.LIZ(VideoEventDispatchViewModel.class), new C1004700cFg());
                if (!C296820BkG.LIZ()) {
                    C736680Sv4.LJIIIIZZ(reusedUIAssem4, (AssemViewModel) c01gwLIZJ3.getValue(), new C2217381BqS() { // from class: X.0Nyz
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj2) {
                            return ((C1ELP) obj2).LLJ;
                        }
                    }, null, new AwS630S0100000_16(repostLazyLoadUtil4, (RepostLazyLoadUtil<ReusedUIAssem<?>, Object>) 40), 6);
                }
            }
            RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil5 = this.LLILLJJLI;
            if (repostLazyLoadUtil5.LIZLLL() > 0) {
                ReusedUIAssem reusedUIAssem5 = repostLazyLoadUtil5.LIZ;
                C736680Sv4.LJIIIIZZ(reusedUIAssem5, (AssemViewModel) C737910Sx3.LIZJ(reusedUIAssem5, C13LE.LIZ(VideoPlayViewModel.class), AFwS252S0000000_16.get$arr$(355)).getValue(), new C2217381BqS() { // from class: X.0Nz7
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C0RFV) obj2).LLJJIII;
                    }
                }, null, new AwS630S0100000_16(repostLazyLoadUtil5, (RepostLazyLoadUtil<ReusedUIAssem<?>, Object>) 39), 6);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1004650cFb c1004650cFb = new C1004650cFb(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1004650cFb) == objLJFF) {
                C1C7U.LIZIZ("RepostLazyLoadUtil@3911.subscribeEventOpt$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RepostLazyLoadUtil@3911.subscribeEventOpt$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
