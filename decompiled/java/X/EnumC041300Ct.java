package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC041300Ct {
    public static final EnumC041300Ct INNER_FLOW;
    public static final /* synthetic */ EnumC041300Ct[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC041300Ct NONE;
    public static final EnumC041300Ct OUT_FLOW;

    public static InterfaceC2044707zh<EnumC041300Ct> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC041300Ct enumC041300Ct = new EnumC041300Ct("NONE", 0);
        NONE = enumC041300Ct;
        EnumC041300Ct enumC041300Ct2 = new EnumC041300Ct("OUT_FLOW", 1);
        OUT_FLOW = enumC041300Ct2;
        EnumC041300Ct enumC041300Ct3 = new EnumC041300Ct("INNER_FLOW", 2);
        INNER_FLOW = enumC041300Ct3;
        EnumC041300Ct[] enumC041300CtArr = {enumC041300Ct, enumC041300Ct2, enumC041300Ct3};
        LL = enumC041300CtArr;
        LLILLJJLI = new C2254308sP(enumC041300CtArr);
    }

    public static EnumC041300Ct[] values() {
        return (EnumC041300Ct[]) LL.clone();
    }

    public static EnumC041300Ct valueOf(String str) {
        return (EnumC041300Ct) C08FF.LIZ(EnumC041300Ct.class, str);
    }

    public EnumC041300Ct(String str, int i) {
    }
}
