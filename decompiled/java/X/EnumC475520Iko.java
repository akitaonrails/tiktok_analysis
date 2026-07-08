package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC475520Iko {
    public static final EnumC475520Iko HANGOUT;
    public static final /* synthetic */ EnumC475520Iko[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC475520Iko NEARBY;
    public static final EnumC475520Iko SKYLIGHT;
    public static final EnumC475520Iko SKYLIGHT_WITH_TITLE;

    public static InterfaceC2044707zh<EnumC475520Iko> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC475520Iko enumC475520Iko = new EnumC475520Iko("SKYLIGHT", 0);
        SKYLIGHT = enumC475520Iko;
        EnumC475520Iko enumC475520Iko2 = new EnumC475520Iko("NEARBY", 1);
        NEARBY = enumC475520Iko2;
        EnumC475520Iko enumC475520Iko3 = new EnumC475520Iko("HANGOUT", 2);
        HANGOUT = enumC475520Iko3;
        EnumC475520Iko enumC475520Iko4 = new EnumC475520Iko("SKYLIGHT_WITH_TITLE", 3);
        SKYLIGHT_WITH_TITLE = enumC475520Iko4;
        EnumC475520Iko[] enumC475520IkoArr = {enumC475520Iko, enumC475520Iko2, enumC475520Iko3, enumC475520Iko4};
        LL = enumC475520IkoArr;
        LLILLJJLI = new C2254308sP(enumC475520IkoArr);
    }

    public static EnumC475520Iko[] values() {
        return (EnumC475520Iko[]) LL.clone();
    }

    public static EnumC475520Iko valueOf(String str) {
        return (EnumC475520Iko) C08FF.LIZ(EnumC475520Iko.class, str);
    }

    public EnumC475520Iko(String str, int i) {
    }
}
