package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0da5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1055790da5 {
    public static final EnumC1055790da5 EvaluateJS;
    public static final /* synthetic */ EnumC1055790da5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1055790da5 LoadUrl;

    public static InterfaceC2044707zh<EnumC1055790da5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1055790da5 enumC1055790da5 = new EnumC1055790da5("LoadUrl", 0);
        LoadUrl = enumC1055790da5;
        EnumC1055790da5 enumC1055790da52 = new EnumC1055790da5("EvaluateJS", 1);
        EvaluateJS = enumC1055790da52;
        EnumC1055790da5[] enumC1055790da5Arr = {enumC1055790da5, enumC1055790da52};
        LL = enumC1055790da5Arr;
        LLILLJJLI = new C2254308sP(enumC1055790da5Arr);
    }

    public static EnumC1055790da5[] values() {
        return (EnumC1055790da5[]) LL.clone();
    }

    public static EnumC1055790da5 valueOf(String str) {
        return (EnumC1055790da5) C08FF.LIZ(EnumC1055790da5.class, str);
    }

    public EnumC1055790da5(String str, int i) {
    }
}
