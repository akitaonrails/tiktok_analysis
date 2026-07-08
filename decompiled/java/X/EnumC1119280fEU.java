package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1119280fEU {
    public static final /* synthetic */ EnumC1119280fEU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1119280fEU REGULAR;
    public static final EnumC1119280fEU THICK;

    public static InterfaceC2044707zh<EnumC1119280fEU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1119280fEU enumC1119280fEU = new EnumC1119280fEU("REGULAR", 0);
        REGULAR = enumC1119280fEU;
        EnumC1119280fEU enumC1119280fEU2 = new EnumC1119280fEU("THICK", 1);
        THICK = enumC1119280fEU2;
        EnumC1119280fEU[] enumC1119280fEUArr = {enumC1119280fEU, enumC1119280fEU2};
        LL = enumC1119280fEUArr;
        LLILLJJLI = new C2254308sP(enumC1119280fEUArr);
    }

    public static EnumC1119280fEU[] values() {
        return (EnumC1119280fEU[]) LL.clone();
    }

    public static EnumC1119280fEU valueOf(String str) {
        return (EnumC1119280fEU) C08FF.LIZ(EnumC1119280fEU.class, str);
    }

    public EnumC1119280fEU(String str, int i) {
    }
}
