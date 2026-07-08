package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1737530vJf {
    public static final EnumC1737530vJf ADD;
    public static final /* synthetic */ EnumC1737530vJf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1737530vJf LOADED;
    public static final EnumC1737530vJf LOADING;
    public static final EnumC1737530vJf PLACEHOLDER;

    public static InterfaceC2044707zh<EnumC1737530vJf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1737530vJf enumC1737530vJf = new EnumC1737530vJf("ADD", 0);
        ADD = enumC1737530vJf;
        EnumC1737530vJf enumC1737530vJf2 = new EnumC1737530vJf("LOADING", 1);
        LOADING = enumC1737530vJf2;
        EnumC1737530vJf enumC1737530vJf3 = new EnumC1737530vJf("LOADED", 2);
        LOADED = enumC1737530vJf3;
        EnumC1737530vJf enumC1737530vJf4 = new EnumC1737530vJf("PLACEHOLDER", 3);
        PLACEHOLDER = enumC1737530vJf4;
        EnumC1737530vJf[] enumC1737530vJfArr = {enumC1737530vJf, enumC1737530vJf2, enumC1737530vJf3, enumC1737530vJf4};
        LL = enumC1737530vJfArr;
        LLILLJJLI = new C2254308sP(enumC1737530vJfArr);
    }

    public static EnumC1737530vJf[] values() {
        return (EnumC1737530vJf[]) LL.clone();
    }

    public static EnumC1737530vJf valueOf(String str) {
        return (EnumC1737530vJf) C08FF.LIZ(EnumC1737530vJf.class, str);
    }

    public EnumC1737530vJf(String str, int i) {
    }
}
