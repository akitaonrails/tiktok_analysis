package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0A0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0A0Y extends C09AY implements Function0<Boolean> {
    public C0A0Y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((((Number) C255620A0a.LIZ.getValue()).intValue() & 1) == 1 && AbstractC19994813Le.Default.nextFloat() < ((Number) C2554409zi.LIZ.getValue()).floatValue());
    }
}
