package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440870HQn {
    public static final EnumC440870HQn ANIMATED;
    public static final /* synthetic */ EnumC440870HQn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440870HQn STATIC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440870HQn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440870HQn enumC440870HQn = new EnumC440870HQn("STATIC", 0, "static");
        STATIC = enumC440870HQn;
        EnumC440870HQn enumC440870HQn2 = new EnumC440870HQn("ANIMATED", 1, "animated");
        ANIMATED = enumC440870HQn2;
        EnumC440870HQn[] enumC440870HQnArr = {enumC440870HQn, enumC440870HQn2};
        LLILLJJLI = enumC440870HQnArr;
        LLILLL = new C2254308sP(enumC440870HQnArr);
    }

    public static EnumC440870HQn[] values() {
        return (EnumC440870HQn[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440870HQn valueOf(String str) {
        return (EnumC440870HQn) C08FF.LIZ(EnumC440870HQn.class, str);
    }

    public EnumC440870HQn(String str, int i, String str2) {
        this.LL = str2;
    }
}
