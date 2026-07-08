package X;

/* JADX INFO: renamed from: X.0XLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC847320XLu {
    Low(0),
    Medium(1),
    High(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC847320XLu valueOf(String str) {
        return (EnumC847320XLu) C08FF.LIZ(EnumC847320XLu.class, str);
    }

    EnumC847320XLu(int i) {
        this.LL = i;
    }
}
