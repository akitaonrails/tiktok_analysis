package com.bef.effectsdk.text;

import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Hashtable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public class FontCache {
    public static Hashtable<String, Typeface> fontCache = new Hashtable<>();
    public static LinkedList<String> lruQueue = new LinkedList<>();

    public static synchronized Typeface getFromFile(String str, String str2) {
        Typeface typefaceW4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FILE_");
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        typefaceW4 = fontCache.get(strLIZIZ);
        if (typefaceW4 == null) {
            try {
                typefaceW4 = C786410Ut5.w4(new C0VSJ(str, str2));
                if (lruQueue.size() >= 32) {
                    fontCache.remove(lruQueue.removeLast());
                    System.gc();
                }
                fontCache.put(strLIZIZ, typefaceW4);
                lruQueue.addFirst(strLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } else {
            lruQueue.remove(strLIZIZ);
            lruQueue.addFirst(strLIZIZ);
        }
        return typefaceW4;
    }

    public static synchronized Typeface getFromSystem(String str, int i) {
        Typeface typefaceCreate;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SYSTEM_");
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        typefaceCreate = fontCache.get(strLIZIZ);
        if (typefaceCreate == null) {
            try {
                typefaceCreate = Typeface.create(str, i);
                if (lruQueue.size() >= 32) {
                    fontCache.remove(lruQueue.removeLast());
                    System.gc();
                }
                fontCache.put(strLIZIZ, typefaceCreate);
                lruQueue.addFirst(strLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } else {
            lruQueue.remove(strLIZIZ);
            lruQueue.addFirst(strLIZIZ);
        }
        return typefaceCreate;
    }
}
