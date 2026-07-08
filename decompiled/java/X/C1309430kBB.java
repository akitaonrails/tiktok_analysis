package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309430kBB extends C09AY implements Function0<Long> {
    public C1309430kBB() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Number number;
        Object obj = C1309360kB4.LIZ().get("key_upload_runtime_event_interval");
        return Long.valueOf(((!(obj instanceof Number) || (number = (Number) obj) == null) ? 60L : number.longValue()) * 1000);
    }
}
