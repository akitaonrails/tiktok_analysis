package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154010g8V {
    public static final EnumC1154010g8V BADGE_ID_BRONZE;
    public static final EnumC1154010g8V BADGE_ID_DIAMOND;
    public static final EnumC1154010g8V BADGE_ID_GOLD;
    public static final EnumC1154010g8V BADGE_ID_PLATINUM;
    public static final EnumC1154010g8V BADGE_ID_SILVER;
    public static final /* synthetic */ EnumC1154010g8V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154010g8V> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154010g8V enumC1154010g8V = new EnumC1154010g8V("BADGE_ID_BRONZE", 0, 40001);
        BADGE_ID_BRONZE = enumC1154010g8V;
        EnumC1154010g8V enumC1154010g8V2 = new EnumC1154010g8V("BADGE_ID_SILVER", 1, 40002);
        BADGE_ID_SILVER = enumC1154010g8V2;
        EnumC1154010g8V enumC1154010g8V3 = new EnumC1154010g8V("BADGE_ID_GOLD", 2, 40003);
        BADGE_ID_GOLD = enumC1154010g8V3;
        EnumC1154010g8V enumC1154010g8V4 = new EnumC1154010g8V("BADGE_ID_PLATINUM", 3, 40004);
        BADGE_ID_PLATINUM = enumC1154010g8V4;
        EnumC1154010g8V enumC1154010g8V5 = new EnumC1154010g8V("BADGE_ID_DIAMOND", 4, 40005);
        BADGE_ID_DIAMOND = enumC1154010g8V5;
        EnumC1154010g8V[] enumC1154010g8VArr = {enumC1154010g8V, enumC1154010g8V2, enumC1154010g8V3, enumC1154010g8V4, enumC1154010g8V5};
        LLILLJJLI = enumC1154010g8VArr;
        LLILLL = new C2254308sP(enumC1154010g8VArr);
    }

    public static EnumC1154010g8V[] values() {
        return (EnumC1154010g8V[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC1154010g8V valueOf(String str) {
        return (EnumC1154010g8V) C08FF.LIZ(EnumC1154010g8V.class, str);
    }

    public EnumC1154010g8V(String str, int i, int i2) {
        this.LL = i2;
    }
}
