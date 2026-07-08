package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC725960Sdm {
    public static final /* synthetic */ EnumC725960Sdm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC725960Sdm PAGE_HIDE;
    public static final EnumC725960Sdm PAGE_SHOW;
    public static final EnumC725960Sdm RESUME;
    public static final EnumC725960Sdm STOP;
    public static final EnumC725960Sdm TAB_SELECT;
    public static final EnumC725960Sdm TAB_UNSELECT;

    public static InterfaceC2044707zh<EnumC725960Sdm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC725960Sdm enumC725960Sdm = new EnumC725960Sdm("PAGE_SHOW", 0);
        PAGE_SHOW = enumC725960Sdm;
        EnumC725960Sdm enumC725960Sdm2 = new EnumC725960Sdm("PAGE_HIDE", 1);
        PAGE_HIDE = enumC725960Sdm2;
        EnumC725960Sdm enumC725960Sdm3 = new EnumC725960Sdm("TAB_SELECT", 2);
        TAB_SELECT = enumC725960Sdm3;
        EnumC725960Sdm enumC725960Sdm4 = new EnumC725960Sdm("TAB_UNSELECT", 3);
        TAB_UNSELECT = enumC725960Sdm4;
        EnumC725960Sdm enumC725960Sdm5 = new EnumC725960Sdm("STOP", 4);
        STOP = enumC725960Sdm5;
        EnumC725960Sdm enumC725960Sdm6 = new EnumC725960Sdm("RESUME", 5);
        RESUME = enumC725960Sdm6;
        EnumC725960Sdm[] enumC725960SdmArr = {enumC725960Sdm, enumC725960Sdm2, enumC725960Sdm3, enumC725960Sdm4, enumC725960Sdm5, enumC725960Sdm6};
        LL = enumC725960SdmArr;
        LLILLJJLI = new C2254308sP(enumC725960SdmArr);
    }

    public static EnumC725960Sdm[] values() {
        return (EnumC725960Sdm[]) LL.clone();
    }

    public static EnumC725960Sdm valueOf(String str) {
        return (EnumC725960Sdm) C08FF.LIZ(EnumC725960Sdm.class, str);
    }

    public EnumC725960Sdm(String str, int i) {
    }
}
