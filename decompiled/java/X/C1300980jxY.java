package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300980jxY {
    public static final Map<String, Typeface[]> LIZ = new HashMap();
    public static final Map<Typeface, Typeface[]> LIZIZ = new HashMap();
    public static final String[] LIZJ = {"", "_bold", "_italic", "_bold_italic"};
    public static final String[] LIZLLL = {".ttf", ".otf"};
    public static final ConcurrentHashMap<String, C1300990jxZ> LJ = new ConcurrentHashMap<>();
    public static final List<InterfaceC1300810jxH> LJFF = new ArrayList();

    public static synchronized void LJI() {
        ((HashMap) LIZ).clear();
    }

    public static synchronized void LIZ(InterfaceC1300810jxH interfaceC1300810jxH) {
        ((ArrayList) LJFF).add(interfaceC1300810jxH);
    }

    public static void LIZIZ(String str, AssetManager assetManager) {
        int i = 0;
        do {
            Typeface typefaceLJFF = LJFF(assetManager, str, i);
            if (typefaceLJFF != null) {
                LIZJ(str, i, typefaceLJFF);
            }
            i++;
        } while (i < 4);
    }

    public static synchronized Typeface LIZLLL(int i, String str) {
        Typeface typefaceLIZ;
        Typeface typeface;
        Typeface[] typefaceArr = (Typeface[]) ((HashMap) LIZ).get(str);
        if (typefaceArr != null && (typeface = typefaceArr[i]) != null) {
            return typeface;
        }
        for (InterfaceC1300810jxH interfaceC1300810jxH : (ArrayList) LJFF) {
            if (interfaceC1300810jxH != null && (typefaceLIZ = interfaceC1300810jxH.LIZ(i, str)) != null) {
                LIZJ(str, i, typefaceLIZ);
                return typefaceLIZ;
            }
        }
        return null;
    }

    public static synchronized void LIZJ(String str, int i, Typeface typeface) {
        Map<String, Typeface[]> map = LIZ;
        Typeface[] typefaceArr = (Typeface[]) ((HashMap) map).get(str);
        if (typefaceArr == null) {
            typefaceArr = new Typeface[4];
            ((HashMap) map).put(str, typefaceArr);
        }
        typefaceArr[i] = typeface;
        ((HashMap) LIZIZ).put(typeface, typefaceArr);
    }

    public static synchronized Typeface LJ(int i, s sVar, String str) {
        for (String str2 : str.split(",")) {
            String strLIZLLL = C1301130jxn.LIZLLL(str2);
            if (!TextUtils.isEmpty(strLIZLLL)) {
                Typeface typefaceLIZLLL = LIZLLL(i, strLIZLLL);
                if (typefaceLIZLLL == null) {
                    Typeface typefaceLJ = C1301060jxg.LIZ.LJ(sVar, strLIZLLL, i, null);
                    if (typefaceLJ != null) {
                        return typefaceLJ;
                    }
                } else {
                    return typefaceLIZLLL;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't not find typeface for fontFamily: ");
        sbLIZ.append(str);
        sbLIZ.append(" in lynx.");
        LynxLog.v("TypefaceCache", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static Typeface LJFF(AssetManager assetManager, String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("font/");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, C1300990jxZ> concurrentHashMap = LJ;
        if (concurrentHashMap.containsKey(strLIZIZ)) {
            return concurrentHashMap.get(strLIZIZ).LIZ;
        }
        String str2 = LIZJ[i];
        StringBuilder sb = new StringBuilder(32);
        sb.append("font/");
        sb.append("");
        sb.append(str);
        sb.append(str2);
        int length = sb.length();
        for (String str3 : LIZLLL) {
            String string = sb.toString();
            if (!string.endsWith(str3)) {
                sb.append(str3);
                string = sb.toString();
            }
            try {
                Typeface typefaceV4 = C786410Ut5.v4(assetManager, string);
                LJ.put(strLIZIZ, new C1300990jxZ(typefaceV4));
                return typefaceV4;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Exception happens whe cacheTypefaceFromAssets with message ");
                sbLIZ2.append(e.getMessage());
                LynxLog.w("TypefaceCache", C2188811AlT.LIZIZ(sbLIZ2));
                sb.setLength(length);
            }
        }
        LJ.put(strLIZIZ, new C1300990jxZ(null));
        return null;
    }
}
