package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994750bzd {
    public static final EnumC994750bzd HIDE;
    public static final /* synthetic */ EnumC994750bzd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994750bzd SHOW;

    public static InterfaceC2044707zh<EnumC994750bzd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994750bzd enumC994750bzd = new EnumC994750bzd("SHOW", 0);
        SHOW = enumC994750bzd;
        EnumC994750bzd enumC994750bzd2 = new EnumC994750bzd("HIDE", 1);
        HIDE = enumC994750bzd2;
        EnumC994750bzd[] enumC994750bzdArr = {enumC994750bzd, enumC994750bzd2};
        LL = enumC994750bzdArr;
        LLILLJJLI = new C2254308sP(enumC994750bzdArr);
    }

    public static EnumC994750bzd[] values() {
        return (EnumC994750bzd[]) LL.clone();
    }

    public static EnumC994750bzd valueOf(String str) {
        return (EnumC994750bzd) C08FF.LIZ(EnumC994750bzd.class, str);
    }

    public EnumC994750bzd(String str, int i) {
    }
}
