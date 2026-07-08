package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0To8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757860To8 {
    public static final C757860To8 LIZ = new C757860To8();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(491));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(492));
    public static boolean LIZLLL;

    public static C13E8 LIZ() {
        Keva keva = (Keva) LIZJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profile_viewer_entrance_animation_frequency_control");
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keva.getString(C2188811AlT.LIZIZ(sbLIZ), ""), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        C13E8 c13e8 = new C13E8();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).longValue() >= System.currentTimeMillis() - TimeUnit.HOURS.toMillis(24L)) {
                arrayList2.add(obj);
            }
        }
        c13e8.addAll(C13LP.LLD(1, arrayList2));
        return c13e8;
    }
}
