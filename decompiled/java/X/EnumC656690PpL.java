package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656690PpL {
    public static final EnumC656690PpL AUTHOR_AVATAR;
    public static final EnumC656690PpL AUTHOR_NAME;
    public static final EnumC656690PpL DESC;
    public static final EnumC656690PpL LIKE;
    public static final /* synthetic */ EnumC656690PpL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC656690PpL ROOT_AREA;
    public static final EnumC656690PpL VIDEO;

    public static InterfaceC2044707zh<EnumC656690PpL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC656690PpL enumC656690PpL = new EnumC656690PpL("VIDEO", 0);
        VIDEO = enumC656690PpL;
        EnumC656690PpL enumC656690PpL2 = new EnumC656690PpL("DESC", 1);
        DESC = enumC656690PpL2;
        EnumC656690PpL enumC656690PpL3 = new EnumC656690PpL("AUTHOR_AVATAR", 2);
        AUTHOR_AVATAR = enumC656690PpL3;
        EnumC656690PpL enumC656690PpL4 = new EnumC656690PpL("AUTHOR_NAME", 3);
        AUTHOR_NAME = enumC656690PpL4;
        EnumC656690PpL enumC656690PpL5 = new EnumC656690PpL("LIKE", 4);
        LIKE = enumC656690PpL5;
        EnumC656690PpL enumC656690PpL6 = new EnumC656690PpL("ROOT_AREA", 5);
        ROOT_AREA = enumC656690PpL6;
        EnumC656690PpL[] enumC656690PpLArr = {enumC656690PpL, enumC656690PpL2, enumC656690PpL3, enumC656690PpL4, enumC656690PpL5, enumC656690PpL6};
        LL = enumC656690PpLArr;
        LLILLJJLI = new C2254308sP(enumC656690PpLArr);
    }

    public static EnumC656690PpL[] values() {
        return (EnumC656690PpL[]) LL.clone();
    }

    public static EnumC656690PpL valueOf(String str) {
        return (EnumC656690PpL) C08FF.LIZ(EnumC656690PpL.class, str);
    }

    public EnumC656690PpL(String str, int i) {
    }
}
