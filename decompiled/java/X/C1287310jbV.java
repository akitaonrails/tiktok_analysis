package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0jbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287310jbV {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(92));

    public static List LIZ(int i, int i2, List list) {
        C1804820x4C c1804820x4C;
        List<Diamond> list2;
        C1804840x4E c1804840x4ELJIILIIL = C1797270ws1.LIZJ().LJIILIIL(i, EnumC587980N4i.STRATEGY_TASK, String.valueOf(i2));
        if ((c1804840x4ELJIILIIL instanceof C1804820x4C) && (c1804820x4C = (C1804820x4C) c1804840x4ELJIILIIL) != null && (list2 = c1804820x4C.LJIIIIZZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (Diamond diamond : list2) {
                if (list.contains(diamond.iapId)) {
                    arrayList.add(diamond);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LIZIZ(int i, int i2, List list) {
        Object objLJJJLL = C13LP.LJJJLL(list);
        List listLIZ = LIZ(i, i2, list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        Iterator it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Diamond) it2.next()).iapId);
        }
        return C500260Jjc.LJJJI(Boolean.valueOf(arrayList.contains(objLJJJLL)));
    }
}
