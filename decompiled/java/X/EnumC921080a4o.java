package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC921080a4o {
    public static final /* synthetic */ EnumC921080a4o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC921080a4o MATCH_CUP_FULL_LEVEL;
    public static final EnumC921080a4o MATCH_CUP_LEVEL_ONE;
    public static final EnumC921080a4o MATCH_CUP_LEVEL_TWO;
    public final long LL;

    public static InterfaceC2044707zh<EnumC921080a4o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC921080a4o enumC921080a4o = new EnumC921080a4o("MATCH_CUP_LEVEL_ONE", 0, 1L);
        MATCH_CUP_LEVEL_ONE = enumC921080a4o;
        EnumC921080a4o enumC921080a4o2 = new EnumC921080a4o("MATCH_CUP_LEVEL_TWO", 1, 2L);
        MATCH_CUP_LEVEL_TWO = enumC921080a4o2;
        EnumC921080a4o enumC921080a4o3 = new EnumC921080a4o("MATCH_CUP_FULL_LEVEL", 2, 3L);
        MATCH_CUP_FULL_LEVEL = enumC921080a4o3;
        EnumC921080a4o[] enumC921080a4oArr = {enumC921080a4o, enumC921080a4o2, enumC921080a4o3};
        LLILLJJLI = enumC921080a4oArr;
        LLILLL = new C2254308sP(enumC921080a4oArr);
    }

    public static EnumC921080a4o[] values() {
        return (EnumC921080a4o[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC921080a4o valueOf(String str) {
        return (EnumC921080a4o) C08FF.LIZ(EnumC921080a4o.class, str);
    }

    public EnumC921080a4o(String str, int i, long j) {
        this.LL = j;
    }
}
