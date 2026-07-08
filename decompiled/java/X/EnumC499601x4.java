package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC499601x4 {
    public static final /* synthetic */ EnumC499601x4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC499601x4 TYPE_CHANGE;
    public static final EnumC499601x4 TYPE_END;
    public static final EnumC499601x4 TYPE_START;
    public static final EnumC499601x4 TYPE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC499601x4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC499601x4 enumC499601x4 = new EnumC499601x4("TYPE_UNKNOWN", 0);
        TYPE_UNKNOWN = enumC499601x4;
        EnumC499601x4 enumC499601x42 = new EnumC499601x4("TYPE_START", 1);
        TYPE_START = enumC499601x42;
        EnumC499601x4 enumC499601x43 = new EnumC499601x4("TYPE_CHANGE", 2);
        TYPE_CHANGE = enumC499601x43;
        EnumC499601x4 enumC499601x44 = new EnumC499601x4("TYPE_END", 3);
        TYPE_END = enumC499601x44;
        EnumC499601x4[] enumC499601x4Arr = {enumC499601x4, enumC499601x42, enumC499601x43, enumC499601x44};
        LL = enumC499601x4Arr;
        LLILLJJLI = new C2254308sP(enumC499601x4Arr);
    }

    public static EnumC499601x4[] values() {
        return (EnumC499601x4[]) LL.clone();
    }

    public static EnumC499601x4 valueOf(String str) {
        return (EnumC499601x4) C08FF.LIZ(EnumC499601x4.class, str);
    }

    public EnumC499601x4(String str, int i) {
    }
}
