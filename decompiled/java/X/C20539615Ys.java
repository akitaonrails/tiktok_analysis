package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20539615Ys {
    public static final void LIZ(C15Z2 c15z2, C20540215Yy c20540215Yy) {
        Iterator<T> it2 = c20540215Yy.LJ.iterator();
        while (it2.hasNext()) {
            String key = ((C15YM) it2.next()).getKey();
            c15z2.getClass();
            C15Z2.LIZIZ().erase(key);
        }
        for (Map.Entry<C15YM, Boolean> entry : c20540215Yy.LIZ.entrySet()) {
            String key2 = entry.getKey().getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            c15z2.getClass();
            C15Z2.LIZIZ().storeBoolean(key2, zBooleanValue);
        }
        for (Map.Entry<C15YM, Integer> entry2 : c20540215Yy.LIZIZ.entrySet()) {
            String key3 = entry2.getKey().getKey();
            int iIntValue = entry2.getValue().intValue();
            c15z2.getClass();
            C15Z2.LIZIZ().storeInt(key3, iIntValue);
        }
        for (Map.Entry<C15YM, Long> entry3 : c20540215Yy.LIZJ.entrySet()) {
            String key4 = entry3.getKey().getKey();
            long jLongValue = entry3.getValue().longValue();
            c15z2.getClass();
            C15Z2.LIZIZ().storeLong(key4, jLongValue);
        }
        for (Map.Entry<C15YM, String> entry4 : c20540215Yy.LIZLLL.entrySet()) {
            String key5 = entry4.getKey().getKey();
            String value = entry4.getValue();
            c15z2.getClass();
            C15Z2.LIZIZ().storeString(key5, value);
        }
    }

    public static final void LIZIZ(C15Z2 c15z2, C20540215Yy c20540215Yy, C15YM c15ym, Boolean bool) {
        if (bool == null) {
            c20540215Yy.LJ.add(c15ym);
            return;
        }
        String key = c15ym.getKey();
        c15z2.getClass();
        if (!C15Z2.LIZ(key)) {
            C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, bool));
            return;
        }
        if (Intrinsics.LJFF(bool, Boolean.valueOf(C15Z2.LIZIZ().getBoolean(c15ym.getKey(), false)))) {
            return;
        }
        C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, bool));
    }

    public static final void LIZJ(C15Z2 c15z2, C20540215Yy c20540215Yy, C15YM c15ym, Integer num) {
        if (num == null) {
            c20540215Yy.LJ.add(c15ym);
            return;
        }
        String key = c15ym.getKey();
        c15z2.getClass();
        if (!C15Z2.LIZ(key)) {
            C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, num));
            return;
        }
        if (num.intValue() == C15Z2.LIZIZ().getInt(c15ym.getKey(), 0)) {
            return;
        }
        C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, num));
    }

    public static final void LIZLLL(C15Z2 c15z2, C20540215Yy c20540215Yy, C15YM c15ym, Long l) {
        if (l == null) {
            c20540215Yy.LJ.add(c15ym);
            return;
        }
        String key = c15ym.getKey();
        c15z2.getClass();
        if (!C15Z2.LIZ(key)) {
            C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, l));
            return;
        }
        if (l.longValue() == C15Z2.LIZIZ().getLong(c15ym.getKey(), 0L)) {
            return;
        }
        C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, l));
    }

    public static final void LJ(C15Z2 c15z2, C20540215Yy c20540215Yy, C15YM c15ym, String str) {
        if (str == null) {
            c20540215Yy.LJ.add(c15ym);
            return;
        }
        String key = c15ym.getKey();
        c15z2.getClass();
        if (!C15Z2.LIZ(key)) {
            C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, str));
            return;
        }
        if (Intrinsics.LJFF(str, C15Z2.LIZIZ().getString(c15ym.getKey(), ""))) {
            return;
        }
        C20539715Yt.LIZIZ(c20540215Yy, new Pair(c15ym, str));
    }
}
