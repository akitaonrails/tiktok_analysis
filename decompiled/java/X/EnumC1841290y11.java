package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1841290y11 {
    public static final /* synthetic */ EnumC1841290y11[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1841290y11 Medium;
    public static final EnumC1841290y11 Small;

    public static InterfaceC2044707zh<EnumC1841290y11> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1841290y11 enumC1841290y11 = new EnumC1841290y11("Small", 0);
        Small = enumC1841290y11;
        EnumC1841290y11 enumC1841290y112 = new EnumC1841290y11("Medium", 1);
        Medium = enumC1841290y112;
        EnumC1841290y11[] enumC1841290y11Arr = {enumC1841290y11, enumC1841290y112};
        LL = enumC1841290y11Arr;
        LLILLJJLI = new C2254308sP(enumC1841290y11Arr);
    }

    public static EnumC1841290y11[] values() {
        return (EnumC1841290y11[]) LL.clone();
    }

    public static EnumC1841290y11 valueOf(String str) {
        return (EnumC1841290y11) C08FF.LIZ(EnumC1841290y11.class, str);
    }

    public EnumC1841290y11(String str, int i) {
    }
}
