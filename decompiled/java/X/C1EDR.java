package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EDR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EDR extends C09AY implements Function0<Boolean> {
    public C1EDR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if ((C1EDT.LIZ() & 1) != 1 && (C1EDT.LIZ() & 2) != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
