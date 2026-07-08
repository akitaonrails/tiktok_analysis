package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07aP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887907aP {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(float f) {
        String strValueOf = String.valueOf(f);
        if (u.LJIIZILJ(strValueOf, ".0", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strValueOf, new String[]{".0"}, 0, 6);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            sbLIZ.append('x');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strValueOf);
        sbLIZ2.append('x');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
