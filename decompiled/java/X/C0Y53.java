package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Y53, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y53 extends C09AY implements Function0<C864700Xw4> {
    public final /* synthetic */ C0Y59 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y53(C0Y59 c0y59) {
        super(0);
        this.LL = c0y59;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C864700Xw4 invoke() {
        C0YEM c0yem = this.LL.LIZIZ;
        return new C864700Xw4(c0yem, c0yem.LJIIZILJ().getDomain().LIZ);
    }
}
