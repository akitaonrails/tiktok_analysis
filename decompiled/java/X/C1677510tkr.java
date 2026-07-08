package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677510tkr extends C09AY implements Function1<C1682900ttY, C1677270tkT> {
    public C1677510tkr() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1677270tkT invoke(C1682900ttY c1682900ttY) {
        long j = c1682900ttY.LIZ;
        return new C1677270tkT((int) (j >> 32), (int) (j & 4294967295L));
    }
}
