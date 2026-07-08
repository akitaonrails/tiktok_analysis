package X;

import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0owY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492560owY {
    public static final C1492560owY LIZ = new C1492560owY();
    public static final List<String> LIZIZ = new ArrayList();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(7));
    public static final LinkedHashMap<String, String> LIZLLL = new LinkedHashMap<>(0, 0.75f, true);
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(8));

    public static List LIZ(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= ((Number) C0ATW.LIZ.getValue()).intValue()) {
            for (Map.Entry entry : C13LP.LL(LIZLLL.entrySet(), ((Number) C0ATV.LIZ.getValue()).intValue())) {
                Object key = entry.getKey();
                C2354709Kn.LJIJJLI((String) entry.getValue());
                LIZLLL.remove(key);
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    public static void LIZIZ(boolean z, long j, Music music, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("resource_type", "music");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LJIIIIZZ("resource_url", str);
        c2344009Gk.LIZLLL(music.getId(), "resource_id");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
    }
}
