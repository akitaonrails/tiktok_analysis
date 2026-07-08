package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05TP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment$handleVideoEvent$1", f = "TakoAiVideoDetailPageFragment.kt", l = {393}, m = "invokeSuspend")
public final class C05TP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAiVideoDetailPageFragment LLILLJJLI;
    public final /* synthetic */ C737030Svd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05TP(TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment, C737030Svd c737030Svd, InterfaceC1364105Vn<? super C05TP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAiVideoDetailPageFragment;
        this.LLILLL = c737030Svd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAiVideoDetailPageFragment@9183.handleVideoEvent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLLIIL;
            C737030Svd c737030Svd = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(c737030Svd, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handleVideoEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAiVideoDetailPageFragment@9183.handleVideoEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
