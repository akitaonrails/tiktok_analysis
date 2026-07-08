package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274701E1s extends C09AY implements Function0<Integer> {
    public C2274701E1s() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer num = C2274671E1p.LIZ().frequencyControlPermanentExitCount;
        return Integer.valueOf(num != null ? num.intValue() : 5);
    }
}
