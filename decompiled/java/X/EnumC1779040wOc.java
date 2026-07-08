package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779040wOc {
    public static final EnumC1779040wOc EXPIRED;
    public static final /* synthetic */ EnumC1779040wOc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779040wOc NO_CACHE;
    public static final EnumC1779040wOc NO_ENOUGH_CACHE;
    public static final EnumC1779040wOc SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779040wOc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779040wOc enumC1779040wOc = new EnumC1779040wOc("SUCCESS", 0, 0);
        SUCCESS = enumC1779040wOc;
        EnumC1779040wOc enumC1779040wOc2 = new EnumC1779040wOc("NO_CACHE", 1, 1);
        NO_CACHE = enumC1779040wOc2;
        EnumC1779040wOc enumC1779040wOc3 = new EnumC1779040wOc("NO_ENOUGH_CACHE", 2, 2);
        NO_ENOUGH_CACHE = enumC1779040wOc3;
        EnumC1779040wOc enumC1779040wOc4 = new EnumC1779040wOc("EXPIRED", 3, 3);
        EXPIRED = enumC1779040wOc4;
        EnumC1779040wOc[] enumC1779040wOcArr = {enumC1779040wOc, enumC1779040wOc2, enumC1779040wOc3, enumC1779040wOc4};
        LLILLJJLI = enumC1779040wOcArr;
        LLILLL = new C2254308sP(enumC1779040wOcArr);
    }

    public static EnumC1779040wOc[] values() {
        return (EnumC1779040wOc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779040wOc valueOf(String str) {
        return (EnumC1779040wOc) C08FF.LIZ(EnumC1779040wOc.class, str);
    }

    public EnumC1779040wOc(String str, int i, int i2) {
        this.LL = i2;
    }
}
