package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917490Zz1 extends C09AY implements Function1<C916740Zxo, C916740Zxo> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C917490Zz1(int i, int i2, boolean z, long j) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C916740Zxo invoke(C916740Zxo c916740Zxo) {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        boolean z = this.LLILLL;
        long j = this.LLILZ;
        c916740Zxo.getClass();
        return new C916740Zxo(i, i2, z, j);
    }
}
