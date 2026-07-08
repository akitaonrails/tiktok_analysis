package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.0jnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1295010jnv {
    MITER,
    ROUND,
    BEVEL;

    public Paint.Join toPaintJoin() {
        int i = C1294990jnt.LIZIZ[ordinal()];
        if (i == 1) {
            return Paint.Join.BEVEL;
        }
        if (i == 2) {
            return Paint.Join.MITER;
        }
        if (i != 3) {
            return null;
        }
        return Paint.Join.ROUND;
    }

    public static EnumC1295010jnv valueOf(String str) {
        return (EnumC1295010jnv) C08FF.LIZ(EnumC1295010jnv.class, str);
    }
}
