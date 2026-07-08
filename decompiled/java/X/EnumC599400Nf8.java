package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599400Nf8 {
    public static final /* synthetic */ EnumC599400Nf8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599400Nf8 LYNX;
    public static final EnumC599400Nf8 NATIVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599400Nf8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599400Nf8 enumC599400Nf8 = new EnumC599400Nf8("NATIVE", 0, "native");
        NATIVE = enumC599400Nf8;
        EnumC599400Nf8 enumC599400Nf82 = new EnumC599400Nf8("LYNX", 1, "lynx");
        LYNX = enumC599400Nf82;
        EnumC599400Nf8[] enumC599400Nf8Arr = {enumC599400Nf8, enumC599400Nf82};
        LLILLJJLI = enumC599400Nf8Arr;
        LLILLL = new C2254308sP(enumC599400Nf8Arr);
    }

    public static EnumC599400Nf8[] values() {
        return (EnumC599400Nf8[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static EnumC599400Nf8 valueOf(String str) {
        return (EnumC599400Nf8) C08FF.LIZ(EnumC599400Nf8.class, str);
    }

    public EnumC599400Nf8(String str, int i, String str2) {
        this.LL = str2;
    }
}
