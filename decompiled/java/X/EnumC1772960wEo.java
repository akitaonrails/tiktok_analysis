package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1772960wEo {
    public static final EnumC1772960wEo CACHE;
    public static final EnumC1772960wEo FETCH;
    public static final /* synthetic */ EnumC1772960wEo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1772960wEo OTHER;

    public static InterfaceC2044707zh<EnumC1772960wEo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1772960wEo enumC1772960wEo = new EnumC1772960wEo("CACHE", 0);
        CACHE = enumC1772960wEo;
        EnumC1772960wEo enumC1772960wEo2 = new EnumC1772960wEo("FETCH", 1);
        FETCH = enumC1772960wEo2;
        EnumC1772960wEo enumC1772960wEo3 = new EnumC1772960wEo("OTHER", 2);
        OTHER = enumC1772960wEo3;
        EnumC1772960wEo[] enumC1772960wEoArr = {enumC1772960wEo, enumC1772960wEo2, enumC1772960wEo3};
        LL = enumC1772960wEoArr;
        LLILLJJLI = new C2254308sP(enumC1772960wEoArr);
    }

    public static EnumC1772960wEo[] values() {
        return (EnumC1772960wEo[]) LL.clone();
    }

    public static EnumC1772960wEo valueOf(String str) {
        return (EnumC1772960wEo) C08FF.LIZ(EnumC1772960wEo.class, str);
    }

    public EnumC1772960wEo(String str, int i) {
    }
}
