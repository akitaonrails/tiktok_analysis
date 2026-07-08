package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00tC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC220800tC {
    public static final EnumC220800tC CACHE;
    public static final /* synthetic */ EnumC220800tC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC220800tC NEW;

    public static InterfaceC2044707zh<EnumC220800tC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC220800tC enumC220800tC = new EnumC220800tC("NEW", 0);
        NEW = enumC220800tC;
        EnumC220800tC enumC220800tC2 = new EnumC220800tC("CACHE", 1);
        CACHE = enumC220800tC2;
        EnumC220800tC[] enumC220800tCArr = {enumC220800tC, enumC220800tC2};
        LL = enumC220800tCArr;
        LLILLJJLI = new C2254308sP(enumC220800tCArr);
    }

    public static EnumC220800tC[] values() {
        return (EnumC220800tC[]) LL.clone();
    }

    public static EnumC220800tC valueOf(String str) {
        return (EnumC220800tC) C08FF.LIZ(EnumC220800tC.class, str);
    }

    public EnumC220800tC(String str, int i) {
    }
}
