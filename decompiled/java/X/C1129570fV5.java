package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.util.Map;

/* JADX INFO: renamed from: X.0fV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129570fV5 {
    public static final C1129570fV5 LIZ = new C1129570fV5();

    public static String LIZ(InterfaceC1131100fXY interfaceC1131100fXY, String str, long j) {
        String str2;
        C1125300fOC c1125300fOCLJJJLZIJ;
        Map<String, Object> map;
        Object obj = null;
        if (interfaceC1131100fXY != null && (c1125300fOCLJJJLZIJ = interfaceC1131100fXY.LJJJLZIJ()) != null && (map = c1125300fOCLJJJLZIJ.LIZIZ) != null) {
            obj = map.get("charge_reason");
        }
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            return str2;
        }
        if (GiftManager.inst().isPollGift(j)) {
            return "quick_poll";
        }
        if (TextUtils.equals(str, "gift_goal")) {
            return "gift_goal";
        }
        if (TextUtils.equals(str, "top2_empty_slot_page")) {
            return "top2_empty_slot_page";
        }
        if (TextUtils.equals(str, "gift_hub")) {
            return "gifthub_gift";
        }
        if (interfaceC1131100fXY != null && interfaceC1131100fXY.LJJLIIIJLJLI() == 21) {
            return "pk_task";
        }
        if (TextUtils.equals(str, "convenient_icon")) {
            return "shortcut_gift";
        }
        return "gift";
    }
}
