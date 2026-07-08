package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1288170jct {
    public static final EnumC1288170jct CANCEL;
    public static final EnumC1288170jct FAILURE;
    public static final /* synthetic */ EnumC1288170jct[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1288170jct SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1288170jct> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1288170jct enumC1288170jct = new EnumC1288170jct("SUCCESS", 0, 0);
        SUCCESS = enumC1288170jct;
        EnumC1288170jct enumC1288170jct2 = new EnumC1288170jct("FAILURE", 1, 1);
        FAILURE = enumC1288170jct2;
        EnumC1288170jct enumC1288170jct3 = new EnumC1288170jct("CANCEL", 2, 2);
        CANCEL = enumC1288170jct3;
        EnumC1288170jct[] enumC1288170jctArr = {enumC1288170jct, enumC1288170jct2, enumC1288170jct3};
        LLILLJJLI = enumC1288170jctArr;
        LLILLL = new C2254308sP(enumC1288170jctArr);
    }

    public static EnumC1288170jct[] values() {
        return (EnumC1288170jct[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1288170jct valueOf(String str) {
        return (EnumC1288170jct) C08FF.LIZ(EnumC1288170jct.class, str);
    }

    public EnumC1288170jct(String str, int i, int i2) {
        this.LL = i2;
    }
}
