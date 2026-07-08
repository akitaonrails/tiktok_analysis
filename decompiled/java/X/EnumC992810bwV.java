package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992810bwV {
    public static final /* synthetic */ EnumC992810bwV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992810bwV REMOVED_BY_REACH_REPEAT;
    public static final EnumC992810bwV REMOVE_BY_BIZ;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992810bwV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992810bwV enumC992810bwV = new EnumC992810bwV("REMOVE_BY_BIZ", 0, 1);
        REMOVE_BY_BIZ = enumC992810bwV;
        EnumC992810bwV enumC992810bwV2 = new EnumC992810bwV("REMOVED_BY_REACH_REPEAT", 1, 2);
        REMOVED_BY_REACH_REPEAT = enumC992810bwV2;
        EnumC992810bwV[] enumC992810bwVArr = {enumC992810bwV, enumC992810bwV2};
        LLILLJJLI = enumC992810bwVArr;
        LLILLL = new C2254308sP(enumC992810bwVArr);
    }

    public static EnumC992810bwV[] values() {
        return (EnumC992810bwV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992810bwV valueOf(String str) {
        return (EnumC992810bwV) C08FF.LIZ(EnumC992810bwV.class, str);
    }

    public EnumC992810bwV(String str, int i, int i2) {
        this.LL = i2;
    }
}
