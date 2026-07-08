package X;

import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0b61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960270b61 {
    public static List<Long> LIZ;
    public static List<QuickCohostContent> LIZIZ;
    public static long LIZJ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZ = c13bv;
        LIZIZ = c13bv;
    }

    public static List LIZ() {
        if (LIZJ != C950220apo.LJ()) {
            List<Long> listLIZ = InterfaceC1104970erP.F2.LIZ();
            if (listLIZ == null) {
                listLIZ = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().longValue()));
            }
            LIZJ = C950220apo.LJ();
            LIZ = arrayList;
        }
        if (!LIZ.isEmpty()) {
            Double dLIZ = InterfaceC1104970erP.G2.LIZ();
            if ((dLIZ != null ? dLIZ.doubleValue() : 0.0d) - C158B.LIZ() >= 5.184E9d) {
                LIZJ("cache_expired_while_getSelectedTagIdList", false, C13BV.INSTANCE);
            }
        }
        return LIZ;
    }

    public static void LIZIZ(String str, List list) {
        LIZIZ = list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((QuickCohostContent) it2.next()).contentId));
        }
        LIZJ(str, true, arrayList);
    }

    public static void LIZJ(String str, boolean z, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSelectedTagIdList tags:");
        sbLIZ.append(list);
        sbLIZ.append(", source:");
        sbLIZ.append(str);
        sbLIZ.append(", refreshExpireCountDown:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("RandomLinkInterestTagRepo", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = C950220apo.LJ();
        LIZ = list;
        InterfaceC1104970erP.F2.LIZJ(list);
        if (z) {
            InterfaceC1104970erP.G2.LIZJ(Double.valueOf(C158B.LIZ() * 1.0d));
        }
    }
}
