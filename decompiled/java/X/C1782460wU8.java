package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782460wU8 {
    public static EnumC1782450wU7 LIZ(String str) {
        EnumC1782450wU7 next;
        Iterator<EnumC1782450wU7> it2 = EnumC1782450wU7.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getValue(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1782450wU7 enumC1782450wU7 = next;
        if (enumC1782450wU7 == null) {
            return EnumC1782450wU7.UNKNOWN;
        }
        return enumC1782450wU7;
    }
}
