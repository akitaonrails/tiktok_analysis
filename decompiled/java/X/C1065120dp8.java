package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065120dp8 {
    public static final C1065120dp8 LIZ = new C1065120dp8();

    public static Intent LIZ(String str, String str2) {
        return new Intent("android.intent.action.VIEW", UriProtector.parse(str2)).setPackage("com.android.vending").putExtra("overlay", true).putExtra("callerId", str);
    }

    public static void LJ(String str, String str2) throws Throwable {
        if (((Boolean) C279350AxB.LIZ.getValue()).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("pid", str);
            contentValues.put("amp_extra", str2);
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            C2204961BRm.LJJIJLIJ(contextLIZ.getContentResolver(), UriProtector.parse(C786410Ut5.j4("content://%s.provider.ttreferrer", Arrays.copyOf(new Object[]{contextLIZ.getApplicationInfo().packageName}, 1))), contentValues, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAkjHjFSuq22giEB6dVYCwgf0IJB4=", null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1065120dp8.LIZIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("result", str);
        if (str2 != null) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("error_reason", str3);
        }
        if (str4 != null && str4.length() > 0 && 1 != 0) {
            for (Map.Entry entry : ((HashMap) C051S.LIZJ(new JSONObject(str4))).entrySet()) {
                Object key = entry.getKey();
                if ((key instanceof String) && (str5 = (String) key) != null) {
                    C1065120dp8 c1065120dp8 = LIZ;
                    Object value = entry.getValue();
                    c1065120dp8.getClass();
                    if (value instanceof String) {
                        c2344009Gk.LJFF(str5, (String) value);
                    } else if (value instanceof Integer) {
                        c2344009Gk.LIZJ(((Number) value).intValue(), str5);
                    } else if (value instanceof Long) {
                        c2344009Gk.LIZLLL(((Number) value).longValue(), str5);
                    } else if (value instanceof Double) {
                        c2344009Gk.LIZ(((Number) value).doubleValue(), str5);
                    } else if (value instanceof Float) {
                        c2344009Gk.LIZIZ(((Number) value).floatValue(), str5);
                    } else {
                        c2344009Gk.LJ(value, str5);
                    }
                }
            }
        }
        if (Intrinsics.LJFF(str2, "tiktok_inbox") && C286760BLu.LIZ()) {
            C20684815ws.LJIILLIIL("inbox_half_page_show_result", c2344009Gk.LIZ);
        }
        C20684815ws.LJIILLIIL("lemon8_ug_half_page_show_result", c2344009Gk.LIZ);
    }

    public static void LIZJ(C1065120dp8 c1065120dp8, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            bool3 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        c1065120dp8.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJIIIIZZ("type", "router");
        c2344009Gk.LJIIIIZZ("subType", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("msg", str3);
        }
        if (bool != null) {
            c2344009Gk.LJ(Boolean.valueOf(bool.booleanValue()), "is_schema_miss");
        }
        if (bool2 != null) {
            c2344009Gk.LJ(Boolean.valueOf(bool2.booleanValue()), "is_pid_miss");
        }
        if (bool3 != null) {
            c2344009Gk.LJ(Boolean.valueOf(bool3.booleanValue()), "is_amp_extra_miss");
        }
        if (str4 != null) {
            c2344009Gk.LJFF("schema", str4);
        }
        if (Intrinsics.LJFF(str, "tiktok_inbox") && C286760BLu.LIZ()) {
            C20684815ws.LJIILLIIL("lemon8_notice_scene_error", c2344009Gk.LIZ);
        }
        C20684815ws.LJIILLIIL("lemon8_ug_scene_error", c2344009Gk.LIZ);
    }
}
