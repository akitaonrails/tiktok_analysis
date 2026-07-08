package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19996913Lz {
    public static final boolean LIZJ(Effect effect) {
        int i;
        List<String> requirements_sec = effect.getRequirements_sec();
        if (requirements_sec == null || requirements_sec.isEmpty()) {
            return false;
        }
        List<String> requirements = effect.getRequirements();
        if ((requirements instanceof Collection) && requirements.isEmpty()) {
            i = 0;
        } else {
            Iterator<String> it2 = requirements.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((!a0.LJJJIL(it2.next())) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        List<String> requirements_sec2 = effect.getRequirements_sec();
        if (requirements_sec2 != null && !requirements_sec2.isEmpty()) {
            Iterator<String> it3 = requirements_sec2.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                if ((!a0.LJJJIL(it3.next())) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i2 != 0 && i2 != i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final Map LIZ(C13R7 c13r7, String str) {
        if (!C504670Jqj.LIZIZ(str) && str != null && c13r7 != null) {
            try {
                return (Map) c13r7.LIZ.convertJsonToObj(str, Map.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS.LIZ.getClass();
                C13SS.LIZIZ("effect_platform", "EffectUtils#getModelNamesOfEffect", e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String[] LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r11, X.C13R7 r12) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19996913Lz.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, X.13R7):java.lang.String[]");
    }

    public static String[] LIZLLL(Map map, String[] strArr) {
        if (C927830aFh.LIZIZ(map)) {
            return strArr;
        }
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.addAll((Collection) ((Map.Entry) it2.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            if (strArr != null) {
                arrayList2.addAll(C13LQ.LJJLL(strArr));
            }
            arrayList2.addAll(arrayList);
            return (String[]) arrayList2.toArray(new String[0]);
        }
        return null;
    }
}
