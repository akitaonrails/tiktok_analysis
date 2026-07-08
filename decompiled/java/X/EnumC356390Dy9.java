package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356390Dy9 {
    public static final EnumC356390Dy9 APPLY;
    public static final /* synthetic */ EnumC356390Dy9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356390Dy9 REMOVE;

    public static InterfaceC2044707zh<EnumC356390Dy9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356390Dy9 enumC356390Dy9 = new EnumC356390Dy9("APPLY", 0);
        APPLY = enumC356390Dy9;
        EnumC356390Dy9 enumC356390Dy92 = new EnumC356390Dy9("REMOVE", 1);
        REMOVE = enumC356390Dy92;
        EnumC356390Dy9[] enumC356390Dy9Arr = {enumC356390Dy9, enumC356390Dy92};
        LL = enumC356390Dy9Arr;
        LLILLJJLI = new C2254308sP(enumC356390Dy9Arr);
    }

    public static EnumC356390Dy9[] values() {
        return (EnumC356390Dy9[]) LL.clone();
    }

    public static EnumC356390Dy9 valueOf(String str) {
        return (EnumC356390Dy9) C08FF.LIZ(EnumC356390Dy9.class, str);
    }

    public EnumC356390Dy9(String str, int i) {
    }
}
