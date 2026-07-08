package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08B3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08B3 {
    public static final HashMap<Object, Bundle> LIZ = new HashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1280));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1278));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1279));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1277));
    public static volatile boolean LJFF;

    public static Object LIZ(Activity activity) {
        Field field;
        Map map = (Map) LIZIZ.getValue();
        if (map == null || (field = (Field) LIZJ.getValue()) == null) {
            return null;
        }
        for (Object obj : map.values()) {
            if (field.get(obj) == activity) {
                return obj;
            }
        }
        return null;
    }

    public static Object LIZIZ(Activity activity) {
        try {
            Field field = (Field) LJ.getValue();
            if (field != null) {
                return field.get(activity);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
