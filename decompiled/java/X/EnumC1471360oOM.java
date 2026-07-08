package X;

/* JADX INFO: renamed from: X.0oOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1471360oOM {
    UNKNOWN(-1),
    WIFI(0),
    READY_SWITCH_TO_CELL(1),
    CELL(2),
    READY_SWITCH_TO_WIFI(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1471360oOM valueOf(String str) {
        return (EnumC1471360oOM) C08FF.LIZ(EnumC1471360oOM.class, str);
    }

    EnumC1471360oOM(int i) {
        this.LL = i;
    }
}
