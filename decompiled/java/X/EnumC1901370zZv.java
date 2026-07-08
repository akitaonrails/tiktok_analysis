package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1901370zZv {
    public static final EnumC1901370zZv LLILZIL;
    public static final EnumC1901370zZv LLILZLL;
    public static final EnumC1901370zZv LLIZ;
    public static final EnumC1901370zZv LLIZLLLIL;
    public static final EnumC1901370zZv LLJ;
    public static final EnumC1901370zZv LLJI;
    public static final EnumC1901370zZv LLJIJIL;
    public static final EnumC1901370zZv LLJILJIL;
    public static final EnumC1901370zZv LLJILJILJ;
    public static final EnumC1901370zZv LLJILLL;
    public static final EnumC1901370zZv LLJJ;
    public static final EnumC1901370zZv LLJJI;
    public static final EnumC1901370zZv LLJJIII;
    public static final /* synthetic */ EnumC1901370zZv[] LLJJIJI;
    public final String LL;
    public final int LLILLJJLI;
    public volatile C1901390zZx LLILLL = new C1901390zZx();
    public volatile C1901410zZz LLILZ = new C1901410zZz();

    public final synchronized int LIZJ() {
        return this.LLILZ.LIZ;
    }

    public final synchronized void LJFF() {
        this.LLILLL.LIZIZ = System.currentTimeMillis();
    }

    public final synchronized void LJI() {
        this.LLILLL.LIZ = System.currentTimeMillis();
    }

    static {
        EnumC1901370zZv enumC1901370zZv = new EnumC1901370zZv("TOTAL_LOADING_TIME", 0, "activities_load_total_time", 0);
        LLILZIL = enumC1901370zZv;
        EnumC1901370zZv enumC1901370zZv2 = new EnumC1901370zZv("ROUTE_TIME", 1, "activities_route_time", 0);
        LLILZLL = enumC1901370zZv2;
        EnumC1901370zZv enumC1901370zZv3 = new EnumC1901370zZv("JANUS_REQUEST_TIME", 2, "activities_janus_request_time", 0);
        LLIZ = enumC1901370zZv3;
        EnumC1901370zZv enumC1901370zZv4 = new EnumC1901370zZv("MULTI_REQUEST_TIME", 3, "activities_multi_request_time", 0);
        LLIZLLLIL = enumC1901370zZv4;
        EnumC1901370zZv enumC1901370zZv5 = new EnumC1901370zZv("RENDER_TIME", 4, "activities_render_time", 0);
        LLJ = enumC1901370zZv5;
        EnumC1901370zZv enumC1901370zZv6 = new EnumC1901370zZv("ENTER_UNREAD_COUNT", 5, "activities_unread_show_count", 1);
        LLJI = enumC1901370zZv6;
        EnumC1901370zZv enumC1901370zZv7 = new EnumC1901370zZv("USER_CARD_HAS_DATA_WHEN_LOAD", 6, "user_card_has_data_when_load", 1);
        LLJIJIL = enumC1901370zZv7;
        EnumC1901370zZv enumC1901370zZv8 = new EnumC1901370zZv("LOAD_OPTIMIZATION_TYPE", 7, "load_optimization_type", 1);
        LLJILJIL = enumC1901370zZv8;
        EnumC1901370zZv enumC1901370zZv9 = new EnumC1901370zZv("IS_HIT_PRELOAD", 8, "is_hit_preload", 1);
        LLJILJILJ = enumC1901370zZv9;
        EnumC1901370zZv enumC1901370zZv10 = new EnumC1901370zZv("ACTIVITY_PAGE_TYPE", 9, "activity_page_type", 1);
        LLJILLL = enumC1901370zZv10;
        EnumC1901370zZv enumC1901370zZv11 = new EnumC1901370zZv("IS_INVALID_DATA", 10, "is_invalid_data", 1);
        LLJJ = enumC1901370zZv11;
        EnumC1901370zZv enumC1901370zZv12 = new EnumC1901370zZv("IS_COLD_START", 11, "is_cold_start", 1);
        LLJJI = enumC1901370zZv12;
        EnumC1901370zZv enumC1901370zZv13 = new EnumC1901370zZv("ACTIVITY_CLASSIFICATION_STATUS", 12, "activity_classification_status", 1);
        LLJJIII = enumC1901370zZv13;
        EnumC1901370zZv[] enumC1901370zZvArr = {enumC1901370zZv, enumC1901370zZv2, enumC1901370zZv3, enumC1901370zZv4, enumC1901370zZv5, enumC1901370zZv6, enumC1901370zZv7, enumC1901370zZv8, enumC1901370zZv9, enumC1901370zZv10, enumC1901370zZv11, enumC1901370zZv12, enumC1901370zZv13};
        LLJJIJI = enumC1901370zZvArr;
        new C2254308sP(enumC1901370zZvArr);
    }

    public static EnumC1901370zZv[] values() {
        return (EnumC1901370zZv[]) LLJJIJI.clone();
    }

    public static EnumC1901370zZv valueOf(String str) {
        return (EnumC1901370zZv) C08FF.LIZ(EnumC1901370zZv.class, str);
    }

    public final synchronized void LJII(int i) {
        this.LLILZ.LIZ = i;
    }

    public EnumC1901370zZv(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
