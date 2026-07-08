package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0jci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288060jci extends C1288070jcj {
    public final int LIZ() {
        Object obj = this.LIZ.get("code");
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    public final String LIZIZ() {
        Object obj = this.LIZ.get("msg");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public C1288060jci(Map<String, Object> map) {
        super(map);
    }
}
