package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {507}, m = "invokeSuspend")
public final class C1690700u68 extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690700u68(AbstractC1690640u62 abstractC1690640u62, float f, int i, InterfaceC1364105Vn<? super C1690700u68> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1690640u62;
        this.LLILLL = f;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1690700u68(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            AbstractC1690640u62 abstractC1690640u62 = this.LLILLJJLI;
            this.LL = 1;
            Object objLJIJI = abstractC1690640u62.LJJI.LJIJI(this);
            if (objLJIJI != C099R.LJFF()) {
                objLJIJI = Unit.LIZ;
            }
            if (objLJIJI == objLJFF) {
                return objLJFF;
            }
        }
        float f = this.LLILLL;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pageOffsetFraction ");
            sbLIZ.append(f);
            sbLIZ.append(" is not within the range -0.5 to 0.5");
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILLJJLI.LJIL(this.LLILLL, this.LLILLJJLI.LJIIIIZZ(this.LLILZ), true);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
