package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1873990yrl {
    public static final C1870280ylm Companion;
    public static final /* synthetic */ EnumC1873990yrl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1873990yrl SHOULD_NOT_SHOW;
    public static final EnumC1873990yrl SHOULD_SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1873990yrl> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ylm] */
    static {
        EnumC1873990yrl enumC1873990yrl = new EnumC1873990yrl("SHOULD_NOT_SHOW", 0, 0);
        SHOULD_NOT_SHOW = enumC1873990yrl;
        EnumC1873990yrl enumC1873990yrl2 = new EnumC1873990yrl("SHOULD_SHOW", 1, 1);
        SHOULD_SHOW = enumC1873990yrl2;
        EnumC1873990yrl[] enumC1873990yrlArr = {enumC1873990yrl, enumC1873990yrl2};
        LLILLJJLI = enumC1873990yrlArr;
        LLILLL = new C2254308sP(enumC1873990yrlArr);
        Companion = new Object() { // from class: X.0ylm
        };
    }

    public static EnumC1873990yrl[] values() {
        return (EnumC1873990yrl[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1873990yrl valueOf(String str) {
        return (EnumC1873990yrl) C08FF.LIZ(EnumC1873990yrl.class, str);
    }

    public EnumC1873990yrl(String str, int i, int i2) {
        this.LL = i2;
    }
}
