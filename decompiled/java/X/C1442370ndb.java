package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ndb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442370ndb {
    public static final boolean LIZ(boolean z) {
        if (z && InterfaceC1442420ndg.LJFF.enableSplitConfig()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Object obj) {
        if (obj instanceof Integer) {
            if (Intrinsics.LJFF(obj, Integer.MIN_VALUE)) {
                return false;
            }
        } else if (obj instanceof Float) {
            if (((Number) obj).floatValue() == Float.MIN_VALUE) {
                return false;
            }
        } else {
            if ((obj instanceof String) && !Intrinsics.LJFF(obj, "invalid_str")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
