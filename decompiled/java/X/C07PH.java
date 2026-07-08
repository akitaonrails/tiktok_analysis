package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: renamed from: X.07PH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07PH {
    public static final String[] LIZ = {"❤️", "😂"};

    public static final List<String> LIZ() {
        String[] strArr;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String[] strArr2 = LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_unread_share_dm_exposed_emoji", String[].class, strArr2);
        if ((objLJIIIIZZ instanceof String[]) && (strArr = (String[]) objLJIIIIZZ) != null && strArr.length != 0) {
            strArr2 = strArr;
        }
        return C13LQ.LJJLL(strArr2);
    }
}
