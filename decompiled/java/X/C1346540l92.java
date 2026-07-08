package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346540l92 extends C09AY implements Function1<C1346950l9h, C1346950l9h> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346540l92(boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1346950l9h invoke(C1346950l9h c1346950l9h) {
        boolean z;
        C1346950l9h c1346950l9h2 = c1346950l9h;
        if (!this.LL && this.LLILLJJLI && this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        return C1346950l9h.LIZ(c1346950l9h2, null, false, 0, 0, null, false, false, false, null, null, null, null, null, false, null, null, null, false, false, null, z, false, false, false, false, null, null, false, null, -8388609);
    }
}
