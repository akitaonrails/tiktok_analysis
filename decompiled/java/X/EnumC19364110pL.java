package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19364110pL {
    public static final EnumC19364110pL HORIZONTAL_SCROLL_VIEW;
    public static final /* synthetic */ EnumC19364110pL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19364110pL POWER_LIST;
    public static final EnumC19364110pL SINGLE_PHOTO;

    public static InterfaceC2044707zh<EnumC19364110pL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19364110pL enumC19364110pL = new EnumC19364110pL("SINGLE_PHOTO", 0);
        SINGLE_PHOTO = enumC19364110pL;
        EnumC19364110pL enumC19364110pL2 = new EnumC19364110pL("HORIZONTAL_SCROLL_VIEW", 1);
        HORIZONTAL_SCROLL_VIEW = enumC19364110pL2;
        EnumC19364110pL enumC19364110pL3 = new EnumC19364110pL("POWER_LIST", 2);
        POWER_LIST = enumC19364110pL3;
        EnumC19364110pL[] enumC19364110pLArr = {enumC19364110pL, enumC19364110pL2, enumC19364110pL3};
        LL = enumC19364110pLArr;
        LLILLJJLI = new C2254308sP(enumC19364110pLArr);
    }

    public static EnumC19364110pL[] values() {
        return (EnumC19364110pL[]) LL.clone();
    }

    public static EnumC19364110pL valueOf(String str) {
        return (EnumC19364110pL) C08FF.LIZ(EnumC19364110pL.class, str);
    }

    public EnumC19364110pL(String str, int i) {
    }
}
