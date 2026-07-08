package X;

import com.bytedance.android.livesdk.livesetting.other.LiveFoldScreenFastGiftsSettings;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: X.0eoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103140eoS {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(long j) {
        Set<String> setLIZIZ = InterfaceC1094160eZy.W0.LIZIZ();
        boolean enable = LiveFoldScreenFastGiftsSettings.INSTANCE.getEnable();
        if ((setLIZIZ == null || !setLIZIZ.contains(String.valueOf(j))) && !enable) {
            return true;
        }
        return false;
    }

    public static void LIZ(boolean z, boolean z2) {
        String str;
        String str2;
        HashMap map = new HashMap();
        if (z) {
            str = "send";
        } else {
            str = "cancel";
        }
        map.put("click_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("convenient_gift_first_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        if (z2) {
            str2 = "new";
        } else {
            str2 = "normal";
        }
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LIZ();
    }
}
