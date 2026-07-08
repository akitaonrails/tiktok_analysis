package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SN2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SN2 {
    public static final C0SN2 BETWEEN_1_TO_1_AND_4_TO_3;
    public static final C0SN3 Companion;
    public static final /* synthetic */ C0SN2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SN2 SHORTER_THAN_1_TO_1;
    public static final C0SN2 TALLER_THAN_4_TO_3;
    public static final C0SN2 UNKNOWN;
    public final float LL;
    public final float maxValue;
    public final float minValue;

    public static InterfaceC2044707zh<C0SN2> getEntries() {
        return LLILLL;
    }

    public static final C0SN2 getRatioCategory(boolean z, boolean z2, Float f, boolean z3) {
        Companion.getClass();
        return C0SN3.LIZ(z, z2, f, z3);
    }

    static {
        C0SN2 c0sn2 = new C0SN2(0, 0.0f, 1.0f, 0.18f, "SHORTER_THAN_1_TO_1");
        SHORTER_THAN_1_TO_1 = c0sn2;
        C0SN2 c0sn22 = new C0SN2(1, 1.0f, 1.3333334f, 0.25f, "BETWEEN_1_TO_1_AND_4_TO_3");
        BETWEEN_1_TO_1_AND_4_TO_3 = c0sn22;
        C0SN2 c0sn23 = new C0SN2(2, 1.3333334f, Float.MAX_VALUE, 0.37f, "TALLER_THAN_4_TO_3");
        TALLER_THAN_4_TO_3 = c0sn23;
        C0SN2 c0sn24 = new C0SN2(3, -1.0f, -1.0f, 0.0f, "UNKNOWN");
        UNKNOWN = c0sn24;
        C0SN2[] c0sn2Arr = {c0sn2, c0sn22, c0sn23, c0sn24};
        LLILLJJLI = c0sn2Arr;
        LLILLL = new C2254308sP(c0sn2Arr);
        Companion = new C0SN3();
    }

    public static C0SN2[] values() {
        return (C0SN2[]) LLILLJJLI.clone();
    }

    public final float getExpectedContentRatio() {
        return this.LL;
    }

    public static C0SN2 valueOf(String str) {
        return (C0SN2) C08FF.LIZ(C0SN2.class, str);
    }

    public C0SN2(int i, float f, float f2, float f3, String str) {
        this.minValue = f;
        this.maxValue = f2;
        this.LL = f3;
    }
}
