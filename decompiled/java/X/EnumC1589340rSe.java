package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1589340rSe {
    public static final EnumC1589340rSe CLEAR_ACTIVITY;
    public static final EnumC1589340rSe CONFIG_CHANGE;
    public static final /* synthetic */ EnumC1589340rSe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1589340rSe OTHER;
    public static final EnumC1589340rSe RECREATE;

    public static InterfaceC2044707zh<EnumC1589340rSe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1589340rSe enumC1589340rSe = new EnumC1589340rSe("CONFIG_CHANGE", 0);
        CONFIG_CHANGE = enumC1589340rSe;
        EnumC1589340rSe enumC1589340rSe2 = new EnumC1589340rSe("OTHER", 1);
        OTHER = enumC1589340rSe2;
        EnumC1589340rSe enumC1589340rSe3 = new EnumC1589340rSe("CLEAR_ACTIVITY", 2);
        CLEAR_ACTIVITY = enumC1589340rSe3;
        EnumC1589340rSe enumC1589340rSe4 = new EnumC1589340rSe("RECREATE", 3);
        RECREATE = enumC1589340rSe4;
        EnumC1589340rSe[] enumC1589340rSeArr = {enumC1589340rSe, enumC1589340rSe2, enumC1589340rSe3, enumC1589340rSe4};
        LL = enumC1589340rSeArr;
        LLILLJJLI = new C2254308sP(enumC1589340rSeArr);
    }

    public static EnumC1589340rSe[] values() {
        return (EnumC1589340rSe[]) LL.clone();
    }

    public static EnumC1589340rSe valueOf(String str) {
        return (EnumC1589340rSe) C08FF.LIZ(EnumC1589340rSe.class, str);
    }

    public EnumC1589340rSe(String str, int i) {
    }
}
