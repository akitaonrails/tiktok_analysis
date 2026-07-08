package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$ZoomableBox$zoomModifier$2$1$1$1", f = "TakoContentPreviewAssem.kt", l = {1521, 1522}, m = "invokeSuspend")
public final class C1377605aI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1378505aR LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377605aI(C1378505aR c1378505aR, float f, long j, InterfaceC1364105Vn<? super C1377605aI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1378505aR;
        this.LLILLL = f;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1377605aI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$2$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$2$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI.LIZ;
            Float fLIZLLL = C2286608xc.LIZLLL(this.LLILLL);
            this.LL = 1;
            if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$2$1$1$1");
                return objLJFF;
            }
        }
        C1677480tko<C1378605aS, C1677270tkT> c1677480tko2 = this.LLILLJJLI.LIZIZ;
        C1378605aS c1378605aS = new C1378605aS(this.LLILZ);
        this.LL = 2;
        if (c1677480tko2.LJFF(c1378605aS, this) == objLJFF) {
            C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$2$1$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$2$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
