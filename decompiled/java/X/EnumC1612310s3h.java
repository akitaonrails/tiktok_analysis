package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1612310s3h {
    public static final EnumC1612310s3h BACKWARD;
    public static final EnumC1612310s3h BOTH;
    public static final EnumC1612310s3h FORWARD;
    public static final /* synthetic */ EnumC1612310s3h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1612310s3h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1612310s3h enumC1612310s3h = new EnumC1612310s3h("BACKWARD", 0, 0);
        BACKWARD = enumC1612310s3h;
        EnumC1612310s3h enumC1612310s3h2 = new EnumC1612310s3h("FORWARD", 1, 1);
        FORWARD = enumC1612310s3h2;
        EnumC1612310s3h enumC1612310s3h3 = new EnumC1612310s3h("BOTH", 2, 2);
        BOTH = enumC1612310s3h3;
        EnumC1612310s3h[] enumC1612310s3hArr = {enumC1612310s3h, enumC1612310s3h2, enumC1612310s3h3};
        LLILLJJLI = enumC1612310s3hArr;
        LLILLL = new C2254308sP(enumC1612310s3hArr);
    }

    public static EnumC1612310s3h[] values() {
        return (EnumC1612310s3h[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1612310s3h valueOf(String str) {
        return (EnumC1612310s3h) C08FF.LIZ(EnumC1612310s3h.class, str);
    }

    public EnumC1612310s3h(String str, int i, int i2) {
        this.LL = i2;
    }
}
