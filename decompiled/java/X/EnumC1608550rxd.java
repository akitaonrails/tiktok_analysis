package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1608550rxd implements InterfaceC1606880ruw {
    public static final /* synthetic */ EnumC1608550rxd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1608550rxd MUTUAL_FOLLOW;
    public static final EnumC1608550rxd SINGLE_FOLLOW;
    public static final EnumC1608550rxd UNFOLLOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1608550rxd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1608550rxd enumC1608550rxd = new EnumC1608550rxd("UNFOLLOW", 0, "unfollow");
        UNFOLLOW = enumC1608550rxd;
        EnumC1608550rxd enumC1608550rxd2 = new EnumC1608550rxd("SINGLE_FOLLOW", 1, "single_follow");
        SINGLE_FOLLOW = enumC1608550rxd2;
        EnumC1608550rxd enumC1608550rxd3 = new EnumC1608550rxd("MUTUAL_FOLLOW", 2, "mutual_follow");
        MUTUAL_FOLLOW = enumC1608550rxd3;
        EnumC1608550rxd[] enumC1608550rxdArr = {enumC1608550rxd, enumC1608550rxd2, enumC1608550rxd3};
        LLILLJJLI = enumC1608550rxdArr;
        LLILLL = new C2254308sP(enumC1608550rxdArr);
    }

    public static EnumC1608550rxd[] values() {
        return (EnumC1608550rxd[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC1606880ruw
    public String getString() {
        return this.LL;
    }

    public static EnumC1608550rxd valueOf(String str) {
        return (EnumC1608550rxd) C08FF.LIZ(EnumC1608550rxd.class, str);
    }

    public EnumC1608550rxd(String str, int i, String str2) {
        this.LL = str2;
    }
}
