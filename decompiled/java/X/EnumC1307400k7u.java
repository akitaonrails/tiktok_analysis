package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1307400k7u {
    public static final EnumC1307400k7u ACTION;
    public static final EnumC1307400k7u CLOUD_DECISION;
    public static final EnumC1307400k7u CUSTOM;
    public static final EnumC1307400k7u END;
    public static final EnumC1307400k7u EVENT;
    public static final EnumC1307400k7u EXPRESSION;
    public static final EnumC1307400k7u FAST_ENGINE;
    public static final /* synthetic */ EnumC1307400k7u[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1307400k7u NOOP;
    public static final EnumC1307400k7u PACKAGE_EXECUTION;
    public static final EnumC1307400k7u START;
    public static final EnumC1307400k7u TTM;
    public static final EnumC1307400k7u UNKNOWN;

    public static InterfaceC2044707zh<EnumC1307400k7u> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1307400k7u enumC1307400k7u = new EnumC1307400k7u("UNKNOWN", 0);
        UNKNOWN = enumC1307400k7u;
        EnumC1307400k7u enumC1307400k7u2 = new EnumC1307400k7u("NOOP", 1);
        NOOP = enumC1307400k7u2;
        EnumC1307400k7u enumC1307400k7u3 = new EnumC1307400k7u("EXPRESSION", 2);
        EXPRESSION = enumC1307400k7u3;
        EnumC1307400k7u enumC1307400k7u4 = new EnumC1307400k7u("TTM", 3);
        TTM = enumC1307400k7u4;
        EnumC1307400k7u enumC1307400k7u5 = new EnumC1307400k7u("CLOUD_DECISION", 4);
        CLOUD_DECISION = enumC1307400k7u5;
        EnumC1307400k7u enumC1307400k7u6 = new EnumC1307400k7u("EVENT", 5);
        EVENT = enumC1307400k7u6;
        EnumC1307400k7u enumC1307400k7u7 = new EnumC1307400k7u("START", 6);
        START = enumC1307400k7u7;
        EnumC1307400k7u enumC1307400k7u8 = new EnumC1307400k7u("END", 7);
        END = enumC1307400k7u8;
        EnumC1307400k7u enumC1307400k7u9 = new EnumC1307400k7u("PACKAGE_EXECUTION", 8);
        PACKAGE_EXECUTION = enumC1307400k7u9;
        EnumC1307400k7u enumC1307400k7u10 = new EnumC1307400k7u("CUSTOM", 9);
        CUSTOM = enumC1307400k7u10;
        EnumC1307400k7u enumC1307400k7u11 = new EnumC1307400k7u("ACTION", 10);
        ACTION = enumC1307400k7u11;
        EnumC1307400k7u enumC1307400k7u12 = new EnumC1307400k7u("FAST_ENGINE", 11);
        FAST_ENGINE = enumC1307400k7u12;
        EnumC1307400k7u[] enumC1307400k7uArr = {enumC1307400k7u, enumC1307400k7u2, enumC1307400k7u3, enumC1307400k7u4, enumC1307400k7u5, enumC1307400k7u6, enumC1307400k7u7, enumC1307400k7u8, enumC1307400k7u9, enumC1307400k7u10, enumC1307400k7u11, enumC1307400k7u12};
        LL = enumC1307400k7uArr;
        LLILLJJLI = new C2254308sP(enumC1307400k7uArr);
    }

    public static EnumC1307400k7u[] values() {
        return (EnumC1307400k7u[]) LL.clone();
    }

    public static EnumC1307400k7u valueOf(String str) {
        return (EnumC1307400k7u) C08FF.LIZ(EnumC1307400k7u.class, str);
    }

    public EnumC1307400k7u(String str, int i) {
    }
}
