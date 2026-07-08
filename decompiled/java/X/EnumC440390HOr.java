package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440390HOr {
    public static final EnumC440390HOr COMPLETE;
    public static final /* synthetic */ EnumC440390HOr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440390HOr MORE_GENERATING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440390HOr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440390HOr enumC440390HOr = new EnumC440390HOr("MORE_GENERATING", 0, "more_generating");
        MORE_GENERATING = enumC440390HOr;
        EnumC440390HOr enumC440390HOr2 = new EnumC440390HOr("COMPLETE", 1, "complete");
        COMPLETE = enumC440390HOr2;
        EnumC440390HOr[] enumC440390HOrArr = {enumC440390HOr, enumC440390HOr2};
        LLILLJJLI = enumC440390HOrArr;
        LLILLL = new C2254308sP(enumC440390HOrArr);
    }

    public static EnumC440390HOr[] values() {
        return (EnumC440390HOr[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440390HOr valueOf(String str) {
        return (EnumC440390HOr) C08FF.LIZ(EnumC440390HOr.class, str);
    }

    public EnumC440390HOr(String str, int i, String str2) {
        this.LL = str2;
    }
}
