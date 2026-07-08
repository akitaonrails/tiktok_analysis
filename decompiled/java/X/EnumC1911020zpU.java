package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1911020zpU {
    public static final EnumC1911020zpU DONATE;
    public static final EnumC1911020zpU DONOR_LIST;
    public static final EnumC1911020zpU EDIT;
    public static final EnumC1911020zpU FUNDRAISER;
    public static final /* synthetic */ EnumC1911020zpU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1911020zpU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1911020zpU enumC1911020zpU = new EnumC1911020zpU("FUNDRAISER", 0);
        FUNDRAISER = enumC1911020zpU;
        EnumC1911020zpU enumC1911020zpU2 = new EnumC1911020zpU("DONOR_LIST", 1);
        DONOR_LIST = enumC1911020zpU2;
        EnumC1911020zpU enumC1911020zpU3 = new EnumC1911020zpU("EDIT", 2);
        EDIT = enumC1911020zpU3;
        EnumC1911020zpU enumC1911020zpU4 = new EnumC1911020zpU("DONATE", 3);
        DONATE = enumC1911020zpU4;
        EnumC1911020zpU[] enumC1911020zpUArr = {enumC1911020zpU, enumC1911020zpU2, enumC1911020zpU3, enumC1911020zpU4};
        LL = enumC1911020zpUArr;
        LLILLJJLI = new C2254308sP(enumC1911020zpUArr);
    }

    public static EnumC1911020zpU[] values() {
        return (EnumC1911020zpU[]) LL.clone();
    }

    public static EnumC1911020zpU valueOf(String str) {
        return (EnumC1911020zpU) C08FF.LIZ(EnumC1911020zpU.class, str);
    }

    public EnumC1911020zpU(String str, int i) {
    }
}
