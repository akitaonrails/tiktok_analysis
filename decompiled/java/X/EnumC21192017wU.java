package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21192017wU {
    public static final EnumC21192017wU COMMON_API;
    public static final EnumC21192017wU ECOM_API;
    public static final EnumC21192017wU FYP;
    public static final EnumC21192017wU FYP_RETRY;
    public static final /* synthetic */ EnumC21192017wU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21192017wU LOCAL;
    public static final EnumC21192017wU ONLINE;
    public static final EnumC21192017wU ROOM;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21192017wU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21192017wU enumC21192017wU = new EnumC21192017wU("ONLINE", 0, "online");
        ONLINE = enumC21192017wU;
        EnumC21192017wU enumC21192017wU2 = new EnumC21192017wU("LOCAL", 1, "local");
        LOCAL = enumC21192017wU2;
        EnumC21192017wU enumC21192017wU3 = new EnumC21192017wU("FYP", 2, "fyp");
        FYP = enumC21192017wU3;
        EnumC21192017wU enumC21192017wU4 = new EnumC21192017wU("FYP_RETRY", 3, "fyp_retry");
        FYP_RETRY = enumC21192017wU4;
        EnumC21192017wU enumC21192017wU5 = new EnumC21192017wU("ROOM", 4, "room");
        ROOM = enumC21192017wU5;
        EnumC21192017wU enumC21192017wU6 = new EnumC21192017wU("COMMON_API", 5, "common_api");
        COMMON_API = enumC21192017wU6;
        EnumC21192017wU enumC21192017wU7 = new EnumC21192017wU("ECOM_API", 6, "ecom_api");
        ECOM_API = enumC21192017wU7;
        EnumC21192017wU[] enumC21192017wUArr = {enumC21192017wU, enumC21192017wU2, enumC21192017wU3, enumC21192017wU4, enumC21192017wU5, enumC21192017wU6, enumC21192017wU7};
        LLILLJJLI = enumC21192017wUArr;
        LLILLL = new C2254308sP(enumC21192017wUArr);
    }

    public static EnumC21192017wU[] values() {
        return (EnumC21192017wU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21192017wU valueOf(String str) {
        return (EnumC21192017wU) C08FF.LIZ(EnumC21192017wU.class, str);
    }

    public EnumC21192017wU(String str, int i, String str2) {
        this.LL = str2;
    }
}
