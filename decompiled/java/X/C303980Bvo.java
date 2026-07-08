package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303980Bvo extends C09AY implements Function0<Boolean> {
    public C303980Bvo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((((Number) C303960Bvm.LIZ.getValue()).intValue() & 1) == 1);
    }
}
