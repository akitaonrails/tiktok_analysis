package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Czf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248571Czf {
    public final ConcurrentHashMap<EnumC1584360rKc, C2248581Czg> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<EnumC1584360rKc, CopyOnWriteArrayList<C2248581Czg>> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C2248581Czg> LIZJ = new ConcurrentHashMap<>();

    public static boolean LIZ(C2248581Czg c2248581Czg, C2248581Czg c2248581Czg2) {
        if (Intrinsics.LJFF(c2248581Czg.LIZJ.LIZ(), c2248581Czg2.LIZJ.LIZ()) && !c2248581Czg.LIZJ.LIZIZ.LIZIZ(c2248581Czg2.LIZJ.LIZIZ)) {
            c2248581Czg.LIZJ.LIZIZ = c2248581Czg2.LIZJ.LIZIZ;
            return false;
        }
        return true;
    }

    public final List<C2248581Czg> LIZIZ(C19EG c19eg, C2248581Czg c2248581Czg) {
        HomeTabAbility homeTabAbilityLIZ;
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            boolean zKQ2 = homeTabAbilityLIZ.HC0().KQ2(c2248581Czg.LJ);
            boolean zKQ22 = homeTabAbilityLIZ.HC0().KQ2("HOME");
            ArrayList arrayList = new ArrayList();
            if (zKQ22) {
                arrayList.addAll(this.LIZ.values());
            } else {
                for (Map.Entry<EnumC1584360rKc, C2248581Czg> entry : this.LIZ.entrySet()) {
                    if (entry.getValue().LIZIZ == EnumC592410NLj.BOTTOM) {
                        arrayList.add(entry.getValue());
                    }
                }
            }
            if (zKQ2) {
                List list = this.LIZIZ.get(c2248581Czg.LIZLLL);
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                arrayList.addAll(list);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
