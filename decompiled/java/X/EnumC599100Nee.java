package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599100Nee {
    public static final EnumC599100Nee DB;
    public static final /* synthetic */ EnumC599100Nee[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC599100Nee PRELOAD;
    public static final EnumC599100Nee PUBLISH;

    public static InterfaceC2044707zh<EnumC599100Nee> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC599100Nee enumC599100Nee = new EnumC599100Nee("PRELOAD", 0);
        PRELOAD = enumC599100Nee;
        EnumC599100Nee enumC599100Nee2 = new EnumC599100Nee("DB", 1);
        DB = enumC599100Nee2;
        EnumC599100Nee enumC599100Nee3 = new EnumC599100Nee("PUBLISH", 2);
        PUBLISH = enumC599100Nee3;
        EnumC599100Nee[] enumC599100NeeArr = {enumC599100Nee, enumC599100Nee2, enumC599100Nee3};
        LL = enumC599100NeeArr;
        LLILLJJLI = new C2254308sP(enumC599100NeeArr);
    }

    public static EnumC599100Nee[] values() {
        return (EnumC599100Nee[]) LL.clone();
    }

    public static EnumC599100Nee valueOf(String str) {
        return (EnumC599100Nee) C08FF.LIZ(EnumC599100Nee.class, str);
    }

    public EnumC599100Nee(String str, int i) {
    }
}
