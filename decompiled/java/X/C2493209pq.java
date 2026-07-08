package X;

import android.graphics.Bitmap;
import com.bytedance.scene.Scene;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2493209pq {
    public static final C2493209pq LIZ = new C2493209pq();
    public static String LIZIZ;

    public static double[] LIZ(int i, int i2, Bitmap bitmap) {
        double dPow;
        double dPow2;
        double dPow3;
        double dCbrt;
        double dCbrt2;
        double dCbrt3;
        int pixel = bitmap.getPixel(i, i2);
        double d = ((double) ((pixel >> 16) & 255)) / 255.0d;
        double d2 = ((double) ((pixel >> 8) & 255)) / 255.0d;
        double d3 = ((double) (pixel & 255)) / 255.0d;
        if (d > 0.04045d) {
            dPow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
        } else {
            dPow = d / 12.92d;
        }
        if (d2 > 0.04045d) {
            dPow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        } else {
            dPow2 = d2 / 12.92d;
        }
        if (d3 > 0.04045d) {
            dPow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        } else {
            dPow3 = d3 / 12.92d;
        }
        double d4 = (((0.4124d * dPow) + (0.3576d * dPow2)) + (0.1805d * dPow3)) / 0.95047d;
        double d5 = (((0.2126d * dPow) + (0.7152d * dPow2)) + (0.0722d * dPow3)) / 1.0d;
        double d6 = (((dPow * 0.0193d) + (dPow2 * 0.1192d)) + (dPow3 * 0.9505d)) / 1.08883d;
        if (d4 > 0.008856d) {
            dCbrt = Math.cbrt(d4);
        } else {
            dCbrt = ((d4 * 903.3d) + 16.0d) / 116.0d;
        }
        if (d5 > 0.008856d) {
            dCbrt2 = Math.cbrt(d5);
        } else {
            dCbrt2 = ((d5 * 903.3d) + 16.0d) / 116.0d;
        }
        if (d6 > 0.008856d) {
            dCbrt3 = Math.cbrt(d6);
        } else {
            dCbrt3 = ((d6 * 903.3d) + 16.0d) / 116.0d;
        }
        return new double[]{(116.0d * dCbrt2) - 16.0d, (dCbrt - dCbrt2) * 500.0d, (dCbrt2 - dCbrt3) * 200.0d};
    }

    public static List LIZIZ(int i, int i2, C2493109pp c2493109pp) {
        int i3 = c2493109pp.LIZJ;
        int[] iArr = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            iArr[i4] = (int) ((((double) i5) / ((double) (c2493109pp.LIZJ + 1))) * ((double) i));
            i4 = i5;
        }
        int i6 = c2493109pp.LIZIZ;
        int[] iArr2 = new int[i6];
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i7 + 1;
            iArr2[i7] = (int) ((((double) i8) / ((double) (c2493109pp.LIZIZ + 1))) * ((double) i2));
            i7 = i8;
        }
        ArrayList arrayList = new ArrayList(i3 * i6);
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = iArr[i9];
            for (int i11 = 0; i11 < i6; i11++) {
                arrayList.add(new int[]{i10, iArr2[i11]});
            }
        }
        return arrayList;
    }

    public static void LIZJ(int i, long j, long j2, float f, float f2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("blank_type", i);
        jSONObject.put("check_duration_1", j);
        jSONObject.put("check_duration_2", j2);
        jSONObject.put(Scene.SCENE_SERVICE, "search_result_page");
        jSONObject.put("blank_percentage_1", Float.valueOf(f));
        jSONObject.put("blank_percentage_2", Float.valueOf(f2));
        AppLogNewUtils.onEventV3("search_general_exception_debug", jSONObject);
    }
}
