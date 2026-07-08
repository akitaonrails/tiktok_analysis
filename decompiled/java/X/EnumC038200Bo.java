package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC038200Bo {
    public static final EnumC038200Bo ERROR;
    public static final EnumC038200Bo HIDDEN;
    public static final /* synthetic */ EnumC038200Bo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC038200Bo WARNING;

    public static InterfaceC2044707zh<EnumC038200Bo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC038200Bo enumC038200Bo = new EnumC038200Bo("WARNING", 0);
        WARNING = enumC038200Bo;
        EnumC038200Bo enumC038200Bo2 = new EnumC038200Bo("ERROR", 1);
        ERROR = enumC038200Bo2;
        EnumC038200Bo enumC038200Bo3 = new EnumC038200Bo("HIDDEN", 2);
        HIDDEN = enumC038200Bo3;
        EnumC038200Bo[] enumC038200BoArr = {enumC038200Bo, enumC038200Bo2, enumC038200Bo3};
        LL = enumC038200BoArr;
        LLILLJJLI = new C2254308sP(enumC038200BoArr);
    }

    public static EnumC038200Bo[] values() {
        return (EnumC038200Bo[]) LL.clone();
    }

    public static EnumC038200Bo valueOf(String str) {
        return (EnumC038200Bo) C08FF.LIZ(EnumC038200Bo.class, str);
    }

    public EnumC038200Bo(String str, int i) {
    }
}
