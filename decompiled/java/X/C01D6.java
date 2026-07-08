package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01D6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D6 extends C09AY implements Function1<C01D5, C01D5> {
    public final /* synthetic */ C419910GdJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01D6(C419910GdJ c419910GdJ) {
        super(1);
        this.LL = c419910GdJ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C01D5 invoke(C01D5 c01d5) {
        return C01D5.LIZ(c01d5, null, 0, 0, 0, null, this.LL, null, 383);
    }
}
