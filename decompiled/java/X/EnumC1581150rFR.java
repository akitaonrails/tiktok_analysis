package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1581150rFR {
    public static final EnumC1581150rFR HISTORY;
    public static final /* synthetic */ EnumC1581150rFR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1581150rFR SORT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1581150rFR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1581150rFR enumC1581150rFR = new EnumC1581150rFR("SORT", 0, 1);
        SORT = enumC1581150rFR;
        EnumC1581150rFR enumC1581150rFR2 = new EnumC1581150rFR("HISTORY", 1, 2);
        HISTORY = enumC1581150rFR2;
        EnumC1581150rFR[] enumC1581150rFRArr = {enumC1581150rFR, enumC1581150rFR2};
        LLILLJJLI = enumC1581150rFRArr;
        LLILLL = new C2254308sP(enumC1581150rFRArr);
    }

    public static EnumC1581150rFR[] values() {
        return (EnumC1581150rFR[]) LLILLJJLI.clone();
    }

    public final int getDataLevel() {
        return this.LL;
    }

    public static EnumC1581150rFR valueOf(String str) {
        return (EnumC1581150rFR) C08FF.LIZ(EnumC1581150rFR.class, str);
    }

    public EnumC1581150rFR(String str, int i, int i2) {
        this.LL = i2;
    }
}
