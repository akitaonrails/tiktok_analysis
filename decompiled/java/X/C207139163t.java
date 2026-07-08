package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.163t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207139163t {
    public static C163V LIZ(int i) {
        for (C163V c163v : C163V.values()) {
            if (c163v.status == i) {
                return c163v;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
