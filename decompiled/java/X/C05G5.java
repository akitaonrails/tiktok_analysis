package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.viewmodel.MusicAggregatedVideoRootViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.05G5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.viewmodel.MusicAggregatedVideoRootViewModel$startCalculatePlayDuration$2", f = "MusicAggregatedVideoRootViewModel.kt", l = {51}, m = "invokeSuspend")
public final class C05G5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ MusicAggregatedVideoRootViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05G5(C238400w2 c238400w2, MusicAggregatedVideoRootViewModel musicAggregatedVideoRootViewModel, InterfaceC1364105Vn<? super C05G5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c238400w2;
        this.LLILLL = musicAggregatedVideoRootViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05G5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAggregatedVideoRootViewModel@aa0d.startCalculatePlayDuration$2");
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
            long j = this.LLILLJJLI.element;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MusicAggregatedVideoRootViewModel@aa0d.startCalculatePlayDuration$2");
                return objLJFF;
            }
        }
        MusicAggregatedVideoRootViewModel musicAggregatedVideoRootViewModel = this.LLILLL;
        musicAggregatedVideoRootViewModel.LLILLJJLI += this.LLILLJJLI.element;
        musicAggregatedVideoRootViewModel.setState(AFwS229S0000000_2.get$arr$(706));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicAggregatedVideoRootViewModel@aa0d.startCalculatePlayDuration$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
