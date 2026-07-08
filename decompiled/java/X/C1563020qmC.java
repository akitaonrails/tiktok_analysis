package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563020qmC extends C09AY implements Function0<C1562200qks> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563020qmC(C118300cf c118300cf, int i, C118300cf c118300cf2, C118300cf c118300cf3, C118300cf c118300cf4, C118300cf c118300cf5, C118300cf c118300cf6) {
        super(0);
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = c118300cf2;
        this.LLILZ = c118300cf3;
        this.LLILZIL = c118300cf4;
        this.LLILZLL = c118300cf5;
        this.LLIZ = c118300cf6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1562200qks invoke() {
        float f = this.LL.element * 1.0f;
        float f2 = this.LLILLJJLI;
        return new C1562200qks(f / f2, (this.LLILLL.element * 1.0f) / f2, (this.LLILZ.element * 1.0f) / f2, (this.LLILZIL.element * 1.0f) / f2, (this.LLILZLL.element * 1.0f) / f2, (this.LLIZ.element * 1.0f) / f2);
    }
}
