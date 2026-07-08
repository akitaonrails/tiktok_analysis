package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.buffer.MessageSearchContentUpdateBufferKt$chunkedWithDebounce$1$1$result$1$2", f = "MessageSearchContentUpdateBuffer.kt", l = {}, m = "invokeSuspend")
public final class C375301d1 extends C09AX implements Function1<InterfaceC1364105Vn<Object>, Object> {
    public C375301d1(InterfaceC1364105Vn<? super C375301d1> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C375301d1(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        new C375301d1(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        return null;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1$1$result$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1$1$result$1$2");
        return null;
    }
}
