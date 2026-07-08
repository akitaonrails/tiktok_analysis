package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1615630s93 {
    public static final EnumC1615630s93 CAPSULE;
    public static final /* synthetic */ EnumC1615630s93[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1615630s93 RECTANGLE;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC1615630s93> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1615630s93 enumC1615630s93 = new EnumC1615630s93("CAPSULE", 0, 200, 200, 200, 200);
        CAPSULE = enumC1615630s93;
        EnumC1615630s93 enumC1615630s932 = new EnumC1615630s93("RECTANGLE", 1, 9, 8, 8, 4);
        RECTANGLE = enumC1615630s932;
        EnumC1615630s93[] enumC1615630s93Arr = {enumC1615630s93, enumC1615630s932};
        LLILZIL = enumC1615630s93Arr;
        LLILZLL = new C2254308sP(enumC1615630s93Arr);
    }

    public static EnumC1615630s93[] values() {
        return (EnumC1615630s93[]) LLILZIL.clone();
    }

    public final int getInnerRadiusSmall() {
        return this.LLILLL;
    }

    public final int getInnerRadiusXSmall() {
        return this.LLILZ;
    }

    public final int getOuterRadiusSmall() {
        return this.LL;
    }

    public final int getOuterRadiusXSmall() {
        return this.LLILLJJLI;
    }

    public static EnumC1615630s93 valueOf(String str) {
        return (EnumC1615630s93) C08FF.LIZ(EnumC1615630s93.class, str);
    }

    public EnumC1615630s93(String str, int i, int i2, int i3, int i4, int i5) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = i5;
    }
}
