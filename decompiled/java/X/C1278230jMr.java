package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0jMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278230jMr {
    public static EnumC1278080jMc LIZ(int i) {
        for (EnumC1278080jMc enumC1278080jMc : EnumC1278080jMc.values()) {
            if (enumC1278080jMc.getSampleRate() == i) {
                return enumC1278080jMc;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
