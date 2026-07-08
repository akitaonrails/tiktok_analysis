package X;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074790e4j<T> implements Comparator {
    public static final C1074790e4j<T> LL = new C1074790e4j<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((C1074770e4h) obj).LL;
        String str2 = ((C1074770e4h) obj2).LL;
        if (Intrinsics.LJFF(str, str2)) {
            return 0;
        }
        if (Intrinsics.LJFF(str, "#")) {
            return 1;
        }
        if (Intrinsics.LJFF(str2, "#")) {
            return -1;
        }
        return str.compareTo(str2);
    }
}
