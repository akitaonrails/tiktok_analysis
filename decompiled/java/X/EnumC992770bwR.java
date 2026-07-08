package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992770bwR {
    public static final EnumC992770bwR DATA_NOT_FOUND;
    public static final EnumC992770bwR FETCHING;
    public static final /* synthetic */ EnumC992770bwR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992770bwR SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992770bwR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992770bwR enumC992770bwR = new EnumC992770bwR("SUCCESS", 0, 0);
        SUCCESS = enumC992770bwR;
        EnumC992770bwR enumC992770bwR2 = new EnumC992770bwR("DATA_NOT_FOUND", 1, 1);
        DATA_NOT_FOUND = enumC992770bwR2;
        EnumC992770bwR enumC992770bwR3 = new EnumC992770bwR("FETCHING", 2, 2);
        FETCHING = enumC992770bwR3;
        EnumC992770bwR[] enumC992770bwRArr = {enumC992770bwR, enumC992770bwR2, enumC992770bwR3};
        LLILLJJLI = enumC992770bwRArr;
        LLILLL = new C2254308sP(enumC992770bwRArr);
    }

    public static EnumC992770bwR[] values() {
        return (EnumC992770bwR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992770bwR valueOf(String str) {
        return (EnumC992770bwR) C08FF.LIZ(EnumC992770bwR.class, str);
    }

    public EnumC992770bwR(String str, int i, int i2) {
        this.LL = i2;
    }
}
