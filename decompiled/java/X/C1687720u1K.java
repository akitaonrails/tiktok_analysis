package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0u1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687720u1K {
    public static EnumC1687680u1G LIZ(int i) {
        for (EnumC1687680u1G enumC1687680u1G : EnumC1687680u1G.values()) {
            if (enumC1687680u1G.getValue() == i) {
                return enumC1687680u1G;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
