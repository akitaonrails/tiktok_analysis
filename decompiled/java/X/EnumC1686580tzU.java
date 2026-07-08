package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1686580tzU {
    public static final EnumC1686580tzU LL;
    public static final EnumC1686580tzU LLILLJJLI;
    public static final EnumC1686580tzU LLILLL;
    public static final /* synthetic */ EnumC1686580tzU[] LLILZ;

    public static EnumC1686580tzU valueOf(String str) {
        return (EnumC1686580tzU) C08FF.LIZ(EnumC1686580tzU.class, str);
    }

    public static EnumC1686580tzU[] values() {
        return (EnumC1686580tzU[]) LLILZ.clone();
    }

    static {
        EnumC1686580tzU enumC1686580tzU = new EnumC1686580tzU("Unknown", 0);
        LL = enumC1686580tzU;
        EnumC1686580tzU enumC1686580tzU2 = new EnumC1686580tzU("Dispatching", 1);
        LLILLJJLI = enumC1686580tzU2;
        EnumC1686580tzU enumC1686580tzU3 = new EnumC1686580tzU("NotDispatching", 2);
        LLILLL = enumC1686580tzU3;
        EnumC1686580tzU[] enumC1686580tzUArr = {enumC1686580tzU, enumC1686580tzU2, enumC1686580tzU3};
        LLILZ = enumC1686580tzUArr;
        new C2254308sP(enumC1686580tzUArr);
    }

    public EnumC1686580tzU(String str, int i) {
    }
}
