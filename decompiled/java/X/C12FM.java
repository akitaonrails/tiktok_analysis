package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.12FM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12FM {
    public static final void LIZ(Context context, String str, String str2, Map<String, String> map, List<String> list) throws JSONException {
        Iterable iterableLJJJJLI;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List listSingletonList = Collections.singletonList(str);
        List listSingletonList2 = Collections.singletonList("TikTokTako");
        if (list != null) {
            iterableLJJJJLI = C13LP.LJJJJLI(list);
        } else {
            iterableLJJJJLI = C13BV.INSTANCE;
        }
        String str9 = null;
        C12FO c12fo = new C12FO(null, null, C13LP.LJLIL(iterableLJJJJLI, listSingletonList2));
        C13DA c13da = new C13DA();
        if (map != null) {
            str3 = map.get("bot_id");
        } else {
            str3 = null;
        }
        c13da.put("tako_bot_id", String.valueOf(str3));
        c13da.put("tako_feedbar_type", "video_gen");
        if (map != null && (str8 = map.get("is_unchanged_tako_template")) != null) {
            c13da.put("is_unchanged_tako_template", str8);
        }
        if (map != null && (str7 = map.get("image_template_id")) != null) {
            c13da.put("tako_template_id", str7);
        }
        Map mapBuild = c13da.build();
        C13DA c13da2 = new C13DA();
        if (map != null) {
            str4 = map.get("bot_id");
        } else {
            str4 = null;
        }
        c13da2.put("tako_bot_id", str4);
        if (map != null) {
            str5 = map.get("process_id");
        } else {
            str5 = null;
        }
        c13da2.put("tako_process_id", str5);
        if (map != null) {
            str9 = map.get("sub_process_id");
        }
        c13da2.put("tako_sub_process_id", str9);
        c13da2.put("tako_message_id", str2);
        c13da2.put("tako_situation", "video_generation");
        if (map != null) {
            String str10 = map.get("is_unchanged_tako_template");
            if (str10 != null) {
                if (Intrinsics.LJFF(str10, "true")) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                c13da2.put("is_unchanged_tako_template", str6);
            }
            String str11 = map.get("image_template_id");
            if (str11 != null) {
                c13da2.put("tako_template_id", str11);
            }
        }
        C12FP.LIZ(context, listSingletonList, c12fo, mapBuild, c13da2.build(), null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(android.content.Context r20, android.view.View r21, java.lang.String r22, java.lang.String r23, java.util.Map<java.lang.String, java.lang.String> r24, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> r25) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12FM.LIZIZ(android.content.Context, android.view.View, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
