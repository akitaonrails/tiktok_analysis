package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036200Au {
    public static final /* synthetic */ EnumC036200Au[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC036200Au MULTI_SNS;
    public static final EnumC036200Au SINGLE_SNS;
    public static final EnumC036200Au SNS_AND_NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC036200Au> getEntries() {
        return LLILLL;
    }

    static {
        EnumC036200Au enumC036200Au = new EnumC036200Au("SINGLE_SNS", 0, 0);
        SINGLE_SNS = enumC036200Au;
        EnumC036200Au enumC036200Au2 = new EnumC036200Au("MULTI_SNS", 1, 1);
        MULTI_SNS = enumC036200Au2;
        EnumC036200Au enumC036200Au3 = new EnumC036200Au("SNS_AND_NORMAL", 2, 2);
        SNS_AND_NORMAL = enumC036200Au3;
        EnumC036200Au[] enumC036200AuArr = {enumC036200Au, enumC036200Au2, enumC036200Au3};
        LLILLJJLI = enumC036200AuArr;
        LLILLL = new C2254308sP(enumC036200AuArr);
    }

    public static EnumC036200Au[] values() {
        return (EnumC036200Au[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC036200Au valueOf(String str) {
        return (EnumC036200Au) C08FF.LIZ(EnumC036200Au.class, str);
    }

    public EnumC036200Au(String str, int i, int i2) {
        this.LL = i2;
    }
}
