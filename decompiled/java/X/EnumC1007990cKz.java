package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007990cKz {
    public static final EnumC1007990cKz ANOLE_COMPONENT_NULL;
    public static final EnumC1007990cKz ANOLE_DEPENDENCY_NOT_READY;
    public static final EnumC1007990cKz ANOLE_NOT_IN_APPEARPHASE;
    public static final EnumC1007990cKz ANOLE_REACHED_MAX_SHOW_COUNT;
    public static final EnumC1007990cKz ANOLE_UNKNOWN;
    public static final EnumC1007990cKz ANOLE_UPTO_BUSINESS;
    public static final EnumC1007990cKz ANOLE_WITHIN_SKIP_COUNT;
    public static final /* synthetic */ EnumC1007990cKz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public String LL;

    public static InterfaceC2044707zh<EnumC1007990cKz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1007990cKz enumC1007990cKz = new EnumC1007990cKz("ANOLE_NOT_IN_APPEARPHASE", 0, "not_in_appear_phase");
        ANOLE_NOT_IN_APPEARPHASE = enumC1007990cKz;
        EnumC1007990cKz enumC1007990cKz2 = new EnumC1007990cKz("ANOLE_REACHED_MAX_SHOW_COUNT", 1, "reached_max_show_count");
        ANOLE_REACHED_MAX_SHOW_COUNT = enumC1007990cKz2;
        EnumC1007990cKz enumC1007990cKz3 = new EnumC1007990cKz("ANOLE_COMPONENT_NULL", 2, "component_null");
        ANOLE_COMPONENT_NULL = enumC1007990cKz3;
        EnumC1007990cKz enumC1007990cKz4 = new EnumC1007990cKz("ANOLE_WITHIN_SKIP_COUNT", 3, "within_skip_count");
        ANOLE_WITHIN_SKIP_COUNT = enumC1007990cKz4;
        EnumC1007990cKz enumC1007990cKz5 = new EnumC1007990cKz("ANOLE_UPTO_BUSINESS", 4, "upto_business");
        ANOLE_UPTO_BUSINESS = enumC1007990cKz5;
        EnumC1007990cKz enumC1007990cKz6 = new EnumC1007990cKz("ANOLE_DEPENDENCY_NOT_READY", 5, "dependency_not_ready");
        ANOLE_DEPENDENCY_NOT_READY = enumC1007990cKz6;
        EnumC1007990cKz enumC1007990cKz7 = new EnumC1007990cKz("ANOLE_UNKNOWN", 6, "unknown");
        ANOLE_UNKNOWN = enumC1007990cKz7;
        EnumC1007990cKz[] enumC1007990cKzArr = {enumC1007990cKz, enumC1007990cKz2, enumC1007990cKz3, enumC1007990cKz4, enumC1007990cKz5, enumC1007990cKz6, enumC1007990cKz7};
        LLILLJJLI = enumC1007990cKzArr;
        LLILLL = new C2254308sP(enumC1007990cKzArr);
    }

    public static EnumC1007990cKz[] values() {
        return (EnumC1007990cKz[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1007990cKz valueOf(String str) {
        return (EnumC1007990cKz) C08FF.LIZ(EnumC1007990cKz.class, str);
    }

    public final void setReason(String str) {
        this.LL = str;
    }

    public EnumC1007990cKz(String str, int i, String str2) {
        this.LL = str2;
    }
}
