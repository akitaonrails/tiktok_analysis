package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936400aTW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(int i, int i2, String str, boolean z) {
        String str2;
        HashMap map = new HashMap();
        map.put("duration", String.valueOf(i));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_succeed", str2);
        map.put("error_code", String.valueOf(i2));
        map.put("error_msg", str);
        C0KX4.LIZ("livesdk_multi_guest_avatar_upload_picture", map, null, true);
    }

    public static void LIZIZ(int i, int i2, boolean z, String str, long j) {
        String str2;
        HashMap map = new HashMap();
        map.put("avatar_id", String.valueOf(j));
        map.put("duration", String.valueOf(i));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_succeed", str2);
        map.put("error_code", String.valueOf(i2));
        map.put("error_msg", str);
        C0KX4.LIZ("livesdk_multi_guest_avatar_download_resources", map, null, true);
    }

    public static void LIZ(long j, long j2, String str, int i, boolean z, int i2, String str2, boolean z2) {
        Object obj;
        HashMap map = new HashMap();
        map.put("style_id", String.valueOf(j));
        map.put("avatar_id", String.valueOf(j2));
        map.put("image_uri", str);
        map.put("duration", String.valueOf(i));
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_succeed", obj);
        map.put("error_code", String.valueOf(i2));
        map.put("error_msg", str2);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_timeout", str3);
        C0KX4.LIZ("livesdk_multi_guest_avatar_create_avatar", map, null, true);
    }

    public static void LIZJ(int i, boolean z, long j, String str, int i2, String str2, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        HashMap map = new HashMap();
        map.put("style_id", String.valueOf(j));
        map.put("origin_image_uri", str);
        map.put("duration", String.valueOf(i));
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_succeed", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_cached", obj2);
        map.put("error_code", String.valueOf(i2));
        map.put("error_msg", str2);
        if (!z3) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_timeout", str3);
        C0KX4.LIZ("livesdk_multi_guest_avatar_stylized_picture", map, null, true);
    }
}
