package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509470JyT extends C09AY implements Function1<C509480JyU, C509480JyU> {
    public final /* synthetic */ C509160Jxy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509470JyT(C509160Jxy c509160Jxy) {
        super(1);
        this.LL = c509160Jxy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C509480JyU invoke(C509480JyU c509480JyU) {
        C291001Au c291001Au = new C291001Au(this.LL);
        c509480JyU.getClass();
        return new C509480JyU(c291001Au);
    }
}
