package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454370Hrn {
    public static final EnumC454370Hrn FAVOURITE;
    public static final EnumC454370Hrn INPUT_REC;
    public static final /* synthetic */ EnumC454370Hrn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454370Hrn SEARCH;
    public static final EnumC454370Hrn SOCIAL_AVATAR;
    public static final EnumC454370Hrn STICKER_SET;
    public static final EnumC454370Hrn USE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC454370Hrn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454370Hrn enumC454370Hrn = new EnumC454370Hrn("SEARCH", 0, "search");
        SEARCH = enumC454370Hrn;
        EnumC454370Hrn enumC454370Hrn2 = new EnumC454370Hrn("FAVOURITE", 1, "favourite");
        FAVOURITE = enumC454370Hrn2;
        EnumC454370Hrn enumC454370Hrn3 = new EnumC454370Hrn("STICKER_SET", 2, "sticker_set");
        STICKER_SET = enumC454370Hrn3;
        EnumC454370Hrn enumC454370Hrn4 = new EnumC454370Hrn("USE", 3, "use");
        USE = enumC454370Hrn4;
        EnumC454370Hrn enumC454370Hrn5 = new EnumC454370Hrn("SOCIAL_AVATAR", 4, "social_avatar");
        SOCIAL_AVATAR = enumC454370Hrn5;
        EnumC454370Hrn enumC454370Hrn6 = new EnumC454370Hrn("INPUT_REC", 5, "input_rec");
        INPUT_REC = enumC454370Hrn6;
        EnumC454370Hrn[] enumC454370HrnArr = {enumC454370Hrn, enumC454370Hrn2, enumC454370Hrn3, enumC454370Hrn4, enumC454370Hrn5, enumC454370Hrn6};
        LLILLJJLI = enumC454370HrnArr;
        LLILLL = new C2254308sP(enumC454370HrnArr);
    }

    public static EnumC454370Hrn[] values() {
        return (EnumC454370Hrn[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC454370Hrn valueOf(String str) {
        return (EnumC454370Hrn) C08FF.LIZ(EnumC454370Hrn.class, str);
    }

    public EnumC454370Hrn(String str, int i, String str2) {
        this.LL = str2;
    }
}
