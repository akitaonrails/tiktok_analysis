package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08PX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PX extends C09AY implements Function0<Long> {
    public C08PX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(TimeUnit.SECONDS.toMillis(2L));
    }
}
