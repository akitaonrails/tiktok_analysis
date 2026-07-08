package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ja0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1286380ja0 {
    public static final EnumC1286380ja0 FAILED;
    public static final /* synthetic */ EnumC1286380ja0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1286380ja0 NOT_START;
    public static final EnumC1286380ja0 SUCCESSFUL;

    public static InterfaceC2044707zh<EnumC1286380ja0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1286380ja0 enumC1286380ja0 = new EnumC1286380ja0("NOT_START", 0);
        NOT_START = enumC1286380ja0;
        EnumC1286380ja0 enumC1286380ja02 = new EnumC1286380ja0("SUCCESSFUL", 1);
        SUCCESSFUL = enumC1286380ja02;
        EnumC1286380ja0 enumC1286380ja03 = new EnumC1286380ja0("FAILED", 2);
        FAILED = enumC1286380ja03;
        EnumC1286380ja0[] enumC1286380ja0Arr = {enumC1286380ja0, enumC1286380ja02, enumC1286380ja03};
        LL = enumC1286380ja0Arr;
        LLILLJJLI = new C2254308sP(enumC1286380ja0Arr);
    }

    public static EnumC1286380ja0[] values() {
        return (EnumC1286380ja0[]) LL.clone();
    }

    public static EnumC1286380ja0 valueOf(String str) {
        return (EnumC1286380ja0) C08FF.LIZ(EnumC1286380ja0.class, str);
    }

    public EnumC1286380ja0(String str, int i) {
    }
}
