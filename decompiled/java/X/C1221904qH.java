package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1221904qH extends C09AY implements Function0<EnumC12934054i> {
    public C1221904qH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final EnumC12934054i invoke() {
        int iIntValue = ((Number) C1221804qG.LIZIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? EnumC12934054i.NO_CACHE : EnumC12934054i.DO_FRAME : EnumC12934054i.SAME_MESSAGE;
    }
}
