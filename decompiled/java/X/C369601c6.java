package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C369601c6 {
    public static final Object LIZJ = new Object();
    public final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(296));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C5182020e(this, 248));

    public final Keva LIZIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final String LIZ(String str) {
        String str2 = (String) ((LinkedHashMap) this.LIZIZ.getValue()).get(str);
        if (str2 == null) {
            str2 = "";
        }
        if (new C0VSJ(str2).exists()) {
            return str2;
        }
        return null;
    }

    public final void LIZLLL(String str) {
        synchronized (LIZJ) {
            try {
                ((LinkedHashMap) this.LIZIZ.getValue()).remove(str);
                try {
                    Set<Map.Entry> setEntrySet = ((LinkedHashMap) this.LIZIZ.getValue()).entrySet();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
                    for (Map.Entry entry : setEntrySet) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                    Keva kevaLIZIZ = LIZIZ();
                    C1227904rF.LIZ.getClass();
                    kevaLIZIZ.storeString("cahce_resource_new", String.valueOf(C1227904rF.LJI(arrayList)));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LIZJ(String str, String str2) {
        synchronized (LIZJ) {
            try {
                ((LinkedHashMap) this.LIZIZ.getValue()).put(str, str2);
                try {
                    Set<Map.Entry> setEntrySet = ((LinkedHashMap) this.LIZIZ.getValue()).entrySet();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
                    for (Map.Entry entry : setEntrySet) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                    Keva kevaLIZIZ = LIZIZ();
                    C1227904rF.LIZ.getClass();
                    kevaLIZIZ.storeString("cahce_resource_new", String.valueOf(C1227904rF.LJI(arrayList)));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
