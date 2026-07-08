package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982750bgH {
    public static final EnumC982750bgH CUTSHORT;
    public static final C983530bhX Companion;
    public static final /* synthetic */ EnumC982750bgH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982750bgH NORMAL;
    public static final EnumC982750bgH UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982750bgH> getEntries() {
        return LLILLL;
    }

    public static final EnumC982750bgH getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983530bhX.LIZ(num);
    }

    static {
        EnumC982750bgH enumC982750bgH = new EnumC982750bgH("UNKNOWN", 0, 0);
        UNKNOWN = enumC982750bgH;
        EnumC982750bgH enumC982750bgH2 = new EnumC982750bgH("NORMAL", 1, 1);
        NORMAL = enumC982750bgH2;
        EnumC982750bgH enumC982750bgH3 = new EnumC982750bgH("CUTSHORT", 2, 2);
        CUTSHORT = enumC982750bgH3;
        EnumC982750bgH[] enumC982750bgHArr = {enumC982750bgH, enumC982750bgH2, enumC982750bgH3};
        LLILLJJLI = enumC982750bgHArr;
        LLILLL = new C2254308sP(enumC982750bgHArr);
        Companion = new C983530bhX();
    }

    public static EnumC982750bgH[] values() {
        return (EnumC982750bgH[]) LLILLJJLI.clone();
    }

    public final boolean isCutshort() {
        return this == CUTSHORT;
    }

    public final boolean isNormal() {
        return this == NORMAL;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982750bgH valueOf(String str) {
        return (EnumC982750bgH) C08FF.LIZ(EnumC982750bgH.class, str);
    }

    public EnumC982750bgH(String str, int i, int i2) {
        this.LL = i2;
    }
}
