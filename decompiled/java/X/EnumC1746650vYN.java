package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1746650vYN {
    public static final EnumC1746650vYN ADD;
    public static final EnumC1746650vYN EDIT;
    public static final /* synthetic */ EnumC1746650vYN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1746650vYN MODIFY;

    public static InterfaceC2044707zh<EnumC1746650vYN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1746650vYN enumC1746650vYN = new EnumC1746650vYN("ADD", 0);
        ADD = enumC1746650vYN;
        EnumC1746650vYN enumC1746650vYN2 = new EnumC1746650vYN("EDIT", 1);
        EDIT = enumC1746650vYN2;
        EnumC1746650vYN enumC1746650vYN3 = new EnumC1746650vYN("MODIFY", 2);
        MODIFY = enumC1746650vYN3;
        EnumC1746650vYN[] enumC1746650vYNArr = {enumC1746650vYN, enumC1746650vYN2, enumC1746650vYN3};
        LL = enumC1746650vYNArr;
        LLILLJJLI = new C2254308sP(enumC1746650vYNArr);
    }

    public static EnumC1746650vYN[] values() {
        return (EnumC1746650vYN[]) LL.clone();
    }

    public final String type() {
        int i = C1746900vYm.LIZ[ordinal()];
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "edit";
        }
        if (i == 3) {
            return "modify";
        }
        throw new C1954807lC();
    }

    public static EnumC1746650vYN valueOf(String str) {
        return (EnumC1746650vYN) C08FF.LIZ(EnumC1746650vYN.class, str);
    }

    public EnumC1746650vYN(String str, int i) {
    }
}
