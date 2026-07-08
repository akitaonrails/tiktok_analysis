package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790190wgb {
    public static EnumC1790200wgc LIZ(String str) {
        EnumC1790200wgc next;
        Iterator<EnumC1790200wgc> it2 = EnumC1790200wgc.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getMethodName(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1790200wgc enumC1790200wgc = next;
        if (enumC1790200wgc == null) {
            return EnumC1790200wgc.UNKNOWN;
        }
        return enumC1790200wgc;
    }
}
