package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707450Rp1 {
    public static final EnumC707450Rp1 BOUND;
    public static final EnumC707450Rp1 INITIAL;
    public static final /* synthetic */ EnumC707450Rp1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC707450Rp1 SELECTED;
    public static final EnumC707450Rp1 UNSELECTED;
    public int LL;

    public static InterfaceC2044707zh<EnumC707450Rp1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC707450Rp1 enumC707450Rp1 = new EnumC707450Rp1("INITIAL", 0, 0);
        INITIAL = enumC707450Rp1;
        EnumC707450Rp1 enumC707450Rp12 = new EnumC707450Rp1("BOUND", 1, 1);
        BOUND = enumC707450Rp12;
        EnumC707450Rp1 enumC707450Rp13 = new EnumC707450Rp1("SELECTED", 2, 2);
        SELECTED = enumC707450Rp13;
        EnumC707450Rp1 enumC707450Rp14 = new EnumC707450Rp1("UNSELECTED", 3, 3);
        UNSELECTED = enumC707450Rp14;
        EnumC707450Rp1[] enumC707450Rp1Arr = {enumC707450Rp1, enumC707450Rp12, enumC707450Rp13, enumC707450Rp14};
        LLILLJJLI = enumC707450Rp1Arr;
        LLILLL = new C2254308sP(enumC707450Rp1Arr);
    }

    public static EnumC707450Rp1[] values() {
        return (EnumC707450Rp1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC707450Rp1 valueOf(String str) {
        return (EnumC707450Rp1) C08FF.LIZ(EnumC707450Rp1.class, str);
    }

    public final void setValue(int i) {
        this.LL = i;
    }

    public EnumC707450Rp1(String str, int i, int i2) {
        this.LL = i2;
    }
}
