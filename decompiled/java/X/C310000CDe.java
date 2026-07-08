package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310000CDe extends C09AY implements Function0<Long> {
    public C310000CDe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(C0CD2.LJFF().getLong("optimize_suspendtasksinterval", 50L));
    }
}
