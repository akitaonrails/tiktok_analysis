package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.0jlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1293720jlq {
    Miter,
    Round,
    Bevel;

    public Paint.Join toPaintJoin() {
        int i = C1293700jlo.LIZIZ[ordinal()];
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

    public static EnumC1293720jlq valueOf(String str) {
        return (EnumC1293720jlq) C08FF.LIZ(EnumC1293720jlq.class, str);
    }
}
