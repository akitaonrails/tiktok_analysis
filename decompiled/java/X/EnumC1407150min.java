package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0min, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1407150min {
    public static final C1407170mip Companion;
    public static final /* synthetic */ EnumC1407150min[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1407150min LOADING;
    public static final EnumC1407150min NONE;
    public static final EnumC1407150min SHOW_ORIGINAL;
    public static final EnumC1407150min SHOW_TRANSLATION;
    public static final EnumC1407150min TRANSLATING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1407150min> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1407150min enumC1407150min = new EnumC1407150min("NONE", 0, 0);
        NONE = enumC1407150min;
        EnumC1407150min enumC1407150min2 = new EnumC1407150min("SHOW_ORIGINAL", 1, 1);
        SHOW_ORIGINAL = enumC1407150min2;
        EnumC1407150min enumC1407150min3 = new EnumC1407150min("SHOW_TRANSLATION", 2, 2);
        SHOW_TRANSLATION = enumC1407150min3;
        EnumC1407150min enumC1407150min4 = new EnumC1407150min("TRANSLATING", 3, 3);
        TRANSLATING = enumC1407150min4;
        EnumC1407150min enumC1407150min5 = new EnumC1407150min("LOADING", 4, 4);
        LOADING = enumC1407150min5;
        EnumC1407150min[] enumC1407150minArr = {enumC1407150min, enumC1407150min2, enumC1407150min3, enumC1407150min4, enumC1407150min5};
        LLILLJJLI = enumC1407150minArr;
        LLILLL = new C2254308sP(enumC1407150minArr);
        Companion = new C1407170mip();
    }

    public static EnumC1407150min[] values() {
        return (EnumC1407150min[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1407150min valueOf(String str) {
        return (EnumC1407150min) C08FF.LIZ(EnumC1407150min.class, str);
    }

    public EnumC1407150min(String str, int i, int i2) {
        this.LL = i2;
    }
}
