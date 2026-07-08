package X;

import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20648415r0 {
    public static final HashMap<String, Integer> LIZ = new HashMap<>();
    public static final HashMap<String, List<OutreachRecordData>> LIZIZ = new HashMap<>();

    public static void LIZ(OutreachRecordData outreachRecordData, List list) {
        int iIntValue;
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C20648515r1 c20648515r1 = (C20648515r1) it2.next();
            if (!(c20648515r1.LJ instanceof C20651115rR)) {
                C20648815r4.LIZ.getClass();
                if (C20648815r4.LJIIIZ(outreachRecordData, c20648515r1)) {
                    String str = c20648515r1.LIZ;
                    HashMap<String, Integer> map = LIZ;
                    Integer num = map.get(str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put(str, Integer.valueOf(iIntValue + 1));
                    HashMap<String, List<OutreachRecordData>> map2 = LIZIZ;
                    List<OutreachRecordData> arrayList = map2.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map2.put(str, arrayList);
                    }
                    arrayList.add(outreachRecordData);
                }
            }
        }
    }
}
