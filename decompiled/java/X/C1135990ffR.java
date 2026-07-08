package X;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSettingNew;
import com.bytedance.android.livesdk.livesetting.gift.TrayStayAfterComboConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ffR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135990ffR {
    public static final C1135990ffR LIZ = new C1135990ffR();

    public static Map LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("1", C1697810uHb.LJIILJJIL("#FF262626", "#99262626", "#11262626")), new Pair("500", C1697810uHb.LJIILJJIL("#FF1634C6", "#991634C6", "#111634C6")), new Pair("10000", C1697810uHb.LJIILJJIL("#FF510EBF", "#99510EBF", "#11510EBF")));
    }

    public static Drawable LJI(int i) {
        Map mapLIZ;
        Set setKeySet;
        float f;
        int iLJFF;
        Map<String, Object> value = LiveGiftTrayPriceColorSettingNew.INSTANCE.getValue();
        if (Intrinsics.LJFF("normal", "gallery")) {
            setKeySet = C08CX.INSTANCE;
        } else {
            Object obj = value.get("normal");
            if (!(obj instanceof Map) || (mapLIZ = (Map) obj) == null) {
                LIZ.getClass();
                mapLIZ = LIZ();
            }
            setKeySet = mapLIZ.keySet();
        }
        if (setKeySet.isEmpty()) {
            setKeySet = Collections.singleton("1");
        }
        if (Intrinsics.LJFF(LJII(setKeySet, i), "1")) {
            f = 0.3f;
        } else {
            f = 1.0f;
        }
        Integer numLJIIIIZZ = LJIIIIZZ((String) C13LP.LJJJLL(LIZIZ(i, "normal")));
        if (numLJIIIIZZ != null) {
            iLJFF = numLJIIIIZZ.intValue();
        } else {
            iLJFF = C497740JfY.LJFF(R.color.a2l);
        }
        float[] fArr = new float[8];
        Arrays.fill(fArr, 120.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(iLJFF);
        shapeDrawable.getPaint().setAlpha(C814420VxA.LIZIZ(f * 255));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static Integer LJIIIIZZ(String str) {
        Integer numValueOf = null;
        if (str == null) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf(Color.parseColor(str));
            return numValueOf;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return numValueOf;
        }
    }

    public static List LIZIZ(int i, String str) {
        Map mapLIZ;
        Iterable iterable;
        List listLLIIII;
        Map<String, Object> value = LiveGiftTrayPriceColorSettingNew.INSTANCE.getValue();
        if (Intrinsics.LJFF(str, "gallery")) {
            Object obj = value.get(str);
            if (C19719512Dh.LJI(obj)) {
                iterable = (Iterable) obj;
            }
            return C1697810uHb.LJIILJJIL("#FF262626", "#99262626", "#11262626");
        }
        Object obj2 = value.get(str);
        if (!(obj2 instanceof Map) || (mapLIZ = (Map) obj2) == null) {
            LIZ.getClass();
            mapLIZ = LIZ();
        }
        C1135990ffR c1135990ffR = LIZ;
        Set setKeySet = mapLIZ.keySet();
        c1135990ffR.getClass();
        iterable = (Iterable) mapLIZ.get(LJII(setKeySet, i));
        if (iterable != null && (listLLIIII = C13LP.LLIIII(iterable)) != null) {
            return listLLIIII;
        }
        return C1697810uHb.LJIILJJIL("#FF262626", "#99262626", "#11262626");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.drawable.Drawable LJ(android.content.Context r7, X.C1135810ff9 r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135990ffR.LJ(android.content.Context, X.0ff9):android.graphics.drawable.Drawable");
    }

    public static final long LJFF(int i, C1135810ff9 c1135810ff9) {
        int i2;
        Object obj;
        int iIntValue;
        int i3 = 0;
        if (i <= 70) {
            LIZ.getClass();
            if (c1135810ff9 == null) {
                return 2000L;
            }
            boolean z = c1135810ff9.LJIJI;
            boolean z2 = c1135810ff9.LJJJLIIL;
            if (z2) {
                i2 = c1135810ff9.LJIILJJIL;
            } else {
                i2 = c1135810ff9.LJIILIIL;
            }
            boolean z3 = c1135810ff9.LJJJLL;
            int iLIZ = 2000;
            if (C1135980ffQ.LJIIJ()) {
                TrayStayAfterComboConfig trayStayAfterComboConfig = C1135980ffQ.LIZJ(z2, z3)._trayStayAfterComboConfig;
                if (!C1135980ffQ.LJIIJ()) {
                    iIntValue = 2000;
                } else {
                    if (u.LJIJI(trayStayAfterComboConfig._stayType, "fix", true)) {
                        iIntValue = trayStayAfterComboConfig._fixDuration;
                    } else {
                        List<Integer> list = trayStayAfterComboConfig._dynamicDuration;
                        int iLIZ2 = C1135980ffQ.LIZ(i2, (List) C1135980ffQ.LIZIZ.invoke(Boolean.valueOf(z2)));
                        if (iLIZ2 >= 0 && iLIZ2 < list.size()) {
                            obj = ListProtector.get(list, iLIZ2);
                        } else {
                            obj = -1;
                        }
                        iIntValue = ((Number) obj).intValue();
                    }
                    if (iIntValue > 0) {
                    }
                    iLIZ = C1147010fxD.LIZ(z2, i2, iLIZ, z3, false);
                }
                iLIZ = iIntValue;
                iLIZ = C1147010fxD.LIZ(z2, i2, iLIZ, z3, false);
            }
            long j = iLIZ;
            if (z) {
                boolean z4 = c1135810ff9.LJJJLIIL;
                boolean z5 = c1135810ff9.LJJJLL;
                if (C1135980ffQ.LJIIJ()) {
                    i3 = C1135980ffQ.LIZJ(z4, z5)._trayStayAfterComboConfig._firstSendExtendsDuration;
                }
                return j + ((long) i3);
            }
            return j;
        }
        if (i < 1751) {
            return 3000L;
        }
        if (1751 > i) {
            return 2000L;
        }
        if (i < 5201) {
            return 4000L;
        }
        if (i < 17501) {
            return 6000L;
        }
        if (i < 300001) {
            return 7000L;
        }
        return 8000L;
    }

    public static String LJII(Set set, int i) {
        int iIntValue;
        Iterator it2 = set.iterator();
        String str = "1";
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
            int iIntValue2 = 0;
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue <= i) {
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str);
                if (numLJIIJJI2 != null) {
                    iIntValue2 = numLJIIJJI2.intValue();
                }
                if (iIntValue > iIntValue2) {
                    str = str2;
                }
            }
        }
        return str;
    }

    public static Drawable LIZJ(List list, boolean z, float f) {
        GradientDrawable gradientDrawable;
        int iIntValue;
        LinkedList linkedList = new LinkedList();
        Iterator it2 = list.iterator();
        while (true) {
            int iIntValue2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Integer numLJIIIIZZ = LJIIIIZZ((String) it2.next());
            if (numLJIIIIZZ != null) {
                iIntValue2 = numLJIIIIZZ.intValue();
            }
            linkedList.addLast(Integer.valueOf(iIntValue2));
        }
        if (linkedList.isEmpty()) {
            linkedList.addLast(LJIIIIZZ("#33000000"));
        }
        if (z && linkedList.size() > 1) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, C13LP.LLII(linkedList));
        } else {
            gradientDrawable = new GradientDrawable();
            C1135990ffR c1135990ffR = LIZ;
            String str = (String) C13LP.LJJJLL(list);
            c1135990ffR.getClass();
            Integer numLJIIIIZZ2 = LJIIIIZZ(str);
            if (numLJIIIIZZ2 != null) {
                iIntValue = numLJIIIIZZ2.intValue();
            } else {
                iIntValue = 0;
            }
            gradientDrawable.setColor(iIntValue);
        }
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(f));
        return gradientDrawable;
    }
}
