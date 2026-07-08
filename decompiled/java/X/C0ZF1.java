package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0ZF1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZF1 {
    public static EnumC896490ZEx LIZ(int i) {
        for (EnumC896490ZEx enumC896490ZEx : EnumC896490ZEx.values()) {
            if (enumC896490ZEx.getValue() == i) {
                return enumC896490ZEx;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
