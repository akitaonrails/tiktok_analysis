package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ayX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public final class EnumC955630ayX {
    public static final C956630b09 Companion;
    public static final EnumC955630ayX DAILY_GAME_RANK;
    public static final EnumC955630ayX DAILY_RANK;
    public static final EnumC955630ayX DAILY_RANK_HALL_OF_FAME;
    public static final EnumC955630ayX EC_WEEKLY_RANK;
    public static final EnumC955630ayX HOURLY_RANK;
    public static final /* synthetic */ EnumC955630ayX[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC955630ayX UNKNOWN;
    public static final EnumC955630ayX WEEKLY_GAME_RANK;
    public static final EnumC955630ayX WEEKLY_RANK;
    public static final EnumC955630ayX WEEKLY_ROOKIE_RANK;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC955630ayX> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0b09] */
    static {
        EnumC955630ayX enumC955630ayX = new EnumC955630ayX("HOURLY_RANK", 0, 0, "hourly_rank");
        HOURLY_RANK = enumC955630ayX;
        EnumC955630ayX enumC955630ayX2 = new EnumC955630ayX("WEEKLY_RANK", 1, 1, "weekly_rank");
        WEEKLY_RANK = enumC955630ayX2;
        EnumC955630ayX enumC955630ayX3 = new EnumC955630ayX("WEEKLY_ROOKIE_RANK", 2, 5, "rookie_star_rank");
        WEEKLY_ROOKIE_RANK = enumC955630ayX3;
        EnumC955630ayX enumC955630ayX4 = new EnumC955630ayX("EC_WEEKLY_RANK", 3, 6, "sale_rank");
        EC_WEEKLY_RANK = enumC955630ayX4;
        EnumC955630ayX enumC955630ayX5 = new EnumC955630ayX("DAILY_RANK", 4, 8, "daily_rank");
        DAILY_RANK = enumC955630ayX5;
        EnumC955630ayX enumC955630ayX6 = new EnumC955630ayX("WEEKLY_GAME_RANK", 5, 10, "weekly_game_rank");
        WEEKLY_GAME_RANK = enumC955630ayX6;
        EnumC955630ayX enumC955630ayX7 = new EnumC955630ayX("DAILY_GAME_RANK", 6, 11, "daily_game_rank");
        DAILY_GAME_RANK = enumC955630ayX7;
        EnumC955630ayX enumC955630ayX8 = new EnumC955630ayX("DAILY_RANK_HALL_OF_FAME", 7, 12, "hall_of_fame_rank");
        DAILY_RANK_HALL_OF_FAME = enumC955630ayX8;
        EnumC955630ayX enumC955630ayX9 = new EnumC955630ayX("UNKNOWN", 8, -1, "unknown");
        UNKNOWN = enumC955630ayX9;
        EnumC955630ayX[] enumC955630ayXArr = {enumC955630ayX, enumC955630ayX2, enumC955630ayX3, enumC955630ayX4, enumC955630ayX5, enumC955630ayX6, enumC955630ayX7, enumC955630ayX8, enumC955630ayX9};
        LLILLL = enumC955630ayXArr;
        LLILZ = new C2254308sP(enumC955630ayXArr);
        Companion = new Object() { // from class: X.0b09
        };
    }

    public static EnumC955630ayX[] values() {
        return (EnumC955630ayX[]) LLILLL.clone();
    }

    public final String getRankName() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    public static final EnumC955630ayX valueOf(int i) {
        Companion.getClass();
        for (EnumC955630ayX enumC955630ayX : values()) {
            if (i == enumC955630ayX.getType()) {
                return enumC955630ayX;
            }
        }
        return UNKNOWN;
    }

    public static final EnumC955630ayX valueOfName(String str) {
        Companion.getClass();
        for (EnumC955630ayX enumC955630ayX : values()) {
            if (!Intrinsics.LJFF(str, enumC955630ayX.getRankName())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enumC955630ayX.getRankName());
                sbLIZ.append("_notice");
                if (Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ))) {
                    return enumC955630ayX;
                }
            } else {
                return enumC955630ayX;
            }
        }
        return UNKNOWN;
    }

    public static EnumC955630ayX valueOf(String str) {
        return (EnumC955630ayX) C08FF.LIZ(EnumC955630ayX.class, str);
    }

    public EnumC955630ayX(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
