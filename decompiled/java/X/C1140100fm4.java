package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.node.base.PipelineKt$then$1", f = "Pipeline.kt", l = {75, 84}, m = "invokeSuspend")
public final class C1140100fm4 extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object> LLILLL;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140100fm4(InterfaceC1140460fme<Object, Object> interfaceC1140460fme, InterfaceC1140460fme<Object, Object> interfaceC1140460fme2, InterfaceC1364105Vn<? super C1140100fm4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1140460fme;
        this.LLILZ = interfaceC1140460fme2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1140100fm4 c1140100fm4 = new C1140100fm4(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1140100fm4.LLILLJJLI = obj;
        return c1140100fm4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1140190fmD c1140190fmD;
        C1C7U.LIZ("PipelineKt@cc3.then$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PipelineKt@cc3.then$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            obj2 = this.LLILLJJLI;
            InterfaceC1140460fme<Object, Object> interfaceC1140460fme = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = interfaceC1140460fme.LIZ(obj2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PipelineKt@cc3.then$1");
                return objLJFF;
            }
        }
        AbstractC1140120fm6 abstractC1140120fm6 = (AbstractC1140120fm6) obj;
        abstractC1140120fm6.getClass();
        if (abstractC1140120fm6 instanceof C1140190fmD) {
            Throwable thLIZ = abstractC1140120fm6.LIZ();
            if (thLIZ != null) {
                c1140190fmD = new C1140190fmD(thLIZ);
            } else {
                c1140190fmD = new C1140190fmD(abstractC1140120fm6.LIZIZ());
            }
            C1C7U.LIZIZ("PipelineKt@cc3.then$1");
            return c1140190fmD;
        }
        InterfaceC1140460fme<Object, Object> interfaceC1140460fme2 = this.LLILZ;
        this.LLILLJJLI = null;
        this.LL = 2;
        obj = interfaceC1140460fme2.LIZ(obj2, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("PipelineKt@cc3.then$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("PipelineKt@cc3.then$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
