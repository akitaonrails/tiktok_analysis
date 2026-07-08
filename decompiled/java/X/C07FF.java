package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07FF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07FF extends C09AY implements Function0<Boolean> {
    public C07FF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C07FD.LIZ.getClass();
        return Boolean.valueOf((C07FD.LIZ() & 1) == 1);
    }
}
