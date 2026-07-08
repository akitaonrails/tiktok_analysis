package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC643900PNk {
    public static final EnumC643900PNk EMPTY_LIST;
    public static final EnumC643900PNk FAILED;
    public static final /* synthetic */ EnumC643900PNk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC643900PNk OTHER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC643900PNk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC643900PNk enumC643900PNk = new EnumC643900PNk("EMPTY_LIST", 0, 8);
        EMPTY_LIST = enumC643900PNk;
        EnumC643900PNk enumC643900PNk2 = new EnumC643900PNk("FAILED", 1, 2);
        FAILED = enumC643900PNk2;
        EnumC643900PNk enumC643900PNk3 = new EnumC643900PNk("OTHER", 2, -2);
        OTHER = enumC643900PNk3;
        EnumC643900PNk[] enumC643900PNkArr = {enumC643900PNk, enumC643900PNk2, enumC643900PNk3};
        LLILLJJLI = enumC643900PNkArr;
        LLILLL = new C2254308sP(enumC643900PNkArr);
    }

    public static EnumC643900PNk[] values() {
        return (EnumC643900PNk[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static EnumC643900PNk valueOf(String str) {
        return (EnumC643900PNk) C08FF.LIZ(EnumC643900PNk.class, str);
    }

    public EnumC643900PNk(String str, int i, int i2) {
        this.LL = i2;
    }
}
