package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDY extends C09AY implements Function0<Long> {
    public C0CDY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(C0CD2.LJFF().getLong("optimize_sleeprunnableinterval", -1L));
    }
}
