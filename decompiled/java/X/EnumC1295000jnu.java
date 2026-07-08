package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.0jnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1295000jnu {
    BUTT,
    ROUND,
    UNKNOWN;

    public Paint.Cap toPaintCap() {
        int i = C1294990jnt.LIZ[ordinal()];
        return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static EnumC1295000jnu valueOf(String str) {
        return (EnumC1295000jnu) C08FF.LIZ(EnumC1295000jnu.class, str);
    }
}
