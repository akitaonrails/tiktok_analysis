package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821690WLf implements InterfaceC821860WLw {
    public static final C821700WLg Companion;
    public static final /* synthetic */ EnumC821690WLf[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC821690WLf WEB_ROUTER_DFID_NULL;
    public static final EnumC821690WLf WEB_ROUTER_NEED_USE_CCT;
    public static final EnumC821690WLf WEB_ROUTER_RASP_BLOCKED;
    public static final EnumC821690WLf WEB_ROUTER_SANDBOX_INTERCEPT;
    public static final EnumC821690WLf WEB_ROUTER_SCHEME_MODIFY;
    public static final EnumC821690WLf WEB_ROUTER_SECLINK_OPEN_DEFAULT_GLOBALLY;
    public static final Map<Integer, InterfaceC821860WLw> codeMap;
    public final int LL;
    public final String LLILLJJLI;
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821690WLf> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0WLg] */
    static {
        Boolean bool = Boolean.TRUE;
        EnumC821690WLf enumC821690WLf = new EnumC821690WLf("WEB_ROUTER_DFID_NULL", 0, 101, "web_router_dataflowId_is_null; For 3rd-party H5, please use CCT/SparkThird to open", bool);
        WEB_ROUTER_DFID_NULL = enumC821690WLf;
        EnumC821690WLf enumC821690WLf2 = new EnumC821690WLf("WEB_ROUTER_NEED_USE_CCT", 1, 102, "web_router_uses_CCT_container_to_open_instead", bool);
        WEB_ROUTER_NEED_USE_CCT = enumC821690WLf2;
        EnumC821690WLf enumC821690WLf3 = new EnumC821690WLf("WEB_ROUTER_SANDBOX_INTERCEPT", 2, 103, "web_router_intercepted_by_sandbox", bool);
        WEB_ROUTER_SANDBOX_INTERCEPT = enumC821690WLf3;
        EnumC821690WLf enumC821690WLf4 = new EnumC821690WLf("WEB_ROUTER_SECLINK_OPEN_DEFAULT_GLOBALLY", 3, 104, "web_router_seclink_open_default_globally", bool);
        WEB_ROUTER_SECLINK_OPEN_DEFAULT_GLOBALLY = enumC821690WLf4;
        EnumC821690WLf enumC821690WLf5 = new EnumC821690WLf("WEB_ROUTER_SCHEME_MODIFY", 4, 302, "web_router_modify_scheme", bool);
        WEB_ROUTER_SCHEME_MODIFY = enumC821690WLf5;
        EnumC821690WLf enumC821690WLf6 = new EnumC821690WLf("WEB_ROUTER_RASP_BLOCKED", 5, 501, "Blocked by RASP", bool);
        WEB_ROUTER_RASP_BLOCKED = enumC821690WLf6;
        EnumC821690WLf[] enumC821690WLfArr = {enumC821690WLf, enumC821690WLf2, enumC821690WLf3, enumC821690WLf4, enumC821690WLf5, enumC821690WLf6};
        LLILZ = enumC821690WLfArr;
        LLILZIL = new C2254308sP(enumC821690WLfArr);
        Companion = new Object() { // from class: X.0WLg
        };
        EnumC821690WLf[] enumC821690WLfArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC821690WLfArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC821690WLf enumC821690WLf7 : enumC821690WLfArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC821690WLf7.getCode()), enumC821690WLf7);
        }
        codeMap = linkedHashMap;
    }

    public static EnumC821690WLf[] values() {
        return (EnumC821690WLf[]) LLILZ.clone();
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

    public static EnumC821690WLf valueOf(String str) {
        return (EnumC821690WLf) C08FF.LIZ(EnumC821690WLf.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }

    public EnumC821690WLf(String str, int i, int i2, String str2, Boolean bool) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
    }
}
