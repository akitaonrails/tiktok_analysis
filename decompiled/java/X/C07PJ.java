package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: renamed from: X.07PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07PJ {
    public static final String[] LIZ = {"🥰", "😂", "🥺"};

    public static final List<String> LIZ() {
        String[] strArr;
        Object objLJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("tt_story_dm_exposed_emoji", String[].class, LIZ);
        if (!(objLJIIIIZZ instanceof String[]) || (strArr = (String[]) objLJIIIIZZ) == null || strArr.length == 0) {
            return null;
        }
        return C13LQ.LJJLL(strArr);
    }
}
