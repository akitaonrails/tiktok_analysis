package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676050tiV extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C1692150u8T LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676050tiV(C1692150u8T c1692150u8T, C1677480tko<Float, C1677280tkU> c1677480tko, int i) {
        super(0);
        this.LL = c1692150u8T;
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C1692150u8T c1692150u8T = this.LL;
        int iLJ = 0;
        if (c1692150u8T != null) {
            float fFloatValue = this.LLILLJJLI.LIZLLL().floatValue();
            int i = this.LLILLL;
            int i2 = c1692150u8T.LIZIZ.LJFF;
            if (i2 > i && i > 0) {
                iLJ = C13LZ.LJ((C1676150tif.LJII(c1692150u8T, fFloatValue) - i) + 1, 0, i2 - i);
            }
        }
        return Integer.valueOf(iLJ);
    }
}
