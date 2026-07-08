package X;

import android.graphics.Color;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.Map;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849430XTx {
    public static final LruCache<Float, Integer> LIZ = new LruCache<>(100);
    public static final LruCache<String, Integer> LIZIZ = new LruCache<>(100);

    public static String LIZ(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Character) {
            return String.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        return null;
    }

    public static Integer LIZJ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (!(!z)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            String strLJJJJZ = a0.LJJJJZ("#", str);
            int length = strLJJJJZ.length();
            if (length != 3) {
                if (length != 4) {
                    if (length != 6) {
                        if (length != 8) {
                            return null;
                        }
                        String strSubstring = strLJJJJZ.substring(6, 8);
                        CharsKt__CharJVMKt.checkRadix(16);
                        int i = CastIntegerProtector.parseInt(strSubstring, 16);
                        String strSubstring2 = strLJJJJZ.substring(0, 2);
                        CharsKt__CharJVMKt.checkRadix(16);
                        int i2 = CastIntegerProtector.parseInt(strSubstring2, 16);
                        String strSubstring3 = strLJJJJZ.substring(2, 4);
                        CharsKt__CharJVMKt.checkRadix(16);
                        int i3 = CastIntegerProtector.parseInt(strSubstring3, 16);
                        String strSubstring4 = strLJJJJZ.substring(4, 6);
                        CharsKt__CharJVMKt.checkRadix(16);
                        return Integer.valueOf(Color.argb(i, i2, i3, CastIntegerProtector.parseInt(strSubstring4, 16)));
                    }
                    String strSubstring5 = strLJJJJZ.substring(0, 2);
                    CharsKt__CharJVMKt.checkRadix(16);
                    int i4 = CastIntegerProtector.parseInt(strSubstring5, 16);
                    String strSubstring6 = strLJJJJZ.substring(2, 4);
                    CharsKt__CharJVMKt.checkRadix(16);
                    int i5 = CastIntegerProtector.parseInt(strSubstring6, 16);
                    String strSubstring7 = strLJJJJZ.substring(4, 6);
                    CharsKt__CharJVMKt.checkRadix(16);
                    return Integer.valueOf(Color.rgb(i4, i5, CastIntegerProtector.parseInt(strSubstring7, 16)));
                }
                String strLJJ = u.LJJ(2, strLJJJJZ.substring(0, 1));
                CharsKt__CharJVMKt.checkRadix(16);
                int i6 = CastIntegerProtector.parseInt(strLJJ, 16);
                String strLJJ2 = u.LJJ(2, strLJJJJZ.substring(1, 2));
                CharsKt__CharJVMKt.checkRadix(16);
                int i7 = CastIntegerProtector.parseInt(strLJJ2, 16);
                String strLJJ3 = u.LJJ(2, strLJJJJZ.substring(2, 3));
                CharsKt__CharJVMKt.checkRadix(16);
                int i8 = CastIntegerProtector.parseInt(strLJJ3, 16);
                String strLJJ4 = u.LJJ(2, strLJJJJZ.substring(3, 4));
                CharsKt__CharJVMKt.checkRadix(16);
                return Integer.valueOf(Color.argb(CastIntegerProtector.parseInt(strLJJ4, 16), i6, i7, i8));
            }
            String strLJJ5 = u.LJJ(2, strLJJJJZ.substring(0, 1));
            CharsKt__CharJVMKt.checkRadix(16);
            int i9 = CastIntegerProtector.parseInt(strLJJ5, 16);
            String strLJJ6 = u.LJJ(2, strLJJJJZ.substring(1, 2));
            CharsKt__CharJVMKt.checkRadix(16);
            int i10 = CastIntegerProtector.parseInt(strLJJ6, 16);
            String strLJJ7 = u.LJJ(2, strLJJJJZ.substring(2, 3));
            CharsKt__CharJVMKt.checkRadix(16);
            return Integer.valueOf(Color.rgb(i9, i10, CastIntegerProtector.parseInt(strLJJ7, 16)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (Integer) obj;
        }
    }

    public static String LIZIZ(String str, Map map) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static Integer LIZLLL(float f, String str) {
        Float fLJIIIIZZ;
        if (str == null) {
            return null;
        }
        String lowerCase = a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT);
        int iIntValue = 0;
        if (lowerCase.length() == 0 || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(a0.LJJJLL("rpx", a0.LJJJLL("px", lowerCase)))) == null) {
            return null;
        }
        float fFloatValue = fLJIIIIZZ.floatValue();
        if (fFloatValue <= 0.0f) {
            return 0;
        }
        if (u.LJIIZILJ(lowerCase, "px", false)) {
            LruCache<Float, Integer> lruCache = LIZ;
            Integer num = lruCache.get(Float.valueOf(fFloatValue));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int iLIZIZ = C814420VxA.LIZIZ(C1168340gVc.LIZJ.LIZIZ * fFloatValue);
                if (iLIZIZ >= 0) {
                    iIntValue = iLIZIZ;
                }
                lruCache.put(Float.valueOf(fFloatValue), Integer.valueOf(iIntValue));
            }
            return Integer.valueOf(iIntValue);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(fFloatValue);
        sbLIZ.append('_');
        sbLIZ.append(f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LruCache<String, Integer> lruCache2 = LIZIZ;
        Integer num2 = lruCache2.get(strLIZIZ);
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            int iLIZIZ2 = C814420VxA.LIZIZ(fFloatValue * f);
            if (iLIZIZ2 >= 0) {
                iIntValue = iLIZIZ2;
            }
            lruCache2.put(strLIZIZ, Integer.valueOf(iIntValue));
        }
        return Integer.valueOf(iIntValue);
    }
}
