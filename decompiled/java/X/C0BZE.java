package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BZE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BZE extends C09AY implements Function0<Boolean> {
    public C0BZE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if (C0BZD.LIZ() != 1 && C0BZD.LIZ() != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
