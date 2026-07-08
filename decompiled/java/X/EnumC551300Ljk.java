package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ljk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551300Ljk {
    public static final EnumC551300Ljk GENERATING;
    public static final EnumC551300Ljk IS_VIRTUAL_CAMEO;
    public static final /* synthetic */ EnumC551300Ljk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC551300Ljk NOT_IN_EXP;
    public static final EnumC551300Ljk NO_CAMEO_CAN_INVITE;
    public static final EnumC551300Ljk NO_CAMEO_DISABLE_INVITE;
    public static final EnumC551300Ljk NO_CAMEO_INVITED;
    public static final EnumC551300Ljk NO_PERMISSION;

    public static InterfaceC2044707zh<EnumC551300Ljk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC551300Ljk enumC551300Ljk = new EnumC551300Ljk("GENERATING", 0);
        GENERATING = enumC551300Ljk;
        EnumC551300Ljk enumC551300Ljk2 = new EnumC551300Ljk("NO_PERMISSION", 1);
        NO_PERMISSION = enumC551300Ljk2;
        EnumC551300Ljk enumC551300Ljk3 = new EnumC551300Ljk("NO_CAMEO_INVITED", 2);
        NO_CAMEO_INVITED = enumC551300Ljk3;
        EnumC551300Ljk enumC551300Ljk4 = new EnumC551300Ljk("NO_CAMEO_CAN_INVITE", 3);
        NO_CAMEO_CAN_INVITE = enumC551300Ljk4;
        EnumC551300Ljk enumC551300Ljk5 = new EnumC551300Ljk("NO_CAMEO_DISABLE_INVITE", 4);
        NO_CAMEO_DISABLE_INVITE = enumC551300Ljk5;
        EnumC551300Ljk enumC551300Ljk6 = new EnumC551300Ljk("NOT_IN_EXP", 5);
        NOT_IN_EXP = enumC551300Ljk6;
        EnumC551300Ljk enumC551300Ljk7 = new EnumC551300Ljk("IS_VIRTUAL_CAMEO", 6);
        IS_VIRTUAL_CAMEO = enumC551300Ljk7;
        EnumC551300Ljk[] enumC551300LjkArr = {enumC551300Ljk, enumC551300Ljk2, enumC551300Ljk3, enumC551300Ljk4, enumC551300Ljk5, enumC551300Ljk6, enumC551300Ljk7};
        LL = enumC551300LjkArr;
        LLILLJJLI = new C2254308sP(enumC551300LjkArr);
    }

    public static EnumC551300Ljk[] values() {
        return (EnumC551300Ljk[]) LL.clone();
    }

    public static EnumC551300Ljk valueOf(String str) {
        return (EnumC551300Ljk) C08FF.LIZ(EnumC551300Ljk.class, str);
    }

    public EnumC551300Ljk(String str, int i) {
    }
}
