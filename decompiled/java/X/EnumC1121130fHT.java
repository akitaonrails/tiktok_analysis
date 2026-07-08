package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1121130fHT {
    public static final EnumC1121130fHT BUBBLE;
    public static final EnumC1121130fHT DETAIL_PAGE;
    public static final /* synthetic */ EnumC1121130fHT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1121130fHT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1121130fHT enumC1121130fHT = new EnumC1121130fHT("BUBBLE", 0);
        BUBBLE = enumC1121130fHT;
        EnumC1121130fHT enumC1121130fHT2 = new EnumC1121130fHT("DETAIL_PAGE", 1);
        DETAIL_PAGE = enumC1121130fHT2;
        EnumC1121130fHT[] enumC1121130fHTArr = {enumC1121130fHT, enumC1121130fHT2};
        LL = enumC1121130fHTArr;
        LLILLJJLI = new C2254308sP(enumC1121130fHTArr);
    }

    public static EnumC1121130fHT[] values() {
        return (EnumC1121130fHT[]) LL.clone();
    }

    public static EnumC1121130fHT valueOf(String str) {
        return (EnumC1121130fHT) C08FF.LIZ(EnumC1121130fHT.class, str);
    }

    public EnumC1121130fHT(String str, int i) {
    }
}
