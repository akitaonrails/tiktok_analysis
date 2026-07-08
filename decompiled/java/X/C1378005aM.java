package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$ZoomableBox$zoomModifier$1$1$1$1", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C1378005aM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1378505aR LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378005aM(C1378505aR c1378505aR, long j, long j2, InterfaceC1364105Vn<? super C1378005aM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1378505aR;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1378005aM c1378005aM = new C1378005aM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1378005aM.LL = obj;
        return c1378005aM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        if (this.LLILLJJLI.LIZ.LIZLLL().floatValue() > 1.0f) {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1377905aL(this.LLILLJJLI, null), 3);
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1378205aO(this.LLILLJJLI, null), 3);
        } else {
            Pair pairLJI = C1679750toT.LJI(2.0f, this.LLILZ, C1378605aS.LJI(C1378605aS.LJII(2.0f, C1378605aS.LJFF(this.LLILLJJLI.LIZIZ.LIZLLL().LIZ, this.LLILLL)), this.LLILLL));
            long j = ((C1378605aS) pairLJI.getFirst()).LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1377805aK(this.LLILLJJLI, ((Number) pairLJI.getSecond()).floatValue(), null), 3);
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1378105aN(this.LLILLJJLI, j, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.ZoomableBox$zoomModifier$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
