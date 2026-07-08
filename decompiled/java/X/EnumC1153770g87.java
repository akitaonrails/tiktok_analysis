package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153770g87 {
    public static final EnumC1153770g87 AFTER_CONTENTION;
    public static final EnumC1153770g87 AFTER_HANDLE_RESPONSE;
    public static final EnumC1153770g87 AFTER_SUPER_BIND;
    public static final EnumC1153770g87 BEFORE_CONTENTION;
    public static final EnumC1153770g87 BEFORE_HANDLE_RESPONSE;
    public static final EnumC1153770g87 BEFORE_SUPER_BIND;
    public static final /* synthetic */ EnumC1153770g87[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1153770g87> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153770g87 enumC1153770g87 = new EnumC1153770g87("BEFORE_SUPER_BIND", 0);
        BEFORE_SUPER_BIND = enumC1153770g87;
        EnumC1153770g87 enumC1153770g872 = new EnumC1153770g87("AFTER_SUPER_BIND", 1);
        AFTER_SUPER_BIND = enumC1153770g872;
        EnumC1153770g87 enumC1153770g873 = new EnumC1153770g87("BEFORE_CONTENTION", 2);
        BEFORE_CONTENTION = enumC1153770g873;
        EnumC1153770g87 enumC1153770g874 = new EnumC1153770g87("AFTER_CONTENTION", 3);
        AFTER_CONTENTION = enumC1153770g874;
        EnumC1153770g87 enumC1153770g875 = new EnumC1153770g87("BEFORE_HANDLE_RESPONSE", 4);
        BEFORE_HANDLE_RESPONSE = enumC1153770g875;
        EnumC1153770g87 enumC1153770g876 = new EnumC1153770g87("AFTER_HANDLE_RESPONSE", 5);
        AFTER_HANDLE_RESPONSE = enumC1153770g876;
        EnumC1153770g87[] enumC1153770g87Arr = {enumC1153770g87, enumC1153770g872, enumC1153770g873, enumC1153770g874, enumC1153770g875, enumC1153770g876};
        LL = enumC1153770g87Arr;
        LLILLJJLI = new C2254308sP(enumC1153770g87Arr);
    }

    public static EnumC1153770g87[] values() {
        return (EnumC1153770g87[]) LL.clone();
    }

    public static EnumC1153770g87 valueOf(String str) {
        return (EnumC1153770g87) C08FF.LIZ(EnumC1153770g87.class, str);
    }

    public EnumC1153770g87(String str, int i) {
    }
}
