package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C9G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C9G extends C09AY implements Function0<Long> {
    public C0C9G() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        return Long.valueOf((jCurrentTimeMillis - C844470XAv.LJIJJLI) / 1000);
    }
}
