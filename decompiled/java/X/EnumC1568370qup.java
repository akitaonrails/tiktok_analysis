package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1568370qup {
    public static final EnumC1568370qup HOT_CACHE_PREFETCH;
    public static final /* synthetic */ EnumC1568370qup[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1568370qup NORMAL_PREFETCH;
    public static final EnumC1568370qup NO_PREFETCH;
    public static final EnumC1568370qup SERVER_PREFETCH;
    public static final EnumC1568370qup STARSHIP_PREFETCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1568370qup> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1568370qup enumC1568370qup = new EnumC1568370qup("NO_PREFETCH", 0, 0);
        NO_PREFETCH = enumC1568370qup;
        EnumC1568370qup enumC1568370qup2 = new EnumC1568370qup("NORMAL_PREFETCH", 1, 1);
        NORMAL_PREFETCH = enumC1568370qup2;
        EnumC1568370qup enumC1568370qup3 = new EnumC1568370qup("STARSHIP_PREFETCH", 2, 2);
        STARSHIP_PREFETCH = enumC1568370qup3;
        EnumC1568370qup enumC1568370qup4 = new EnumC1568370qup("SERVER_PREFETCH", 3, 3);
        SERVER_PREFETCH = enumC1568370qup4;
        EnumC1568370qup enumC1568370qup5 = new EnumC1568370qup("HOT_CACHE_PREFETCH", 4, 4);
        HOT_CACHE_PREFETCH = enumC1568370qup5;
        EnumC1568370qup[] enumC1568370qupArr = {enumC1568370qup, enumC1568370qup2, enumC1568370qup3, enumC1568370qup4, enumC1568370qup5};
        LLILLJJLI = enumC1568370qupArr;
        LLILLL = new C2254308sP(enumC1568370qupArr);
    }

    public static EnumC1568370qup[] values() {
        return (EnumC1568370qup[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1568370qup valueOf(String str) {
        return (EnumC1568370qup) C08FF.LIZ(EnumC1568370qup.class, str);
    }

    public EnumC1568370qup(String str, int i, int i2) {
        this.LL = i2;
    }
}
