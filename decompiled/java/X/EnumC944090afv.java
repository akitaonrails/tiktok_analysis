package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0afv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC944090afv {
    public static final EnumC944090afv ANCHOR_LINKMIC_ONLINE;
    public static final EnumC944090afv ANCHOR_LINKMIC_USER_ADDING;
    public static final EnumC944090afv ANCHOR_NORMAL;
    public static final EnumC944090afv AUDIENCE_IN_ROOM_LINKMIC_ONLINE;
    public static final EnumC944090afv AUDIENCE_IN_ROOM_NORMAL;
    public static final EnumC944090afv AUDIENCE_ROOM_ENTER;
    public static final /* synthetic */ EnumC944090afv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC944090afv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC944090afv enumC944090afv = new EnumC944090afv("ANCHOR_NORMAL", 0, "anchor_normal");
        ANCHOR_NORMAL = enumC944090afv;
        EnumC944090afv enumC944090afv2 = new EnumC944090afv("ANCHOR_LINKMIC_ONLINE", 1, "anchor_linkmic_online");
        ANCHOR_LINKMIC_ONLINE = enumC944090afv2;
        EnumC944090afv enumC944090afv3 = new EnumC944090afv("ANCHOR_LINKMIC_USER_ADDING", 2, "anchor_linkmic_adding");
        ANCHOR_LINKMIC_USER_ADDING = enumC944090afv3;
        EnumC944090afv enumC944090afv4 = new EnumC944090afv("AUDIENCE_IN_ROOM_NORMAL", 3, "audience_normal");
        AUDIENCE_IN_ROOM_NORMAL = enumC944090afv4;
        EnumC944090afv enumC944090afv5 = new EnumC944090afv("AUDIENCE_ROOM_ENTER", 4, "audience_enter");
        AUDIENCE_ROOM_ENTER = enumC944090afv5;
        EnumC944090afv enumC944090afv6 = new EnumC944090afv("AUDIENCE_IN_ROOM_LINKMIC_ONLINE", 5, "audience_linkmic_online");
        AUDIENCE_IN_ROOM_LINKMIC_ONLINE = enumC944090afv6;
        EnumC944090afv[] enumC944090afvArr = {enumC944090afv, enumC944090afv2, enumC944090afv3, enumC944090afv4, enumC944090afv5, enumC944090afv6};
        LLILLJJLI = enumC944090afvArr;
        LLILLL = new C2254308sP(enumC944090afvArr);
    }

    public static EnumC944090afv[] values() {
        return (EnumC944090afv[]) LLILLJJLI.clone();
    }

    public final String getPipelineTypeValue() {
        return this.LL;
    }

    public static EnumC944090afv valueOf(String str) {
        return (EnumC944090afv) C08FF.LIZ(EnumC944090afv.class, str);
    }

    public EnumC944090afv(String str, int i, String str2) {
        this.LL = str2;
    }
}
