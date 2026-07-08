package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677430tkj extends C09AY implements Function1<C1677270tkT, C1677440tkk> {
    public C1677430tkj() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1677440tkk invoke(C1677270tkT c1677270tkT) {
        C1677270tkT c1677270tkT2 = c1677270tkT;
        float f = c1677270tkT2.LIZ;
        float f2 = c1677270tkT2.LIZIZ;
        return new C1677440tkk((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }
}
