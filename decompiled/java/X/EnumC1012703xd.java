package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1012703xd {
    public static final EnumC1012703xd COLOR;
    public static final /* synthetic */ EnumC1012703xd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1012703xd SIZE;
    public static final EnumC1012703xd UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1012703xd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1012703xd enumC1012703xd = new EnumC1012703xd("UNKNOWN", 0, 0);
        UNKNOWN = enumC1012703xd;
        EnumC1012703xd enumC1012703xd2 = new EnumC1012703xd("SIZE", 1, 1);
        SIZE = enumC1012703xd2;
        EnumC1012703xd enumC1012703xd3 = new EnumC1012703xd("COLOR", 2, 2);
        COLOR = enumC1012703xd3;
        EnumC1012703xd[] enumC1012703xdArr = {enumC1012703xd, enumC1012703xd2, enumC1012703xd3};
        LLILLJJLI = enumC1012703xdArr;
        LLILLL = new C2254308sP(enumC1012703xdArr);
    }

    public static EnumC1012703xd[] values() {
        return (EnumC1012703xd[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1012703xd valueOf(String str) {
        return (EnumC1012703xd) C08FF.LIZ(EnumC1012703xd.class, str);
    }

    public EnumC1012703xd(String str, int i, int i2) {
        this.LL = i2;
    }
}
