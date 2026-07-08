package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;

/* JADX INFO: renamed from: X.0jsz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298150jsz {
    public static C1298160jt0 LIZIZ(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1298160jt0 c1298160jt0 = new C1298160jt0();
        if (interfaceC1298070jsr == null) {
            c1298160jt0.LIZ = false;
        } else {
            ReadableType type = interfaceC1298070jsr.getType();
            if (type == ReadableType.Boolean) {
                c1298160jt0.LIZ = interfaceC1298070jsr.asBoolean();
                c1298160jt0.LIZIZ = false;
                return c1298160jt0;
            }
            if (type == ReadableType.String) {
                String strAsString = interfaceC1298070jsr.asString();
                if (!TextUtils.isEmpty(strAsString) && !"none".equals(strAsString) && !"false".equals(strAsString)) {
                    if (!"default".equals(strAsString) && !"true".equals(strAsString)) {
                        if ("await".equals(strAsString)) {
                            c1298160jt0.LIZ = true;
                            c1298160jt0.LIZIZ = true;
                            return c1298160jt0;
                        }
                    } else {
                        c1298160jt0.LIZ = true;
                        c1298160jt0.LIZIZ = false;
                        return c1298160jt0;
                    }
                } else {
                    c1298160jt0.LIZ = false;
                    c1298160jt0.LIZIZ = false;
                    return c1298160jt0;
                }
            }
        }
        return c1298160jt0;
    }

    public static Rect LIZJ(ReadableMap readableMap) {
        Rect rect;
        int i;
        if (readableMap == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseRegionToDecode error: ");
            sbLIZ.append(th.getMessage());
            LynxLog.e("ImageUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (readableMap.hasKey("x") && readableMap.hasKey("y") && readableMap.hasKey("width") && readableMap.hasKey("height")) {
            int i2 = (int) readableMap.getDouble("x");
            int i3 = (int) readableMap.getDouble("y");
            rect = new Rect(i2, i3, ((int) readableMap.getDouble("width")) + i2, ((int) readableMap.getDouble("height")) + i3);
        } else {
            rect = null;
        }
        if (rect == null) {
            LynxLog.w("ImageUtils", "parseRegionToDecode: rect is null");
            return null;
        }
        int i4 = rect.left;
        if (i4 >= 0 && (i = rect.top) >= 0 && rect.right > i4 && rect.bottom > i) {
            return rect;
        }
        LynxLog.w("ImageUtils", "parseRegionToDecode: invalid rect " + rect);
        return null;
    }

    public static int LIZ(int i, int i2, Bitmap.Config config) {
        int i3 = i * i2;
        int i4 = C0SZD.LIZ[config.ordinal()];
        int i5 = 4;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    throw new UnsupportedOperationException("Current Bitmap.Config is not supported");
                }
                i5 = 2;
            } else {
                i5 = 1;
            }
        }
        return i3 * i5;
    }
}
