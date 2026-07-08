package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1411605fm {
    public static final EnumC1411605fm BUSINESS_INSIGHTS;
    public static final EnumC1411605fm CHAT_INTRO;
    public static final EnumC1411605fm FAQ;
    public static final /* synthetic */ EnumC1411605fm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1411605fm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1411605fm enumC1411605fm = new EnumC1411605fm("FAQ", 0, "faq");
        FAQ = enumC1411605fm;
        EnumC1411605fm enumC1411605fm2 = new EnumC1411605fm("BUSINESS_INSIGHTS", 1, "business_insights");
        BUSINESS_INSIGHTS = enumC1411605fm2;
        EnumC1411605fm enumC1411605fm3 = new EnumC1411605fm("CHAT_INTRO", 2, "chat_intro");
        CHAT_INTRO = enumC1411605fm3;
        EnumC1411605fm[] enumC1411605fmArr = {enumC1411605fm, enumC1411605fm2, enumC1411605fm3};
        LLILLJJLI = enumC1411605fmArr;
        LLILLL = new C2254308sP(enumC1411605fmArr);
    }

    public static EnumC1411605fm[] values() {
        return (EnumC1411605fm[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1411605fm valueOf(String str) {
        return (EnumC1411605fm) C08FF.LIZ(EnumC1411605fm.class, str);
    }

    public EnumC1411605fm(String str, int i, String str2) {
        this.LL = str2;
    }
}
