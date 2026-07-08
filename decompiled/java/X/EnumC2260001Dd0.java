package X;

import android.icu.text.MeasureFormat;

/* JADX INFO: renamed from: X.1Dd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2260001Dd0 {
    SHORT,
    NARROW,
    LONG;

    public MeasureFormat.FormatWidth getFormatWidth() {
        int i = C2259961Dcw.LJ[ordinal()];
        return i != 2 ? i != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LJ[ordinal()];
        if (i == 1) {
            return "short";
        }
        if (i == 2) {
            return "narrow";
        }
        if (i == 3) {
            return "long";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2260001Dd0 valueOf(String str) {
        return (EnumC2260001Dd0) C08FF.LIZ(EnumC2260001Dd0.class, str);
    }
}
