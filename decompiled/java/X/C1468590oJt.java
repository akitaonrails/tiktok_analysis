package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.DataLoaderHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468590oJt {
    public static C1468600oJu LIZ = new C1468600oJu();
    public static final Lock LIZIZ = new ReentrantLock();
    public static final LruCache<String, Map<Long, Map<String, Object>>> LIZJ = new LruCache<>(100);

    public static JSONArray LIZJ(InterfaceC1467050oHP interfaceC1467050oHP, int i) {
        List<C1474520oTS> listLJIILL;
        int index;
        long jLJJIIZ;
        JSONArray jSONArray = new JSONArray();
        if (interfaceC1467050oHP != null && (listLJIILL = interfaceC1467050oHP.LJIILL()) != null && listLJIILL.size() != 0) {
            try {
                for (C1474520oTS c1474520oTS : listLJIILL) {
                    if (c1474520oTS != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (c1474520oTS.LJFF() == 0) {
                            jSONObject.put("mtype", c1474520oTS.LJFF());
                            jSONObject.put("bitrate", c1474520oTS.LIZIZ(3));
                            EnumC2281151EQn resolution = c1474520oTS.getResolution();
                            if (resolution != null) {
                                index = resolution.getIndex();
                            } else {
                                index = -1;
                            }
                            jSONObject.put("res", index);
                            jSONObject.put("quality", c1474520oTS.LIZ(32));
                            jSONObject.put("width", c1474520oTS.LIZIZ(1));
                            jSONObject.put("height", c1474520oTS.LIZIZ(2));
                            if (i != -1) {
                                String strLIZ = c1474520oTS.LIZ(15);
                                if (1 == i) {
                                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                                    jLJJIIZ = dataLoaderHelper.LJJJLL(strLIZ);
                                    if (jLJJIIZ == 0) {
                                        jLJJIIZ = dataLoaderHelper.LJJIIZ(strLIZ);
                                    }
                                } else {
                                    jLJJIIZ = C805420Vie.LIZ.LJJIIZ(strLIZ);
                                }
                                jSONObject.put("cache", jLJJIIZ);
                            }
                        } else {
                            jSONObject.put("mtype", c1474520oTS.LJFF());
                            jSONObject.put("bitrate", c1474520oTS.LIZIZ(3));
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0342  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r20v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.0oJu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJFF(X.InterfaceC1467050oHP r28, X.C1468600oJu r29) {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468590oJt.LJFF(X.0oHP, X.0oJu):java.util.Map");
    }

    public static void LIZLLL(InterfaceC1467050oHP interfaceC1467050oHP, C1468610oJv c1468610oJv, C1468600oJu c1468600oJu) {
        Boolean bool;
        LinkedList linkedList = new LinkedList();
        List<C1474520oTS> listLJIILL = interfaceC1467050oHP.LJIILL();
        if (listLJIILL != null && listLJIILL.size() > 0) {
            for (C1474520oTS c1474520oTS : listLJIILL) {
                if (c1474520oTS != null && c1474520oTS.LJFF() == 0) {
                    int iLIZIZ = c1474520oTS.LIZIZ(3);
                    int iLIZ = C1468610oJv.LIZ(c1474520oTS);
                    if (!((HashMap) c1468610oJv.LJFF).containsKey(Integer.valueOf(iLIZ))) {
                        bool = Boolean.FALSE;
                    } else {
                        Integer num = c1468610oJv.LIZ.LJJIFFI;
                        List list = (List) ((HashMap) c1468610oJv.LJFF).get(Integer.valueOf(iLIZ));
                        if (list == null) {
                            bool = Boolean.FALSE;
                        } else {
                            C1474520oTS c1474520oTS2 = null;
                            for (C1474520oTS c1474520oTS3 : listLJIILL) {
                                int iLIZ2 = C1468610oJv.LIZ(c1474520oTS3);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (((Integer) it2.next()).intValue() == iLIZ2 && (c1474520oTS2 == null || c1474520oTS2.LIZIZ(3) < c1474520oTS3.LIZIZ(3))) {
                                        c1474520oTS2 = c1474520oTS3;
                                        break;
                                    }
                                }
                            }
                            if (c1474520oTS2 == null || (num != null && c1474520oTS2.LIZIZ(1) <= num.intValue())) {
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        }
                    }
                    if (bool.booleanValue()) {
                        linkedList.add(Integer.valueOf(iLIZIZ));
                    }
                }
            }
        }
        if (!c1468600oJu.LIZIZ.containsKey(43)) {
            c1468600oJu.LIZIZ.put(43, linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1474520oTS LJ(X.InterfaceC1467050oHP r7, int r8, int r9) {
        /*
            java.util.List r0 = r7.LJIILL()
            if (r0 == 0) goto L45
            java.util.Iterator r7 = r0.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r6 = r7.next()
            X.0oTS r6 = (X.C1474520oTS) r6
            if (r6 == 0) goto La
            int r0 = r6.LJFF()
            r1 = 1
            if (r0 == r1) goto La
            X.1EQn r0 = r6.getResolution()
            if (r0 == 0) goto La
            r5 = 3
            if (r1 != r9) goto L40
            r0 = 44
            int r0 = r6.LIZIZ(r0)
            long r3 = (long) r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3a
            int r0 = r6.LIZIZ(r5)
        L39:
            long r3 = (long) r0
        L3a:
            long r1 = (long) r8
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            return r6
        L40:
            int r0 = r6.LIZIZ(r5)
            goto L39
        L45:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468590oJt.LJ(X.0oHP, int, int):X.0oTS");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(int r12, X.C1469920oM2 r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468590oJt.LJI(int, X.0oM2, java.util.Map):void");
    }

    public static float LJII(String str, float f, Map map) {
        String str2 = (String) ((HashMap) map).get(str);
        if (str2 != null) {
            try {
                f = CastFloatProtector.parseFloat(str2);
                return f;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return f;
    }

    public static int LJIIIIZZ(int i, String str, Map map) {
        String str2 = (String) ((HashMap) map).get(str);
        if (str2 != null) {
            try {
                i = CastIntegerProtector.parseInt(str2);
                return i;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    public static void LIZ(C1468600oJu c1468600oJu, int i, Map<String, String> map, int i2) {
        ((HashMap) map).put(Integer.toString(i), Integer.toString(c1468600oJu.LIZ(i, i2, true)));
    }

    public static int LIZIZ(InterfaceC1467050oHP interfaceC1467050oHP, int i, String str, int i2) {
        EnumC2281151EQn enumC2281151EQnValueOf = EnumC2281151EQn.valueOf(i);
        if (enumC2281151EQnValueOf != EnumC2281151EQn.Undefine || !TextUtils.isEmpty(str)) {
            HashMap map = new HashMap();
            map.put(32, str);
            C1474520oTS c1474520oTSLJIIIZ = interfaceC1467050oHP.LJIIIZ(enumC2281151EQnValueOf, map, false);
            if (c1474520oTSLJIIIZ != null) {
                if (1 == i2) {
                    return c1474520oTSLJIIIZ.LIZIZ(44);
                }
                return c1474520oTSLJIIIZ.LIZIZ(3);
            }
            return -1;
        }
        return -1;
    }
}
