package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS104S1000000_20;
import kotlin.jvm.internal.AwS31S2000000_12;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0kvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337960kvC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1337880kv4 c1337880kv4) {
        if (c1337880kv4 == null) {
            return;
        }
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW != null && interfaceC1168280gVW.LJII() && c1337880kv4.LIZIZ == 1) {
            if (c1337880kv4.LIZ != ((int) r1)) {
                C1168400gVi.LIZJ(new AwS599S0100000_20(c1337880kv4, 44));
            }
        }
    }

    public static final C1337920kv8 LIZIZ(Map<String, ? extends Object> map) {
        Float fLIZLLL;
        List<Map> list;
        if (map != null && (fLIZLLL = C1337850kv1.LIZLLL(map.get("degree"))) != null) {
            float fFloatValue = fLIZLLL.floatValue();
            Object obj = map.get("colors");
            if ((obj instanceof List) && (list = (List) obj) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Map map2 : list) {
                    Integer numLJFF = C1337850kv1.LJFF(C1337850kv1.LJIIJ(map2.get("color")));
                    if (numLJFF != null) {
                        int iIntValue = numLJFF.intValue();
                        Float fLIZLLL2 = C1337850kv1.LIZLLL(map2.get("location"));
                        if (fLIZLLL2 != null) {
                            arrayList.add(new C1337900kv6(iIntValue, Math.round(fLIZLLL2.floatValue() * 100)));
                        }
                    }
                    return null;
                }
                if (arrayList.size() > 1) {
                    return new C1337920kv8(arrayList, fFloatValue);
                }
            }
        }
        return null;
    }

    public static float LJ(List list) {
        Object objLJJJLZIJ;
        if (list != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        } else {
            objLJJJLZIJ = null;
        }
        return C1337850kv1.LIZIZ(1.0f, objLJJJLZIJ);
    }

    public static final List<String> LJII(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                String strLJIIJ = C1337850kv1.LJIIJ(it2.next());
                if (strLJIIJ != null) {
                    arrayList.add(strLJIIJ);
                }
            }
            return arrayList;
        }
        return Collections.singletonList(obj.toString());
    }

    public static final Integer LJIIIIZZ(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() > 0 && strTrim.charAt(0) == '#') {
            if (strTrim.length() >= 7) {
                int color = ColorProtector.parseColor(strTrim);
                if (strTrim.length() == 9) {
                    return Integer.valueOf((color << 24) | (color >>> 8));
                }
                return Integer.valueOf(color);
            }
            if (strTrim.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                int length = strTrim.length();
                for (int i = 1; i < length; i++) {
                    char cCharAt = strTrim.charAt(i);
                    sb.append(cCharAt);
                    sb.append(cCharAt);
                }
                return Integer.valueOf(ColorProtector.parseColor(sb.toString()));
            }
        }
        C1325860kbg.LIZIZ(null, new AwS104S1000000_20(str, 4), C2097608Jq.LJ());
        return null;
    }

    public static final List<Object> LJIIJJI(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj instanceof String) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = a0.LJJLIIIJILLIZJL((CharSequence) obj, new String[]{" "}, 0, 6).iterator();
            while (it2.hasNext()) {
                String string = a0.LJLIIIL((String) it2.next()).toString();
                if (string.length() > 0) {
                    arrayList.add(string);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final C1337880kv4 LIZJ(C1168340gVc c1168340gVc, Object obj) {
        boolean z;
        C1337880kv4 c1337880kv4;
        C1337880kv4 c1337880kv42;
        C1337880kv4 c1337880kv43 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if (C279370AxD.LIZ()) {
                return new C1337880kv4(C1337970kvD.LIZIZ((Number) obj, c1168340gVc), 1);
            }
            return new C1337880kv4(Math.round(C1337970kvD.LIZIZ((Number) obj, c1168340gVc)), 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                if ("auto".equals(str)) {
                    c1337880kv42 = new C1337880kv4(0.0f, 0);
                } else {
                    int length = str.length();
                    if (length > 0 && str.charAt(length - 1) == '%') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c1337880kv42 = new C1337880kv4(CastFloatProtector.parseFloat(str.substring(0, str.length() - 1)), 2);
                    } else {
                        String strSubstring = "0f";
                        if (u.LJIIZILJ(str, "rpx", false)) {
                            if (C279370AxD.LIZ()) {
                                if (str.length() > 3) {
                                    strSubstring = str.substring(0, str.length() - 3);
                                } else {
                                    C1325860kbg.LIZIZ(null, new AwS31S2000000_12(str, "rpx", 1), C21323718cd.LIZ(new Object()));
                                }
                                c1337880kv4 = new C1337880kv4(C1337970kvD.LIZIZ(Float.valueOf(CastFloatProtector.parseFloat(strSubstring)), c1168340gVc), 1);
                            } else {
                                if (str.length() > 3) {
                                    strSubstring = str.substring(0, str.length() - 3);
                                } else {
                                    C1325860kbg.LIZIZ(null, new AwS31S2000000_12(str, "rpx", 1), C21323718cd.LIZ(new Object()));
                                }
                                c1337880kv4 = new C1337880kv4(C1337970kvD.LIZ(Float.valueOf(CastFloatProtector.parseFloat(strSubstring)), c1168340gVc), 1);
                            }
                        } else if (u.LJIIZILJ(str, "px", false)) {
                            if (str.length() > 2) {
                                strSubstring = str.substring(0, str.length() - 2);
                            } else {
                                C1325860kbg.LIZIZ(null, new AwS31S2000000_12(str, "px", 1), C21323718cd.LIZ(new Object()));
                            }
                            c1337880kv42 = new C1337880kv4(C1337970kvD.LIZJ(Float.valueOf(CastFloatProtector.parseFloat(strSubstring))), 1);
                        } else if (C279370AxD.LIZ()) {
                            c1337880kv4 = new C1337880kv4(C1337970kvD.LIZIZ(Float.valueOf(CastFloatProtector.parseFloat(str)), c1168340gVc), 1);
                        } else {
                            c1337880kv4 = new C1337880kv4(C1337970kvD.LIZ(Float.valueOf(CastFloatProtector.parseFloat(str)), c1168340gVc), 1);
                        }
                        c1337880kv43 = c1337880kv4;
                    }
                }
                c1337880kv43 = c1337880kv42;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1337880kv43 = new C1337880kv4(0.0f, 0);
            }
        }
        LIZ(c1337880kv43);
        return c1337880kv43;
    }

    public static final C1337880kv4 LIZLLL(C21325918cz c21325918cz, Object obj) {
        C1337880kv4 c1337880kv4LIZJ = LIZJ(c21325918cz.LJIIJ(), obj);
        LIZ(c1337880kv4LIZJ);
        return c1337880kv4LIZJ;
    }

    public static final float LJFF(List<?> list, float f) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return C1337850kv1.LIZIZ(f, ListProtector.get(list, 0));
            }
            return C1337850kv1.LIZIZ(f, ListProtector.get(list, 1));
        }
        return f;
    }

    public static final C1337880kv4 LJIIIZ(C21325918cz c21325918cz, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return new C1337880kv4(C1337970kvD.LJFF((Number) obj, c21325918cz.LJIIJ()), 1);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        String strSubstring = "0f";
        if (u.LJIIZILJ(str, "rpx", false)) {
            if (str.length() > 3) {
                strSubstring = str.substring(0, str.length() - 3);
            } else {
                AwS31S2000000_12 awS31S2000000_12 = new AwS31S2000000_12(str, "rpx", 1);
                if (c21325918cz == null) {
                    obj2 = new Object();
                } else {
                    obj2 = c21325918cz;
                }
                C1325860kbg.LIZIZ(null, awS31S2000000_12, C21323718cd.LIZ(obj2));
            }
            return new C1337880kv4(C1337970kvD.LJFF(Float.valueOf(CastFloatProtector.parseFloat(strSubstring)), c21325918cz.LJIIJ()), 1);
        }
        float f = 0.0f;
        if (u.LJIIZILJ(str, "px", false)) {
            if (str.length() > 2) {
                strSubstring = str.substring(0, str.length() - 2);
            } else {
                AwS31S2000000_12 awS31S2000000_122 = new AwS31S2000000_12(str, "px", 1);
                Object obj3 = c21325918cz;
                if (c21325918cz == null) {
                    obj3 = new Object();
                }
                C1325860kbg.LIZIZ(null, awS31S2000000_122, C21323718cd.LIZ(obj3));
            }
            float fFloatValue = Float.valueOf(CastFloatProtector.parseFloat(strSubstring)).floatValue();
            if (fFloatValue != 0.0f) {
                f = C1168340gVc.LIZJ.LIZ * fFloatValue;
            }
            return new C1337880kv4(Math.round(f), 1);
        }
        float fFloatValue2 = Float.valueOf(C1337850kv1.LIZIZ(0.0f, obj)).floatValue();
        if (fFloatValue2 != 0.0f) {
            f = C1168340gVc.LIZJ.LIZ * fFloatValue2;
        }
        return new C1337880kv4(Math.round(f), 1);
    }

    public static final C1337980kvE LJIIJ(C21325918cz c21325918cz, Object obj) {
        boolean z;
        Object obj2;
        Object obj3;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if (C279370AxD.LIZ()) {
                return new C1337980kvE(C1337970kvD.LIZIZ((Number) obj, c21325918cz.LJIIJ()), 1);
            }
            return new C1337980kvE(Math.round(C1337970kvD.LIZIZ((Number) obj, c21325918cz.LJIIJ())), 1);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        int length = str.length();
        if (length > 0 && str.charAt(length - 1) == '%') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C1337980kvE(CastFloatProtector.parseFloat(str.substring(0, str.length() - 1)) / 100, 2);
        }
        String strSubstring = "0f";
        if (u.LJIIZILJ(str, "rpx", false)) {
            if (C279370AxD.LIZ()) {
                if (str.length() > 3) {
                    strSubstring = str.substring(0, str.length() - 3);
                } else {
                    AwS31S2000000_12 awS31S2000000_12 = new AwS31S2000000_12(str, "rpx", 1);
                    if (c21325918cz == null) {
                        obj3 = new Object();
                    } else {
                        obj3 = c21325918cz;
                    }
                    C1325860kbg.LIZIZ(null, awS31S2000000_12, C21323718cd.LIZ(obj3));
                }
                return new C1337980kvE(C1337970kvD.LIZIZ(Float.valueOf(CastFloatProtector.parseFloat(strSubstring)), c21325918cz.LJIIJ()), 1);
            }
            if (str.length() > 3) {
                strSubstring = str.substring(0, str.length() - 3);
            } else {
                AwS31S2000000_12 awS31S2000000_122 = new AwS31S2000000_12(str, "rpx", 1);
                if (c21325918cz == null) {
                    obj2 = new Object();
                } else {
                    obj2 = c21325918cz;
                }
                C1325860kbg.LIZIZ(null, awS31S2000000_122, C21323718cd.LIZ(obj2));
            }
            return new C1337980kvE(C1337970kvD.LIZ(Float.valueOf(CastFloatProtector.parseFloat(strSubstring)), c21325918cz.LJIIJ()), 1);
        }
        if (u.LJIIZILJ(str, "px", false)) {
            if (str.length() > 2) {
                strSubstring = str.substring(0, str.length() - 2);
            } else {
                AwS31S2000000_12 awS31S2000000_123 = new AwS31S2000000_12(str, "px", 1);
                Object obj4 = c21325918cz;
                if (c21325918cz == null) {
                    obj4 = new Object();
                }
                C1325860kbg.LIZIZ(null, awS31S2000000_123, C21323718cd.LIZ(obj4));
            }
            return new C1337980kvE(C1337970kvD.LIZJ(Float.valueOf(CastFloatProtector.parseFloat(strSubstring))), 1);
        }
        return new C1337980kvE(C1337850kv1.LIZIZ(0.0f, obj), 2);
    }
}
