package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.BizScopedMediaMessageManager$retrySendMediaMessage$1", f = "BizScopedMediaMessageManager.kt", l = {}, m = "invokeSuspend")
public final class C873400YOc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YOY $listener;
    public final /* synthetic */ C0IC5 $options;
    public final /* synthetic */ C873450YOh $params;
    public int label;
    public final /* synthetic */ C873490YOl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873400YOc(C873490YOl c873490YOl, C873450YOh c873450YOh, C0YOY c0yoy, C0IC5 c0ic5, InterfaceC1364105Vn<? super C873400YOc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.this$0 = c873490YOl;
        this.$params = c873450YOh;
        this.$listener = c0yoy;
        this.$options = c0ic5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C873400YOc(this.this$0, this.$params, this.$listener, this.$options, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BizScopedMediaMessageManager@fd91.retrySendMediaMessage$1");
        C099R.LJFF();
        if (this.label == 0) {
            C155000ia.LIZIZ(obj);
            C869590Y9l c869590Y9lLJJIIZI = this.this$0.LIZ.LIZJ().LJIIJJI().LJJIIZI(this.$params.LIZ);
            if (c869590Y9lLJJIIZI == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Message not found for uuid=");
                sbLIZ.append(this.$params.LIZ);
                C0YPY c0ypy = new C0YPY(-1040, C2188811AlT.LIZIZ(sbLIZ), null, null);
                C0YOY c0yoy = this.$listener;
                if (c0yoy != null) {
                    c0yoy.onEvent(new C0YQ0(null, null, c0ypy, this.$params.LIZ));
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BizScopedMediaMessageManager@fd91.retrySendMediaMessage$1");
                return unit;
            }
            C873490YOl c873490YOl = this.this$0;
            C873450YOh c873450YOh = this.$params;
            c873490YOl.LIZ(c873450YOh.LIZ, new C0YPU(c869590Y9lLJJIIZI), c873450YOh.LIZIZ, c873450YOh.LIZJ, this.$options, this.$listener);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BizScopedMediaMessageManager@fd91.retrySendMediaMessage$1");
            return unit2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
