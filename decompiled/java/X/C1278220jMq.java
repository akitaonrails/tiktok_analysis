package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0jMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278220jMq {
    public static EnumC1278060jMa LIZ(int i) {
        for (EnumC1278060jMa enumC1278060jMa : EnumC1278060jMa.values()) {
            if (enumC1278060jMa.getChannel() == i) {
                return enumC1278060jMa;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
