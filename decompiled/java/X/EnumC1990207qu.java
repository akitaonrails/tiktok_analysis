package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990207qu {
    public static final EnumC1990207qu COMBINED;
    public static final /* synthetic */ EnumC1990207qu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1990207qu SPLIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1990207qu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1990207qu enumC1990207qu = new EnumC1990207qu("COMBINED", 0, 1);
        COMBINED = enumC1990207qu;
        EnumC1990207qu enumC1990207qu2 = new EnumC1990207qu("SPLIT", 1, 2);
        SPLIT = enumC1990207qu2;
        EnumC1990207qu[] enumC1990207quArr = {enumC1990207qu, enumC1990207qu2};
        LLILLJJLI = enumC1990207quArr;
        LLILLL = new C2254308sP(enumC1990207quArr);
    }

    public static EnumC1990207qu[] values() {
        return (EnumC1990207qu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1990207qu valueOf(String str) {
        return (EnumC1990207qu) C08FF.LIZ(EnumC1990207qu.class, str);
    }

    public EnumC1990207qu(String str, int i, int i2) {
        this.LL = i2;
    }
}
