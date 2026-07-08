package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1188490h27 {
    public static final /* synthetic */ EnumC1188490h27[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1188490h27 POI_BASIC;
    public static final EnumC1188490h27 SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1188490h27> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1188490h27 enumC1188490h27 = new EnumC1188490h27("SEARCH", 0, "search");
        SEARCH = enumC1188490h27;
        EnumC1188490h27 enumC1188490h272 = new EnumC1188490h27("POI_BASIC", 1, "poi_basic");
        POI_BASIC = enumC1188490h272;
        EnumC1188490h27[] enumC1188490h27Arr = {enumC1188490h27, enumC1188490h272};
        LLILLJJLI = enumC1188490h27Arr;
        LLILLL = new C2254308sP(enumC1188490h27Arr);
    }

    public static EnumC1188490h27[] values() {
        return (EnumC1188490h27[]) LLILLJJLI.clone();
    }

    public final String getKeyName() {
        return this.LL;
    }

    public static EnumC1188490h27 valueOf(String str) {
        return (EnumC1188490h27) C08FF.LIZ(EnumC1188490h27.class, str);
    }

    public EnumC1188490h27(String str, int i, String str2) {
        this.LL = str2;
    }
}
