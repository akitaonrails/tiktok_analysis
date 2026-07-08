package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1917507fB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1262));

    public static List LIZ() {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(((Keva) LIZ.getValue()).getString("shortcut_id_queue", ""), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
