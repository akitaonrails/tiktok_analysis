package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.01e9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C382301e9 implements InterfaceC1432240nNG {
    public static final C382301e9 LIZ = new C382301e9();
    public static final Keva LIZIZ = Keva.getRepo("nle_template_feature_info");

    public static List LIZLLL(List list, List list2) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(CastLongProtector.parseLong((String) it2.next())));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            int i = LIZIZ.getInt((String) it3.next(), -1);
            if (i == -1) {
                return C13BV.INSTANCE;
            }
            int i2 = i / 32;
            ListProtector.set(arrayList2, i2, Long.valueOf(((Number) ListProtector.get(arrayList2, i2)).longValue() & ((long) (~(1 << (i % 32))))));
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1432240nNG
    public final List<Long> LIZIZ(List<String> list, boolean z) {
        return LIZLLL(C13LQ.LJJLL(LIZIZ.getStringArray("all_support_feature_bits", new String[0])), list);
    }

    @Override // X.InterfaceC1432240nNG
    public final List<Long> LIZJ(List<String> list, boolean z) {
        return LIZLLL(C13LQ.LJJLL(LIZIZ.getStringArray("ugc_all_support_feature_bits", new String[0])), list);
    }

    @Override // X.InterfaceC1432240nNG
    public final boolean LIZ(List<Long> list, List<Long> list2, boolean z) {
        ArrayList arrayList = (ArrayList) list2;
        ArrayList arrayList2 = (ArrayList) list;
        if (arrayList.size() > arrayList2.size()) {
            return false;
        }
        int iMin = Math.min(arrayList2.size(), arrayList.size());
        for (int i = 0; i < iMin; i++) {
            if ((((Number) ListProtector.get(list2, i)).longValue() | ((Number) ListProtector.get(list, i)).longValue()) != ((Number) ListProtector.get(list, i)).longValue()) {
                return false;
            }
        }
        return true;
    }
}
