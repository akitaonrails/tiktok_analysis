package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC687960Qyg {
    public static final EnumC687960Qyg ALREADY_SATISFIED;
    public static final EnumC687960Qyg CONVERSION_POPUP;
    public static final /* synthetic */ EnumC687960Qyg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC687960Qyg STANDARD_REQUEST;

    public static InterfaceC2044707zh<EnumC687960Qyg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC687960Qyg enumC687960Qyg = new EnumC687960Qyg("ALREADY_SATISFIED", 0);
        ALREADY_SATISFIED = enumC687960Qyg;
        EnumC687960Qyg enumC687960Qyg2 = new EnumC687960Qyg("STANDARD_REQUEST", 1);
        STANDARD_REQUEST = enumC687960Qyg2;
        EnumC687960Qyg enumC687960Qyg3 = new EnumC687960Qyg("CONVERSION_POPUP", 2);
        CONVERSION_POPUP = enumC687960Qyg3;
        EnumC687960Qyg[] enumC687960QygArr = {enumC687960Qyg, enumC687960Qyg2, enumC687960Qyg3};
        LL = enumC687960QygArr;
        LLILLJJLI = new C2254308sP(enumC687960QygArr);
    }

    public static EnumC687960Qyg[] values() {
        return (EnumC687960Qyg[]) LL.clone();
    }

    public static EnumC687960Qyg valueOf(String str) {
        return (EnumC687960Qyg) C08FF.LIZ(EnumC687960Qyg.class, str);
    }

    public EnumC687960Qyg(String str, int i) {
    }
}
