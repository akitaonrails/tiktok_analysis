package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1804100x32 {
    public static final EnumC1804100x32 CHARGE_FROM_HASH_BALANCE;
    public static final EnumC1804100x32 CHARGE_FROM_HASH_PROMOTION;
    public static final EnumC1804100x32 CHARGE_FROM_HASH_V2_LIVE_ROOM;
    public static final EnumC1804100x32 CHARGE_FROM_HASH_V3_LIVE_ROOM;
    public static final EnumC1804100x32 CHARGE_FROM_HASH_V3_PHASE2_BALANCE;
    public static final EnumC1804100x32 CHARGE_FROM_HASH_V3_PHASE2_LIVE_ROOM;
    public static final EnumC1804100x32 CHARGE_FROM_HASH_V3_PHASE2_PROMOTION;
    public static final C1804110x33 Companion;
    public static final /* synthetic */ EnumC1804100x32[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public static InterfaceC2044707zh<EnumC1804100x32> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1804100x32 enumC1804100x32 = new EnumC1804100x32(0, 0, "CHARGE_FROM_HASH_V2_LIVE_ROOM", "gJte5Ru", "live_detail", "");
        CHARGE_FROM_HASH_V2_LIVE_ROOM = enumC1804100x32;
        EnumC1804100x32 enumC1804100x322 = new EnumC1804100x32(1, 0, "CHARGE_FROM_HASH_V3_LIVE_ROOM", "VWC4Fkb", "live_detail", "");
        CHARGE_FROM_HASH_V3_LIVE_ROOM = enumC1804100x322;
        EnumC1804100x32 enumC1804100x323 = new EnumC1804100x32(2, 0, "CHARGE_FROM_HASH_V3_PHASE2_LIVE_ROOM", "bd5pxts", "live_detail", "NON_GOOGLE_LIVE_ROOM_PHASE_2");
        CHARGE_FROM_HASH_V3_PHASE2_LIVE_ROOM = enumC1804100x323;
        EnumC1804100x32 enumC1804100x324 = new EnumC1804100x32(3, 5, "CHARGE_FROM_HASH_PROMOTION", "zCMPwgZ", "live_detail", "");
        CHARGE_FROM_HASH_PROMOTION = enumC1804100x324;
        EnumC1804100x32 enumC1804100x325 = new EnumC1804100x32(4, 5, "CHARGE_FROM_HASH_V3_PHASE2_PROMOTION", "zPyLSAp", "live_detail", "NON_GOOGLE_PROMOTE_PHASE_2");
        CHARGE_FROM_HASH_V3_PHASE2_PROMOTION = enumC1804100x325;
        EnumC1804100x32 enumC1804100x326 = new EnumC1804100x32(5, 1, "CHARGE_FROM_HASH_BALANCE", "SSUXz83", "wallet", "");
        CHARGE_FROM_HASH_BALANCE = enumC1804100x326;
        EnumC1804100x32 enumC1804100x327 = new EnumC1804100x32(6, 1, "CHARGE_FROM_HASH_V3_PHASE2_BALANCE", "p9ebPxE", "wallet", "NON_GOOGLE_BALANCE_PHASE_2");
        CHARGE_FROM_HASH_V3_PHASE2_BALANCE = enumC1804100x327;
        EnumC1804100x32[] enumC1804100x32Arr = {enumC1804100x32, enumC1804100x322, enumC1804100x323, enumC1804100x324, enumC1804100x325, enumC1804100x326, enumC1804100x327};
        LLILZIL = enumC1804100x32Arr;
        LLILZLL = new C2254308sP(enumC1804100x32Arr);
        Companion = new C1804110x33();
    }

    public static EnumC1804100x32[] values() {
        return (EnumC1804100x32[]) LLILZIL.clone();
    }

    public final int getChargeSource() {
        return this.LLILLJJLI;
    }

    public final String getHash() {
        return this.LL;
    }

    public final String getRequestPage() {
        return this.LLILLL;
    }

    public final String getTriggerPoint() {
        return this.LLILZ;
    }

    public static EnumC1804100x32 valueOf(String str) {
        return (EnumC1804100x32) C08FF.LIZ(EnumC1804100x32.class, str);
    }

    public EnumC1804100x32(int i, int i2, String str, String str2, String str3, String str4) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }
}
