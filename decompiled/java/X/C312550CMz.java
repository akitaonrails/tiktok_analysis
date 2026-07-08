package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312550CMz extends C09AY implements Function0<Long> {
    public C312550CMz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(C312410CMl.LIZ().uiFirstFrameTriggerTimeout > 0 ? C312410CMl.LIZ().uiFirstFrameTriggerTimeout : 200L);
    }
}
