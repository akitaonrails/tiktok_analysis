package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924610aAV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, int i, String str2, boolean z, Long l, Integer num, Boolean bool) {
        Object obj;
        String string;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C924620aAW.LJIIIZ(map);
        map.put("guest_invite_type", str);
        map.put("connection_status", String.valueOf(i));
        map.put("enter_from", C935990aSr.LIZJ());
        map.put("click_button", str2);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_customize_grey", obj);
        if (l != null) {
            map.put("avatar_id", String.valueOf(l.longValue()));
            if (num == null || (string = num.toString()) == null) {
                string = "1";
            }
            map.put("avatar_position", string);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str3 = "1";
            }
            map.put("is_customize", str3);
        }
        C0KX4.LIZ("livesdk_multi_guest_avatar_setting_click", map, null, true);
    }
}
