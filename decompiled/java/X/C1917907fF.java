package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1917907fF {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1179));

    public final List<String> LIZ() {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(((Keva) this.LIZ.getValue()).getString("emoji_list", ""), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
