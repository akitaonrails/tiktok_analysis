package X;

import com.bytedance.android.starship.trace.span.Span;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308190k9B extends C1308180k9A {
    public final AtomicInteger LLILZIL;

    @Override // X.C1308180k9A, X.InterfaceC1307160k7W
    public final void release() {
        if (this.LLILLJJLI.LIZIZ.decrementAndGet() == 0 && this.LLILZIL.get() == 0) {
            close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308190k9B(String str) {
        super(new Span(str), new C1308200k9C(new C1308220k9E()), null);
        C1308180k9A.LLILZ.getClass();
        this.LLILZIL = new AtomicInteger(0);
    }

    @Override // X.C1308180k9A, X.InterfaceC1307160k7W
    public final void LJLLI(Span span) {
        if (Intrinsics.LJFF(span.context.parentId, this.LL.context.spanId)) {
            if (this.LLILZIL.decrementAndGet() == 0 && this.LLILLJJLI.LIZIZ.get() == 0) {
                close();
                return;
            }
            return;
        }
        super.LJLLI(span);
    }

    @Override // X.C1308180k9A, X.InterfaceC1307160k7W
    public final InterfaceC1307160k7W LLIIIZ(String str) {
        this.LLILZIL.incrementAndGet();
        return super.LLIIIZ(str);
    }
}
