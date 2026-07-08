package X;

import android.content.Context;
import com.bytedance.push.settings.LocalFrequencySettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808840VoA {
    public static Map<Integer, C808830Vo9> LIZ;

    public static void LIZ(Context context) {
        if (LIZ != null) {
            return;
        }
        List<C808830Vo9> listLJJIII = ((LocalFrequencySettings) C0WFE.LIZ(context, LocalFrequencySettings.class)).LJJIII();
        if (listLJJIII == null) {
            LIZ = new HashMap();
            return;
        }
        HashMap map = new HashMap();
        for (C808830Vo9 c808830Vo9 : listLJJIII) {
            if (c808830Vo9 != null) {
                map.put(Integer.valueOf(c808830Vo9.LJ), c808830Vo9);
            }
        }
        LIZ = map;
    }

    public static synchronized C808830Vo9 LIZIZ(int i, Context context) {
        LIZ(context);
        Map<Integer, C808830Vo9> map = LIZ;
        if (map == null) {
            return null;
        }
        return (C808830Vo9) ((HashMap) map).get(Integer.valueOf(i));
    }

    public static synchronized void LIZJ(Context context, C808830Vo9 c808830Vo9) {
        LIZ(context);
        Map<Integer, C808830Vo9> map = LIZ;
        if (map == null) {
            return;
        }
        ((HashMap) map).put(Integer.valueOf(c808830Vo9.LJ), c808830Vo9);
        ((LocalFrequencySettings) C0WFE.LIZ(context, LocalFrequencySettings.class)).LJIJI(new ArrayList(((HashMap) LIZ).values()));
    }
}
