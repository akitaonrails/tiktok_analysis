package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1604570rrD {
    public static final EnumC1604570rrD CLOSED;
    public static final EnumC1604570rrD EXCEEDED_REDIRECTION;
    public static final /* synthetic */ EnumC1604570rrD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1604570rrD OPENED;

    public static InterfaceC2044707zh<EnumC1604570rrD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1604570rrD enumC1604570rrD = new EnumC1604570rrD("CLOSED", 0);
        CLOSED = enumC1604570rrD;
        EnumC1604570rrD enumC1604570rrD2 = new EnumC1604570rrD("OPENED", 1);
        OPENED = enumC1604570rrD2;
        EnumC1604570rrD enumC1604570rrD3 = new EnumC1604570rrD("EXCEEDED_REDIRECTION", 2);
        EXCEEDED_REDIRECTION = enumC1604570rrD3;
        EnumC1604570rrD[] enumC1604570rrDArr = {enumC1604570rrD, enumC1604570rrD2, enumC1604570rrD3};
        LL = enumC1604570rrDArr;
        LLILLJJLI = new C2254308sP(enumC1604570rrDArr);
    }

    public static EnumC1604570rrD[] values() {
        return (EnumC1604570rrD[]) LL.clone();
    }

    public static EnumC1604570rrD valueOf(String str) {
        return (EnumC1604570rrD) C08FF.LIZ(EnumC1604570rrD.class, str);
    }

    public EnumC1604570rrD(String str, int i) {
    }
}
