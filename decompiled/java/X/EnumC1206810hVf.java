package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1206810hVf {
    public static final EnumC1206810hVf GROUP;
    public static final /* synthetic */ EnumC1206810hVf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1206810hVf PRIVATE;

    public static InterfaceC2044707zh<EnumC1206810hVf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1206810hVf enumC1206810hVf = new EnumC1206810hVf("GROUP", 0);
        GROUP = enumC1206810hVf;
        EnumC1206810hVf enumC1206810hVf2 = new EnumC1206810hVf("PRIVATE", 1);
        PRIVATE = enumC1206810hVf2;
        EnumC1206810hVf[] enumC1206810hVfArr = {enumC1206810hVf, enumC1206810hVf2};
        LL = enumC1206810hVfArr;
        LLILLJJLI = new C2254308sP(enumC1206810hVfArr);
    }

    public static EnumC1206810hVf[] values() {
        return (EnumC1206810hVf[]) LL.clone();
    }

    public static EnumC1206810hVf valueOf(String str) {
        return (EnumC1206810hVf) C08FF.LIZ(EnumC1206810hVf.class, str);
    }

    public EnumC1206810hVf(String str, int i) {
    }
}
