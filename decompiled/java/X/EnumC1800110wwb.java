package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1800110wwb {
    public static final EnumC1800110wwb BEFORE_LOCATION;
    public static final C1800160wwg Companion;
    public static final EnumC1800110wwb FOREGROUND;
    public static final /* synthetic */ EnumC1800110wwb[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1800110wwb SDK_INIT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1800110wwb> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0wwg] */
    static {
        EnumC1800110wwb enumC1800110wwb = new EnumC1800110wwb("SDK_INIT", 0, 0, "sdk_init");
        SDK_INIT = enumC1800110wwb;
        EnumC1800110wwb enumC1800110wwb2 = new EnumC1800110wwb("FOREGROUND", 1, 1, "foreground");
        FOREGROUND = enumC1800110wwb2;
        EnumC1800110wwb enumC1800110wwb3 = new EnumC1800110wwb("BEFORE_LOCATION", 2, 2, "before_location");
        BEFORE_LOCATION = enumC1800110wwb3;
        EnumC1800110wwb[] enumC1800110wwbArr = {enumC1800110wwb, enumC1800110wwb2, enumC1800110wwb3};
        LLILLL = enumC1800110wwbArr;
        LLILZ = new C2254308sP(enumC1800110wwbArr);
        Companion = new Object() { // from class: X.0wwg
        };
    }

    public static EnumC1800110wwb[] values() {
        return (EnumC1800110wwb[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getTriggerScene() {
        return this.LLILLJJLI;
    }

    public static EnumC1800110wwb valueOf(String str) {
        return (EnumC1800110wwb) C08FF.LIZ(EnumC1800110wwb.class, str);
    }

    public EnumC1800110wwb(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
