package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC845360XEg {
    public static final EnumC845360XEg FORCED;
    public static final /* synthetic */ EnumC845360XEg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC845360XEg SUPPRESSED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC845360XEg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC845360XEg enumC845360XEg = new EnumC845360XEg("FORCED", 0, "forced");
        FORCED = enumC845360XEg;
        EnumC845360XEg enumC845360XEg2 = new EnumC845360XEg("SUPPRESSED", 1, "suppressed");
        SUPPRESSED = enumC845360XEg2;
        EnumC845360XEg[] enumC845360XEgArr = {enumC845360XEg, enumC845360XEg2};
        LLILLJJLI = enumC845360XEgArr;
        LLILLL = new C2254308sP(enumC845360XEgArr);
    }

    public static EnumC845360XEg[] values() {
        return (EnumC845360XEg[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC845360XEg valueOf(String str) {
        return (EnumC845360XEg) C08FF.LIZ(EnumC845360XEg.class, str);
    }

    public EnumC845360XEg(String str, int i, String str2) {
        this.LL = str2;
    }
}
