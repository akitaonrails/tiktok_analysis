package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21196517xD {
    public static final EnumC21196517xD ANCHOR_AS_AUDIENCE;
    public static final EnumC21196517xD AUDIENCE;
    public static final /* synthetic */ EnumC21196517xD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21196517xD MODERATOR;
    public static final EnumC21196517xD ROOM_OWNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21196517xD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21196517xD enumC21196517xD = new EnumC21196517xD("AUDIENCE", 0, "audience");
        AUDIENCE = enumC21196517xD;
        EnumC21196517xD enumC21196517xD2 = new EnumC21196517xD("ANCHOR_AS_AUDIENCE", 1, "anchor_as_audience");
        ANCHOR_AS_AUDIENCE = enumC21196517xD2;
        EnumC21196517xD enumC21196517xD3 = new EnumC21196517xD("ROOM_OWNER", 2, "roomOwner");
        ROOM_OWNER = enumC21196517xD3;
        EnumC21196517xD enumC21196517xD4 = new EnumC21196517xD("MODERATOR", 3, "moderator");
        MODERATOR = enumC21196517xD4;
        EnumC21196517xD[] enumC21196517xDArr = {enumC21196517xD, enumC21196517xD2, enumC21196517xD3, enumC21196517xD4};
        LLILLJJLI = enumC21196517xDArr;
        LLILLL = new C2254308sP(enumC21196517xDArr);
    }

    public static EnumC21196517xD[] values() {
        return (EnumC21196517xD[]) LLILLJJLI.clone();
    }

    public final String getRoleStr() {
        return this.LL;
    }

    public static EnumC21196517xD valueOf(String str) {
        return (EnumC21196517xD) C08FF.LIZ(EnumC21196517xD.class, str);
    }

    public EnumC21196517xD(String str, int i, String str2) {
        this.LL = str2;
    }
}
