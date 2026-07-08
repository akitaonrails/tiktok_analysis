package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1733160vCc {
    public static final EnumC1733160vCc LIVE_ROOM;
    public static final /* synthetic */ EnumC1733160vCc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1733160vCc SHOP_BAG_LIST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1733160vCc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1733160vCc enumC1733160vCc = new EnumC1733160vCc("LIVE_ROOM", 0, "a2270.b4180");
        LIVE_ROOM = enumC1733160vCc;
        EnumC1733160vCc enumC1733160vCc2 = new EnumC1733160vCc("SHOP_BAG_LIST", 1, "a2270.b9588");
        SHOP_BAG_LIST = enumC1733160vCc2;
        EnumC1733160vCc[] enumC1733160vCcArr = {enumC1733160vCc, enumC1733160vCc2};
        LLILLJJLI = enumC1733160vCcArr;
        LLILLL = new C2254308sP(enumC1733160vCcArr);
    }

    public static EnumC1733160vCc[] values() {
        return (EnumC1733160vCc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1733160vCc valueOf(String str) {
        return (EnumC1733160vCc) C08FF.LIZ(EnumC1733160vCc.class, str);
    }

    public EnumC1733160vCc(String str, int i, String str2) {
        this.LL = str2;
    }
}
