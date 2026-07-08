package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01D7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D7 extends C09AY implements Function1<C01D5, C01D5> {
    public final /* synthetic */ C01D5 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01D7(C01D5 c01d5, int i) {
        super(1);
        this.LL = c01d5;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C01D5 invoke(C01D5 c01d5) {
        int i = this.LL.LLILLL;
        int i2 = this.LLILLJJLI;
        return C01D5.LIZ(c01d5, new C01DA(i, i2), i2, 0, 0, null, null, null, 508);
    }
}
