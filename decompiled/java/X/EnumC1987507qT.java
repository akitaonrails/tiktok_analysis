package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987507qT {
    public static final EnumC1987507qT FAIL_PLAY;
    public static final /* synthetic */ EnumC1987507qT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1987507qT SUCCESS_PLAY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1987507qT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1987507qT enumC1987507qT = new EnumC1987507qT("SUCCESS_PLAY", 0, 0);
        SUCCESS_PLAY = enumC1987507qT;
        EnumC1987507qT enumC1987507qT2 = new EnumC1987507qT("FAIL_PLAY", 1, 1);
        FAIL_PLAY = enumC1987507qT2;
        EnumC1987507qT[] enumC1987507qTArr = {enumC1987507qT, enumC1987507qT2};
        LLILLJJLI = enumC1987507qTArr;
        LLILLL = new C2254308sP(enumC1987507qTArr);
    }

    public static EnumC1987507qT[] values() {
        return (EnumC1987507qT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1987507qT valueOf(String str) {
        return (EnumC1987507qT) C08FF.LIZ(EnumC1987507qT.class, str);
    }

    public EnumC1987507qT(String str, int i, int i2) {
        this.LL = i2;
    }
}
