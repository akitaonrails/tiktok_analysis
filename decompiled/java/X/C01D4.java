package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01D4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D4 extends C09AY implements Function1<C01D5, C01D5> {
    public final /* synthetic */ C01D5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01D4(C01D5 c01d5) {
        super(1);
        this.LL = c01d5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C01D5 invoke(C01D5 c01d5) {
        C01D5 c01d52 = c01d5;
        int i = this.LL.LLILLL;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i2 = 0;
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        return C01D5.LIZ(c01d52, null, 0, i2, 0, null, null, null, 507);
    }
}
