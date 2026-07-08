package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1073280e2I {
    public static final /* synthetic */ EnumC1073280e2I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1073280e2I NONE;
    public static final EnumC1073280e2I NORMAL_ALL;
    public static final EnumC1073280e2I NORMAL_TIME_AND_TYPE;

    public static InterfaceC2044707zh<EnumC1073280e2I> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1073280e2I enumC1073280e2I = new EnumC1073280e2I("NONE", 0);
        NONE = enumC1073280e2I;
        EnumC1073280e2I enumC1073280e2I2 = new EnumC1073280e2I("NORMAL_TIME_AND_TYPE", 1);
        NORMAL_TIME_AND_TYPE = enumC1073280e2I2;
        EnumC1073280e2I enumC1073280e2I3 = new EnumC1073280e2I("NORMAL_ALL", 2);
        NORMAL_ALL = enumC1073280e2I3;
        EnumC1073280e2I[] enumC1073280e2IArr = {enumC1073280e2I, enumC1073280e2I2, enumC1073280e2I3};
        LL = enumC1073280e2IArr;
        LLILLJJLI = new C2254308sP(enumC1073280e2IArr);
    }

    public static EnumC1073280e2I[] values() {
        return (EnumC1073280e2I[]) LL.clone();
    }

    public static EnumC1073280e2I valueOf(String str) {
        return (EnumC1073280e2I) C08FF.LIZ(EnumC1073280e2I.class, str);
    }

    public EnumC1073280e2I(String str, int i) {
    }
}
