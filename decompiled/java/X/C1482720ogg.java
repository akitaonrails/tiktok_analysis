package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0ogg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482720ogg implements InterfaceC1023890ckd {
    public InterfaceC1479620obg LIZIZ;
    public InterfaceC1479620obg LIZJ;
    public String LIZLLL;
    public final C1024010ckp LIZ = new LinkedHashMap<String, List<InterfaceC1479620obg>>() { // from class: X.0ckp
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<InterfaceC1479620obg>> entry) {
            if (size() > 8) {
                return true;
            }
            return false;
        }
    };
    public boolean LJ = false;
    public final List<InterfaceC1479620obg> LJFF = new ArrayList();
    public int LJI = -1;

    public final List<InterfaceC1479620obg> LIZLLL() {
        List<InterfaceC1479620obg> list = get(this.LIZLLL);
        return list == null ? new ArrayList() : list;
    }

    public final boolean LJII() {
        int i = this.LJI;
        return i > LIZ(this.LIZIZ, LIZLLL()) && i > -1;
    }

    public final boolean LJ(String str) {
        return LJI(this.LIZJ, str);
    }

    public final void LJIIIIZZ(InterfaceC1479620obg interfaceC1479620obg) {
        this.LIZIZ = this.LIZJ;
        this.LIZJ = interfaceC1479620obg;
        System.currentTimeMillis();
        int iLIZIZ = LIZIZ(this.LIZJ, LIZLLL());
        this.LJI = iLIZIZ;
        if (iLIZIZ == -1) {
            ListIterator listIterator = new ArrayList(entrySet()).listIterator(size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) listIterator.previous();
                int iLIZIZ2 = LIZIZ(this.LIZJ, (List) entry.getValue());
                if (iLIZIZ2 > -1) {
                    this.LIZLLL = (String) entry.getKey();
                    this.LJI = iLIZIZ2;
                    break;
                }
            }
        }
        System.currentTimeMillis();
    }

    public static boolean LJFF(String str, List list) {
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

    public static final boolean LJI(InterfaceC1479620obg interfaceC1479620obg, String str) {
        if (interfaceC1479620obg == null) {
            return false;
        }
        if (!TextUtils.equals(str, interfaceC1479620obg.getKey()) && !LJFF(str, interfaceC1479620obg.LJIIJJI()) && !LJFF(str, interfaceC1479620obg.LJII())) {
            return false;
        }
        return true;
    }

    public final int LIZ(InterfaceC1479620obg interfaceC1479620obg, List<InterfaceC1479620obg> list) {
        int i = this.LJI;
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

    public final void LJIIIZ(String str, List<InterfaceC1479620obg> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            List<InterfaceC1479620obg> listLIZLLL = LIZLLL();
            boolean z = false;
            if (list.size() != 0 && listLIZLLL.size() != 0 && list.size() > listLIZLLL.size() && TextUtils.equals(((InterfaceC1479620obg) ListProtector.get(list, 0)).getKey(), ((InterfaceC1479620obg) ListProtector.get(listLIZLLL, 0)).getKey())) {
                z = true;
                ((ArrayList) this.LJFF).clear();
                ((ArrayList) this.LJFF).addAll(list);
                ((ArrayList) this.LJFF).removeAll(listLIZLLL);
            }
            this.LJ = z;
            if (get(str) == null) {
                put(str, new ArrayList());
            }
            this.LIZLLL = str;
            LIZLLL().clear();
            LIZLLL().addAll(list);
        }
    }

    public final List<InterfaceC1479620obg> LIZJ(int i, int i2, int i3) {
        boolean zLJII;
        ArrayList arrayList = new ArrayList();
        if (this.LJI == -1) {
            return arrayList;
        }
        try {
            List<InterfaceC1479620obg> listLIZLLL = LIZLLL();
            int i4 = 0;
            if (i3 != 2) {
                if (i3 == 1) {
                    zLJII = true;
                } else {
                    zLJII = LJII();
                }
            } else {
                zLJII = false;
            }
            if (zLJII) {
                while (i4 < i) {
                    int i5 = this.LJI + 1 + i4 + i2;
                    if (i5 < listLIZLLL.size()) {
                        arrayList.add(listLIZLLL.get(i5));
                    }
                    i4++;
                }
            } else {
                while (i4 < i) {
                    int i6 = ((this.LJI - 1) - i4) - i2;
                    if (i6 >= 0 && i6 < listLIZLLL.size()) {
                        arrayList.add(listLIZLLL.get(i6));
                    }
                    i4++;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }
}
