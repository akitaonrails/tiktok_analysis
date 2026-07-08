package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677370tkd extends C09AY implements Function1<C1676820tjk, C1677270tkT> {
    public C1677370tkd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1677270tkT invoke(C1676820tjk c1676820tjk) {
        long j = c1676820tjk.LIZ;
        return new C1677270tkT((int) (j >> 32), C1676820tjk.LIZJ(j));
    }
}
