package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1217990hnh {
    public static final EnumC1217990hnh APPROVE;
    public static final EnumC1217990hnh DECLINE;
    public static final /* synthetic */ EnumC1217990hnh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1217990hnh UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1217990hnh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1217990hnh enumC1217990hnh = new EnumC1217990hnh("UNKNOWN", 0, 0);
        UNKNOWN = enumC1217990hnh;
        EnumC1217990hnh enumC1217990hnh2 = new EnumC1217990hnh("APPROVE", 1, 1);
        APPROVE = enumC1217990hnh2;
        EnumC1217990hnh enumC1217990hnh3 = new EnumC1217990hnh("DECLINE", 2, 2);
        DECLINE = enumC1217990hnh3;
        EnumC1217990hnh[] enumC1217990hnhArr = {enumC1217990hnh, enumC1217990hnh2, enumC1217990hnh3};
        LLILLJJLI = enumC1217990hnhArr;
        LLILLL = new C2254308sP(enumC1217990hnhArr);
    }

    public static EnumC1217990hnh[] values() {
        return (EnumC1217990hnh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1217990hnh valueOf(String str) {
        return (EnumC1217990hnh) C08FF.LIZ(EnumC1217990hnh.class, str);
    }

    public EnumC1217990hnh(String str, int i, int i2) {
        this.LL = i2;
    }
}
