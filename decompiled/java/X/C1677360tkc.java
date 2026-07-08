package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677360tkc extends C09AY implements Function1<C1680770tq7, C1677270tkT> {
    public C1677360tkc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1677270tkT invoke(C1680770tq7 c1680770tq7) {
        long j = c1680770tq7.LIZ;
        return new C1677270tkT(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
