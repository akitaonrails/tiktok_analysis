package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0on9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486730on9 {
    public static final EnumC1486730on9 INIT;
    public static final /* synthetic */ EnumC1486730on9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1486730on9 PAUSE;
    public static final EnumC1486730on9 RELEASE;
    public static final EnumC1486730on9 RESUME;
    public static final EnumC1486730on9 START;
    public static final EnumC1486730on9 STOP;

    public static InterfaceC2044707zh<EnumC1486730on9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486730on9 enumC1486730on9 = new EnumC1486730on9("INIT", 0);
        INIT = enumC1486730on9;
        EnumC1486730on9 enumC1486730on92 = new EnumC1486730on9("START", 1);
        START = enumC1486730on92;
        EnumC1486730on9 enumC1486730on93 = new EnumC1486730on9("PAUSE", 2);
        PAUSE = enumC1486730on93;
        EnumC1486730on9 enumC1486730on94 = new EnumC1486730on9("RESUME", 3);
        RESUME = enumC1486730on94;
        EnumC1486730on9 enumC1486730on95 = new EnumC1486730on9("STOP", 4);
        STOP = enumC1486730on95;
        EnumC1486730on9 enumC1486730on96 = new EnumC1486730on9("RELEASE", 5);
        RELEASE = enumC1486730on96;
        EnumC1486730on9[] enumC1486730on9Arr = {enumC1486730on9, enumC1486730on92, enumC1486730on93, enumC1486730on94, enumC1486730on95, enumC1486730on96};
        LL = enumC1486730on9Arr;
        LLILLJJLI = new C2254308sP(enumC1486730on9Arr);
    }

    public static EnumC1486730on9[] values() {
        return (EnumC1486730on9[]) LL.clone();
    }

    public static EnumC1486730on9 valueOf(String str) {
        return (EnumC1486730on9) C08FF.LIZ(EnumC1486730on9.class, str);
    }

    public EnumC1486730on9(String str, int i) {
    }
}
