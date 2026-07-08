package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C275180AqS extends C09AY implements Function0<Integer> {
    public C275180AqS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C01GW c01gw = C275170AqR.LIZ;
        return Integer.valueOf(((Number) c01gw.getValue()).intValue() > 0 ? ((Number) c01gw.getValue()).intValue() : 1);
    }
}
