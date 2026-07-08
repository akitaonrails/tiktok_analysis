package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01DF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DF extends C09AY implements Function1<C01D5, C01D5> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DF(int i) {
        super(1);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C01D5 invoke(C01D5 c01d5) {
        return C01D5.LIZ(c01d5, null, this.LL, 0, 0, new C291001Au(Boolean.TRUE), null, null, 493);
    }
}
