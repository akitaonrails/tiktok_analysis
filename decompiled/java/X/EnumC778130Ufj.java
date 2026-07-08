package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ufj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC778130Ufj {
    public static final EnumC778130Ufj CHANGE_STATE;
    public static final EnumC778130Ufj HIDE_TIP;
    public static final /* synthetic */ EnumC778130Ufj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC778130Ufj NEW_TIP;
    public static final EnumC778130Ufj RETURN_APP;
    public static final EnumC778130Ufj TIME_OUT;
    public static final EnumC778130Ufj USER_CLICK;

    public static InterfaceC2044707zh<EnumC778130Ufj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC778130Ufj enumC778130Ufj = new EnumC778130Ufj("TIME_OUT", 0);
        TIME_OUT = enumC778130Ufj;
        EnumC778130Ufj enumC778130Ufj2 = new EnumC778130Ufj("NEW_TIP", 1);
        NEW_TIP = enumC778130Ufj2;
        EnumC778130Ufj enumC778130Ufj3 = new EnumC778130Ufj("HIDE_TIP", 2);
        HIDE_TIP = enumC778130Ufj3;
        EnumC778130Ufj enumC778130Ufj4 = new EnumC778130Ufj("USER_CLICK", 3);
        USER_CLICK = enumC778130Ufj4;
        EnumC778130Ufj enumC778130Ufj5 = new EnumC778130Ufj("RETURN_APP", 4);
        RETURN_APP = enumC778130Ufj5;
        EnumC778130Ufj enumC778130Ufj6 = new EnumC778130Ufj("CHANGE_STATE", 5);
        CHANGE_STATE = enumC778130Ufj6;
        EnumC778130Ufj[] enumC778130UfjArr = {enumC778130Ufj, enumC778130Ufj2, enumC778130Ufj3, enumC778130Ufj4, enumC778130Ufj5, enumC778130Ufj6};
        LL = enumC778130UfjArr;
        LLILLJJLI = new C2254308sP(enumC778130UfjArr);
    }

    public static EnumC778130Ufj[] values() {
        return (EnumC778130Ufj[]) LL.clone();
    }

    public static EnumC778130Ufj valueOf(String str) {
        return (EnumC778130Ufj) C08FF.LIZ(EnumC778130Ufj.class, str);
    }

    public EnumC778130Ufj(String str, int i) {
    }
}
