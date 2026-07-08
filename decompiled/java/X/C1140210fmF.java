package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.node.base.PipelineKt$andAll$1", f = "Pipeline.kt", l = {234}, m = "invokeSuspend")
public final class C1140210fmF extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object>[] LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140210fmF(InterfaceC1140460fme<Object, Object>[] interfaceC1140460fmeArr, InterfaceC1364105Vn<? super C1140210fmF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1140460fmeArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1140210fmF c1140210fmF = new C1140210fmF(this.LLILLL, interfaceC1364105Vn);
        c1140210fmF.LLILLJJLI = obj;
        return c1140210fmF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipelineKt@cc3.andAll$1");
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
            C1140200fmE c1140200fmE = new C1140200fmE(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C2296808zG.LJ(c1140200fmE, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PipelineKt@cc3.andAll$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PipelineKt@cc3.andAll$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
