package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1706170uV5 {
    public static final EnumC1706170uV5 DETAIL;
    public static final /* synthetic */ EnumC1706170uV5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1706170uV5 NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1706170uV5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1706170uV5 enumC1706170uV5 = new EnumC1706170uV5("NORMAL", 0, 0);
        NORMAL = enumC1706170uV5;
        EnumC1706170uV5 enumC1706170uV52 = new EnumC1706170uV5("DETAIL", 1, 1);
        DETAIL = enumC1706170uV52;
        EnumC1706170uV5[] enumC1706170uV5Arr = {enumC1706170uV5, enumC1706170uV52};
        LLILLJJLI = enumC1706170uV5Arr;
        LLILLL = new C2254308sP(enumC1706170uV5Arr);
    }

    public static EnumC1706170uV5[] values() {
        return (EnumC1706170uV5[]) LLILLJJLI.clone();
    }

    public final int getMark() {
        return this.LL;
    }

    public static EnumC1706170uV5 valueOf(String str) {
        return (EnumC1706170uV5) C08FF.LIZ(EnumC1706170uV5.class, str);
    }

    public EnumC1706170uV5(String str, int i, int i2) {
        this.LL = i2;
    }
}
