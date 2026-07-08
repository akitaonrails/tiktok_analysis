package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ogj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482750ogj {
    public InterfaceC1479620obg LIZIZ;
    public InterfaceC1479620obg LIZJ;
    public String LIZLLL;
    public final C1482810ogp LIZ = new LinkedHashMap<String, List<InterfaceC1479620obg>>() { // from class: X.0ogp
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<InterfaceC1479620obg>> entry) {
            if (size() > 8) {
                return true;
            }
            return false;
        }
    };
    public int LJ = -1;

    public final List<InterfaceC1479620obg> LIZJ() {
        List<InterfaceC1479620obg> list = get(this.LIZLLL);
        return list == null ? new ArrayList() : list;
    }

    public final boolean LIZLLL(String str) {
        InterfaceC1479620obg interfaceC1479620obg = this.LIZJ;
        if (interfaceC1479620obg == null) {
            return false;
        }
        if (!TextUtils.equals(str, interfaceC1479620obg.getKey()) && !LJ(str, this.LIZJ.LJIIJJI()) && !LJ(str, this.LIZJ.LJII())) {
            return false;
        }
        return true;
    }

    public static boolean LJ(String str, List list) {
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(((InterfaceC1479740obs) it2.next()).getKey(), str)) {
                return true;
            }
        }
        return false;
    }

    public final int LIZ(InterfaceC1479620obg interfaceC1479620obg, List<InterfaceC1479620obg> list) {
        int i = this.LJ;
        if (i != -1 && interfaceC1479620obg != null) {
            int iMin = Math.min(i + 9, list.size() - 1);
            for (int iMax = Math.max(i - 9, 0); iMax < iMin; iMax++) {
                if (TextUtils.equals(((InterfaceC1479620obg) ListProtector.get(list, iMax)).getKey(), interfaceC1479620obg.getKey())) {
                    return iMax;
                }
            }
        }
        return -1;
    }

    public final int LIZIZ(InterfaceC1479620obg interfaceC1479620obg, List<InterfaceC1479620obg> list) {
        int iLIZ = LIZ(interfaceC1479620obg, list);
        int i = -1;
        if (iLIZ != -1) {
            return iLIZ;
        }
        if (list.size() != 0 && interfaceC1479620obg != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (TextUtils.equals(((InterfaceC1479620obg) ListProtector.get(list, i2)).getKey(), interfaceC1479620obg.getKey())) {
                    i = i2;
                }
            }
        }
        return i;
    }
}
