package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KZ {
    public static final C19KZ AD_HISTORY;
    public static final C19KZ AD_REVIEWS;
    public static final C19KY Companion;
    public static final C19KZ LINK_HISTORY;
    public static final /* synthetic */ C19KZ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final Map<String, C19KZ> VALID_TAB_IDS;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C19KZ> getEntries() {
        return LLILZ;
    }

    static {
        C19KZ c19kz = new C19KZ("AD_HISTORY", 0, "ad_history", 2131835109);
        AD_HISTORY = c19kz;
        C19KZ c19kz2 = new C19KZ("AD_REVIEWS", 1, "ad_reviews", 2131835110);
        AD_REVIEWS = c19kz2;
        C19KZ c19kz3 = new C19KZ("LINK_HISTORY", 2, "link_history", 2131835112);
        LINK_HISTORY = c19kz3;
        C19KZ[] c19kzArr = {c19kz, c19kz2, c19kz3};
        LLILLL = c19kzArr;
        LLILZ = new C2254308sP(c19kzArr);
        Companion = new C19KY();
        C19KZ[] c19kzArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c19kzArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C19KZ c19kz4 : c19kzArrValues) {
            linkedHashMap.put(c19kz4.LL, c19kz4);
        }
        VALID_TAB_IDS = linkedHashMap;
    }

    public static C19KZ[] values() {
        return (C19KZ[]) LLILLL.clone();
    }

    public final int getTitleRes() {
        return this.LLILLJJLI;
    }

    public final String getTrackingName() {
        return this.LL;
    }

    public static C19KZ valueOf(String str) {
        return (C19KZ) C08FF.LIZ(C19KZ.class, str);
    }

    public C19KZ(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
