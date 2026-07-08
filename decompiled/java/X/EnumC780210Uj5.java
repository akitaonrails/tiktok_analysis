package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC780210Uj5 {
    public static final EnumC780210Uj5 Default;
    public static final /* synthetic */ EnumC780210Uj5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC780210Uj5 Scale120;
    public static final EnumC780210Uj5 Scale60;
    public static final EnumC780210Uj5 Scale70;
    public static final EnumC780210Uj5 Scale80;
    public static final EnumC780210Uj5 Scale90;
    public final float LL;

    public static InterfaceC2044707zh<EnumC780210Uj5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC780210Uj5 enumC780210Uj5 = new EnumC780210Uj5(1.2f, "Scale120", 0);
        Scale120 = enumC780210Uj5;
        EnumC780210Uj5 enumC780210Uj52 = new EnumC780210Uj5(1.0f, "Default", 1);
        Default = enumC780210Uj52;
        EnumC780210Uj5 enumC780210Uj53 = new EnumC780210Uj5(0.9f, "Scale90", 2);
        Scale90 = enumC780210Uj53;
        EnumC780210Uj5 enumC780210Uj54 = new EnumC780210Uj5(0.8f, "Scale80", 3);
        Scale80 = enumC780210Uj54;
        EnumC780210Uj5 enumC780210Uj55 = new EnumC780210Uj5(0.7f, "Scale70", 4);
        Scale70 = enumC780210Uj55;
        EnumC780210Uj5 enumC780210Uj56 = new EnumC780210Uj5(0.6f, "Scale60", 5);
        Scale60 = enumC780210Uj56;
        EnumC780210Uj5[] enumC780210Uj5Arr = {enumC780210Uj5, enumC780210Uj52, enumC780210Uj53, enumC780210Uj54, enumC780210Uj55, enumC780210Uj56};
        LLILLJJLI = enumC780210Uj5Arr;
        LLILLL = new C2254308sP(enumC780210Uj5Arr);
    }

    public static EnumC780210Uj5[] values() {
        return (EnumC780210Uj5[]) LLILLJJLI.clone();
    }

    public final float getRatio() {
        return this.LL;
    }

    public static EnumC780210Uj5 valueOf(String str) {
        return (EnumC780210Uj5) C08FF.LIZ(EnumC780210Uj5.class, str);
    }

    public EnumC780210Uj5(float f, String str, int i) {
        this.LL = f;
    }
}
