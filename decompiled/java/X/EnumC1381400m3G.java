package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381400m3G {
    public static final EnumC1381400m3G FAIL;
    public static final /* synthetic */ EnumC1381400m3G[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1381400m3G SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1381400m3G> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1381400m3G enumC1381400m3G = new EnumC1381400m3G("SUCCESS", 0, 0);
        SUCCESS = enumC1381400m3G;
        EnumC1381400m3G enumC1381400m3G2 = new EnumC1381400m3G("FAIL", 1, 1);
        FAIL = enumC1381400m3G2;
        EnumC1381400m3G[] enumC1381400m3GArr = {enumC1381400m3G, enumC1381400m3G2};
        LLILLJJLI = enumC1381400m3GArr;
        LLILLL = new C2254308sP(enumC1381400m3GArr);
    }

    public static EnumC1381400m3G[] values() {
        return (EnumC1381400m3G[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1381400m3G valueOf(String str) {
        return (EnumC1381400m3G) C08FF.LIZ(EnumC1381400m3G.class, str);
    }

    public EnumC1381400m3G(String str, int i, int i2) {
        this.LL = i2;
    }
}
