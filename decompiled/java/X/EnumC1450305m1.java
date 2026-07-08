package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1450305m1 {
    public static final EnumC1450305m1 BY_PASS;
    public static final /* synthetic */ EnumC1450305m1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1450305m1 MUST_SHOW;
    public static final EnumC1450305m1 NORMAL;
    public static final EnumC1450305m1 SKIP_AVOID;

    public static InterfaceC2044707zh<EnumC1450305m1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1450305m1 enumC1450305m1 = new EnumC1450305m1("NORMAL", 0);
        NORMAL = enumC1450305m1;
        EnumC1450305m1 enumC1450305m12 = new EnumC1450305m1("MUST_SHOW", 1);
        MUST_SHOW = enumC1450305m12;
        EnumC1450305m1 enumC1450305m13 = new EnumC1450305m1("SKIP_AVOID", 2);
        SKIP_AVOID = enumC1450305m13;
        EnumC1450305m1 enumC1450305m14 = new EnumC1450305m1("BY_PASS", 3);
        BY_PASS = enumC1450305m14;
        EnumC1450305m1[] enumC1450305m1Arr = {enumC1450305m1, enumC1450305m12, enumC1450305m13, enumC1450305m14};
        LL = enumC1450305m1Arr;
        LLILLJJLI = new C2254308sP(enumC1450305m1Arr);
    }

    public static EnumC1450305m1[] values() {
        return (EnumC1450305m1[]) LL.clone();
    }

    public static EnumC1450305m1 valueOf(String str) {
        return (EnumC1450305m1) C08FF.LIZ(EnumC1450305m1.class, str);
    }

    public EnumC1450305m1(String str, int i) {
    }
}
