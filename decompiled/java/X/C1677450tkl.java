package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677450tkl extends C09AY implements Function1<C1677440tkk, C1677270tkT> {
    public C1677450tkl() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1677270tkT invoke(C1677440tkk c1677440tkk) {
        long j = c1677440tkk.LIZ;
        return new C1677270tkT(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
