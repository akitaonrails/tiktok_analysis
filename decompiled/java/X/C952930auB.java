package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0auB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952930auB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC952940auC enumC952940auC, EnumC953380auu enumC953380auu, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("function_name", "noticeboard");
        linkedHashMap.put("action_detail", enumC952940auC.toString());
        linkedHashMap.put("to_user_type", "anchor");
        linkedHashMap.put("drop_reason", enumC953380auu.toString());
        linkedHashMap.put("error_code", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("error_msg", str2);
        linkedHashMap.put("is_moderator", CardStruct.IStatusCode.DEFAULT);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_function_call_result");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }
}
