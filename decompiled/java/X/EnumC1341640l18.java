package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341640l18 {
    public static final EnumC1341640l18 FOLD;
    public static final /* synthetic */ EnumC1341640l18[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1341640l18 UNFOLD;
    public static final EnumC1341640l18 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1341640l18> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1341640l18 enumC1341640l18 = new EnumC1341640l18("UNKNOWN", 0, -1);
        UNKNOWN = enumC1341640l18;
        EnumC1341640l18 enumC1341640l182 = new EnumC1341640l18("UNFOLD", 1, 0);
        UNFOLD = enumC1341640l182;
        EnumC1341640l18 enumC1341640l183 = new EnumC1341640l18("FOLD", 2, 1);
        FOLD = enumC1341640l183;
        EnumC1341640l18[] enumC1341640l18Arr = {enumC1341640l18, enumC1341640l182, enumC1341640l183};
        LLILLJJLI = enumC1341640l18Arr;
        LLILLL = new C2254308sP(enumC1341640l18Arr);
    }

    public static EnumC1341640l18[] values() {
        return (EnumC1341640l18[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1341640l18 valueOf(String str) {
        return (EnumC1341640l18) C08FF.LIZ(EnumC1341640l18.class, str);
    }

    public EnumC1341640l18(String str, int i, int i2) {
        this.LL = i2;
    }
}
