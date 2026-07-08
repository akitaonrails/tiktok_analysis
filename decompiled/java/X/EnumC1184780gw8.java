package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184780gw8 {
    public static final EnumC1184780gw8 GRADE;
    public static final /* synthetic */ EnumC1184780gw8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1184780gw8 RANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1184780gw8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1184780gw8 enumC1184780gw8 = new EnumC1184780gw8("RANGE", 0, "range");
        RANGE = enumC1184780gw8;
        EnumC1184780gw8 enumC1184780gw82 = new EnumC1184780gw8("GRADE", 1, "grade");
        GRADE = enumC1184780gw82;
        EnumC1184780gw8[] enumC1184780gw8Arr = {enumC1184780gw8, enumC1184780gw82};
        LLILLJJLI = enumC1184780gw8Arr;
        LLILLL = new C2254308sP(enumC1184780gw8Arr);
    }

    public static EnumC1184780gw8[] values() {
        return (EnumC1184780gw8[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1184780gw8 valueOf(String str) {
        return (EnumC1184780gw8) C08FF.LIZ(EnumC1184780gw8.class, str);
    }

    public EnumC1184780gw8(String str, int i, String str2) {
        this.LL = str2;
    }
}
