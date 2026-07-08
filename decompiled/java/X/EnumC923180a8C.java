package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC923180a8C {
    public static final EnumC923180a8C FAILED;
    public static final /* synthetic */ EnumC923180a8C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC923180a8C NONE;
    public static final EnumC923180a8C SUCCEED;

    public static InterfaceC2044707zh<EnumC923180a8C> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC923180a8C enumC923180a8C = new EnumC923180a8C("NONE", 0);
        NONE = enumC923180a8C;
        EnumC923180a8C enumC923180a8C2 = new EnumC923180a8C("SUCCEED", 1);
        SUCCEED = enumC923180a8C2;
        EnumC923180a8C enumC923180a8C3 = new EnumC923180a8C("FAILED", 2);
        FAILED = enumC923180a8C3;
        EnumC923180a8C[] enumC923180a8CArr = {enumC923180a8C, enumC923180a8C2, enumC923180a8C3};
        LL = enumC923180a8CArr;
        LLILLJJLI = new C2254308sP(enumC923180a8CArr);
    }

    public static EnumC923180a8C[] values() {
        return (EnumC923180a8C[]) LL.clone();
    }

    public static EnumC923180a8C valueOf(String str) {
        return (EnumC923180a8C) C08FF.LIZ(EnumC923180a8C.class, str);
    }

    public EnumC923180a8C(String str, int i) {
    }
}
