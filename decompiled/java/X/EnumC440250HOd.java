package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440250HOd {
    public static final EnumC440250HOd CLOSE;
    public static final EnumC440250HOd CREATE_AVATAR;
    public static final /* synthetic */ EnumC440250HOd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440250HOd SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440250HOd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440250HOd enumC440250HOd = new EnumC440250HOd("SHOW", 0, "show");
        SHOW = enumC440250HOd;
        EnumC440250HOd enumC440250HOd2 = new EnumC440250HOd("CREATE_AVATAR", 1, "create_avatar");
        CREATE_AVATAR = enumC440250HOd2;
        EnumC440250HOd enumC440250HOd3 = new EnumC440250HOd("CLOSE", 2, "close");
        CLOSE = enumC440250HOd3;
        EnumC440250HOd[] enumC440250HOdArr = {enumC440250HOd, enumC440250HOd2, enumC440250HOd3};
        LLILLJJLI = enumC440250HOdArr;
        LLILLL = new C2254308sP(enumC440250HOdArr);
    }

    public static EnumC440250HOd[] values() {
        return (EnumC440250HOd[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440250HOd valueOf(String str) {
        return (EnumC440250HOd) C08FF.LIZ(EnumC440250HOd.class, str);
    }

    public EnumC440250HOd(String str, int i, String str2) {
        this.LL = str2;
    }
}
