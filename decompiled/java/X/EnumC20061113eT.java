package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20061113eT implements InterfaceC1679420tnw {
    public static final EnumC20061113eT Active;
    public static final EnumC20061113eT ActiveParent;
    public static final EnumC20061113eT Captured;
    public static final EnumC20061113eT Inactive;
    public static final /* synthetic */ EnumC20061113eT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC20061113eT> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC20061113eT valueOf(String str) {
        return (EnumC20061113eT) C08FF.LIZ(EnumC20061113eT.class, str);
    }

    public static EnumC20061113eT[] values() {
        return (EnumC20061113eT[]) LL.clone();
    }

    static {
        EnumC20061113eT enumC20061113eT = new EnumC20061113eT("Active", 0);
        Active = enumC20061113eT;
        EnumC20061113eT enumC20061113eT2 = new EnumC20061113eT("ActiveParent", 1);
        ActiveParent = enumC20061113eT2;
        EnumC20061113eT enumC20061113eT3 = new EnumC20061113eT("Captured", 2);
        Captured = enumC20061113eT3;
        EnumC20061113eT enumC20061113eT4 = new EnumC20061113eT("Inactive", 3);
        Inactive = enumC20061113eT4;
        EnumC20061113eT[] enumC20061113eTArr = {enumC20061113eT, enumC20061113eT2, enumC20061113eT3, enumC20061113eT4};
        LL = enumC20061113eTArr;
        LLILLJJLI = new C2254308sP(enumC20061113eTArr);
    }

    @Override // X.InterfaceC1679420tnw
    public boolean getHasFocus() {
        int i = C20061413eW.LIZ[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new C1954807lC();
    }

    public boolean isCaptured() {
        int i = C20061413eW.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1679420tnw
    public boolean isFocused() {
        int i = C20061413eW.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new C1954807lC();
    }

    public EnumC20061113eT(String str, int i) {
    }
}
