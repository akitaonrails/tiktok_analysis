package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1418300n0m {
    public static final EnumC1418300n0m ERROR_PROCESS_GENERAL;
    public static final EnumC1418300n0m ERROR_PROCESS_INTERNET;
    public static final EnumC1418300n0m ERROR_PROCESS_INTERNET_WEAK;
    public static final /* synthetic */ EnumC1418300n0m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1418300n0m PROCESS_ADD_SOUND;
    public static final EnumC1418300n0m PROCESS_ADJUST_AND_RENDERING;
    public static final EnumC1418300n0m PROCESS_APPLY_EFFECTS;

    public static InterfaceC2044707zh<EnumC1418300n0m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1418300n0m enumC1418300n0m = new EnumC1418300n0m("PROCESS_ADD_SOUND", 0);
        PROCESS_ADD_SOUND = enumC1418300n0m;
        EnumC1418300n0m enumC1418300n0m2 = new EnumC1418300n0m("PROCESS_APPLY_EFFECTS", 1);
        PROCESS_APPLY_EFFECTS = enumC1418300n0m2;
        EnumC1418300n0m enumC1418300n0m3 = new EnumC1418300n0m("PROCESS_ADJUST_AND_RENDERING", 2);
        PROCESS_ADJUST_AND_RENDERING = enumC1418300n0m3;
        EnumC1418300n0m enumC1418300n0m4 = new EnumC1418300n0m("ERROR_PROCESS_GENERAL", 3);
        ERROR_PROCESS_GENERAL = enumC1418300n0m4;
        EnumC1418300n0m enumC1418300n0m5 = new EnumC1418300n0m("ERROR_PROCESS_INTERNET", 4);
        ERROR_PROCESS_INTERNET = enumC1418300n0m5;
        EnumC1418300n0m enumC1418300n0m6 = new EnumC1418300n0m("ERROR_PROCESS_INTERNET_WEAK", 5);
        ERROR_PROCESS_INTERNET_WEAK = enumC1418300n0m6;
        EnumC1418300n0m[] enumC1418300n0mArr = {enumC1418300n0m, enumC1418300n0m2, enumC1418300n0m3, enumC1418300n0m4, enumC1418300n0m5, enumC1418300n0m6};
        LL = enumC1418300n0mArr;
        LLILLJJLI = new C2254308sP(enumC1418300n0mArr);
    }

    public static EnumC1418300n0m[] values() {
        return (EnumC1418300n0m[]) LL.clone();
    }

    public static EnumC1418300n0m valueOf(String str) {
        return (EnumC1418300n0m) C08FF.LIZ(EnumC1418300n0m.class, str);
    }

    public EnumC1418300n0m(String str, int i) {
    }
}
