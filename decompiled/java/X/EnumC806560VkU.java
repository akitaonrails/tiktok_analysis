package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC806560VkU {
    public static final EnumC806560VkU AWEME;
    public static final EnumC806560VkU LIVE;
    public static final /* synthetic */ EnumC806560VkU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC806560VkU NO_DATA;
    public static final EnumC806560VkU REPOST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC806560VkU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC806560VkU enumC806560VkU = new EnumC806560VkU("NO_DATA", 0, -1);
        NO_DATA = enumC806560VkU;
        EnumC806560VkU enumC806560VkU2 = new EnumC806560VkU("AWEME", 1, 1);
        AWEME = enumC806560VkU2;
        EnumC806560VkU enumC806560VkU3 = new EnumC806560VkU("LIVE", 2, 2);
        LIVE = enumC806560VkU3;
        EnumC806560VkU enumC806560VkU4 = new EnumC806560VkU("REPOST", 3, 3);
        REPOST = enumC806560VkU4;
        EnumC806560VkU[] enumC806560VkUArr = {enumC806560VkU, enumC806560VkU2, enumC806560VkU3, enumC806560VkU4};
        LLILLJJLI = enumC806560VkUArr;
        LLILLL = new C2254308sP(enumC806560VkUArr);
    }

    public static EnumC806560VkU[] values() {
        return (EnumC806560VkU[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC806560VkU valueOf(String str) {
        return (EnumC806560VkU) C08FF.LIZ(EnumC806560VkU.class, str);
    }

    public EnumC806560VkU(String str, int i, int i2) {
        this.LL = i2;
    }
}
