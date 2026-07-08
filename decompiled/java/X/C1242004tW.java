package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1242004tW extends C09AY implements Function0<Integer> {
    public C1242004tW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iIntValue;
        C01GW c01gw = C1241804tU.LIZIZ;
        if (((Number) c01gw.getValue()).intValue() == -1) {
            iIntValue = C13LQ.LJIILLIIL(C2222691Bz1.LIZ(), (Object[]) C1243304tj.LIZIZ.getValue()) ? 0 : 5;
        } else {
            iIntValue = ((Number) c01gw.getValue()).intValue();
        }
        return Integer.valueOf(iIntValue);
    }
}
