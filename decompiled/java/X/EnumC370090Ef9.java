package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ef9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC370090Ef9 {
    public static final EnumC370090Ef9 LEFT;
    public static final /* synthetic */ EnumC370090Ef9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC370090Ef9 RIGHT;

    public static InterfaceC2044707zh<EnumC370090Ef9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC370090Ef9 enumC370090Ef9 = new EnumC370090Ef9("LEFT", 0);
        LEFT = enumC370090Ef9;
        EnumC370090Ef9 enumC370090Ef92 = new EnumC370090Ef9("RIGHT", 1);
        RIGHT = enumC370090Ef92;
        EnumC370090Ef9[] enumC370090Ef9Arr = {enumC370090Ef9, enumC370090Ef92};
        LL = enumC370090Ef9Arr;
        LLILLJJLI = new C2254308sP(enumC370090Ef9Arr);
    }

    public static EnumC370090Ef9[] values() {
        return (EnumC370090Ef9[]) LL.clone();
    }

    public static EnumC370090Ef9 valueOf(String str) {
        return (EnumC370090Ef9) C08FF.LIZ(EnumC370090Ef9.class, str);
    }

    public EnumC370090Ef9(String str, int i) {
    }
}
