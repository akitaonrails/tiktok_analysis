package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756020vnU {
    public static final EnumC1756020vnU LAST_USED_CACHE;
    public static final /* synthetic */ EnumC1756020vnU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1756020vnU NOCACHE;
    public static final EnumC1756020vnU PREFETCH_FULL;
    public static final EnumC1756020vnU PREFETCH_PART;
    public static final EnumC1756020vnU UNDEFINE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1756020vnU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756020vnU enumC1756020vnU = new EnumC1756020vnU("UNDEFINE", 0, -1);
        UNDEFINE = enumC1756020vnU;
        EnumC1756020vnU enumC1756020vnU2 = new EnumC1756020vnU("NOCACHE", 1, 0);
        NOCACHE = enumC1756020vnU2;
        EnumC1756020vnU enumC1756020vnU3 = new EnumC1756020vnU("PREFETCH_FULL", 2, 1);
        PREFETCH_FULL = enumC1756020vnU3;
        EnumC1756020vnU enumC1756020vnU4 = new EnumC1756020vnU("PREFETCH_PART", 3, 2);
        PREFETCH_PART = enumC1756020vnU4;
        EnumC1756020vnU enumC1756020vnU5 = new EnumC1756020vnU("LAST_USED_CACHE", 4, 3);
        LAST_USED_CACHE = enumC1756020vnU5;
        EnumC1756020vnU[] enumC1756020vnUArr = {enumC1756020vnU, enumC1756020vnU2, enumC1756020vnU3, enumC1756020vnU4, enumC1756020vnU5};
        LLILLJJLI = enumC1756020vnUArr;
        LLILLL = new C2254308sP(enumC1756020vnUArr);
    }

    public static EnumC1756020vnU[] values() {
        return (EnumC1756020vnU[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1756020vnU valueOf(String str) {
        return (EnumC1756020vnU) C08FF.LIZ(EnumC1756020vnU.class, str);
    }

    public EnumC1756020vnU(String str, int i, int i2) {
        this.LL = i2;
    }
}
