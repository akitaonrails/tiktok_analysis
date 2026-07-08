package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1982807pi {
    public static final EnumC1982807pi DEFAULT_D_CODE;
    public static final /* synthetic */ EnumC1982807pi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "d0";

    public static InterfaceC2044707zh<EnumC1982807pi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1982807pi enumC1982807pi = new EnumC1982807pi();
        DEFAULT_D_CODE = enumC1982807pi;
        EnumC1982807pi[] enumC1982807piArr = {enumC1982807pi};
        LLILLJJLI = enumC1982807piArr;
        LLILLL = new C2254308sP(enumC1982807piArr);
    }

    public static EnumC1982807pi[] values() {
        return (EnumC1982807pi[]) LLILLJJLI.clone();
    }

    public final String getDCode() {
        return this.LL;
    }

    public static EnumC1982807pi valueOf(String str) {
        return (EnumC1982807pi) C08FF.LIZ(EnumC1982807pi.class, str);
    }
}
