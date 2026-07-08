package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677320tkY extends C09AY implements Function1<C1677270tkT, C1682900ttY> {
    public C1677320tkY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1682900ttY invoke(C1677270tkT c1677270tkT) {
        C1677270tkT c1677270tkT2 = c1677270tkT;
        int iRound = Math.round(c1677270tkT2.LIZ);
        int i = 0;
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(c1677270tkT2.LIZIZ);
        if (iRound2 >= 0) {
            i = iRound2;
        }
        return new C1682900ttY((((long) i) & 4294967295L) | (((long) iRound) << 32));
    }
}
