package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1206110hUX {
    public static final C1206120hUY Companion;
    public static final EnumC1206110hUX HIDE;
    public static final /* synthetic */ EnumC1206110hUX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1206110hUX SHOW;
    public static final EnumC1206110hUX UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1206110hUX> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0hUY] */
    static {
        EnumC1206110hUX enumC1206110hUX = new EnumC1206110hUX("UNKNOWN", 0, 0);
        UNKNOWN = enumC1206110hUX;
        EnumC1206110hUX enumC1206110hUX2 = new EnumC1206110hUX("HIDE", 1, 1);
        HIDE = enumC1206110hUX2;
        EnumC1206110hUX enumC1206110hUX3 = new EnumC1206110hUX("SHOW", 2, 2);
        SHOW = enumC1206110hUX3;
        EnumC1206110hUX[] enumC1206110hUXArr = {enumC1206110hUX, enumC1206110hUX2, enumC1206110hUX3};
        LLILLJJLI = enumC1206110hUXArr;
        LLILLL = new C2254308sP(enumC1206110hUXArr);
        Companion = new Object() { // from class: X.0hUY
        };
    }

    public static EnumC1206110hUX[] values() {
        return (EnumC1206110hUX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1206110hUX valueOf(String str) {
        return (EnumC1206110hUX) C08FF.LIZ(EnumC1206110hUX.class, str);
    }

    public EnumC1206110hUX(String str, int i, int i2) {
        this.LL = i2;
    }
}
