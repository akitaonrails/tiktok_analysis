package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1119290fEV {
    public static final /* synthetic */ EnumC1119290fEV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1119290fEV SMALL;
    public static final EnumC1119290fEV X_SMALL;

    public static InterfaceC2044707zh<EnumC1119290fEV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1119290fEV enumC1119290fEV = new EnumC1119290fEV("SMALL", 0);
        SMALL = enumC1119290fEV;
        EnumC1119290fEV enumC1119290fEV2 = new EnumC1119290fEV("X_SMALL", 1);
        X_SMALL = enumC1119290fEV2;
        EnumC1119290fEV[] enumC1119290fEVArr = {enumC1119290fEV, enumC1119290fEV2};
        LL = enumC1119290fEVArr;
        LLILLJJLI = new C2254308sP(enumC1119290fEVArr);
    }

    public static EnumC1119290fEV[] values() {
        return (EnumC1119290fEV[]) LL.clone();
    }

    public static EnumC1119290fEV valueOf(String str) {
        return (EnumC1119290fEV) C08FF.LIZ(EnumC1119290fEV.class, str);
    }

    public EnumC1119290fEV(String str, int i) {
    }
}
