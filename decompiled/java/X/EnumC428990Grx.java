package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428990Grx {
    public static final EnumC428990Grx LIKE;
    public static final /* synthetic */ EnumC428990Grx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC428990Grx REPLY;
    public static final EnumC428990Grx REPOST_LOGO;
    public static final EnumC428990Grx SOCIAL_AVATAR;
    public static final EnumC428990Grx TEXT;

    public static InterfaceC2044707zh<EnumC428990Grx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC428990Grx enumC428990Grx = new EnumC428990Grx("TEXT", 0);
        TEXT = enumC428990Grx;
        EnumC428990Grx enumC428990Grx2 = new EnumC428990Grx("LIKE", 1);
        LIKE = enumC428990Grx2;
        EnumC428990Grx enumC428990Grx3 = new EnumC428990Grx("REPLY", 2);
        REPLY = enumC428990Grx3;
        EnumC428990Grx enumC428990Grx4 = new EnumC428990Grx("REPOST_LOGO", 3);
        REPOST_LOGO = enumC428990Grx4;
        EnumC428990Grx enumC428990Grx5 = new EnumC428990Grx("SOCIAL_AVATAR", 4);
        SOCIAL_AVATAR = enumC428990Grx5;
        EnumC428990Grx[] enumC428990GrxArr = {enumC428990Grx, enumC428990Grx2, enumC428990Grx3, enumC428990Grx4, enumC428990Grx5};
        LL = enumC428990GrxArr;
        LLILLJJLI = new C2254308sP(enumC428990GrxArr);
    }

    public static EnumC428990Grx[] values() {
        return (EnumC428990Grx[]) LL.clone();
    }

    public static EnumC428990Grx valueOf(String str) {
        return (EnumC428990Grx) C08FF.LIZ(EnumC428990Grx.class, str);
    }

    public EnumC428990Grx(String str, int i) {
    }
}
