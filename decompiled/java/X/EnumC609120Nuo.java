package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC609120Nuo {
    public static final /* synthetic */ EnumC609120Nuo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC609120Nuo UPVOTE_GUIDE;
    public static final EnumC609120Nuo UPVOTE_INFO;
    public static final EnumC609120Nuo UPVOTE_INFO_NEW_STYLE;

    public static InterfaceC2044707zh<EnumC609120Nuo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC609120Nuo enumC609120Nuo = new EnumC609120Nuo("UPVOTE_GUIDE", 0);
        UPVOTE_GUIDE = enumC609120Nuo;
        EnumC609120Nuo enumC609120Nuo2 = new EnumC609120Nuo("UPVOTE_INFO", 1);
        UPVOTE_INFO = enumC609120Nuo2;
        EnumC609120Nuo enumC609120Nuo3 = new EnumC609120Nuo("UPVOTE_INFO_NEW_STYLE", 2);
        UPVOTE_INFO_NEW_STYLE = enumC609120Nuo3;
        EnumC609120Nuo[] enumC609120NuoArr = {enumC609120Nuo, enumC609120Nuo2, enumC609120Nuo3};
        LL = enumC609120NuoArr;
        LLILLJJLI = new C2254308sP(enumC609120NuoArr);
    }

    public static EnumC609120Nuo[] values() {
        return (EnumC609120Nuo[]) LL.clone();
    }

    public static EnumC609120Nuo valueOf(String str) {
        return (EnumC609120Nuo) C08FF.LIZ(EnumC609120Nuo.class, str);
    }

    public EnumC609120Nuo(String str, int i) {
    }
}
