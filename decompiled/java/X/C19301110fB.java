package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.10fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19301110fB {
    public static EnumC19300510f5 LIZ(int i) {
        for (EnumC19300510f5 enumC19300510f5 : EnumC19300510f5.values()) {
            if (enumC19300510f5.getType() == i) {
                return enumC19300510f5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
