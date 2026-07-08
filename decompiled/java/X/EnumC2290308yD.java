package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2290308yD {
    public static final /* synthetic */ EnumC2290308yD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2290308yD MULTI_SELECT_PHOTO;
    public static final EnumC2290308yD NONE;
    public static final EnumC2290308yD SINGLE_SELECT_PHOTO;

    public static InterfaceC2044707zh<EnumC2290308yD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2290308yD enumC2290308yD = new EnumC2290308yD("NONE", 0);
        NONE = enumC2290308yD;
        EnumC2290308yD enumC2290308yD2 = new EnumC2290308yD("MULTI_SELECT_PHOTO", 1);
        MULTI_SELECT_PHOTO = enumC2290308yD2;
        EnumC2290308yD enumC2290308yD3 = new EnumC2290308yD("SINGLE_SELECT_PHOTO", 2);
        SINGLE_SELECT_PHOTO = enumC2290308yD3;
        EnumC2290308yD[] enumC2290308yDArr = {enumC2290308yD, enumC2290308yD2, enumC2290308yD3};
        LL = enumC2290308yDArr;
        LLILLJJLI = new C2254308sP(enumC2290308yDArr);
    }

    public static EnumC2290308yD[] values() {
        return (EnumC2290308yD[]) LL.clone();
    }

    public static EnumC2290308yD valueOf(String str) {
        return (EnumC2290308yD) C08FF.LIZ(EnumC2290308yD.class, str);
    }

    public EnumC2290308yD(String str, int i) {
    }
}
