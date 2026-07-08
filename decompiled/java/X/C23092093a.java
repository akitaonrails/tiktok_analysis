package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.093a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23092093a {
    public static final C23092093a LIZ = new C23092093a();
    public static float LIZIZ = -1.0f;

    public static int LIZ() {
        if (LIZIZ == -1.0f) {
            try {
                LIZ.getClass();
                LIZIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        float f = LIZIZ;
        return f < 6.0f ? EnumC2009807u4.PHONE_LEVEL_LOW.getValue() : f < 8.0f ? EnumC2009807u4.PHONE_LEVEL_MIDDLE.getValue() : EnumC2009807u4.PHONE_LEVEL_HIGH.getValue();
    }

    public static void LIZIZ() {
        Float f;
        if (LIZIZ == -1.0f) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C844470XAv.LIZ.getClass();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
            C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
            C1300610jwx[] c1300610jwxArr = {c1300610jwx};
            Bundle bundle = new Bundle();
            if (c09gaLIZIZ != null) {
                c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
            }
            Object obj = null;
            try {
                obj = bundle.get(c1300610jwx.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            LIZIZ = (!(obj instanceof Float) || (f = (Float) obj) == null) ? 0.0f : f.floatValue();
        }
    }

    public static n LIZLLL(n nVar) {
        n nVar2 = new n();
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            nVar2.LJJIFFI((String) entry.getKey(), (k) entry.getValue());
        }
        return nVar2;
    }

    public static String LIZJ(String str, String str2) {
        n nVar = new n();
        C1227904rF.LIZ.getClass();
        n nVar2 = (n) C1227904rF.LIZIZ(str, n.class);
        n nVar3 = (n) C1227904rF.LIZIZ(str2, n.class);
        for (Map.Entry<String, k> entry : nVar2.entrySet()) {
            nVar.LJJIFFI(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, k> entry2 : nVar3.entrySet()) {
            nVar.LJJIFFI(entry2.getKey(), entry2.getValue());
        }
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(nVar);
        if (strLJI == null) {
            return "";
        }
        return strLJI;
    }
}
