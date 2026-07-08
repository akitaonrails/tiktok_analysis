package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986007qE {
    public static final EnumC1986007qE ActionRuntime;
    public static final EnumC1986007qE JSBRuntime;
    public static final /* synthetic */ EnumC1986007qE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1986007qE UnknownRuntime;
    public String LL;

    public static InterfaceC2044707zh<EnumC1986007qE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1986007qE enumC1986007qE = new EnumC1986007qE("JSBRuntime", 0, "jsbRuntime");
        JSBRuntime = enumC1986007qE;
        EnumC1986007qE enumC1986007qE2 = new EnumC1986007qE("ActionRuntime", 1, "actionRuntime");
        ActionRuntime = enumC1986007qE2;
        EnumC1986007qE enumC1986007qE3 = new EnumC1986007qE("UnknownRuntime", 2, "unknownRuntime");
        UnknownRuntime = enumC1986007qE3;
        EnumC1986007qE[] enumC1986007qEArr = {enumC1986007qE, enumC1986007qE2, enumC1986007qE3};
        LLILLJJLI = enumC1986007qEArr;
        LLILLL = new C2254308sP(enumC1986007qEArr);
    }

    public static EnumC1986007qE[] values() {
        return (EnumC1986007qE[]) LLILLJJLI.clone();
    }

    public final String getRuntime() {
        return this.LL;
    }

    public static EnumC1986007qE valueOf(String str) {
        return (EnumC1986007qE) C08FF.LIZ(EnumC1986007qE.class, str);
    }

    public final void setRuntime(String str) {
        this.LL = str;
    }

    public EnumC1986007qE(String str, int i, String str2) {
        this.LL = str2;
    }
}
