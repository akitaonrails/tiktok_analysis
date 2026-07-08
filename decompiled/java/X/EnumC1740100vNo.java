package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1740100vNo {
    public static final EnumC1740100vNo FIRST_SCREEN;
    public static final /* synthetic */ EnumC1740100vNo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1740100vNo SERVER;
    public static final EnumC1740100vNo UNCOMPLETED;
    public static final EnumC1740100vNo UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1740100vNo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1740100vNo enumC1740100vNo = new EnumC1740100vNo("UNKNOWN", 0, -1);
        UNKNOWN = enumC1740100vNo;
        EnumC1740100vNo enumC1740100vNo2 = new EnumC1740100vNo("UNCOMPLETED", 1, 0);
        UNCOMPLETED = enumC1740100vNo2;
        EnumC1740100vNo enumC1740100vNo3 = new EnumC1740100vNo("FIRST_SCREEN", 2, 1);
        FIRST_SCREEN = enumC1740100vNo3;
        EnumC1740100vNo enumC1740100vNo4 = new EnumC1740100vNo("SERVER", 3, 2);
        SERVER = enumC1740100vNo4;
        EnumC1740100vNo[] enumC1740100vNoArr = {enumC1740100vNo, enumC1740100vNo2, enumC1740100vNo3, enumC1740100vNo4};
        LLILLJJLI = enumC1740100vNoArr;
        LLILLL = new C2254308sP(enumC1740100vNoArr);
    }

    public static EnumC1740100vNo[] values() {
        return (EnumC1740100vNo[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1740100vNo valueOf(String str) {
        return (EnumC1740100vNo) C08FF.LIZ(EnumC1740100vNo.class, str);
    }

    public EnumC1740100vNo(String str, int i, int i2) {
        this.LL = i2;
    }
}
