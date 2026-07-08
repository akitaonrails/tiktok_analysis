package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623890OdX {
    public static final /* synthetic */ EnumC623890OdX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC623890OdX TAB_ALL;
    public static final EnumC623890OdX TAB_CLOSED;
    public static final EnumC623890OdX TAB_COMPLETED;
    public static final EnumC623890OdX TAB_IN_PROGRESS;
    public static final EnumC623890OdX TAB_PENDING;
    public static final EnumC623890OdX TAB_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC623890OdX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC623890OdX enumC623890OdX = new EnumC623890OdX("TAB_UNKNOWN", 0, 0);
        TAB_UNKNOWN = enumC623890OdX;
        EnumC623890OdX enumC623890OdX2 = new EnumC623890OdX("TAB_ALL", 1, 1);
        TAB_ALL = enumC623890OdX2;
        EnumC623890OdX enumC623890OdX3 = new EnumC623890OdX("TAB_PENDING", 2, 2);
        TAB_PENDING = enumC623890OdX3;
        EnumC623890OdX enumC623890OdX4 = new EnumC623890OdX("TAB_IN_PROGRESS", 3, 3);
        TAB_IN_PROGRESS = enumC623890OdX4;
        EnumC623890OdX enumC623890OdX5 = new EnumC623890OdX("TAB_COMPLETED", 4, 4);
        TAB_COMPLETED = enumC623890OdX5;
        EnumC623890OdX enumC623890OdX6 = new EnumC623890OdX("TAB_CLOSED", 5, 5);
        TAB_CLOSED = enumC623890OdX6;
        EnumC623890OdX[] enumC623890OdXArr = {enumC623890OdX, enumC623890OdX2, enumC623890OdX3, enumC623890OdX4, enumC623890OdX5, enumC623890OdX6};
        LLILLJJLI = enumC623890OdXArr;
        LLILLL = new C2254308sP(enumC623890OdXArr);
    }

    public static EnumC623890OdX[] values() {
        return (EnumC623890OdX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC623890OdX valueOf(String str) {
        return (EnumC623890OdX) C08FF.LIZ(EnumC623890OdX.class, str);
    }

    public EnumC623890OdX(String str, int i, int i2) {
        this.LL = i2;
    }
}
