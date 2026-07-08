package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01V8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01V8 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    static {
        new C01V6();
    }

    public C01V8(String str) {
        this.LIZ = str;
    }

    public static void LIZ(C01V8 c01v8, String str, Map map, Function0 function0, int i) {
        Map map2 = map;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = "view_created_cost";
        }
        if ((i & 2) != 0) {
            map2 = null;
        }
        c01v8.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        function0.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (((Number) C01V9.LIZ.getValue()).intValue() == 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01V7(c01v8, jCurrentTimeMillis2, str2, map2, null), 3);
        }
    }
}
