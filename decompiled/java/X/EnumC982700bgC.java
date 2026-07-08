package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982700bgC {
    public static final C983500bhU Companion;
    public static final EnumC982700bgC INVITEE;
    public static final EnumC982700bgC INVITER;
    public static final /* synthetic */ EnumC982700bgC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982700bgC UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982700bgC> getEntries() {
        return LLILLL;
    }

    public static final EnumC982700bgC getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983500bhU.LIZ(num);
    }

    static {
        EnumC982700bgC enumC982700bgC = new EnumC982700bgC("UNKNOWN", 0, 0);
        UNKNOWN = enumC982700bgC;
        EnumC982700bgC enumC982700bgC2 = new EnumC982700bgC("INVITER", 1, 1);
        INVITER = enumC982700bgC2;
        EnumC982700bgC enumC982700bgC3 = new EnumC982700bgC("INVITEE", 2, 2);
        INVITEE = enumC982700bgC3;
        EnumC982700bgC[] enumC982700bgCArr = {enumC982700bgC, enumC982700bgC2, enumC982700bgC3};
        LLILLJJLI = enumC982700bgCArr;
        LLILLL = new C2254308sP(enumC982700bgCArr);
        Companion = new C983500bhU();
    }

    public static EnumC982700bgC[] values() {
        return (EnumC982700bgC[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982700bgC valueOf(String str) {
        return (EnumC982700bgC) C08FF.LIZ(EnumC982700bgC.class, str);
    }

    public EnumC982700bgC(String str, int i, int i2) {
        this.LL = i2;
    }
}
