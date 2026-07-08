package X;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2027607ww {
    public static final Map<String, Typeface[]> LIZ = new HashMap();
    public static final Map<Typeface, Typeface[]> LIZIZ = new HashMap();
    public static final List<InterfaceC2027707wx> LIZJ;

    static {
        new ConcurrentHashMap();
        LIZJ = new ArrayList();
    }

    public static synchronized Typeface LIZIZ(int i, String str) {
        Typeface typefaceLIZ;
        Typeface typeface;
        Typeface[] typefaceArr = (Typeface[]) ((HashMap) LIZ).get(str);
        if (typefaceArr != null && (typeface = typefaceArr[i]) != null) {
            return typeface;
        }
        for (InterfaceC2027707wx interfaceC2027707wx : (ArrayList) LIZJ) {
            if (interfaceC2027707wx != null && (typefaceLIZ = interfaceC2027707wx.LIZ()) != null) {
                LIZ(str, i, typefaceLIZ);
                return typefaceLIZ;
            }
        }
        return null;
    }

    public static synchronized void LIZ(String str, int i, Typeface typeface) {
        Map<String, Typeface[]> map = LIZ;
        Typeface[] typefaceArr = (Typeface[]) ((HashMap) map).get(str);
        if (typefaceArr == null) {
            typefaceArr = new Typeface[4];
            ((HashMap) map).put(str, typefaceArr);
        }
        typefaceArr[i] = typeface;
        ((HashMap) LIZIZ).put(typeface, typefaceArr);
    }
}
