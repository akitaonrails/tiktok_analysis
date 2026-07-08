package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1119730fFD {
    public static final EnumC1119730fFD ATTR;
    public static final EnumC1119730fFD DRAWABLE;
    public static final EnumC1119730fFD GECKO;
    public static final /* synthetic */ EnumC1119730fFD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1119730fFD REMOTE;

    public static InterfaceC2044707zh<EnumC1119730fFD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1119730fFD enumC1119730fFD = new EnumC1119730fFD("ATTR", 0);
        ATTR = enumC1119730fFD;
        EnumC1119730fFD enumC1119730fFD2 = new EnumC1119730fFD("GECKO", 1);
        GECKO = enumC1119730fFD2;
        EnumC1119730fFD enumC1119730fFD3 = new EnumC1119730fFD("REMOTE", 2);
        REMOTE = enumC1119730fFD3;
        EnumC1119730fFD enumC1119730fFD4 = new EnumC1119730fFD("DRAWABLE", 3);
        DRAWABLE = enumC1119730fFD4;
        EnumC1119730fFD[] enumC1119730fFDArr = {enumC1119730fFD, enumC1119730fFD2, enumC1119730fFD3, enumC1119730fFD4};
        LL = enumC1119730fFDArr;
        LLILLJJLI = new C2254308sP(enumC1119730fFDArr);
    }

    public static EnumC1119730fFD[] values() {
        return (EnumC1119730fFD[]) LL.clone();
    }

    public static EnumC1119730fFD valueOf(String str) {
        return (EnumC1119730fFD) C08FF.LIZ(EnumC1119730fFD.class, str);
    }

    public EnumC1119730fFD(String str, int i) {
    }
}
