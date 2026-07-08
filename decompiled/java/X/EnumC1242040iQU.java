package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1242040iQU {
    public static final EnumC1242040iQU CONTACT;
    public static final /* synthetic */ EnumC1242040iQU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1242040iQU MESSAGE;
    public static final EnumC1242040iQU NOTICE;

    public static InterfaceC2044707zh<EnumC1242040iQU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1242040iQU enumC1242040iQU = new EnumC1242040iQU("CONTACT", 0);
        CONTACT = enumC1242040iQU;
        EnumC1242040iQU enumC1242040iQU2 = new EnumC1242040iQU("MESSAGE", 1);
        MESSAGE = enumC1242040iQU2;
        EnumC1242040iQU enumC1242040iQU3 = new EnumC1242040iQU("NOTICE", 2);
        NOTICE = enumC1242040iQU3;
        EnumC1242040iQU[] enumC1242040iQUArr = {enumC1242040iQU, enumC1242040iQU2, enumC1242040iQU3};
        LL = enumC1242040iQUArr;
        LLILLJJLI = new C2254308sP(enumC1242040iQUArr);
    }

    public static EnumC1242040iQU[] values() {
        return (EnumC1242040iQU[]) LL.clone();
    }

    public static EnumC1242040iQU valueOf(String str) {
        return (EnumC1242040iQU) C08FF.LIZ(EnumC1242040iQU.class, str);
    }

    public EnumC1242040iQU(String str, int i) {
    }
}
