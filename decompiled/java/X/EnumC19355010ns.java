package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19355010ns {
    public static final EnumC19355010ns COLOR_BG_WITHOUT_BRACKETS;
    public static final /* synthetic */ EnumC19355010ns[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19355010ns NONE;
    public static final EnumC19355010ns TRANSPARENT_BG_WITH_BRACKETS;

    public static InterfaceC2044707zh<EnumC19355010ns> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19355010ns enumC19355010ns = new EnumC19355010ns("NONE", 0);
        NONE = enumC19355010ns;
        EnumC19355010ns enumC19355010ns2 = new EnumC19355010ns("COLOR_BG_WITHOUT_BRACKETS", 1);
        COLOR_BG_WITHOUT_BRACKETS = enumC19355010ns2;
        EnumC19355010ns enumC19355010ns3 = new EnumC19355010ns("TRANSPARENT_BG_WITH_BRACKETS", 2);
        TRANSPARENT_BG_WITH_BRACKETS = enumC19355010ns3;
        EnumC19355010ns[] enumC19355010nsArr = {enumC19355010ns, enumC19355010ns2, enumC19355010ns3};
        LL = enumC19355010nsArr;
        LLILLJJLI = new C2254308sP(enumC19355010nsArr);
    }

    public static EnumC19355010ns[] values() {
        return (EnumC19355010ns[]) LL.clone();
    }

    public static EnumC19355010ns valueOf(String str) {
        return (EnumC19355010ns) C08FF.LIZ(EnumC19355010ns.class, str);
    }

    public EnumC19355010ns(String str, int i) {
    }
}
