package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20642815q6 {
    public static volatile int LIZ;
    public static final CopyOnWriteArrayList<InterfaceC20643015q8> LIZIZ = new CopyOnWriteArrayList<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C20642915q7());

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static void LJ(EnumC20643215qA enumC20643215qA, boolean z) {
        int i;
        if (enumC20643215qA == EnumC20643215qA.COLD_START) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            LIZ = i;
        }
        Iterator<InterfaceC20643015q8> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(enumC20643215qA, z);
        }
    }

    public static void LJFF(int i, InnerPushMessage innerPushMessage) {
        List list = (List) LIZ().get(Integer.valueOf(i));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20643015q8) it2.next()).LIZIZ(innerPushMessage);
            }
        }
        Iterator<InterfaceC20643015q8> it3 = LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(innerPushMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public static void LJI(InterfaceC20643015q8 interfaceC20643015q8, int[] iArr) {
        boolean z = true;
        if (iArr != null && iArr.length != 0) {
            for (int i : iArr) {
                ?? arrayList = (List) LIZ().get(Integer.valueOf(i));
                if (arrayList != 0 && !arrayList.isEmpty()) {
                    if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                        arrayList.add(interfaceC20643015q8);
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next(), interfaceC20643015q8)) {
                                break;
                            }
                        }
                        arrayList.add(interfaceC20643015q8);
                    }
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(interfaceC20643015q8);
                }
                LIZ().put(Integer.valueOf(i), arrayList);
            }
        } else {
            CopyOnWriteArrayList<InterfaceC20643015q8> copyOnWriteArrayList = LIZIZ;
            if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
                LIZIZ.add(interfaceC20643015q8);
            } else {
                Iterator<InterfaceC20643015q8> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next(), interfaceC20643015q8)) {
                        break;
                    }
                }
                LIZIZ.add(interfaceC20643015q8);
            }
        }
        if (LIZ != 0) {
            EnumC20643215qA enumC20643215qA = EnumC20643215qA.COLD_START;
            if (LIZ != 1) {
                z = false;
            }
            LJ(enumC20643215qA, z);
        }
    }

    public static void LIZIZ(int i, InnerPushMessage innerPushMessage, int i2) {
        List list = (List) LIZ().get(Integer.valueOf(i));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20643015q8) it2.next()).LJIIL(i2, innerPushMessage);
            }
        }
        Iterator<InterfaceC20643015q8> it3 = LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJIIL(i2, innerPushMessage);
        }
    }

    public static void LIZLLL(int i, InnerPushMessage innerPushMessage, EnumC19330310jt enumC19330310jt) {
        List list = (List) LIZ().get(Integer.valueOf(i));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20643015q8) it2.next()).LJ();
            }
        }
        Iterator<InterfaceC20643015q8> it3 = LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJ();
        }
    }

    public static void LIZJ(int i, InnerPushMessage innerPushMessage, boolean z, String str) {
        List list = (List) LIZ().get(Integer.valueOf(i));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20643015q8) it2.next()).LJIIJ(innerPushMessage, z, str);
            }
        }
        Iterator<InterfaceC20643015q8> it3 = LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJIIJ(innerPushMessage, z, str);
        }
    }
}
