package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06EU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06EU {
    public static C06ET LIZ(String str) {
        C06ET next;
        Iterator<C06ET> it2 = C06ET.LJII.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C06ET c06et = next;
        if (c06et == null) {
            return new C06ET(str);
        }
        return c06et;
    }
}
