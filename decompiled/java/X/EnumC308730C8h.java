package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308730C8h {
    public static final EnumC308730C8h AIR;
    public static final C308750C8j Companion;
    public static final /* synthetic */ EnumC308730C8h[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC308730C8h MINI;
    public static final EnumC308730C8h NONE;
    public static final EnumC308730C8h NORMAL;
    public static final C01GW<EnumC308730C8h> current$delegate;
    public final int LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC308730C8h> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC308730C8h enumC308730C8h = new EnumC308730C8h("NORMAL", 0, ((Number) C269470AhF.LIZ.getValue()).intValue(), ((Boolean) C2280811EPf.LJ.getValue()).booleanValue(), ((Number) C0C20.LIZ.getValue()).intValue() > 0, ((Number) C269920Ahy.LIZ.getValue()).intValue());
        NORMAL = enumC308730C8h;
        EnumC308730C8h enumC308730C8h2 = new EnumC308730C8h("AIR", 1, ((Number) C269390Ah7.LIZ.getValue()).intValue(), false, true, 3);
        AIR = enumC308730C8h2;
        EnumC308730C8h enumC308730C8h3 = new EnumC308730C8h("MINI", 2, ((Number) C269410Ah9.LIZ.getValue()).intValue(), false, true, 2);
        MINI = enumC308730C8h3;
        EnumC308730C8h enumC308730C8h4 = new EnumC308730C8h("NONE", 3, 0, false, true, 0);
        NONE = enumC308730C8h4;
        EnumC308730C8h[] enumC308730C8hArr = {enumC308730C8h, enumC308730C8h2, enumC308730C8h3, enumC308730C8h4};
        LLILZIL = enumC308730C8hArr;
        LLILZLL = new C2254308sP(enumC308730C8hArr);
        Companion = new C308750C8j();
        current$delegate = C452501pT.LIZIZ(new C308740C8i());
    }

    public static EnumC308730C8h[] values() {
        return (EnumC308730C8h[]) LLILZIL.clone();
    }

    public final boolean getAutoCleanCache() {
        return this.LLILLL;
    }

    public final int getCapacity() {
        return this.LL;
    }

    public final int getMaximumCountEnableAdded() {
        return this.LLILZ;
    }

    public final boolean getVideoHighQuality() {
        return this.LLILLJJLI;
    }

    public static EnumC308730C8h valueOf(String str) {
        return (EnumC308730C8h) C08FF.LIZ(EnumC308730C8h.class, str);
    }

    public EnumC308730C8h(String str, int i, int i2, boolean z, boolean z2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = i3;
    }
}
