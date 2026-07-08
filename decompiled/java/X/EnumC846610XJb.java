package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC846610XJb {
    public static final EnumC846610XJb BACKUP;
    public static final EnumC846610XJb DOWNGRADE;
    public static final /* synthetic */ EnumC846610XJb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC846610XJb NONE;
    public static final EnumC846610XJb ORIGIN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC846610XJb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC846610XJb enumC846610XJb = new EnumC846610XJb("NONE", 0, 0);
        NONE = enumC846610XJb;
        EnumC846610XJb enumC846610XJb2 = new EnumC846610XJb("ORIGIN", 1, 1);
        ORIGIN = enumC846610XJb2;
        EnumC846610XJb enumC846610XJb3 = new EnumC846610XJb("DOWNGRADE", 2, 2);
        DOWNGRADE = enumC846610XJb3;
        EnumC846610XJb enumC846610XJb4 = new EnumC846610XJb("BACKUP", 3, 3);
        BACKUP = enumC846610XJb4;
        EnumC846610XJb[] enumC846610XJbArr = {enumC846610XJb, enumC846610XJb2, enumC846610XJb3, enumC846610XJb4};
        LLILLJJLI = enumC846610XJbArr;
        LLILLL = new C2254308sP(enumC846610XJbArr);
    }

    public static EnumC846610XJb[] values() {
        return (EnumC846610XJb[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC846610XJb valueOf(String str) {
        return (EnumC846610XJb) C08FF.LIZ(EnumC846610XJb.class, str);
    }

    public EnumC846610XJb(String str, int i, int i2) {
        this.LL = i2;
    }
}
