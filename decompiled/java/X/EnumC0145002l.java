package X;

/* JADX INFO: renamed from: X.002l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0145002l {
    VideoTimeSelectionBarStyle_None(0),
    VideoTimeSelectionBarStyle_Default(1),
    VideoTimeSelectionBarStyle_Static(2);

    public final int LL;

    public static EnumC0145002l valueOf(String str) {
        return (EnumC0145002l) C08FF.LIZ(EnumC0145002l.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC0145002l(int i) {
        this.LL = i;
    }
}
