package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC757240Tn8 {
    public static final EnumC757240Tn8 ADD;
    public static final /* synthetic */ EnumC757240Tn8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC757240Tn8 PIN;
    public static final EnumC757240Tn8 REMOVE;
    public static final EnumC757240Tn8 UNPIN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC757240Tn8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC757240Tn8 enumC757240Tn8 = new EnumC757240Tn8("PIN", 0, 1);
        PIN = enumC757240Tn8;
        EnumC757240Tn8 enumC757240Tn82 = new EnumC757240Tn8("UNPIN", 1, 2);
        UNPIN = enumC757240Tn82;
        EnumC757240Tn8 enumC757240Tn83 = new EnumC757240Tn8("ADD", 2, 3);
        ADD = enumC757240Tn83;
        EnumC757240Tn8 enumC757240Tn84 = new EnumC757240Tn8("REMOVE", 3, 4);
        REMOVE = enumC757240Tn84;
        EnumC757240Tn8[] enumC757240Tn8Arr = {enumC757240Tn8, enumC757240Tn82, enumC757240Tn83, enumC757240Tn84};
        LLILLJJLI = enumC757240Tn8Arr;
        LLILLL = new C2254308sP(enumC757240Tn8Arr);
    }

    public static EnumC757240Tn8[] values() {
        return (EnumC757240Tn8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC757240Tn8 valueOf(String str) {
        return (EnumC757240Tn8) C08FF.LIZ(EnumC757240Tn8.class, str);
    }

    public EnumC757240Tn8(String str, int i, int i2) {
        this.LL = i2;
    }
}
