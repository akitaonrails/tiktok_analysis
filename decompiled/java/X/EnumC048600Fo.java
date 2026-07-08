package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC048600Fo {
    public static final EnumC048600Fo HOMEPAGE_OTHER_PROFILE;
    public static final EnumC048600Fo HOMEPAGE_SELF_PROFILE;
    public static final /* synthetic */ EnumC048600Fo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC048600Fo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC048600Fo enumC048600Fo = new EnumC048600Fo("HOMEPAGE_OTHER_PROFILE", 0);
        HOMEPAGE_OTHER_PROFILE = enumC048600Fo;
        EnumC048600Fo enumC048600Fo2 = new EnumC048600Fo("HOMEPAGE_SELF_PROFILE", 1);
        HOMEPAGE_SELF_PROFILE = enumC048600Fo2;
        EnumC048600Fo[] enumC048600FoArr = {enumC048600Fo, enumC048600Fo2};
        LL = enumC048600FoArr;
        LLILLJJLI = new C2254308sP(enumC048600FoArr);
    }

    public static EnumC048600Fo[] values() {
        return (EnumC048600Fo[]) LL.clone();
    }

    public static EnumC048600Fo valueOf(String str) {
        return (EnumC048600Fo) C08FF.LIZ(EnumC048600Fo.class, str);
    }

    public EnumC048600Fo(String str, int i) {
    }
}
