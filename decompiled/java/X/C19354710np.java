package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.10np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19354710np {
    public static EnumC19354610no LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            for (EnumC19354610no enumC19354610no : EnumC19354610no.values()) {
                if (enumC19354610no.ordinal() == num.intValue()) {
                    return enumC19354610no;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return null;
    }
}
