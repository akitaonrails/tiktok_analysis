package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821800WLq implements InterfaceC821860WLw {
    public static final C821820WLs Companion;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_EXCEPTION;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_IDC_INVALID;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_PATH_INVALID;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_REQUEST_EXCEPTION;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_SUCCESS_WITHOUT_FALLBACK_CONFIG;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_SUCCESS_WITH_FALLBACK_CONFIG;
    public static final EnumC821800WLq GECKO_CDN_REWRITE_URL_EQUAL;
    public static final /* synthetic */ EnumC821800WLq[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL;
    public final String LLILLJJLI;
    public Boolean LLILLL = null;

    public static InterfaceC2044707zh<EnumC821800WLq> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0WLs] */
    static {
        EnumC821800WLq enumC821800WLq = new EnumC821800WLq("GECKO_CDN_REWRITE_IDC_INVALID", 0, 100, "gecko_cdn_not_rewrite_idc_invalid");
        GECKO_CDN_REWRITE_IDC_INVALID = enumC821800WLq;
        EnumC821800WLq enumC821800WLq2 = new EnumC821800WLq("GECKO_CDN_REWRITE_PATH_INVALID", 1, 101, "gecko_cdn_not_rewrite_path_invalid");
        GECKO_CDN_REWRITE_PATH_INVALID = enumC821800WLq2;
        EnumC821800WLq enumC821800WLq3 = new EnumC821800WLq("GECKO_CDN_REWRITE_URL_EQUAL", 2, 102, "gecko_cdn_not_rewrite_url_equal");
        GECKO_CDN_REWRITE_URL_EQUAL = enumC821800WLq3;
        EnumC821800WLq enumC821800WLq4 = new EnumC821800WLq("GECKO_CDN_REWRITE_EXCEPTION", 3, 103, "gecko_rewrite_exception");
        GECKO_CDN_REWRITE_EXCEPTION = enumC821800WLq4;
        EnumC821800WLq enumC821800WLq5 = new EnumC821800WLq("GECKO_CDN_REWRITE_REQUEST_EXCEPTION", 4, 104, "gecko_rewrite_request_exception");
        GECKO_CDN_REWRITE_REQUEST_EXCEPTION = enumC821800WLq5;
        EnumC821800WLq enumC821800WLq6 = new EnumC821800WLq("GECKO_CDN_REWRITE_SUCCESS_WITH_FALLBACK_CONFIG", 5, 200, "gecko_rewrite_success_with_fallback_config");
        GECKO_CDN_REWRITE_SUCCESS_WITH_FALLBACK_CONFIG = enumC821800WLq6;
        EnumC821800WLq enumC821800WLq7 = new EnumC821800WLq("GECKO_CDN_REWRITE_SUCCESS_WITHOUT_FALLBACK_CONFIG", 6, 201, "gecko_rewrite_success_without_fallback_config");
        GECKO_CDN_REWRITE_SUCCESS_WITHOUT_FALLBACK_CONFIG = enumC821800WLq7;
        EnumC821800WLq[] enumC821800WLqArr = {enumC821800WLq, enumC821800WLq2, enumC821800WLq3, enumC821800WLq4, enumC821800WLq5, enumC821800WLq6, enumC821800WLq7};
        LLILZ = enumC821800WLqArr;
        LLILZIL = new C2254308sP(enumC821800WLqArr);
        Companion = new Object() { // from class: X.0WLs
        };
        EnumC821800WLq[] enumC821800WLqArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821800WLqArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821800WLq enumC821800WLq8 : enumC821800WLqArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821800WLq8.getCode()), enumC821800WLq8);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821800WLq[] values() {
        return (EnumC821800WLq[]) LLILZ.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code:");
        sbLIZ.append(getCode());
        sbLIZ.append("; message:");
        sbLIZ.append(getDescription());
        sbLIZ.append("; intercept:");
        sbLIZ.append(getIntercept());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC821860WLw
    public int getCode() {
        return this.LL;
    }

    @Override // X.InterfaceC821860WLw
    public String getDescription() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC821860WLw
    public Boolean getIntercept() {
        return this.LLILLL;
    }

    public static EnumC821800WLq valueOf(String str) {
        return (EnumC821800WLq) C08FF.LIZ(EnumC821800WLq.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }

    public EnumC821800WLq(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
