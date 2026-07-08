package X;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321730kV1 {
    public static final List<C1321790kV7> LIZ = new ArrayList();
    public static int LIZIZ;

    public static String LIZ(DialogC1321700kUy dialogC1321700kUy) {
        StringBuilder sb = new StringBuilder("default_overlay_id_");
        int i = LIZIZ;
        LIZIZ = i + 1;
        sb.append(i);
        String string = sb.toString();
        int iIntValue = dialogC1321700kUy.LLILZ.intValue();
        ListIterator listIterator = ((ArrayList) LIZ).listIterator();
        while (listIterator.hasNext()) {
            if (iIntValue <= ((C1321790kV7) listIterator.next()).LIZIZ.LLILZ.intValue()) {
                listIterator.previous();
                listIterator.add(new C1321790kV7(string, dialogC1321700kUy));
                return string;
            }
        }
        ((ArrayList) LIZ).add(new C1321790kV7(string, dialogC1321700kUy));
        return string;
    }

    public static void LIZIZ(String str) {
        if (str != null) {
            for (C1321790kV7 c1321790kV7 : (ArrayList) LIZ) {
                if (Intrinsics.LJFF(c1321790kV7.LIZ, str)) {
                    ((ArrayList) LIZ).remove(c1321790kV7);
                    return;
                }
            }
        }
    }
}
