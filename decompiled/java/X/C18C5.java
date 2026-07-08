package X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18C5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18C5 extends C09AY implements Function0<String> {
    public C18C5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AtomicLong atomicLong = C801030VbZ.LIZ;
        return UUID.randomUUID().toString();
    }
}
