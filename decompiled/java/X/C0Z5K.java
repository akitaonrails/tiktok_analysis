package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z5K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5K extends C09AY implements Function0<Boolean> {
    public C0Z5K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(System.currentTimeMillis() % ((long) 100) < ((long) C0Z5L.LIZ().defaultSampleRate));
    }
}
