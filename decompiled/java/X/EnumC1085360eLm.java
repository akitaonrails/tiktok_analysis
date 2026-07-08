package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1085360eLm {
    public static final EnumC1085360eLm INTERRUPT;
    public static final EnumC1085360eLm LIVE_END;
    public static final /* synthetic */ EnumC1085360eLm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1085360eLm NULL;
    public static final EnumC1085360eLm REPLACE;
    public static final EnumC1085360eLm TIME_OUT;
    public static final EnumC1085360eLm UNPIN_MESSAGE;

    public static InterfaceC2044707zh<EnumC1085360eLm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1085360eLm enumC1085360eLm = new EnumC1085360eLm("TIME_OUT", 0);
        TIME_OUT = enumC1085360eLm;
        EnumC1085360eLm enumC1085360eLm2 = new EnumC1085360eLm("REPLACE", 1);
        REPLACE = enumC1085360eLm2;
        EnumC1085360eLm enumC1085360eLm3 = new EnumC1085360eLm("INTERRUPT", 2);
        INTERRUPT = enumC1085360eLm3;
        EnumC1085360eLm enumC1085360eLm4 = new EnumC1085360eLm("LIVE_END", 3);
        LIVE_END = enumC1085360eLm4;
        EnumC1085360eLm enumC1085360eLm5 = new EnumC1085360eLm("UNPIN_MESSAGE", 4);
        UNPIN_MESSAGE = enumC1085360eLm5;
        EnumC1085360eLm enumC1085360eLm6 = new EnumC1085360eLm("NULL", 5);
        NULL = enumC1085360eLm6;
        EnumC1085360eLm[] enumC1085360eLmArr = {enumC1085360eLm, enumC1085360eLm2, enumC1085360eLm3, enumC1085360eLm4, enumC1085360eLm5, enumC1085360eLm6};
        LL = enumC1085360eLmArr;
        LLILLJJLI = new C2254308sP(enumC1085360eLmArr);
    }

    public static EnumC1085360eLm[] values() {
        return (EnumC1085360eLm[]) LL.clone();
    }

    public static EnumC1085360eLm valueOf(String str) {
        return (EnumC1085360eLm) C08FF.LIZ(EnumC1085360eLm.class, str);
    }

    public EnumC1085360eLm(String str, int i) {
    }
}
