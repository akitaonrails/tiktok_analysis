package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918860a1E {
    public static final EnumC918860a1E LEGACY;
    public static final /* synthetic */ EnumC918860a1E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918860a1E UNIFIED;

    public static InterfaceC2044707zh<EnumC918860a1E> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918860a1E enumC918860a1E = new EnumC918860a1E("LEGACY", 0);
        LEGACY = enumC918860a1E;
        EnumC918860a1E enumC918860a1E2 = new EnumC918860a1E("UNIFIED", 1);
        UNIFIED = enumC918860a1E2;
        EnumC918860a1E[] enumC918860a1EArr = {enumC918860a1E, enumC918860a1E2};
        LL = enumC918860a1EArr;
        LLILLJJLI = new C2254308sP(enumC918860a1EArr);
    }

    public static EnumC918860a1E[] values() {
        return (EnumC918860a1E[]) LL.clone();
    }

    public static EnumC918860a1E valueOf(String str) {
        return (EnumC918860a1E) C08FF.LIZ(EnumC918860a1E.class, str);
    }

    public EnumC918860a1E(String str, int i) {
    }
}
