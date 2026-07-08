package X;

import android.view.View;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCommonAction;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157910gEn {
    public static final C1157920gEo LIZ(SlashCommonAction slashCommonAction, View view, String str) {
        Map<String, Object> map = slashCommonAction.params;
        Map mapLJIILLIIL = null;
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if ((value instanceof String) && value != null) {
                    arrayList.add(new Pair(key, value));
                }
            }
            mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        }
        return new C1157920gEo(view, mapLJIILLIIL, slashCommonAction.params, slashCommonAction.type, str);
    }
}
