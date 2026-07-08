package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.node.base.PipelineKt$or$1", f = "Pipeline.kt", l = {136, 138}, m = "invokeSuspend")
public final class C1140110fm5 extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object> LLILLL;
    public final /* synthetic */ InterfaceC1140460fme<Object, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140110fm5(InterfaceC1140460fme<Object, Object> interfaceC1140460fme, InterfaceC1140460fme<Object, Object> interfaceC1140460fme2, InterfaceC1364105Vn<? super C1140110fm5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1140460fme;
        this.LLILZ = interfaceC1140460fme2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1140110fm5 c1140110fm5 = new C1140110fm5(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1140110fm5.LLILLJJLI = obj;
        return c1140110fm5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("PipelineKt@cc3.or$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PipelineKt@cc3.or$1");
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
                C1C7U.LIZIZ("PipelineKt@cc3.or$1");
                return objLJFF;
            }
        }
        if (!(obj instanceof C1140300fmO)) {
            InterfaceC1140460fme<Object, Object> interfaceC1140460fme2 = this.LLILZ;
            this.LLILLJJLI = null;
            this.LL = 2;
            obj = interfaceC1140460fme2.LIZ(obj2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PipelineKt@cc3.or$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PipelineKt@cc3.or$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super AbstractC1140120fm6<Object>> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
