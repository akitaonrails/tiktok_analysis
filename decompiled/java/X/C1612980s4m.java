package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612980s4m {
    public static EnumC1612690s4J LIZ(String str) {
        EnumC1612690s4J next;
        Iterator<EnumC1612690s4J> it2 = EnumC1612690s4J.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(str, next.getKey())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
