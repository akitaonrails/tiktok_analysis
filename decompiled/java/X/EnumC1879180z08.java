package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0z08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1879180z08 {
    public static final EnumC1879180z08 CLEAR;
    public static final /* synthetic */ EnumC1879180z08[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1879180z08 NOT_RETRY;
    public static final EnumC1879180z08 RETRY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1879180z08> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1879180z08 enumC1879180z08 = new EnumC1879180z08("NOT_RETRY", 0, 0);
        NOT_RETRY = enumC1879180z08;
        EnumC1879180z08 enumC1879180z082 = new EnumC1879180z08("RETRY", 1, 1);
        RETRY = enumC1879180z082;
        EnumC1879180z08 enumC1879180z083 = new EnumC1879180z08("CLEAR", 2, 2);
        CLEAR = enumC1879180z083;
        EnumC1879180z08[] enumC1879180z08Arr = {enumC1879180z08, enumC1879180z082, enumC1879180z083};
        LLILLJJLI = enumC1879180z08Arr;
        LLILLL = new C2254308sP(enumC1879180z08Arr);
    }

    public static EnumC1879180z08[] values() {
        return (EnumC1879180z08[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC1879180z08 valueOf(String str) {
        return (EnumC1879180z08) C08FF.LIZ(EnumC1879180z08.class, str);
    }

    public EnumC1879180z08(String str, int i, int i2) {
        this.LL = i2;
    }
}
