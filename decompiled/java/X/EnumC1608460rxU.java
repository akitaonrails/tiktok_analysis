package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1608460rxU implements InterfaceC1606880ruw {
    public static final EnumC1608460rxU LIVE;
    public static final /* synthetic */ EnumC1608460rxU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "live";

    public static InterfaceC2044707zh<EnumC1608460rxU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1608460rxU enumC1608460rxU = new EnumC1608460rxU();
        LIVE = enumC1608460rxU;
        EnumC1608460rxU[] enumC1608460rxUArr = {enumC1608460rxU};
        LLILLJJLI = enumC1608460rxUArr;
        LLILLL = new C2254308sP(enumC1608460rxUArr);
    }

    public static EnumC1608460rxU[] values() {
        return (EnumC1608460rxU[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC1606880ruw
    public String getString() {
        return this.LL;
    }

    public static EnumC1608460rxU valueOf(String str) {
        return (EnumC1608460rxU) C08FF.LIZ(EnumC1608460rxU.class, str);
    }
}
