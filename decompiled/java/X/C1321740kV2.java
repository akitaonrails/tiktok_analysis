package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321740kV2 {
    public static final List<C1321780kV6> LIZ = new ArrayList();
    public static int LIZIZ;

    public static void LIZIZ(String str) {
        if (str != null) {
            for (C1321780kV6 c1321780kV6 : (ArrayList) LIZ) {
                if (Intrinsics.LJFF(c1321780kV6.LIZ, str)) {
                    ((ArrayList) LIZ).remove(c1321780kV6);
                    return;
                }
            }
        }
    }

    public static String LIZ(String str, DialogC1321720kV0 dialogC1321720kV0) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("default_overlay_id_");
            int i = LIZIZ;
            LIZIZ = i + 1;
            sb.append(i);
            str = sb.toString();
        }
        ListProtector.add(LIZ, 0, new C1321780kV6(str, dialogC1321720kV0));
        return str;
    }
}
