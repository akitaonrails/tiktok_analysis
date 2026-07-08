package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1191300h6e {
    public static final EnumC1191300h6e AFTER_POST;
    public static final EnumC1191300h6e DETAIL;
    public static final EnumC1191300h6e LANDING;
    public static final /* synthetic */ EnumC1191300h6e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1191300h6e PROFILE;

    public static InterfaceC2044707zh<EnumC1191300h6e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1191300h6e enumC1191300h6e = new EnumC1191300h6e("AFTER_POST", 0);
        AFTER_POST = enumC1191300h6e;
        EnumC1191300h6e enumC1191300h6e2 = new EnumC1191300h6e("LANDING", 1);
        LANDING = enumC1191300h6e2;
        EnumC1191300h6e enumC1191300h6e3 = new EnumC1191300h6e("PROFILE", 2);
        PROFILE = enumC1191300h6e3;
        EnumC1191300h6e enumC1191300h6e4 = new EnumC1191300h6e("DETAIL", 3);
        DETAIL = enumC1191300h6e4;
        EnumC1191300h6e[] enumC1191300h6eArr = {enumC1191300h6e, enumC1191300h6e2, enumC1191300h6e3, enumC1191300h6e4};
        LL = enumC1191300h6eArr;
        LLILLJJLI = new C2254308sP(enumC1191300h6eArr);
    }

    public static EnumC1191300h6e[] values() {
        return (EnumC1191300h6e[]) LL.clone();
    }

    public static EnumC1191300h6e valueOf(String str) {
        return (EnumC1191300h6e) C08FF.LIZ(EnumC1191300h6e.class, str);
    }

    public EnumC1191300h6e(String str, int i) {
    }
}
