package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC729530SjX {
    public static final EnumC729530SjX AWEME_NULL;
    public static final /* synthetic */ EnumC729530SjX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC729530SjX NOT_LOGIN;
    public static final EnumC729530SjX NOT_SELF_AND_NOT_PUBLIC;
    public static final EnumC729530SjX NO_PERMISSION_TO_ADD_TO_STORY;
    public static final EnumC729530SjX SHARE_PANEL_ACL;
    public static final EnumC729530SjX STORY_CANT_BE_SHARED_FROM_ENTRANCE;
    public static final EnumC729530SjX USER_CANT_SHARE_TO_STORY;
    public static final EnumC729530SjX USER_ID_NULL;
    public static final EnumC729530SjX USER_IS_OWNER;
    public static final EnumC729530SjX USER_NOT_TAGGED_OR_MENTIONED;
    public static final EnumC729530SjX VIDEO_IS_AD;
    public static final EnumC729530SjX VIDEO_IS_PRIVATE;
    public static final EnumC729530SjX VIDEO_IS_TOO_LONG;
    public static final EnumC729530SjX VIDEO_SHARED_STORY_NOT_VISIBLE;
    public static final EnumC729530SjX VIDEO_STATUS_IS_DELETED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC729530SjX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC729530SjX enumC729530SjX = new EnumC729530SjX("SHARE_PANEL_ACL", 0, 0);
        SHARE_PANEL_ACL = enumC729530SjX;
        EnumC729530SjX enumC729530SjX2 = new EnumC729530SjX("AWEME_NULL", 1, 1);
        AWEME_NULL = enumC729530SjX2;
        EnumC729530SjX enumC729530SjX3 = new EnumC729530SjX("USER_ID_NULL", 2, 2);
        USER_ID_NULL = enumC729530SjX3;
        EnumC729530SjX enumC729530SjX4 = new EnumC729530SjX("VIDEO_IS_AD", 3, 3);
        VIDEO_IS_AD = enumC729530SjX4;
        EnumC729530SjX enumC729530SjX5 = new EnumC729530SjX("VIDEO_IS_PRIVATE", 4, 4);
        VIDEO_IS_PRIVATE = enumC729530SjX5;
        EnumC729530SjX enumC729530SjX6 = new EnumC729530SjX("USER_CANT_SHARE_TO_STORY", 5, 5);
        USER_CANT_SHARE_TO_STORY = enumC729530SjX6;
        EnumC729530SjX enumC729530SjX7 = new EnumC729530SjX("VIDEO_STATUS_IS_DELETED", 6, 6);
        VIDEO_STATUS_IS_DELETED = enumC729530SjX7;
        EnumC729530SjX enumC729530SjX8 = new EnumC729530SjX("VIDEO_SHARED_STORY_NOT_VISIBLE", 7, 7);
        VIDEO_SHARED_STORY_NOT_VISIBLE = enumC729530SjX8;
        EnumC729530SjX enumC729530SjX9 = new EnumC729530SjX("USER_NOT_TAGGED_OR_MENTIONED", 8, 8);
        USER_NOT_TAGGED_OR_MENTIONED = enumC729530SjX9;
        EnumC729530SjX enumC729530SjX10 = new EnumC729530SjX("NOT_LOGIN", 9, 9);
        NOT_LOGIN = enumC729530SjX10;
        EnumC729530SjX enumC729530SjX11 = new EnumC729530SjX("NO_PERMISSION_TO_ADD_TO_STORY", 10, 10);
        NO_PERMISSION_TO_ADD_TO_STORY = enumC729530SjX11;
        EnumC729530SjX enumC729530SjX12 = new EnumC729530SjX("VIDEO_IS_TOO_LONG", 11, 11);
        VIDEO_IS_TOO_LONG = enumC729530SjX12;
        EnumC729530SjX enumC729530SjX13 = new EnumC729530SjX("NOT_SELF_AND_NOT_PUBLIC", 12, 12);
        NOT_SELF_AND_NOT_PUBLIC = enumC729530SjX13;
        EnumC729530SjX enumC729530SjX14 = new EnumC729530SjX("STORY_CANT_BE_SHARED_FROM_ENTRANCE", 13, 13);
        STORY_CANT_BE_SHARED_FROM_ENTRANCE = enumC729530SjX14;
        EnumC729530SjX enumC729530SjX15 = new EnumC729530SjX("USER_IS_OWNER", 14, 14);
        USER_IS_OWNER = enumC729530SjX15;
        EnumC729530SjX[] enumC729530SjXArr = {enumC729530SjX, enumC729530SjX2, enumC729530SjX3, enumC729530SjX4, enumC729530SjX5, enumC729530SjX6, enumC729530SjX7, enumC729530SjX8, enumC729530SjX9, enumC729530SjX10, enumC729530SjX11, enumC729530SjX12, enumC729530SjX13, enumC729530SjX14, enumC729530SjX15};
        LLILLJJLI = enumC729530SjXArr;
        LLILLL = new C2254308sP(enumC729530SjXArr);
    }

    public static EnumC729530SjX[] values() {
        return (EnumC729530SjX[]) LLILLJJLI.clone();
    }

    public int getId() {
        return this.LL;
    }

    public static EnumC729530SjX valueOf(String str) {
        return (EnumC729530SjX) C08FF.LIZ(EnumC729530SjX.class, str);
    }

    public EnumC729530SjX(String str, int i, int i2) {
        this.LL = i2;
    }
}
