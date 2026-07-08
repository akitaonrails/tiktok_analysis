package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00J4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00J4 {
    public static final Map<Integer, Boolean> LIZ;

    static {
        int[] iArr = {0};
        int[] iArr2 = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("bottom_lynx_support_video_type", int[].class, iArr);
        if (iArr2 != null) {
            iArr = iArr2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i : iArr) {
            linkedHashMap.put(Integer.valueOf(i), Boolean.TRUE);
        }
        LIZ = linkedHashMap;
    }
}
