package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05R4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend")
public final class C05R4 extends C09AX implements Function1<InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Long, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05R4(Function1<? super Long, Object> function1, InterfaceC1364105Vn<? super C05R4> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05R4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
            Function1<Long, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = C1838620xwi.LIZIZ(this, function1);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        return obj;
    }
}
