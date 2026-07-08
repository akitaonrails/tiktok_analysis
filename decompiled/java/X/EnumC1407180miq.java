package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0miq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1407180miq {
    public static final EnumC1407180miq ERROR;
    public static final /* synthetic */ EnumC1407180miq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1407180miq LOADING;
    public static final EnumC1407180miq SHOW_ORIGINAL;
    public static final EnumC1407180miq SHOW_TRANSLATION;
    public static final EnumC1407180miq TRANSLATING;

    public static InterfaceC2044707zh<EnumC1407180miq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1407180miq enumC1407180miq = new EnumC1407180miq("ERROR", 0);
        ERROR = enumC1407180miq;
        EnumC1407180miq enumC1407180miq2 = new EnumC1407180miq("SHOW_TRANSLATION", 1);
        SHOW_TRANSLATION = enumC1407180miq2;
        EnumC1407180miq enumC1407180miq3 = new EnumC1407180miq("TRANSLATING", 2);
        TRANSLATING = enumC1407180miq3;
        EnumC1407180miq enumC1407180miq4 = new EnumC1407180miq("SHOW_ORIGINAL", 3);
        SHOW_ORIGINAL = enumC1407180miq4;
        EnumC1407180miq enumC1407180miq5 = new EnumC1407180miq("LOADING", 4);
        LOADING = enumC1407180miq5;
        EnumC1407180miq[] enumC1407180miqArr = {enumC1407180miq, enumC1407180miq2, enumC1407180miq3, enumC1407180miq4, enumC1407180miq5};
        LL = enumC1407180miqArr;
        LLILLJJLI = new C2254308sP(enumC1407180miqArr);
    }

    public static EnumC1407180miq[] values() {
        return (EnumC1407180miq[]) LL.clone();
    }

    public static EnumC1407180miq valueOf(String str) {
        return (EnumC1407180miq) C08FF.LIZ(EnumC1407180miq.class, str);
    }

    public EnumC1407180miq(String str, int i) {
    }
}
