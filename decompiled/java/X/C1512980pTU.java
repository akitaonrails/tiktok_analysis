package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512980pTU extends C09AY implements Function0<EnumC1512990pTV> {
    public C1512980pTU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final EnumC1512990pTV invoke() {
        C1513000pTW c1513000pTW = EnumC1512990pTV.Companion;
        int iIntValue = ((Number) C1512970pTT.LIZ.getValue()).intValue();
        c1513000pTW.getClass();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? EnumC1512990pTV.INVALID : EnumC1512990pTV.V4 : EnumC1512990pTV.V3 : EnumC1512990pTV.V2 : EnumC1512990pTV.V1;
    }
}
