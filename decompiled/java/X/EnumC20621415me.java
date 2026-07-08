package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20621415me {
    public static final EnumC20621415me FYP;
    public static final /* synthetic */ EnumC20621415me[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20621415me OTHER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20621415me> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20621415me enumC20621415me = new EnumC20621415me("FYP", 0, "fyp");
        FYP = enumC20621415me;
        EnumC20621415me enumC20621415me2 = new EnumC20621415me("OTHER", 1, "inbox_profile");
        OTHER = enumC20621415me2;
        EnumC20621415me[] enumC20621415meArr = {enumC20621415me, enumC20621415me2};
        LLILLJJLI = enumC20621415meArr;
        LLILLL = new C2254308sP(enumC20621415meArr);
    }

    public static EnumC20621415me[] values() {
        return (EnumC20621415me[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static EnumC20621415me valueOf(String str) {
        return (EnumC20621415me) C08FF.LIZ(EnumC20621415me.class, str);
    }

    public EnumC20621415me(String str, int i, String str2) {
        this.LL = str2;
    }
}
