package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509490JyV extends C09AY implements Function1<C509480JyU, C509480JyU> {
    public final /* synthetic */ C509170Jxz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509490JyV(C509170Jxz c509170Jxz) {
        super(1);
        this.LL = c509170Jxz;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C509480JyU invoke(C509480JyU c509480JyU) {
        C291001Au c291001Au = new C291001Au(this.LL);
        c509480JyU.getClass();
        return new C509480JyU(c291001Au);
    }
}
