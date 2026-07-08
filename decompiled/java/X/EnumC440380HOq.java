package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440380HOq {
    public static final EnumC440380HOq DIRECT;
    public static final EnumC440380HOq GENERATION_HISTORY;
    public static final /* synthetic */ EnumC440380HOq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440380HOq STUDIO_GENERATING_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440380HOq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440380HOq enumC440380HOq = new EnumC440380HOq("STUDIO_GENERATING_PAGE", 0, "studio_generating_page");
        STUDIO_GENERATING_PAGE = enumC440380HOq;
        EnumC440380HOq enumC440380HOq2 = new EnumC440380HOq("DIRECT", 1, "direct");
        DIRECT = enumC440380HOq2;
        EnumC440380HOq enumC440380HOq3 = new EnumC440380HOq("GENERATION_HISTORY", 2, "generation_history");
        GENERATION_HISTORY = enumC440380HOq3;
        EnumC440380HOq[] enumC440380HOqArr = {enumC440380HOq, enumC440380HOq2, enumC440380HOq3};
        LLILLJJLI = enumC440380HOqArr;
        LLILLL = new C2254308sP(enumC440380HOqArr);
    }

    public static EnumC440380HOq[] values() {
        return (EnumC440380HOq[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440380HOq valueOf(String str) {
        return (EnumC440380HOq) C08FF.LIZ(EnumC440380HOq.class, str);
    }

    public EnumC440380HOq(String str, int i, String str2) {
        this.LL = str2;
    }
}
