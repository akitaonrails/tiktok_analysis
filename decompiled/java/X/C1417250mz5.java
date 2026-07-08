package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutPreloadingComponent$startPreload$1", f = "AutoCutPreloadingComponent.kt", l = {145}, m = "invokeSuspend")
public final class C1417250mz5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1417240mz4 LLILLJJLI;
    public final /* synthetic */ C1417180myy LLILLL;
    public final /* synthetic */ AbstractC1417270mz7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417250mz5(C1417240mz4 c1417240mz4, C1417180myy c1417180myy, AbstractC1417270mz7 abstractC1417270mz7, InterfaceC1364105Vn<? super C1417250mz5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1417240mz4;
        this.LLILLL = c1417180myy;
        this.LLILZ = abstractC1417270mz7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1417250mz5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutPreloadingComponent@62d.startPreload$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("AutoCutPreloadingComponent@62d.startPreload$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.c3(this.LLILLL, this.LLILZ)) {
            this.LLILLJJLI.W1();
            C1417160myw.LJIL(this.LLILLJJLI.getActivity(), this.LLILLJJLI.getDiContainer(), this.LLILLJJLI.H2(), this.LLILLL, true, 32);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutPreloadingComponent@62d.startPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
