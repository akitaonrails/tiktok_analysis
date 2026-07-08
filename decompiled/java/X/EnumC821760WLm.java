package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821760WLm implements InterfaceC821860WLw {
    public static final C821830WLt Companion;
    public static final /* synthetic */ EnumC821760WLm[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC821760WLm LYNX_LOAD_BLOCK_BY_BLOCK_URL;
    public static final EnumC821760WLm LYNX_LOAD_BLOCK_BY_DYNAMIC_STRATEGY;
    public static final EnumC821760WLm LYNX_LOAD_BLOCK_BY_STATIC_STRATEGY;
    public static final EnumC821760WLm LYNX_LOAD_BLOCK_BY_VERIFY_FAILED;
    public static final EnumC821760WLm LYNX_LOAD_BLOCK_EXEMPTION;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL;
    public final String LLILLJJLI;
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821760WLm> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0WLt] */
    static {
        Boolean bool = Boolean.TRUE;
        EnumC821760WLm enumC821760WLm = new EnumC821760WLm("LYNX_LOAD_BLOCK_BY_VERIFY_FAILED", 0, 101, "Lynx loads failed for template verify failed", bool);
        LYNX_LOAD_BLOCK_BY_VERIFY_FAILED = enumC821760WLm;
        EnumC821760WLm enumC821760WLm2 = new EnumC821760WLm("LYNX_LOAD_BLOCK_BY_BLOCK_URL", 1, 102, "Lynx loads failed due to block url", bool);
        LYNX_LOAD_BLOCK_BY_BLOCK_URL = enumC821760WLm2;
        EnumC821760WLm enumC821760WLm3 = new EnumC821760WLm("LYNX_LOAD_BLOCK_EXEMPTION", 2, 103, "Lynx loads exemption", Boolean.FALSE);
        LYNX_LOAD_BLOCK_EXEMPTION = enumC821760WLm3;
        EnumC821760WLm enumC821760WLm4 = new EnumC821760WLm("LYNX_LOAD_BLOCK_BY_DYNAMIC_STRATEGY", 3, 104, "Lynx loads invalid url blocked by psp: lynx_load_block", bool);
        LYNX_LOAD_BLOCK_BY_DYNAMIC_STRATEGY = enumC821760WLm4;
        EnumC821760WLm enumC821760WLm5 = new EnumC821760WLm("LYNX_LOAD_BLOCK_BY_STATIC_STRATEGY", 4, 105, "Lynx loads invalid domain blocked by libra: tiktok_intercept_third_party_cdn_resource_config", bool);
        LYNX_LOAD_BLOCK_BY_STATIC_STRATEGY = enumC821760WLm5;
        EnumC821760WLm[] enumC821760WLmArr = {enumC821760WLm, enumC821760WLm2, enumC821760WLm3, enumC821760WLm4, enumC821760WLm5};
        LLILZ = enumC821760WLmArr;
        LLILZIL = new C2254308sP(enumC821760WLmArr);
        Companion = new Object() { // from class: X.0WLt
        };
        EnumC821760WLm[] enumC821760WLmArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821760WLmArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821760WLm enumC821760WLm6 : enumC821760WLmArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821760WLm6.getCode()), enumC821760WLm6);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821760WLm[] values() {
        return (EnumC821760WLm[]) LLILZ.clone();
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

    public static EnumC821760WLm valueOf(String str) {
        return (EnumC821760WLm) C08FF.LIZ(EnumC821760WLm.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }

    public EnumC821760WLm(String str, int i, int i2, String str2, Boolean bool) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
    }
}
