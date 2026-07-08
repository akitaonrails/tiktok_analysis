package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0UFF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFF {
    public static C0UFE LIZ(int i) {
        for (C0UFE c0ufe : C0UFE.values()) {
            if (c0ufe.getValue() == i) {
                return c0ufe;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
