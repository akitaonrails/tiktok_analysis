package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0oew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481640oew implements InterfaceC1482100ofg {
    public final LinkedList<String> LIZ = new LinkedList<>();
    public final LinkedList<String> LIZIZ = new LinkedList<>();
    public final List<InterfaceC1481930ofP> LIZJ = new LinkedList();
    public final C603840NmI<String, Integer> LIZLLL = new C603840NmI<>(20);
    public final C603840NmI<String, HashMap<String, String>> LJ = new C603840NmI<>(20);
    public final C603840NmI<String, Boolean> LJFF = new C603840NmI<>(20);
    public final C603840NmI<String, Boolean> LJI = new C603840NmI<>(20);

    public static C1481640oew LIZJ(String str) {
        C1481640oew c1481640oew = new C1481640oew();
        if (TextUtils.isEmpty(str)) {
            return c1481640oew;
        }
        int iMin = Math.min(Math.max(5120, 102400), 307200);
        int iMin2 = Math.min(Math.max(2, 4), 32);
        for (int i = 0; i < iMin2; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("play_session_events_data_");
            sbLIZ.append(i);
            C0VT1 c0vt1 = new C0VT1(C2188811AlT.LIZIZ(sbLIZ), iMin);
            HashMap<String, HashMap<String, String>> mapLIZLLL = c0vt1.LIZLLL();
            if (mapLIZLLL != null && !mapLIZLLL.isEmpty()) {
                Set<String> setKeySet = mapLIZLLL.keySet();
                c1481640oew.LJ.putAll(mapLIZLLL);
                c1481640oew.LIZIZ.addAll(setKeySet);
                Iterator<String> it2 = setKeySet.iterator();
                if (it2.hasNext()) {
                    String next = it2.next();
                    if (!TextUtils.isEmpty(next) && i >= 0) {
                        c1481640oew.LIZLLL.put(next, Integer.valueOf(i));
                    }
                }
            }
            ((LinkedList) c1481640oew.LIZJ).add(c0vt1);
        }
        return c1481640oew;
    }

    public final HashMap<String, String> LIZ(String str) {
        if (TextUtils.isEmpty(str) || !this.LJ.containsKey(str)) {
            return null;
        }
        return this.LJ.get(str);
    }

    public final InterfaceC1481930ofP LIZIZ(String str) {
        Integer num;
        int iIntValue;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || !this.LIZLLL.containsKey(str) || (num = this.LIZLLL.get(str)) == null || (iIntValue = num.intValue()) < 0 || iIntValue >= ((LinkedList) this.LIZJ).size()) {
            return null;
        }
        return (InterfaceC1481930ofP) ListProtector.get(this.LIZJ, iIntValue);
    }

    public final HashMap<String, String> LIZLLL(String str) {
        HashMap<String, String> mapLIZ;
        if (TextUtils.isEmpty(str) || (mapLIZ = LIZ(str)) == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str) && this.LIZ.contains(str)) {
            this.LIZ.remove(str);
        }
        if (!TextUtils.isEmpty(str) && this.LJ.containsKey(str)) {
            this.LJ.remove(str);
        }
        if (!TextUtils.isEmpty(str)) {
            this.LJI.put(str, Boolean.TRUE);
        }
        InterfaceC1481930ofP interfaceC1481930ofPLIZIZ = LIZIZ(str);
        if (interfaceC1481930ofPLIZIZ != null) {
            interfaceC1481930ofPLIZIZ.LIZ();
        }
        return mapLIZ;
    }

    public final void LJ(EnumC1481810ofD enumC1481810ofD, String str, String str2) {
        Boolean bool;
        int i = C1481800ofC.LIZ[enumC1481810ofD.ordinal()];
        if ((i == 1 || i == 2 || i == 3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int size = this.LIZ.size();
            if (size > 2) {
                while (true) {
                    int i2 = size - 1;
                    if (size <= 2) {
                        break;
                    }
                    String first = this.LIZ.getFirst();
                    if (!TextUtils.isEmpty(first)) {
                        this.LIZ.remove(0);
                        this.LIZIZ.addLast(first);
                    }
                    size = i2;
                }
            }
            if (enumC1481810ofD == EnumC1481810ofD.VIDEO_REQUEST && !TextUtils.isEmpty(str)) {
                this.LIZ.addLast(str);
            }
            String strName = enumC1481810ofD.name();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strName) && !TextUtils.isEmpty(str2)) {
                HashMap<String, String> mapLIZ = LIZ(str);
                if (mapLIZ == null) {
                    mapLIZ = new HashMap<>();
                    if (!TextUtils.isEmpty(str)) {
                        this.LJ.put(str, mapLIZ);
                    }
                }
                mapLIZ.put(strName, str2);
            }
            if (!TextUtils.isEmpty(str) && this.LJI.containsKey(str) && (bool = this.LJI.get(str)) != null && bool.booleanValue()) {
                if (!TextUtils.isEmpty(str)) {
                    for (int i3 = 0; i3 < this.LIZIZ.size(); i3++) {
                        if (TextUtils.equals(str, this.LIZIZ.get(i3))) {
                            break;
                        }
                    }
                    this.LIZIZ.addLast(str);
                } else {
                    this.LIZIZ.addLast(str);
                }
            }
            enumC1481810ofD.name();
        }
    }
}
