package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1905107dB {
    public static final Map<String, String> LIZ(Effect effect) {
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("prop_panel_model_request_id", effect.getLogId()));
        ArrayList arrayList = new ArrayList(mapLIZJ.size());
        for (Map.Entry entry : mapLIZJ.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue().toString()));
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }
}
