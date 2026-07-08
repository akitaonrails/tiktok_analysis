package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677350tkb extends C09AY implements Function1<C1378605aS, C1677270tkT> {
    public C1677350tkb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1677270tkT invoke(C1378605aS c1378605aS) {
        long j = c1378605aS.LIZ;
        return new C1677270tkT(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
