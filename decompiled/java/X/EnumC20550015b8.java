package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15b8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20550015b8 {
    public static final /* synthetic */ EnumC20550015b8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20550015b8 STATE_FREQ_BATCH_COUNT_MISS;
    public static final EnumC20550015b8 STATE_FREQ_BATCH_INTERVAL_MISS;
    public static final EnumC20550015b8 STATE_FREQ_NEGATIVE_COOLDOWN;
    public static final EnumC20550015b8 STATE_FREQ_PARAM_INVALID;
    public static final EnumC20550015b8 STATE_FREQ_REACHED_MAX_COUNT;
    public static final EnumC20550015b8 STATE_FREQ_SUCCESS;
    public static final EnumC20550015b8 STATE_FREQ_TIME_INTERVAL_MISS;
    public static final EnumC20550015b8 STATE_REAL_TIME_INSERT_ERROR_TYPE_AVOID_AD;
    public static final EnumC20550015b8 STATE_REAL_TIME_INSERT_ERROR_TYPE_DISPERSION;
    public static final EnumC20550015b8 STATE_REAL_TIME_INSERT_ERROR_TYPE_NOT_LAST_VIDEO;
    public int LL;

    public static InterfaceC2044707zh<EnumC20550015b8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20550015b8 enumC20550015b8 = new EnumC20550015b8("STATE_FREQ_SUCCESS", 0, 0);
        STATE_FREQ_SUCCESS = enumC20550015b8;
        EnumC20550015b8 enumC20550015b82 = new EnumC20550015b8("STATE_FREQ_BATCH_COUNT_MISS", 1, 601);
        STATE_FREQ_BATCH_COUNT_MISS = enumC20550015b82;
        EnumC20550015b8 enumC20550015b83 = new EnumC20550015b8("STATE_FREQ_TIME_INTERVAL_MISS", 2, 602);
        STATE_FREQ_TIME_INTERVAL_MISS = enumC20550015b83;
        EnumC20550015b8 enumC20550015b84 = new EnumC20550015b8("STATE_FREQ_REACHED_MAX_COUNT", 3, 603);
        STATE_FREQ_REACHED_MAX_COUNT = enumC20550015b84;
        EnumC20550015b8 enumC20550015b85 = new EnumC20550015b8("STATE_FREQ_BATCH_INTERVAL_MISS", 4, 604);
        STATE_FREQ_BATCH_INTERVAL_MISS = enumC20550015b85;
        EnumC20550015b8 enumC20550015b86 = new EnumC20550015b8("STATE_FREQ_PARAM_INVALID", 5, 701);
        STATE_FREQ_PARAM_INVALID = enumC20550015b86;
        EnumC20550015b8 enumC20550015b87 = new EnumC20550015b8("STATE_FREQ_NEGATIVE_COOLDOWN", 6, 605);
        STATE_FREQ_NEGATIVE_COOLDOWN = enumC20550015b87;
        EnumC20550015b8 enumC20550015b88 = new EnumC20550015b8("STATE_REAL_TIME_INSERT_ERROR_TYPE_DISPERSION", 7, 801);
        STATE_REAL_TIME_INSERT_ERROR_TYPE_DISPERSION = enumC20550015b88;
        EnumC20550015b8 enumC20550015b89 = new EnumC20550015b8("STATE_REAL_TIME_INSERT_ERROR_TYPE_AVOID_AD", 8, 802);
        STATE_REAL_TIME_INSERT_ERROR_TYPE_AVOID_AD = enumC20550015b89;
        EnumC20550015b8 enumC20550015b810 = new EnumC20550015b8("STATE_REAL_TIME_INSERT_ERROR_TYPE_NOT_LAST_VIDEO", 9, 803);
        STATE_REAL_TIME_INSERT_ERROR_TYPE_NOT_LAST_VIDEO = enumC20550015b810;
        EnumC20550015b8[] enumC20550015b8Arr = {enumC20550015b8, enumC20550015b82, enumC20550015b83, enumC20550015b84, enumC20550015b85, enumC20550015b86, enumC20550015b87, enumC20550015b88, enumC20550015b89, enumC20550015b810};
        LLILLJJLI = enumC20550015b8Arr;
        LLILLL = new C2254308sP(enumC20550015b8Arr);
    }

    public static EnumC20550015b8[] values() {
        return (EnumC20550015b8[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC20550015b8 valueOf(String str) {
        return (EnumC20550015b8) C08FF.LIZ(EnumC20550015b8.class, str);
    }

    public final void setState(int i) {
        this.LL = i;
    }

    public EnumC20550015b8(String str, int i, int i2) {
        this.LL = i2;
    }
}
