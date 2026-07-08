package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216900hlw {
    public static final C1216910hlx Companion;
    public static final EnumC1216900hlw District;
    public static final EnumC1216900hlw Grid;
    public static final /* synthetic */ EnumC1216900hlw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216900hlw LatLngAndGeocode;
    public static final EnumC1216900hlw None;
    public static final EnumC1216900hlw OnlyLatLng;
    public static final EnumC1216900hlw Province;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1216900hlw> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0hlx] */
    static {
        EnumC1216900hlw enumC1216900hlw = new EnumC1216900hlw("None", 0, 0);
        None = enumC1216900hlw;
        EnumC1216900hlw enumC1216900hlw2 = new EnumC1216900hlw("OnlyLatLng", 1, 1);
        OnlyLatLng = enumC1216900hlw2;
        EnumC1216900hlw enumC1216900hlw3 = new EnumC1216900hlw("Province", 2, 10);
        Province = enumC1216900hlw3;
        EnumC1216900hlw enumC1216900hlw4 = new EnumC1216900hlw("District", 3, 20);
        District = enumC1216900hlw4;
        EnumC1216900hlw enumC1216900hlw5 = new EnumC1216900hlw("Grid", 4, 30);
        Grid = enumC1216900hlw5;
        EnumC1216900hlw enumC1216900hlw6 = new EnumC1216900hlw("LatLngAndGeocode", 5, 40);
        LatLngAndGeocode = enumC1216900hlw6;
        EnumC1216900hlw[] enumC1216900hlwArr = {enumC1216900hlw, enumC1216900hlw2, enumC1216900hlw3, enumC1216900hlw4, enumC1216900hlw5, enumC1216900hlw6};
        LLILLJJLI = enumC1216900hlwArr;
        LLILLL = new C2254308sP(enumC1216900hlwArr);
        Companion = new Object() { // from class: X.0hlx
        };
    }

    public static EnumC1216900hlw[] values() {
        return (EnumC1216900hlw[]) LLILLJJLI.clone();
    }

    public final boolean needDecrypt() {
        int i = this.LL;
        return i == 1 || i == 40;
    }

    public final boolean needServerGeocode() {
        return this.LL >= 10;
    }

    public final int getLevel() {
        return this.LL;
    }

    public static EnumC1216900hlw valueOf(String str) {
        return (EnumC1216900hlw) C08FF.LIZ(EnumC1216900hlw.class, str);
    }

    public EnumC1216900hlw(String str, int i, int i2) {
        this.LL = i2;
    }
}
