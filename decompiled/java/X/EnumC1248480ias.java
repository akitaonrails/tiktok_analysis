package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ias, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1248480ias {
    public static final /* synthetic */ EnumC1248480ias[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1248480ias LOADING;
    public static final EnumC1248480ias ORIGINAL;
    public static final EnumC1248480ias TRANSLATED;

    public static InterfaceC2044707zh<EnumC1248480ias> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1248480ias enumC1248480ias = new EnumC1248480ias("ORIGINAL", 0);
        ORIGINAL = enumC1248480ias;
        EnumC1248480ias enumC1248480ias2 = new EnumC1248480ias("LOADING", 1);
        LOADING = enumC1248480ias2;
        EnumC1248480ias enumC1248480ias3 = new EnumC1248480ias("TRANSLATED", 2);
        TRANSLATED = enumC1248480ias3;
        EnumC1248480ias[] enumC1248480iasArr = {enumC1248480ias, enumC1248480ias2, enumC1248480ias3};
        LL = enumC1248480iasArr;
        LLILLJJLI = new C2254308sP(enumC1248480iasArr);
    }

    public static EnumC1248480ias[] values() {
        return (EnumC1248480ias[]) LL.clone();
    }

    public static EnumC1248480ias valueOf(String str) {
        return (EnumC1248480ias) C08FF.LIZ(EnumC1248480ias.class, str);
    }

    public EnumC1248480ias(String str, int i) {
    }
}
