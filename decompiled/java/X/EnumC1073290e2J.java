package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1073290e2J {
    public static final EnumC1073290e2J BEFORE_AUTH_PIPELINE;
    public static final EnumC1073290e2J END_AUTH_PIPELINE;
    public static final /* synthetic */ EnumC1073290e2J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1073290e2J START_AUTH_PIPELINE;
    public static final EnumC1073290e2J UPDATE_LOCAL_FREQ_DATA;

    public static InterfaceC2044707zh<EnumC1073290e2J> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1073290e2J enumC1073290e2J = new EnumC1073290e2J("BEFORE_AUTH_PIPELINE", 0);
        BEFORE_AUTH_PIPELINE = enumC1073290e2J;
        EnumC1073290e2J enumC1073290e2J2 = new EnumC1073290e2J("START_AUTH_PIPELINE", 1);
        START_AUTH_PIPELINE = enumC1073290e2J2;
        EnumC1073290e2J enumC1073290e2J3 = new EnumC1073290e2J("END_AUTH_PIPELINE", 2);
        END_AUTH_PIPELINE = enumC1073290e2J3;
        EnumC1073290e2J enumC1073290e2J4 = new EnumC1073290e2J("UPDATE_LOCAL_FREQ_DATA", 3);
        UPDATE_LOCAL_FREQ_DATA = enumC1073290e2J4;
        EnumC1073290e2J[] enumC1073290e2JArr = {enumC1073290e2J, enumC1073290e2J2, enumC1073290e2J3, enumC1073290e2J4};
        LL = enumC1073290e2JArr;
        LLILLJJLI = new C2254308sP(enumC1073290e2JArr);
    }

    public static EnumC1073290e2J[] values() {
        return (EnumC1073290e2J[]) LL.clone();
    }

    public static EnumC1073290e2J valueOf(String str) {
        return (EnumC1073290e2J) C08FF.LIZ(EnumC1073290e2J.class, str);
    }

    public EnumC1073290e2J(String str, int i) {
    }
}
