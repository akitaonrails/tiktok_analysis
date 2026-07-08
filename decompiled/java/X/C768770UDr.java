package X;

import android.graphics.Rect;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C768770UDr {
    public final View LIZ;
    public final InterfaceC768780UDs LIZIZ;

    public C768770UDr(View view, InterfaceC768780UDs interfaceC768780UDs) {
        this.LIZ = view;
        this.LIZIZ = interfaceC768780UDs;
    }

    public final String LIZ(float f, float f2, float f3) throws JSONException {
        int iIntValue;
        int iIntValue2;
        int width;
        int height;
        int i;
        float f4;
        int i2;
        float fLIZIZ;
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC768780UDs interfaceC768780UDs = this.LIZIZ;
        if (interfaceC768780UDs != null && (numValueOf2 = Integer.valueOf(interfaceC768780UDs.LJ())) != null) {
            iIntValue = numValueOf2.intValue();
        } else {
            iIntValue = 720;
        }
        InterfaceC768780UDs interfaceC768780UDs2 = this.LIZIZ;
        if (interfaceC768780UDs2 != null && (numValueOf = Integer.valueOf(interfaceC768780UDs2.LIZJ())) != null) {
            iIntValue2 = numValueOf.intValue();
        } else {
            iIntValue2 = 1280;
        }
        View view = this.LIZ;
        if (view != null) {
            width = view.getWidth();
        } else {
            width = 0;
        }
        View view2 = this.LIZ;
        if (view2 != null) {
            height = view2.getHeight();
        } else {
            height = 0;
        }
        if (width == 0 || height == 0 || iIntValue2 == 0 || iIntValue == 0) {
            return null;
        }
        float f5 = width;
        float f6 = height;
        float f7 = iIntValue;
        float f8 = iIntValue2;
        float f9 = f7 / f8;
        if (f5 / f6 > f9) {
            i2 = (int) (f5 / f9);
            f4 = f7 / f5;
            i = width;
        } else {
            i = (int) (f9 * f6);
            f4 = f8 / f6;
            i2 = height;
        }
        Rect rect = new Rect();
        View view3 = this.LIZ;
        if (view3 != null) {
            view3.getGlobalVisibleRect(rect);
        }
        int i3 = rect.left - ((i - width) / 2);
        int i4 = rect.top - (i2 - height);
        if (C500260Jjc.LJIL()) {
            fLIZIZ = C497740JfY.LIZIZ(f2);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(f);
        }
        float f10 = (((int) fLIZIZ) - i4) * f4;
        float f11 = (0 - i3) * f4;
        float fLIZIZ2 = ((int) C497740JfY.LIZIZ(f3)) * f4;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("top", Float.valueOf(f10));
        jSONObject2.put("left", Float.valueOf(f11));
        jSONObject2.put("right", Float.valueOf(f11));
        jSONObject2.put("bottom", Float.valueOf(fLIZIZ2));
        jSONObject.put("safe_area", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", iIntValue);
        jSONObject3.put("height", iIntValue2);
        jSONObject.put("canvas", jSONObject3);
        return C786410Ut5.J3(jSONObject);
    }
}
