package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1845790y8H {
    public static final EnumC1845790y8H EDIT_FAILURE;
    public static final EnumC1845790y8H EDIT_SUCCESS;
    public static final EnumC1845790y8H LINK_FAILURE;
    public static final EnumC1845790y8H LINK_SUCCESS;
    public static final /* synthetic */ EnumC1845790y8H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1845790y8H UNLINK_FAILURE;
    public static final EnumC1845790y8H UNLINK_SUCCESS;

    public static InterfaceC2044707zh<EnumC1845790y8H> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1845790y8H enumC1845790y8H = new EnumC1845790y8H("LINK_SUCCESS", 0);
        LINK_SUCCESS = enumC1845790y8H;
        EnumC1845790y8H enumC1845790y8H2 = new EnumC1845790y8H("LINK_FAILURE", 1);
        LINK_FAILURE = enumC1845790y8H2;
        EnumC1845790y8H enumC1845790y8H3 = new EnumC1845790y8H("EDIT_SUCCESS", 2);
        EDIT_SUCCESS = enumC1845790y8H3;
        EnumC1845790y8H enumC1845790y8H4 = new EnumC1845790y8H("EDIT_FAILURE", 3);
        EDIT_FAILURE = enumC1845790y8H4;
        EnumC1845790y8H enumC1845790y8H5 = new EnumC1845790y8H("UNLINK_SUCCESS", 4);
        UNLINK_SUCCESS = enumC1845790y8H5;
        EnumC1845790y8H enumC1845790y8H6 = new EnumC1845790y8H("UNLINK_FAILURE", 5);
        UNLINK_FAILURE = enumC1845790y8H6;
        EnumC1845790y8H[] enumC1845790y8HArr = {enumC1845790y8H, enumC1845790y8H2, enumC1845790y8H3, enumC1845790y8H4, enumC1845790y8H5, enumC1845790y8H6};
        LL = enumC1845790y8HArr;
        LLILLJJLI = new C2254308sP(enumC1845790y8HArr);
    }

    public static EnumC1845790y8H[] values() {
        return (EnumC1845790y8H[]) LL.clone();
    }

    public static EnumC1845790y8H valueOf(String str) {
        return (EnumC1845790y8H) C08FF.LIZ(EnumC1845790y8H.class, str);
    }

    public EnumC1845790y8H(String str, int i) {
    }
}
