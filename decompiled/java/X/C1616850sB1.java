package X;

import Y.AfS9S0100100_24;
import Y.AkS201S0300000_24;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0sB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616850sB1 {
    public final InterfaceC1615440s8k LIZ;
    public final Function0<String> LIZIZ;
    public final ConcurrentHashMap<String, C1615950s9Z> LIZJ;
    public final ConcurrentHashMap<Integer, List<C1616830sAz>> LIZLLL;

    public C1616850sB1() {
        throw null;
    }

    public C1616850sB1(InterfaceC1615440s8k interfaceC1615440s8k) {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(32);
        this.LIZ = interfaceC1615440s8k;
        this.LIZIZ = aFwS213S0000000_24;
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.LIZLLL) {
            try {
                List<C1616830sAz> list2 = this.LIZLLL.get(Integer.valueOf(i));
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(list2.size() + list.size());
                for (C1616830sAz c1616830sAz : list2) {
                    linkedHashMap.put(new C443120HZe(c1616830sAz.LIZIZ, c1616830sAz.LJIIIZ, c1616830sAz.LJIIJ), c1616830sAz);
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C1616830sAz c1616830sAz2 = (C1616830sAz) it2.next();
                    linkedHashMap.put(new C443120HZe(c1616830sAz2.LIZIZ, c1616830sAz2.LJIIIZ, c1616830sAz2.LJIIJ), c1616830sAz2);
                }
                this.LIZLLL.put(Integer.valueOf(i), C13LP.LLIIII(linkedHashMap.values()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final AbstractC19484711Kz<C1615950s9Z> LIZJ(C1616880sB4 c1616880sB4, boolean z) {
        C1615950s9Z c1615950s9Z;
        final String strLIZIZ = LIZIZ(c1616880sB4.LIZJ, c1616880sB4.LIZLLL);
        if (z && (c1615950s9Z = this.LIZJ.get(strLIZIZ)) != null) {
            return AbstractC19484711Kz.LJIJJLI(c1615950s9Z);
        }
        String strInvoke = c1616880sB4.LJ;
        if (strInvoke == null) {
            strInvoke = this.LIZIZ.invoke();
        }
        C13DA c13da = new C13DA();
        c13da.put("business_line", Integer.valueOf(c1616880sB4.LIZIZ.getValue()));
        c13da.put(Scene.SCENE_SERVICE, c1616880sB4.LIZ);
        String str = c1616880sB4.LIZLLL;
        if (str != null && str.length() > 0) {
            c13da.put("creator_id", str);
        }
        String str2 = c1616880sB4.LIZJ;
        if (str2 != null && str2.length() > 0) {
            c13da.put("spu_id", str2);
        }
        Map mapBuild = c13da.build();
        long jLJ = C518170KTv.LJ("prefetch_config", null, null, null, mapBuild, 30);
        InterfaceC1615440s8k interfaceC1615440s8k = this.LIZ;
        String str3 = c1616880sB4.LIZ;
        int value = c1616880sB4.LIZIZ.getValue();
        return interfaceC1615440s8k.LIZ(str3, Integer.valueOf(value), c1616880sB4.LIZJ, c1616880sB4.LIZLLL, Boolean.valueOf(C1616810sAx.LIZIZ.LJIILJJIL()), strInvoke, c1616880sB4.LJFF).LJIILL(new AfS9S0100100_24(jLJ, mapBuild, 0)).LJIIL(new AfS9S0100100_24(jLJ, mapBuild, 1)).LJIIZILJ(new AkS201S0300000_24(c1616880sB4, this, mapBuild, 0)).LJIILL(new C09JN() { // from class: X.0sB5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PaywallDataSource@b65f.loadResponse$5");
                this.LL.LIZJ.put(strLIZIZ, obj);
                C1C7U.LIZIZ("PaywallDataSource@b65f.loadResponse$5");
            }
        });
    }
}
