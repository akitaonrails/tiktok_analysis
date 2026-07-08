package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538340L9k {
    public static final EnumC538340L9k H5;
    public static final /* synthetic */ EnumC538340L9k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC538340L9k OTHER;
    public static final EnumC538340L9k TAB;

    public static InterfaceC2044707zh<EnumC538340L9k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC538340L9k enumC538340L9k = new EnumC538340L9k("H5", 0);
        H5 = enumC538340L9k;
        EnumC538340L9k enumC538340L9k2 = new EnumC538340L9k("TAB", 1);
        TAB = enumC538340L9k2;
        EnumC538340L9k enumC538340L9k3 = new EnumC538340L9k("OTHER", 2);
        OTHER = enumC538340L9k3;
        EnumC538340L9k[] enumC538340L9kArr = {enumC538340L9k, enumC538340L9k2, enumC538340L9k3};
        LL = enumC538340L9kArr;
        LLILLJJLI = new C2254308sP(enumC538340L9kArr);
    }

    public static EnumC538340L9k[] values() {
        return (EnumC538340L9k[]) LL.clone();
    }

    public static EnumC538340L9k valueOf(String str) {
        return (EnumC538340L9k) C08FF.LIZ(EnumC538340L9k.class, str);
    }

    public EnumC538340L9k(String str, int i) {
    }
}
