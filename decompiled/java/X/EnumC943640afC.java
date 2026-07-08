package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0afC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC943640afC {
    public static final EnumC943640afC DISCONNECT;
    public static final /* synthetic */ EnumC943640afC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC943640afC NORMAL;
    public static final EnumC943640afC UNDEFINED;

    public static InterfaceC2044707zh<EnumC943640afC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC943640afC enumC943640afC = new EnumC943640afC("UNDEFINED", 0);
        UNDEFINED = enumC943640afC;
        EnumC943640afC enumC943640afC2 = new EnumC943640afC("NORMAL", 1);
        NORMAL = enumC943640afC2;
        EnumC943640afC enumC943640afC3 = new EnumC943640afC("DISCONNECT", 2);
        DISCONNECT = enumC943640afC3;
        EnumC943640afC[] enumC943640afCArr = {enumC943640afC, enumC943640afC2, enumC943640afC3};
        LL = enumC943640afCArr;
        LLILLJJLI = new C2254308sP(enumC943640afCArr);
    }

    public static EnumC943640afC[] values() {
        return (EnumC943640afC[]) LL.clone();
    }

    public static EnumC943640afC valueOf(String str) {
        return (EnumC943640afC) C08FF.LIZ(EnumC943640afC.class, str);
    }

    public EnumC943640afC(String str, int i) {
    }
}
