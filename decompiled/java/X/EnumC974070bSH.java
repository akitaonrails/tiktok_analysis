package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974070bSH {
    public static final /* synthetic */ EnumC974070bSH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_CATCH_BEAN_GUIDE;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_COMPETITION_PLATFORM_ACTION;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_ICON_CLICK;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_MATCH_GUIDE;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_RECEIVE_INVITE;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_RESUME;
    public static final EnumC974070bSH MATCH_CREATED_SOURCE_SINGLE_ROOM_INVITE;
    public static final EnumC974070bSH MATCH_CREATE_SOURCE_MODE_SELECT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC974070bSH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974070bSH enumC974070bSH = new EnumC974070bSH("MATCH_CREATED_SOURCE_ICON_CLICK", 0, 0);
        MATCH_CREATED_SOURCE_ICON_CLICK = enumC974070bSH;
        EnumC974070bSH enumC974070bSH2 = new EnumC974070bSH("MATCH_CREATED_SOURCE_MATCH_GUIDE", 1, 1);
        MATCH_CREATED_SOURCE_MATCH_GUIDE = enumC974070bSH2;
        EnumC974070bSH enumC974070bSH3 = new EnumC974070bSH("MATCH_CREATED_SOURCE_RECEIVE_INVITE", 2, 2);
        MATCH_CREATED_SOURCE_RECEIVE_INVITE = enumC974070bSH3;
        EnumC974070bSH enumC974070bSH4 = new EnumC974070bSH("MATCH_CREATED_SOURCE_RESUME", 3, 3);
        MATCH_CREATED_SOURCE_RESUME = enumC974070bSH4;
        EnumC974070bSH enumC974070bSH5 = new EnumC974070bSH("MATCH_CREATE_SOURCE_MODE_SELECT", 4, 4);
        MATCH_CREATE_SOURCE_MODE_SELECT = enumC974070bSH5;
        EnumC974070bSH enumC974070bSH6 = new EnumC974070bSH("MATCH_CREATED_SOURCE_CATCH_BEAN_GUIDE", 5, 5);
        MATCH_CREATED_SOURCE_CATCH_BEAN_GUIDE = enumC974070bSH6;
        EnumC974070bSH enumC974070bSH7 = new EnumC974070bSH("MATCH_CREATED_SOURCE_COMPETITION_PLATFORM_ACTION", 6, 6);
        MATCH_CREATED_SOURCE_COMPETITION_PLATFORM_ACTION = enumC974070bSH7;
        EnumC974070bSH enumC974070bSH8 = new EnumC974070bSH("MATCH_CREATED_SOURCE_SINGLE_ROOM_INVITE", 7, 7);
        MATCH_CREATED_SOURCE_SINGLE_ROOM_INVITE = enumC974070bSH8;
        EnumC974070bSH[] enumC974070bSHArr = {enumC974070bSH, enumC974070bSH2, enumC974070bSH3, enumC974070bSH4, enumC974070bSH5, enumC974070bSH6, enumC974070bSH7, enumC974070bSH8};
        LLILLJJLI = enumC974070bSHArr;
        LLILLL = new C2254308sP(enumC974070bSHArr);
    }

    public static EnumC974070bSH[] values() {
        return (EnumC974070bSH[]) LLILLJJLI.clone();
    }

    public final int getSource() {
        return this.LL;
    }

    public static EnumC974070bSH valueOf(String str) {
        return (EnumC974070bSH) C08FF.LIZ(EnumC974070bSH.class, str);
    }

    public EnumC974070bSH(String str, int i, int i2) {
        this.LL = i2;
    }
}
