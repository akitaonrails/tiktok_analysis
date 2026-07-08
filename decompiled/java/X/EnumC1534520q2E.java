package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534520q2E {
    public static final EnumC1534520q2E FALLBACK;
    public static final EnumC1534520q2E I18N;
    public static final /* synthetic */ EnumC1534520q2E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1534520q2E TARGET;

    public static InterfaceC2044707zh<EnumC1534520q2E> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1534520q2E enumC1534520q2E = new EnumC1534520q2E("TARGET", 0);
        TARGET = enumC1534520q2E;
        EnumC1534520q2E enumC1534520q2E2 = new EnumC1534520q2E("FALLBACK", 1);
        FALLBACK = enumC1534520q2E2;
        EnumC1534520q2E enumC1534520q2E3 = new EnumC1534520q2E("I18N", 2);
        I18N = enumC1534520q2E3;
        EnumC1534520q2E[] enumC1534520q2EArr = {enumC1534520q2E, enumC1534520q2E2, enumC1534520q2E3};
        LL = enumC1534520q2EArr;
        LLILLJJLI = new C2254308sP(enumC1534520q2EArr);
    }

    public static EnumC1534520q2E[] values() {
        return (EnumC1534520q2E[]) LL.clone();
    }

    public static EnumC1534520q2E valueOf(String str) {
        return (EnumC1534520q2E) C08FF.LIZ(EnumC1534520q2E.class, str);
    }

    public EnumC1534520q2E(String str, int i) {
    }
}
