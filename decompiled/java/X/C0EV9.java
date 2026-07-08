package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EV9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EV9 {
    public static C0EVA LIZ(String str) {
        for (C0EVA c0eva : C0EVA.values()) {
            if (Intrinsics.LJFF(c0eva.getValue(), str)) {
                return c0eva;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
