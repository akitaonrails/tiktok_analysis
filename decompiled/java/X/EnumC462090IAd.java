package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC462090IAd {
    public static final EnumC462090IAd FAVOURITE;
    public static final EnumC462090IAd LIKE;
    public static final /* synthetic */ EnumC462090IAd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC462090IAd NONE;
    public static final EnumC462090IAd REPOST;

    public static InterfaceC2044707zh<EnumC462090IAd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC462090IAd enumC462090IAd = new EnumC462090IAd("NONE", 0);
        NONE = enumC462090IAd;
        EnumC462090IAd enumC462090IAd2 = new EnumC462090IAd("LIKE", 1);
        LIKE = enumC462090IAd2;
        EnumC462090IAd enumC462090IAd3 = new EnumC462090IAd("FAVOURITE", 2);
        FAVOURITE = enumC462090IAd3;
        EnumC462090IAd enumC462090IAd4 = new EnumC462090IAd("REPOST", 3);
        REPOST = enumC462090IAd4;
        EnumC462090IAd[] enumC462090IAdArr = {enumC462090IAd, enumC462090IAd2, enumC462090IAd3, enumC462090IAd4};
        LL = enumC462090IAdArr;
        LLILLJJLI = new C2254308sP(enumC462090IAdArr);
    }

    public static EnumC462090IAd[] values() {
        return (EnumC462090IAd[]) LL.clone();
    }

    public static EnumC462090IAd valueOf(String str) {
        return (EnumC462090IAd) C08FF.LIZ(EnumC462090IAd.class, str);
    }

    public EnumC462090IAd(String str, int i) {
    }
}
