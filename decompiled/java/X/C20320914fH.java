package X;

import java.util.Map;

/* JADX INFO: renamed from: X.14fH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20320914fH implements Map.Entry<String, Long> {
    public Map.Entry<String, ?> LL;

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Long getValue() {
        Map.Entry<String, ?> entry = this.LL;
        if (entry == null || !(entry.getValue() instanceof Long)) {
            return -1L;
        }
        return (Long) this.LL.getValue();
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        Map.Entry<String, ?> entry = this.LL;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Long setValue(Long l) {
        return null;
    }
}
