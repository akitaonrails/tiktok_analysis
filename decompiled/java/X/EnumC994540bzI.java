package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994540bzI {
    public static final EnumC994540bzI DESIGN;
    public static final /* synthetic */ EnumC994540bzI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994540bzI NORMAL;

    public static InterfaceC2044707zh<EnumC994540bzI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994540bzI enumC994540bzI = new EnumC994540bzI("NORMAL", 0);
        NORMAL = enumC994540bzI;
        EnumC994540bzI enumC994540bzI2 = new EnumC994540bzI("DESIGN", 1);
        DESIGN = enumC994540bzI2;
        EnumC994540bzI[] enumC994540bzIArr = {enumC994540bzI, enumC994540bzI2};
        LL = enumC994540bzIArr;
        LLILLJJLI = new C2254308sP(enumC994540bzIArr);
    }

    public static EnumC994540bzI[] values() {
        return (EnumC994540bzI[]) LL.clone();
    }

    public static EnumC994540bzI valueOf(String str) {
        return (EnumC994540bzI) C08FF.LIZ(EnumC994540bzI.class, str);
    }

    public EnumC994540bzI(String str, int i) {
    }
}
