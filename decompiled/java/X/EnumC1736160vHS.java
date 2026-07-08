package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1736160vHS {
    public static final /* synthetic */ EnumC1736160vHS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1736160vHS QUIT_OK;
    public static final EnumC1736160vHS QUIT_WITH_MODIFY;

    public static InterfaceC2044707zh<EnumC1736160vHS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1736160vHS enumC1736160vHS = new EnumC1736160vHS("QUIT_OK", 0);
        QUIT_OK = enumC1736160vHS;
        EnumC1736160vHS enumC1736160vHS2 = new EnumC1736160vHS("QUIT_WITH_MODIFY", 1);
        QUIT_WITH_MODIFY = enumC1736160vHS2;
        EnumC1736160vHS[] enumC1736160vHSArr = {enumC1736160vHS, enumC1736160vHS2};
        LL = enumC1736160vHSArr;
        LLILLJJLI = new C2254308sP(enumC1736160vHSArr);
    }

    public static EnumC1736160vHS[] values() {
        return (EnumC1736160vHS[]) LL.clone();
    }

    public static EnumC1736160vHS valueOf(String str) {
        return (EnumC1736160vHS) C08FF.LIZ(EnumC1736160vHS.class, str);
    }

    public EnumC1736160vHS(String str, int i) {
    }
}
