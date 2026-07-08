package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1591490rW7 {
    public static final EnumC1591490rW7 BIG_FONT;
    public static final C1591810rWd Companion;
    public static final /* synthetic */ EnumC1591490rW7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1591490rW7 SMALL_FONT;
    public static final EnumC1591490rW7 SMALL_NARROW_FONT;
    public final float LL;

    public static InterfaceC2044707zh<EnumC1591490rW7> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0rWd] */
    static {
        EnumC1591490rW7 enumC1591490rW7 = new EnumC1591490rW7(17.0f, "BIG_FONT", 0);
        BIG_FONT = enumC1591490rW7;
        EnumC1591490rW7 enumC1591490rW72 = new EnumC1591490rW7(15.0f, "SMALL_FONT", 1);
        SMALL_FONT = enumC1591490rW72;
        EnumC1591490rW7 enumC1591490rW73 = new EnumC1591490rW7(15.0f, "SMALL_NARROW_FONT", 2);
        SMALL_NARROW_FONT = enumC1591490rW73;
        EnumC1591490rW7[] enumC1591490rW7Arr = {enumC1591490rW7, enumC1591490rW72, enumC1591490rW73};
        LLILLJJLI = enumC1591490rW7Arr;
        LLILLL = new C2254308sP(enumC1591490rW7Arr);
        Companion = new Object() { // from class: X.0rWd
        };
    }

    public static EnumC1591490rW7[] values() {
        return (EnumC1591490rW7[]) LLILLJJLI.clone();
    }

    public final float getFontSize() {
        return this.LL;
    }

    public static EnumC1591490rW7 valueOf(String str) {
        return (EnumC1591490rW7) C08FF.LIZ(EnumC1591490rW7.class, str);
    }

    public EnumC1591490rW7(float f, String str, int i) {
        this.LL = f;
    }
}
