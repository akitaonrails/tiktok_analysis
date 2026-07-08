package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ApC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191121ApC extends C09AY implements Function0<Long> {
    public C2191121ApC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(C2191131ApD.LIZ().expiredTime <= 0 ? 0L : ((long) C2191131ApD.LIZ().expiredTime) * 1000);
    }
}
