package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cW0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1014820cW0 {
    public static final EnumC1014820cW0 FALLBACK;
    public static final EnumC1014820cW0 HYBRID;
    public static final EnumC1014820cW0 JSB;
    public static final /* synthetic */ EnumC1014820cW0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1014820cW0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1014820cW0 enumC1014820cW0 = new EnumC1014820cW0("HYBRID", 0, "hybrid_");
        HYBRID = enumC1014820cW0;
        EnumC1014820cW0 enumC1014820cW02 = new EnumC1014820cW0("JSB", 1, "JSB_");
        JSB = enumC1014820cW02;
        EnumC1014820cW0 enumC1014820cW03 = new EnumC1014820cW0("FALLBACK", 2, "fallback_");
        FALLBACK = enumC1014820cW03;
        EnumC1014820cW0[] enumC1014820cW0Arr = {enumC1014820cW0, enumC1014820cW02, enumC1014820cW03};
        LLILLJJLI = enumC1014820cW0Arr;
        LLILLL = new C2254308sP(enumC1014820cW0Arr);
    }

    public static EnumC1014820cW0[] values() {
        return (EnumC1014820cW0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1014820cW0 valueOf(String str) {
        return (EnumC1014820cW0) C08FF.LIZ(EnumC1014820cW0.class, str);
    }

    public EnumC1014820cW0(String str, int i, String str2) {
        this.LL = str2;
    }
}
