package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1070590dxx {
    public static final EnumC1070590dxx CONTINUE;
    public static final /* synthetic */ EnumC1070590dxx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "continue";

    public static InterfaceC2044707zh<EnumC1070590dxx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1070590dxx enumC1070590dxx = new EnumC1070590dxx();
        CONTINUE = enumC1070590dxx;
        EnumC1070590dxx[] enumC1070590dxxArr = {enumC1070590dxx};
        LLILLJJLI = enumC1070590dxxArr;
        LLILLL = new C2254308sP(enumC1070590dxxArr);
    }

    public static EnumC1070590dxx[] values() {
        return (EnumC1070590dxx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1070590dxx valueOf(String str) {
        return (EnumC1070590dxx) C08FF.LIZ(EnumC1070590dxx.class, str);
    }
}
