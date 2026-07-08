package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1899970zXf {
    public static final EnumC1899970zXf FEED;
    public static final EnumC1899970zXf JSB;
    public static final /* synthetic */ EnumC1899970zXf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1899970zXf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1899970zXf enumC1899970zXf = new EnumC1899970zXf("JSB", 0, "jsb");
        JSB = enumC1899970zXf;
        EnumC1899970zXf enumC1899970zXf2 = new EnumC1899970zXf("FEED", 1, "feed");
        FEED = enumC1899970zXf2;
        EnumC1899970zXf[] enumC1899970zXfArr = {enumC1899970zXf, enumC1899970zXf2};
        LLILLJJLI = enumC1899970zXfArr;
        LLILLL = new C2254308sP(enumC1899970zXfArr);
    }

    public static EnumC1899970zXf[] values() {
        return (EnumC1899970zXf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1899970zXf valueOf(String str) {
        return (EnumC1899970zXf) C08FF.LIZ(EnumC1899970zXf.class, str);
    }

    public EnumC1899970zXf(String str, int i, String str2) {
        this.LL = str2;
    }
}
