package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.146q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC202118146q {
    public static final EnumC202118146q APP_BACKGROUND_FILTER;
    public static final EnumC202118146q APP_VERSION_FILTER;
    public static final EnumC202118146q DEBUG_FILTER;
    public static final EnumC202118146q DEFAULT;
    public static final EnumC202118146q DEVICE_BRAND_FILTER;
    public static final EnumC202118146q DYNAMIC_MEMORY_FILTER;
    public static final EnumC202118146q EXECUTE_INTERVAL_FILTER;
    public static final EnumC202118146q EXECUTE_TIMES_FILTER;
    public static final /* synthetic */ EnumC202118146q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC202118146q LOW_MEMORY_DEVICE_FILTER;
    public static final EnumC202118146q NEW_USER_FILTER;
    public static final EnumC202118146q OPEN_DEX_TIME_FILTER;
    public static final EnumC202118146q OS_VERSION;
    public static final EnumC202118146q PROFILE_ON_EVENT;
    public static final EnumC202118146q SUCCESS;
    public static final EnumC202118146q SUCCESS_AND_BE_MONITORED;
    public static final EnumC202118146q WAIT_FOR_DELAY_TIME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC202118146q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC202118146q enumC202118146q = new EnumC202118146q(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1);
        DEFAULT = enumC202118146q;
        EnumC202118146q enumC202118146q2 = new EnumC202118146q("SUCCESS", 1, 200);
        SUCCESS = enumC202118146q2;
        EnumC202118146q enumC202118146q3 = new EnumC202118146q("SUCCESS_AND_BE_MONITORED", 2, 201);
        SUCCESS_AND_BE_MONITORED = enumC202118146q3;
        EnumC202118146q enumC202118146q4 = new EnumC202118146q("DEBUG_FILTER", 3, 400);
        DEBUG_FILTER = enumC202118146q4;
        EnumC202118146q enumC202118146q5 = new EnumC202118146q("OS_VERSION", 4, 401);
        OS_VERSION = enumC202118146q5;
        EnumC202118146q enumC202118146q6 = new EnumC202118146q("NEW_USER_FILTER", 5, 402);
        NEW_USER_FILTER = enumC202118146q6;
        EnumC202118146q enumC202118146q7 = new EnumC202118146q("EXECUTE_TIMES_FILTER", 6, 403);
        EXECUTE_TIMES_FILTER = enumC202118146q7;
        EnumC202118146q enumC202118146q8 = new EnumC202118146q("LOW_MEMORY_DEVICE_FILTER", 7, 404);
        LOW_MEMORY_DEVICE_FILTER = enumC202118146q8;
        EnumC202118146q enumC202118146q9 = new EnumC202118146q("OPEN_DEX_TIME_FILTER", 8, 405);
        OPEN_DEX_TIME_FILTER = enumC202118146q9;
        EnumC202118146q enumC202118146q10 = new EnumC202118146q("DEVICE_BRAND_FILTER", 9, 406);
        DEVICE_BRAND_FILTER = enumC202118146q10;
        EnumC202118146q enumC202118146q11 = new EnumC202118146q("APP_VERSION_FILTER", 10, 407);
        APP_VERSION_FILTER = enumC202118146q11;
        EnumC202118146q enumC202118146q12 = new EnumC202118146q("DYNAMIC_MEMORY_FILTER", 11, 408);
        DYNAMIC_MEMORY_FILTER = enumC202118146q12;
        EnumC202118146q enumC202118146q13 = new EnumC202118146q("EXECUTE_INTERVAL_FILTER", 12, 409);
        EXECUTE_INTERVAL_FILTER = enumC202118146q13;
        EnumC202118146q enumC202118146q14 = new EnumC202118146q("PROFILE_ON_EVENT", 13, 501);
        PROFILE_ON_EVENT = enumC202118146q14;
        EnumC202118146q enumC202118146q15 = new EnumC202118146q("WAIT_FOR_DELAY_TIME", 14, 502);
        WAIT_FOR_DELAY_TIME = enumC202118146q15;
        EnumC202118146q enumC202118146q16 = new EnumC202118146q("APP_BACKGROUND_FILTER", 15, 503);
        APP_BACKGROUND_FILTER = enumC202118146q16;
        EnumC202118146q[] enumC202118146qArr = {enumC202118146q, enumC202118146q2, enumC202118146q3, enumC202118146q4, enumC202118146q5, enumC202118146q6, enumC202118146q7, enumC202118146q8, enumC202118146q9, enumC202118146q10, enumC202118146q11, enumC202118146q12, enumC202118146q13, enumC202118146q14, enumC202118146q15, enumC202118146q16};
        LLILLJJLI = enumC202118146qArr;
        LLILLL = new C2254308sP(enumC202118146qArr);
    }

    public static EnumC202118146q[] values() {
        return (EnumC202118146q[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC202118146q valueOf(String str) {
        return (EnumC202118146q) C08FF.LIZ(EnumC202118146q.class, str);
    }

    public EnumC202118146q(String str, int i, int i2) {
        this.LL = i2;
    }
}
