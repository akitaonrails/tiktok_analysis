package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1362430lYf {
    public static final EnumC1362430lYf FORWARD_RESTRICTED;
    public static final /* synthetic */ EnumC1362430lYf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1362430lYf MULTI_SELECT_LIMIT;
    public static final EnumC1362430lYf SUCCESS;
    public static final EnumC1362430lYf UNSUPPORTED;

    public static InterfaceC2044707zh<EnumC1362430lYf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1362430lYf enumC1362430lYf = new EnumC1362430lYf("SUCCESS", 0);
        SUCCESS = enumC1362430lYf;
        EnumC1362430lYf enumC1362430lYf2 = new EnumC1362430lYf("UNSUPPORTED", 1);
        UNSUPPORTED = enumC1362430lYf2;
        EnumC1362430lYf enumC1362430lYf3 = new EnumC1362430lYf("FORWARD_RESTRICTED", 2);
        FORWARD_RESTRICTED = enumC1362430lYf3;
        EnumC1362430lYf enumC1362430lYf4 = new EnumC1362430lYf("MULTI_SELECT_LIMIT", 3);
        MULTI_SELECT_LIMIT = enumC1362430lYf4;
        EnumC1362430lYf[] enumC1362430lYfArr = {enumC1362430lYf, enumC1362430lYf2, enumC1362430lYf3, enumC1362430lYf4};
        LL = enumC1362430lYfArr;
        LLILLJJLI = new C2254308sP(enumC1362430lYfArr);
    }

    public static EnumC1362430lYf[] values() {
        return (EnumC1362430lYf[]) LL.clone();
    }

    public final boolean isSuccess() {
        return this == SUCCESS;
    }

    public static EnumC1362430lYf valueOf(String str) {
        return (EnumC1362430lYf) C08FF.LIZ(EnumC1362430lYf.class, str);
    }

    public EnumC1362430lYf(String str, int i) {
    }
}
