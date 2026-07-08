package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lWT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1361070lWT {
    public static final EnumC1361070lWT DISABLED;
    public static final /* synthetic */ EnumC1361070lWT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1361070lWT OFF;
    public static final EnumC1361070lWT ON;

    public static InterfaceC2044707zh<EnumC1361070lWT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1361070lWT enumC1361070lWT = new EnumC1361070lWT("ON", 0);
        ON = enumC1361070lWT;
        EnumC1361070lWT enumC1361070lWT2 = new EnumC1361070lWT("OFF", 1);
        OFF = enumC1361070lWT2;
        EnumC1361070lWT enumC1361070lWT3 = new EnumC1361070lWT("DISABLED", 2);
        DISABLED = enumC1361070lWT3;
        EnumC1361070lWT[] enumC1361070lWTArr = {enumC1361070lWT, enumC1361070lWT2, enumC1361070lWT3};
        LL = enumC1361070lWTArr;
        LLILLJJLI = new C2254308sP(enumC1361070lWTArr);
    }

    public static EnumC1361070lWT[] values() {
        return (EnumC1361070lWT[]) LL.clone();
    }

    public static EnumC1361070lWT valueOf(String str) {
        return (EnumC1361070lWT) C08FF.LIZ(EnumC1361070lWT.class, str);
    }

    public EnumC1361070lWT(String str, int i) {
    }
}
