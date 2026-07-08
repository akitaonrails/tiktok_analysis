package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1488950oqj {
    public static final EnumC1488950oqj AIRPLANE_MODE;
    public static final EnumC1488950oqj FAKE;
    public static final /* synthetic */ EnumC1488950oqj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1488950oqj NOT_AVAILABLE;
    public static final EnumC1488950oqj TIMEOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1488950oqj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1488950oqj enumC1488950oqj = new EnumC1488950oqj("TIMEOUT", 0, 2131826677);
        TIMEOUT = enumC1488950oqj;
        EnumC1488950oqj enumC1488950oqj2 = new EnumC1488950oqj("NOT_AVAILABLE", 1, 2131826676);
        NOT_AVAILABLE = enumC1488950oqj2;
        EnumC1488950oqj enumC1488950oqj3 = new EnumC1488950oqj("FAKE", 2, 2131826677);
        FAKE = enumC1488950oqj3;
        EnumC1488950oqj enumC1488950oqj4 = new EnumC1488950oqj("AIRPLANE_MODE", 3, 2131826678);
        AIRPLANE_MODE = enumC1488950oqj4;
        EnumC1488950oqj[] enumC1488950oqjArr = {enumC1488950oqj, enumC1488950oqj2, enumC1488950oqj3, enumC1488950oqj4};
        LLILLJJLI = enumC1488950oqjArr;
        LLILLL = new C2254308sP(enumC1488950oqjArr);
    }

    public static EnumC1488950oqj[] values() {
        return (EnumC1488950oqj[]) LLILLJJLI.clone();
    }

    public final int getErrMsgId() {
        return this.LL;
    }

    public static EnumC1488950oqj valueOf(String str) {
        return (EnumC1488950oqj) C08FF.LIZ(EnumC1488950oqj.class, str);
    }

    public EnumC1488950oqj(String str, int i, int i2) {
        this.LL = i2;
    }
}
