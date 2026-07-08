package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547350qMv {
    public static final InterfaceC1547330qMt LIZ(Object obj) {
        if (obj instanceof InterfaceC1547330qMt) {
            return (InterfaceC1547330qMt) obj;
        }
        if (obj instanceof Map) {
            C1547320qMs.Companion.getClass();
            return C1547340qMu.LIZIZ((Map) obj);
        }
        if (!(obj instanceof List)) {
            return null;
        }
        C1547320qMs.Companion.getClass();
        return C1547340qMu.LIZ((List) obj);
    }
}
