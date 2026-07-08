package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0u1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687710u1J {
    public static EnumC1687690u1H LIZ(int i) {
        for (EnumC1687690u1H enumC1687690u1H : EnumC1687690u1H.values()) {
            if (enumC1687690u1H.getValue() == i) {
                return enumC1687690u1H;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
