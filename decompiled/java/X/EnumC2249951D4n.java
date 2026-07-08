package X;

/* JADX INFO: renamed from: X.1D4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2249951D4n {
    LEVEL_STAGE_DEFAULT(-1, "default"),
    LEVEL_STAGE_480P(1, "480p"),
    LEVEL_STAGE_540P(2, "540p"),
    LEVEL_STAGE_720P(3, "720p"),
    LEVEL_STAGE_1080P(4, "1080p");

    public final int LL;
    public final String LLILLJJLI;

    public String getKey() {
        return this.LLILLJJLI;
    }

    public int level() {
        return this.LL;
    }

    public static final EnumC2249951D4n levelIntToStageLevel(int i) {
        EnumC2249951D4n enumC2249951D4n = LEVEL_STAGE_DEFAULT;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return LEVEL_STAGE_1080P;
                    }
                    return enumC2249951D4n;
                }
                return LEVEL_STAGE_720P;
            }
            return LEVEL_STAGE_540P;
        }
        return LEVEL_STAGE_480P;
    }

    public static EnumC2249951D4n valueOf(String str) {
        return (EnumC2249951D4n) C08FF.LIZ(EnumC2249951D4n.class, str);
    }

    EnumC2249951D4n(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
