package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$ZoomableBox$zoomModifier$1$1$1$1$4", f = "TakoContentPreviewAssem.kt", l = {1507}, m = "invokeSuspend")
public final class C1378105aN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1378505aR LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378105aN(C1378505aR c1378505aR, long j, InterfaceC1364105Vn<? super C1378105aN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1378505aR;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1378105aN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$1$1$1$1$4");
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
            C1677480tko<C1378605aS, C1677270tkT> c1677480tko = this.LLILLJJLI.LIZIZ;
            C1378605aS c1378605aS = new C1378605aS(this.LLILLL);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, c1378605aS, null, null, null, this, 14) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$1$1$1$1$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$1$1$1$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
