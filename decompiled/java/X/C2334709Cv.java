package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PassThroughGsonAdapterFactory;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.09Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2334709Cv {
    public static Map LIZ(C09CU c09cu) {
        int i;
        int i2;
        try {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ != null) {
                i = C2334809Cw.LIZ[c09d6LJJLIIIJ.ordinal()];
            } else {
                i = -1;
            }
            if (i != 1) {
                if (i != 2) {
                    c09cu.LJJZ();
                    return C2097608Jq.LJ();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c09cu.LIZIZ();
                while (c09cu.LJIIZILJ()) {
                    String strLJJJJ = c09cu.LJJJJ();
                    C09D6 c09d6LJJLIIIJ2 = c09cu.LJJLIIIJ();
                    if (c09d6LJJLIIIJ2 != null) {
                        i2 = C2334809Cw.LIZ[c09d6LJJLIIIJ2.ordinal()];
                    } else {
                        i2 = -1;
                    }
                    if (i2 != 1) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    c09cu.LJJZ();
                                } else {
                                    String strLJJJZ = c09cu.LJJJZ();
                                    if (PassThroughGsonAdapterFactory.LL.contains(strLJJJJ)) {
                                        linkedHashMap.put(strLJJJJ, strLJJJZ);
                                    }
                                }
                            } else {
                                String strValueOf = String.valueOf(c09cu.LJJ());
                                if (PassThroughGsonAdapterFactory.LL.contains(strLJJJJ)) {
                                    linkedHashMap.put(strLJJJJ, strValueOf);
                                }
                            }
                        } else {
                            String strLJJJZ2 = c09cu.LJJJZ();
                            if (PassThroughGsonAdapterFactory.LL.contains(strLJJJJ)) {
                                linkedHashMap.put(strLJJJJ, strLJJJZ2);
                            }
                        }
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
                c09cu.LJII();
                return linkedHashMap;
            }
            c09cu.LJJJJJL();
            return null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public static void LIZIZ(C09DL c09dl, Map map) {
        try {
            if (map == null) {
                c09dl.LJIJJ();
                return;
            }
            c09dl.LIZLLL();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (PassThroughGsonAdapterFactory.LL.contains(str)) {
                    c09dl.LJIILLIIL(str);
                    c09dl.LJJJJJ(str2);
                }
            }
            c09dl.LJII();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new l(e);
        }
    }
}
