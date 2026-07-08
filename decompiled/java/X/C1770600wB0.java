package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770600wB0 {
    public final String LIZ;
    public final int LIZIZ;
    public final Object LIZJ = new Object();
    public final LinkedHashMap<String, C1770570wAx> LIZLLL = new LinkedHashMap<>(0, 0.75f, true);

    public final int LJ() {
        Iterator<Map.Entry<String, C1770570wAx>> it2 = this.LIZLLL.entrySet().iterator();
        int i = 0;
        while (this.LIZLLL.size() > this.LIZIZ && it2.hasNext()) {
            it2.next();
            i++;
            it2.remove();
        }
        return i;
    }

    public final C1770570wAx LIZ(String str) {
        boolean z;
        Pair pair;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        EnumC1770610wB1 enumC1770610wB1 = null;
        if (z) {
            return null;
        }
        synchronized (this.LIZJ) {
            try {
                pair = new Pair(this.LIZLLL.get(str), Integer.valueOf(this.LIZLLL.size()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1770570wAx c1770570wAx = (C1770570wAx) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aid=");
        sbLIZ.append(str);
        sbLIZ.append(", hit=");
        if (c1770570wAx != null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", status=");
        if (c1770570wAx != null) {
            enumC1770610wB1 = c1770570wAx.LIZ;
        }
        sbLIZ.append(enumC1770610wB1);
        sbLIZ.append(", size=");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        return c1770570wAx;
    }

    public final void LIZIZ(List<String> list) {
        C443120HZe c443120HZe;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (this.LIZJ) {
            try {
                int size = this.LIZLLL.size();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.LIZLLL.put((String) it2.next(), new C1770570wAx(EnumC1770610wB1.REQUEST_FAIL, 2));
                }
                c443120HZe = new C443120HZe(Integer.valueOf(size), Integer.valueOf(this.LIZLLL.size()), Integer.valueOf(LJ()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((Number) c443120HZe.getFirst()).intValue();
        ((Number) c443120HZe.getSecond()).intValue();
        ((Number) c443120HZe.getThird()).intValue();
    }

    public final void LIZJ(List<String> list) {
        C443120HZe c443120HZe;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (this.LIZJ) {
            try {
                int size = this.LIZLLL.size();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.LIZLLL.put((String) it2.next(), new C1770570wAx((EnumC1770610wB1) null, 3));
                }
                c443120HZe = new C443120HZe(Integer.valueOf(size), Integer.valueOf(this.LIZLLL.size()), Integer.valueOf(LJ()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((Number) c443120HZe.getFirst()).intValue();
        ((Number) c443120HZe.getSecond()).intValue();
        ((Number) c443120HZe.getThird()).intValue();
    }

    public final void LIZLLL(List<C1770680wB8> list) {
        C443120HZe c443120HZe;
        ArrayList<C1770680wB8> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (this.LIZJ) {
            try {
                int size = this.LIZLLL.size();
                for (C1770680wB8 c1770680wB8 : arrayList) {
                    this.LIZLLL.put(c1770680wB8.LIZ, c1770680wB8.LIZIZ);
                }
                c443120HZe = new C443120HZe(Integer.valueOf(size), Integer.valueOf(this.LIZLLL.size()), Integer.valueOf(LJ()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((Number) c443120HZe.getFirst()).intValue();
        ((Number) c443120HZe.getSecond()).intValue();
        ((Number) c443120HZe.getThird()).intValue();
    }

    public C1770600wB0(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
