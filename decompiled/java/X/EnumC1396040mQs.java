package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1396040mQs {
    public static final /* synthetic */ EnumC1396040mQs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1396040mQs NORMAL;
    public static final EnumC1396040mQs SEVEN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1396040mQs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1396040mQs enumC1396040mQs = new EnumC1396040mQs("NORMAL", 0, "normal");
        NORMAL = enumC1396040mQs;
        EnumC1396040mQs enumC1396040mQs2 = new EnumC1396040mQs("SEVEN", 1, "seven");
        SEVEN = enumC1396040mQs2;
        EnumC1396040mQs[] enumC1396040mQsArr = {enumC1396040mQs, enumC1396040mQs2};
        LLILLJJLI = enumC1396040mQsArr;
        LLILLL = new C2254308sP(enumC1396040mQsArr);
    }

    public static EnumC1396040mQs[] values() {
        return (EnumC1396040mQs[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1396040mQs valueOf(String str) {
        return (EnumC1396040mQs) C08FF.LIZ(EnumC1396040mQs.class, str);
    }

    public EnumC1396040mQs(String str, int i, String str2) {
        this.LL = str2;
    }
}
