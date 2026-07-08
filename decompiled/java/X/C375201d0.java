package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.buffer.MessageSearchContentUpdateBufferKt$chunkedWithDebounce$1$1$result$1$1", f = "MessageSearchContentUpdateBuffer.kt", l = {}, m = "invokeSuspend")
public final class C375201d0 extends C09AX implements Function2<Object, InterfaceC1364105Vn<Object>, Object> {
    public /* synthetic */ Object LL;

    public C375201d0(InterfaceC1364105Vn<? super C375201d0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C375201d0 c375201d0 = new C375201d0(interfaceC1364105Vn);
        c375201d0.LL = obj;
        return c375201d0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1$1$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C1C7U.LIZIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1$1$result$1$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
