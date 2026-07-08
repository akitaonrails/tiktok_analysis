package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123920fLy {
    public static C1123920fLy LIZIZ;
    public final C1123930fLz LIZ = new C1123930fLz();

    public static C1123920fLy LIZ() {
        if (LIZIZ == null) {
            synchronized (C1123920fLy.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1123920fLy();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1123960fM2 interfaceC1123960fM2 = (InterfaceC1123960fM2) it2.next();
            C1124000fM6 c1124000fM6 = new C1124000fM6();
            c1124000fM6.LIZ = interfaceC1123960fM2;
            arrayList.add(c1124000fM6);
        }
        return arrayList;
    }

    public final List<C1124000fM6> LIZIZ(EnumC1124020fM8 enumC1124020fM8) {
        C1123930fLz c1123930fLz = this.LIZ;
        c1123930fLz.LIZ();
        return LIZLLL((List) ((HashMap) c1123930fLz.LIZIZ).get(enumC1124020fM8));
    }

    public final List<C1124000fM6> LIZJ(EnumC756810TmR enumC756810TmR) {
        C1123930fLz c1123930fLz = this.LIZ;
        c1123930fLz.LIZ();
        return LIZLLL((List) ((HashMap) c1123930fLz.LIZ).get(enumC756810TmR));
    }
}
