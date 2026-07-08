package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993680bxu {
    public static final /* synthetic */ EnumC993680bxu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993680bxu PROFILE_TAB_REPOSTED_LIST;
    public static final EnumC993680bxu REPOSTED_LIST;

    public static InterfaceC2044707zh<EnumC993680bxu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993680bxu enumC993680bxu = new EnumC993680bxu("PROFILE_TAB_REPOSTED_LIST", 0);
        PROFILE_TAB_REPOSTED_LIST = enumC993680bxu;
        EnumC993680bxu enumC993680bxu2 = new EnumC993680bxu("REPOSTED_LIST", 1);
        REPOSTED_LIST = enumC993680bxu2;
        EnumC993680bxu[] enumC993680bxuArr = {enumC993680bxu, enumC993680bxu2};
        LL = enumC993680bxuArr;
        LLILLJJLI = new C2254308sP(enumC993680bxuArr);
    }

    public static EnumC993680bxu[] values() {
        return (EnumC993680bxu[]) LL.clone();
    }

    public static EnumC993680bxu valueOf(String str) {
        return (EnumC993680bxu) C08FF.LIZ(EnumC993680bxu.class, str);
    }

    public EnumC993680bxu(String str, int i) {
    }
}
