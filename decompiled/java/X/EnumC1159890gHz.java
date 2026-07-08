package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1159890gHz {
    public static final /* synthetic */ EnumC1159890gHz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1159890gHz SHOWN;
    public static final EnumC1159890gHz UNSHOWN_ADJUSTABLE;
    public static final EnumC1159890gHz UNSHOWN_NONADJUSTABLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1159890gHz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1159890gHz enumC1159890gHz = new EnumC1159890gHz("SHOWN", 0, 1);
        SHOWN = enumC1159890gHz;
        EnumC1159890gHz enumC1159890gHz2 = new EnumC1159890gHz("UNSHOWN_NONADJUSTABLE", 1, 2);
        UNSHOWN_NONADJUSTABLE = enumC1159890gHz2;
        EnumC1159890gHz enumC1159890gHz3 = new EnumC1159890gHz("UNSHOWN_ADJUSTABLE", 2, 3);
        UNSHOWN_ADJUSTABLE = enumC1159890gHz3;
        EnumC1159890gHz[] enumC1159890gHzArr = {enumC1159890gHz, enumC1159890gHz2, enumC1159890gHz3};
        LLILLJJLI = enumC1159890gHzArr;
        LLILLL = new C2254308sP(enumC1159890gHzArr);
    }

    public static EnumC1159890gHz[] values() {
        return (EnumC1159890gHz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1159890gHz valueOf(String str) {
        return (EnumC1159890gHz) C08FF.LIZ(EnumC1159890gHz.class, str);
    }

    public EnumC1159890gHz(String str, int i, int i2) {
        this.LL = i2;
    }
}
