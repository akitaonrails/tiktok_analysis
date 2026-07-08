package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1446970nl1 {
    public static final EnumC1446970nl1 AIGC_LABEL_AUTO;
    public static final EnumC1446970nl1 AIGC_LABEL_MANUAL;
    public static final EnumC1446970nl1 AIGC_LABEL_UNKNOWN;
    public static final /* synthetic */ EnumC1446970nl1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1446970nl1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1446970nl1 enumC1446970nl1 = new EnumC1446970nl1("AIGC_LABEL_UNKNOWN", 0, 0);
        AIGC_LABEL_UNKNOWN = enumC1446970nl1;
        EnumC1446970nl1 enumC1446970nl12 = new EnumC1446970nl1("AIGC_LABEL_AUTO", 1, 2);
        AIGC_LABEL_AUTO = enumC1446970nl12;
        EnumC1446970nl1 enumC1446970nl13 = new EnumC1446970nl1("AIGC_LABEL_MANUAL", 2, 1);
        AIGC_LABEL_MANUAL = enumC1446970nl13;
        EnumC1446970nl1[] enumC1446970nl1Arr = {enumC1446970nl1, enumC1446970nl12, enumC1446970nl13};
        LLILLJJLI = enumC1446970nl1Arr;
        LLILLL = new C2254308sP(enumC1446970nl1Arr);
    }

    public static EnumC1446970nl1[] values() {
        return (EnumC1446970nl1[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1446970nl1 valueOf(String str) {
        return (EnumC1446970nl1) C08FF.LIZ(EnumC1446970nl1.class, str);
    }

    public EnumC1446970nl1(String str, int i, int i2) {
        this.LL = i2;
    }
}
