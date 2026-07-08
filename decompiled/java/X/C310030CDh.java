package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310030CDh extends C09AY implements Function0<Integer> {
    public C310030CDh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C0CD2.LJFF().getInt("optimize_suspendtasks_v3", -1));
    }
}
