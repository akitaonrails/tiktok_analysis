package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fm3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.node.base.PipelineKt$thenTransform$1", f = "Pipeline.kt", l = {105, 125}, m = "invokeSuspend")
public final class C1140090fm3 extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object> LLILLL;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140090fm3(InterfaceC1140460fme<Object, Object> interfaceC1140460fme, InterfaceC1140460fme<Object, Object> interfaceC1140460fme2, InterfaceC1364105Vn<? super C1140090fm3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1140460fme;
        this.LLILZ = interfaceC1140460fme2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1140090fm3 c1140090fm3 = new C1140090fm3(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1140090fm3.LLILLJJLI = obj;
        return c1140090fm3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1140190fmD c1140190fmD;
        C1140240fmI c1140240fmI;
        C1C7U.LIZ("PipelineKt@cc3.thenTransform$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            InterfaceC1140460fme<Object, Object> interfaceC1140460fme = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1140460fme.LIZ(obj2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
                return objLJFF;
            }
        }
        AbstractC1140120fm6 abstractC1140120fm6 = (AbstractC1140120fm6) obj;
        Object objLIZJ = abstractC1140120fm6.LIZJ();
        if (objLIZJ == null) {
            if ((abstractC1140120fm6 instanceof C1140240fmI) && (c1140240fmI = (C1140240fmI) abstractC1140120fm6) != null && c1140240fmI.LIZJ != null) {
                C1140240fmI c1140240fmI2 = new C1140240fmI(objLIZJ);
                C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
                return c1140240fmI2;
            }
            if (abstractC1140120fm6 instanceof C1140190fmD) {
                Throwable thLIZ = abstractC1140120fm6.LIZ();
                if (thLIZ != null) {
                    c1140190fmD = new C1140190fmD(thLIZ);
                } else {
                    c1140190fmD = new C1140190fmD(abstractC1140120fm6.LIZIZ());
                }
                C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
                return c1140190fmD;
            }
            C1140190fmD c1140190fmD2 = new C1140190fmD(new Throwable("unknown error msg"));
            C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
            return c1140190fmD2;
        }
        InterfaceC1140460fme<Object, Object> interfaceC1140460fme2 = this.LLILZ;
        this.LL = 2;
        obj = interfaceC1140460fme2.LIZ(objLIZJ, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("PipelineKt@cc3.thenTransform$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
