package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tVL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1667890tVL {

    @InterfaceC1294060jmO
    public static final EnumC1667890tVL Icon;
    public static final EnumC1667890tVL IllustrationL;
    public static final EnumC1667890tVL IllustrationS;
    public static final /* synthetic */ EnumC1667890tVL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1667890tVL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1667890tVL enumC1667890tVL = new EnumC1667890tVL("Icon", 0);
        Icon = enumC1667890tVL;
        EnumC1667890tVL enumC1667890tVL2 = new EnumC1667890tVL("IllustrationS", 1);
        IllustrationS = enumC1667890tVL2;
        EnumC1667890tVL enumC1667890tVL3 = new EnumC1667890tVL("IllustrationL", 2);
        IllustrationL = enumC1667890tVL3;
        EnumC1667890tVL[] enumC1667890tVLArr = {enumC1667890tVL, enumC1667890tVL2, enumC1667890tVL3};
        LL = enumC1667890tVLArr;
        LLILLJJLI = new C2254308sP(enumC1667890tVLArr);
    }

    public static EnumC1667890tVL[] values() {
        return (EnumC1667890tVL[]) LL.clone();
    }

    public static EnumC1667890tVL valueOf(String str) {
        return (EnumC1667890tVL) C08FF.LIZ(EnumC1667890tVL.class, str);
    }

    public EnumC1667890tVL(String str, int i) {
    }
}
