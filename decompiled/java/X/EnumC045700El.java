package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC045700El {
    public static final EnumC045700El ALL;
    public static final /* synthetic */ EnumC045700El[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC045700El NONE;
    public static final EnumC045700El ONLY_SUCCESS;

    public static InterfaceC2044707zh<EnumC045700El> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC045700El enumC045700El = new EnumC045700El("NONE", 0);
        NONE = enumC045700El;
        EnumC045700El enumC045700El2 = new EnumC045700El("ALL", 1);
        ALL = enumC045700El2;
        EnumC045700El enumC045700El3 = new EnumC045700El("ONLY_SUCCESS", 2);
        ONLY_SUCCESS = enumC045700El3;
        EnumC045700El[] enumC045700ElArr = {enumC045700El, enumC045700El2, enumC045700El3};
        LL = enumC045700ElArr;
        LLILLJJLI = new C2254308sP(enumC045700ElArr);
    }

    public static EnumC045700El[] values() {
        return (EnumC045700El[]) LL.clone();
    }

    public static EnumC045700El valueOf(String str) {
        return (EnumC045700El) C08FF.LIZ(EnumC045700El.class, str);
    }

    public EnumC045700El(String str, int i) {
    }
}
