package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC442690HXn {
    public static final EnumC442690HXn CREATE_NAME;
    public static final EnumC442690HXn FEED_ORDER;
    public static final /* synthetic */ EnumC442690HXn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC442690HXn MULTI_VIDEO;

    public static InterfaceC2044707zh<EnumC442690HXn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC442690HXn enumC442690HXn = new EnumC442690HXn("CREATE_NAME", 0);
        CREATE_NAME = enumC442690HXn;
        EnumC442690HXn enumC442690HXn2 = new EnumC442690HXn("MULTI_VIDEO", 1);
        MULTI_VIDEO = enumC442690HXn2;
        EnumC442690HXn enumC442690HXn3 = new EnumC442690HXn("FEED_ORDER", 2);
        FEED_ORDER = enumC442690HXn3;
        EnumC442690HXn[] enumC442690HXnArr = {enumC442690HXn, enumC442690HXn2, enumC442690HXn3};
        LL = enumC442690HXnArr;
        LLILLJJLI = new C2254308sP(enumC442690HXnArr);
    }

    public static EnumC442690HXn[] values() {
        return (EnumC442690HXn[]) LL.clone();
    }

    public static EnumC442690HXn valueOf(String str) {
        return (EnumC442690HXn) C08FF.LIZ(EnumC442690HXn.class, str);
    }

    public EnumC442690HXn(String str, int i) {
    }
}
