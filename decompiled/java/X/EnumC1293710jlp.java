package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.0jlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1293710jlp {
    Butt,
    Round,
    Unknown;

    public Paint.Cap toPaintCap() {
        int i = C1293700jlo.LIZ[ordinal()];
        return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static EnumC1293710jlp valueOf(String str) {
        return (EnumC1293710jlp) C08FF.LIZ(EnumC1293710jlp.class, str);
    }
}
