package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.15Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20539715Yt {
    public static final void LIZ(C20540215Yy c20540215Yy, C20540215Yy c20540215Yy2) {
        c20540215Yy.LIZ.putAll(c20540215Yy2.LIZ);
        c20540215Yy.LIZIZ.putAll(c20540215Yy2.LIZIZ);
        c20540215Yy.LIZJ.putAll(c20540215Yy2.LIZJ);
        c20540215Yy.LIZLLL.putAll(c20540215Yy2.LIZLLL);
        c20540215Yy.LJ.addAll(c20540215Yy2.LJ);
    }

    public static final void LIZIZ(C20540215Yy c20540215Yy, Pair<? extends C15YM, ?> pair) {
        Class<?> cls;
        Object second = pair.getSecond();
        if (second instanceof Integer) {
            c20540215Yy.LIZIZ.put(pair.getFirst(), (Integer) second);
            return;
        }
        if (second instanceof Long) {
            c20540215Yy.LIZJ.put(pair.getFirst(), (Long) second);
            return;
        }
        if (second instanceof String) {
            c20540215Yy.LIZLLL.put(pair.getFirst(), (String) second);
            return;
        }
        if (second instanceof Boolean) {
            c20540215Yy.LIZ.put(pair.getFirst(), (Boolean) second);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported type: ");
        if (second != null) {
            cls = second.getClass();
        } else {
            cls = null;
        }
        sbLIZ.append(cls);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
