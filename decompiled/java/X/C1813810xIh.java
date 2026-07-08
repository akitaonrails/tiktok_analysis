package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0xIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813810xIh {
    public static List LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        C13BV c13bv = C1813820xIi.LIZ;
        List list = (List) c0c64LJIILLIIL.LJJII(List.class, c13bv, "studio_ai_video_tool_aspect_ratios", true);
        return list != null ? list : c13bv;
    }

    public static List LIZIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        C13BV c13bv = C1813830xIj.LIZ;
        List list = (List) c0c64LJIILLIIL.LJJII(List.class, c13bv, "studio_ai_video_tool_durations", true);
        return list != null ? list : c13bv;
    }

    public static List LIZJ(Context context) {
        List listLIZIZ = LIZIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1782380wU0(context.getString(2131841124, String.valueOf((int) ((Number) it2.next()).doubleValue())), null, 30));
        }
        return arrayList;
    }
}
