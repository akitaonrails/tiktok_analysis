package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
public final class C1677620tl2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677640tl4 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1677630tl3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677620tl2(C1677640tl4 c1677640tl4, long j, C1677630tl3 c1677630tl3, InterfaceC1364105Vn<? super C1677620tl2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677640tl4;
        this.LLILLL = j;
        this.LLILZ = c1677630tl3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1677620tl2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function2<? super C1682900ttY, ? super C1682900ttY, Unit> function2;
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
            C1677480tko<C1682900ttY, C1677270tkT> c1677480tko = this.LLILLJJLI.LIZ;
            C1682900ttY c1682900ttY = new C1682900ttY(this.LLILLL);
            InterfaceC1677030tk5<C1682900ttY> interfaceC1677030tk5 = this.LLILZ.LLJJ;
            this.LL = 1;
            obj = C1677480tko.LIZJ(c1677480tko, c1682900ttY, interfaceC1677030tk5, null, null, this, 12);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        C1677600tl0 c1677600tl0 = (C1677600tl0) obj;
        if (c1677600tl0.LIZIZ == EnumC993030bwr.Finished && (function2 = this.LLILZ.LLJJIII) != null) {
            function2.invoke(new C1682900ttY(this.LLILLJJLI.LIZIZ), c1677600tl0.LIZ.getValue());
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
