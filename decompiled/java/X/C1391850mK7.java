package X;

import android.app.Activity;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0mK7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391850mK7 {
    public static Function2<? super String, ? super Map<String, String>, Unit> LIZIZ;
    public static int LIZLLL;
    public static Function1<? super Activity, Unit> LJI;
    public static final C13E8<String> LIZ = new C13E8<>(30);
    public static String LIZJ = "";
    public static final C01GW LJ = C452501pT.LIZIZ(new C1391860mK8());
    public static final Map<Integer, String> LJFF = new LinkedHashMap();

    public static void LIZ(Map map) {
        map.put("launch_id", LIZJ);
        map.put("is_cold_start_first_launch", String.valueOf(LIZLLL));
        map.put("upath_chain", new JSONArray((Collection) LIZ).toString());
    }

    public static final void LIZIZ(Object obj, String str) {
        if (obj != null) {
            LJFF.put(Integer.valueOf(obj.hashCode()), str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-----bindPopup()： ");
            sbLIZ.append(obj);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
