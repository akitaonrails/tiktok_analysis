package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996807ry {
    public static final EnumC1996807ry LAUNCH;
    public static final /* synthetic */ EnumC1996807ry[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1996807ry TAB;
    public static final EnumC1996807ry TAB_BIZ;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1996807ry> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1996807ry enumC1996807ry = new EnumC1996807ry("LAUNCH", 0, "launch");
        LAUNCH = enumC1996807ry;
        EnumC1996807ry enumC1996807ry2 = new EnumC1996807ry("TAB", 1, "tab");
        TAB = enumC1996807ry2;
        EnumC1996807ry enumC1996807ry3 = new EnumC1996807ry("TAB_BIZ", 2, "tab_biz");
        TAB_BIZ = enumC1996807ry3;
        EnumC1996807ry[] enumC1996807ryArr = {enumC1996807ry, enumC1996807ry2, enumC1996807ry3};
        LLILLJJLI = enumC1996807ryArr;
        LLILLL = new C2254308sP(enumC1996807ryArr);
    }

    public static EnumC1996807ry[] values() {
        return (EnumC1996807ry[]) LLILLJJLI.clone();
    }

    public final String getTaskType() {
        return this.LL;
    }

    public static EnumC1996807ry valueOf(String str) {
        return (EnumC1996807ry) C08FF.LIZ(EnumC1996807ry.class, str);
    }

    public EnumC1996807ry(String str, int i, String str2) {
        this.LL = str2;
    }
}
