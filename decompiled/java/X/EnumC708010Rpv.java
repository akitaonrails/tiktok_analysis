package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC708010Rpv {
    public static final EnumC708010Rpv DECISION;
    public static final EnumC708010Rpv DISPLAY;
    public static final /* synthetic */ EnumC708010Rpv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC708010Rpv PREP;

    public static InterfaceC2044707zh<EnumC708010Rpv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC708010Rpv enumC708010Rpv = new EnumC708010Rpv("PREP", 0);
        PREP = enumC708010Rpv;
        EnumC708010Rpv enumC708010Rpv2 = new EnumC708010Rpv("DECISION", 1);
        DECISION = enumC708010Rpv2;
        EnumC708010Rpv enumC708010Rpv3 = new EnumC708010Rpv("DISPLAY", 2);
        DISPLAY = enumC708010Rpv3;
        EnumC708010Rpv[] enumC708010RpvArr = {enumC708010Rpv, enumC708010Rpv2, enumC708010Rpv3};
        LL = enumC708010RpvArr;
        LLILLJJLI = new C2254308sP(enumC708010RpvArr);
    }

    public static EnumC708010Rpv[] values() {
        return (EnumC708010Rpv[]) LL.clone();
    }

    public static EnumC708010Rpv valueOf(String str) {
        return (EnumC708010Rpv) C08FF.LIZ(EnumC708010Rpv.class, str);
    }

    public EnumC708010Rpv(String str, int i) {
    }
}
