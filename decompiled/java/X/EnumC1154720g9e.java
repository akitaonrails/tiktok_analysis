package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154720g9e {
    public static final EnumC1154720g9e BUILTIN;
    public static final EnumC1154720g9e CDN;
    public static final EnumC1154720g9e GECKO;
    public static final /* synthetic */ EnumC1154720g9e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154720g9e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154720g9e enumC1154720g9e = new EnumC1154720g9e("GECKO", 0);
        GECKO = enumC1154720g9e;
        EnumC1154720g9e enumC1154720g9e2 = new EnumC1154720g9e("BUILTIN", 1);
        BUILTIN = enumC1154720g9e2;
        EnumC1154720g9e enumC1154720g9e3 = new EnumC1154720g9e("CDN", 2);
        CDN = enumC1154720g9e3;
        EnumC1154720g9e[] enumC1154720g9eArr = {enumC1154720g9e, enumC1154720g9e2, enumC1154720g9e3};
        LL = enumC1154720g9eArr;
        LLILLJJLI = new C2254308sP(enumC1154720g9eArr);
    }

    public static EnumC1154720g9e[] values() {
        return (EnumC1154720g9e[]) LL.clone();
    }

    public static EnumC1154720g9e valueOf(String str) {
        return (EnumC1154720g9e) C08FF.LIZ(EnumC1154720g9e.class, str);
    }

    public EnumC1154720g9e(String str, int i) {
    }
}
