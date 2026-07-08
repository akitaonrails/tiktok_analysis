package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331410kkd {
    public static final int LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static boolean LIZLLL;

    static {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        long j = displayMetrics.heightPixels * displayMetrics.widthPixels * 4;
        LIZ = 2;
        LIZIZ = 20971520L;
        LIZJ = j;
        LIZLLL = false;
    }

    public static JSONObject LIZ(String str, String str2, int i, String str3, String str4, String str5, long j, int i2, int i3, int i4, int i5, long j2, String str6) {
        String str7;
        int iMin = Math.min((i4 * LSPassThroughRecordSizeConfig.DEFAULT) / i2, (i5 * LSPassThroughRecordSizeConfig.DEFAULT) / i3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
            jSONObject.put("image_type", str2);
            if (i != 1) {
                if (i != 10) {
                    if (i != 11) {
                        if (i != 100) {
                            if (i != 101) {
                                if (i != 110) {
                                    if (i == 111) {
                                        str7 = "1,2,3";
                                    } else {
                                        str7 = "";
                                    }
                                } else {
                                    str7 = "2,3";
                                }
                            } else {
                                str7 = "1,3";
                            }
                        } else {
                            str7 = "3";
                        }
                    } else {
                        str7 = "1,2";
                    }
                } else {
                    str7 = "2";
                }
            } else {
                str7 = "1";
            }
            jSONObject.put("bigimage_reason", str7);
            jSONObject.put("biz_tag", str3);
            jSONObject.put("scene_tag", str4);
            jSONObject.put("page_tag", str5);
            jSONObject.put("file_size", j);
            jSONObject.put("view_width", i2);
            jSONObject.put("view_height", i3);
            jSONObject.put("image_width", i4);
            jSONObject.put("image_height", i5);
            jSONObject.put("ram_size", j2);
            jSONObject.put("contrast", iMin);
            jSONObject.put("view_info", str6);
            jSONObject.put("image_sdk_version", "1.15.07.4-tiktok");
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
