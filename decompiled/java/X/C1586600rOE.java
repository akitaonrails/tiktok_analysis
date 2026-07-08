package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rOE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586600rOE extends C09AY implements Function0<Boolean> {
    public C1586600rOE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iLIZ = C1586580rOC.LIZ();
        boolean z = false;
        if (1 <= iLIZ && iLIZ < 9 && C1586580rOC.LIZ() != 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
