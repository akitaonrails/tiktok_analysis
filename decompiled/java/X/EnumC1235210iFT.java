package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235210iFT {
    public static final /* synthetic */ EnumC1235210iFT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235210iFT NO;
    public static final EnumC1235210iFT YES;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1235210iFT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235210iFT enumC1235210iFT = new EnumC1235210iFT("NO", 0, 0);
        NO = enumC1235210iFT;
        EnumC1235210iFT enumC1235210iFT2 = new EnumC1235210iFT("YES", 1, 1);
        YES = enumC1235210iFT2;
        EnumC1235210iFT[] enumC1235210iFTArr = {enumC1235210iFT, enumC1235210iFT2};
        LLILLJJLI = enumC1235210iFTArr;
        LLILLL = new C2254308sP(enumC1235210iFTArr);
    }

    public static EnumC1235210iFT[] values() {
        return (EnumC1235210iFT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1235210iFT valueOf(String str) {
        return (EnumC1235210iFT) C08FF.LIZ(EnumC1235210iFT.class, str);
    }

    public EnumC1235210iFT(String str, int i, int i2) {
        this.LL = i2;
    }
}
