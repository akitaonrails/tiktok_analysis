package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609720Nvm extends C09AY implements Function0<Long> {
    public C609720Nvm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((long) C609730Nvn.LIZ().retryTimeInterval) * 1000);
    }
}
