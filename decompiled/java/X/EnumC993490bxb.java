package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993490bxb {
    public static final /* synthetic */ EnumC993490bxb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993490bxb TYPE_AI_GENERATE;
    public static final EnumC993490bxb TYPE_NORMAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993490bxb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993490bxb enumC993490bxb = new EnumC993490bxb("TYPE_AI_GENERATE", 0, "ai_generate");
        TYPE_AI_GENERATE = enumC993490bxb;
        EnumC993490bxb enumC993490bxb2 = new EnumC993490bxb("TYPE_NORMAL", 1, "normal");
        TYPE_NORMAL = enumC993490bxb2;
        EnumC993490bxb[] enumC993490bxbArr = {enumC993490bxb, enumC993490bxb2};
        LLILLJJLI = enumC993490bxbArr;
        LLILLL = new C2254308sP(enumC993490bxbArr);
    }

    public static EnumC993490bxb[] values() {
        return (EnumC993490bxb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC993490bxb valueOf(String str) {
        return (EnumC993490bxb) C08FF.LIZ(EnumC993490bxb.class, str);
    }

    public EnumC993490bxb(String str, int i, String str2) {
        this.LL = str2;
    }
}
