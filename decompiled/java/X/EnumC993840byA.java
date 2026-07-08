package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993840byA {
    public static final EnumC993840byA HELPFUL;
    public static final /* synthetic */ EnumC993840byA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993840byA MY_FOOTNOTE;
    public static final EnumC993840byA NONE;
    public static final EnumC993840byA NOT_HELPFUL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993840byA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993840byA enumC993840byA = new EnumC993840byA("NONE", 0, 0);
        NONE = enumC993840byA;
        EnumC993840byA enumC993840byA2 = new EnumC993840byA("HELPFUL", 1, 1);
        HELPFUL = enumC993840byA2;
        EnumC993840byA enumC993840byA3 = new EnumC993840byA("NOT_HELPFUL", 2, 2);
        NOT_HELPFUL = enumC993840byA3;
        EnumC993840byA enumC993840byA4 = new EnumC993840byA("MY_FOOTNOTE", 3, 55);
        MY_FOOTNOTE = enumC993840byA4;
        EnumC993840byA[] enumC993840byAArr = {enumC993840byA, enumC993840byA2, enumC993840byA3, enumC993840byA4};
        LLILLJJLI = enumC993840byAArr;
        LLILLL = new C2254308sP(enumC993840byAArr);
    }

    public static EnumC993840byA[] values() {
        return (EnumC993840byA[]) LLILLJJLI.clone();
    }

    public final int getResult() {
        return this.LL;
    }

    public static EnumC993840byA valueOf(String str) {
        return (EnumC993840byA) C08FF.LIZ(EnumC993840byA.class, str);
    }

    public EnumC993840byA(String str, int i, int i2) {
        this.LL = i2;
    }
}
