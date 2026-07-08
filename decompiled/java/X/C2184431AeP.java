package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184431AeP extends C09AY implements Function0<Boolean> {
    public C2184431AeP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iLIZ = C2184411AeN.LIZ();
        boolean z = true;
        if (iLIZ != 1 && iLIZ != 2 && iLIZ != 3 && iLIZ != 4 && iLIZ != 5) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
