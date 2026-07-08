package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1801900wzU {
    public static final EnumC1801900wzU AVAILABLE;
    public static final /* synthetic */ EnumC1801900wzU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1801900wzU UNAVAILABLE;
    public static final EnumC1801900wzU UNSET;

    public static InterfaceC2044707zh<EnumC1801900wzU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1801900wzU enumC1801900wzU = new EnumC1801900wzU("AVAILABLE", 0);
        AVAILABLE = enumC1801900wzU;
        EnumC1801900wzU enumC1801900wzU2 = new EnumC1801900wzU("UNAVAILABLE", 1);
        UNAVAILABLE = enumC1801900wzU2;
        EnumC1801900wzU enumC1801900wzU3 = new EnumC1801900wzU("UNSET", 2);
        UNSET = enumC1801900wzU3;
        EnumC1801900wzU[] enumC1801900wzUArr = {enumC1801900wzU, enumC1801900wzU2, enumC1801900wzU3};
        LL = enumC1801900wzUArr;
        LLILLJJLI = new C2254308sP(enumC1801900wzUArr);
    }

    public static EnumC1801900wzU[] values() {
        return (EnumC1801900wzU[]) LL.clone();
    }

    public static EnumC1801900wzU valueOf(String str) {
        return (EnumC1801900wzU) C08FF.LIZ(EnumC1801900wzU.class, str);
    }

    public EnumC1801900wzU(String str, int i) {
    }
}
