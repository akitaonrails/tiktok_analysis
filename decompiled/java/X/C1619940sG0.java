package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0sG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619940sG0 implements InterfaceC1585190rLx {
    public static final C1619940sG0 LL = new C1619940sG0();
    public static final Map<String, Long> LLILLJJLI = new LinkedHashMap();

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        String key;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter tab from ");
        sbLIZ.append(str);
        sbLIZ.append(" to ");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
        C1584320rKY.LIZ.getClass();
        EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(str2);
        if (enumC1584360rKcLJIIIIZZ != null && (key = enumC1584360rKcLJIIIIZZ.getKey()) != null) {
            Map<String, Long> map = LLILLJJLI;
            Long l = (Long) ((LinkedHashMap) map).get(key);
            if (l != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                if (jElapsedRealtime >= 30000) {
                    return;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_instruction_bubble_tab_enter");
                c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "click_duration");
                c474500IjALIZ.LJJII(C1584320rKY.LJI(str2), "tooltips_position_name");
                C1619950sG1.LIZ.getClass();
                c474500IjALIZ.LJJII(C1619950sG1.LIZJ.get(key), "tooltips_key");
                c474500IjALIZ.LIZ();
                map.put(key, null);
            }
        }
    }
}
