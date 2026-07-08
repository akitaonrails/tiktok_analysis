package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783060wV6 {
    public static final EnumC1783060wV6 FAIL;
    public static final /* synthetic */ EnumC1783060wV6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1783060wV6 START;
    public static final EnumC1783060wV6 SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1783060wV6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1783060wV6 enumC1783060wV6 = new EnumC1783060wV6("START", 0, "start");
        START = enumC1783060wV6;
        EnumC1783060wV6 enumC1783060wV62 = new EnumC1783060wV6("SUCCESS", 1, "success");
        SUCCESS = enumC1783060wV62;
        EnumC1783060wV6 enumC1783060wV63 = new EnumC1783060wV6("FAIL", 2, "fail");
        FAIL = enumC1783060wV63;
        EnumC1783060wV6[] enumC1783060wV6Arr = {enumC1783060wV6, enumC1783060wV62, enumC1783060wV63};
        LLILLJJLI = enumC1783060wV6Arr;
        LLILLL = new C2254308sP(enumC1783060wV6Arr);
    }

    public static EnumC1783060wV6[] values() {
        return (EnumC1783060wV6[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1783060wV6 valueOf(String str) {
        return (EnumC1783060wV6) C08FF.LIZ(EnumC1783060wV6.class, str);
    }

    public EnumC1783060wV6(String str, int i, String str2) {
        this.LL = str2;
    }
}
