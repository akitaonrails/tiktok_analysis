package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.16Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20742416Es {
    public static final /* synthetic */ EnumC20742416Es[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20742416Es PLURALS;
    public static final EnumC20742416Es STRING;

    public static InterfaceC2044707zh<EnumC20742416Es> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20742416Es enumC20742416Es = new EnumC20742416Es("STRING", 0);
        STRING = enumC20742416Es;
        EnumC20742416Es enumC20742416Es2 = new EnumC20742416Es("PLURALS", 1);
        PLURALS = enumC20742416Es2;
        EnumC20742416Es[] enumC20742416EsArr = {enumC20742416Es, enumC20742416Es2};
        LL = enumC20742416EsArr;
        LLILLJJLI = new C2254308sP(enumC20742416EsArr);
    }

    public static EnumC20742416Es[] values() {
        return (EnumC20742416Es[]) LL.clone();
    }

    public static EnumC20742416Es valueOf(String str) {
        return (EnumC20742416Es) C08FF.LIZ(EnumC20742416Es.class, str);
    }

    public EnumC20742416Es(String str, int i) {
    }
}
