package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13MG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MG {
    public static final C13MG LIZ = new C13MG();
    public static final ConcurrentHashMap<String, Effect> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<C13NY>> LIZJ = new ConcurrentHashMap<>();

    public static boolean LIZJ(Effect effect) {
        if (effect == null || a0.LJJJIL(effect.getId()) || LIZLLL(EffectKt.expectedMd5(effect))) {
            return false;
        }
        if (EffectKt.containDiffInfo(effect) && !C13MR.LIZ(effect)) {
            return false;
        }
        boolean zLJ = C13SB.LJ(effect.getUnzipPath());
        if (zLJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zLIZ = C19997613Mg.LIZ(effect.getUnzipPath());
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkEffectChildrenFile effect: ");
            sbLIZ.append(effect.getEffect_id());
            sbLIZ.append(", name: ");
            sbLIZ.append(effect.getName());
            sbLIZ.append(", result: ");
            sbLIZ.append(zLIZ);
            sbLIZ.append(", time cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("checkEffect", strLIZIZ);
            return zLIZ;
        }
        return zLJ;
    }

    public static boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        return LIZIZ.containsKey(str);
    }

    public static void LIZ(Effect effect, C13NY c13ny) {
        String strExpectedMd5;
        String strExpectedMd52;
        CopyOnWriteArraySet<C13NY> copyOnWriteArraySetPutIfAbsent;
        if (effect != null) {
            strExpectedMd5 = EffectKt.expectedMd5(effect);
        } else {
            strExpectedMd5 = null;
        }
        if (!LIZLLL(strExpectedMd5)) {
            if (LIZJ(effect)) {
                c13ny.onSuccess(effect);
            }
        } else if (effect != null && (strExpectedMd52 = EffectKt.expectedMd5(effect)) != null) {
            ConcurrentHashMap<String, CopyOnWriteArraySet<C13NY>> concurrentHashMap = LIZJ;
            CopyOnWriteArraySet<C13NY> copyOnWriteArraySet = concurrentHashMap.get(strExpectedMd52);
            if (copyOnWriteArraySet == null && (copyOnWriteArraySetPutIfAbsent = concurrentHashMap.putIfAbsent(strExpectedMd52, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
            }
            copyOnWriteArraySet.add(c13ny);
        }
    }

    public static void LIZIZ(Effect effect, C1662010tLr c1662010tLr) {
        String strExpectedMd5;
        if (effect != null && (strExpectedMd5 = EffectKt.expectedMd5(effect)) != null) {
            CopyOnWriteArraySet<C13NY> copyOnWriteArraySet = LIZJ.get(strExpectedMd5);
            if (copyOnWriteArraySet != null) {
                Iterator<C13NY> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().onFail(effect, c1662010tLr);
                }
            }
            LIZJ.remove(strExpectedMd5);
            LIZIZ.remove(strExpectedMd5);
        }
    }
}
