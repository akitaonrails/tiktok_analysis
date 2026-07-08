package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1000580c92 implements InterfaceC593520NPq<String> {
    public static final EnumC1000580c92 AUTO;
    public static final /* synthetic */ EnumC1000580c92[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1000580c92 MANUAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1000580c92> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1000580c92 enumC1000580c92 = new EnumC1000580c92("AUTO", 0, "auto");
        AUTO = enumC1000580c92;
        EnumC1000580c92 enumC1000580c922 = new EnumC1000580c92("MANUAL", 1, "manual");
        MANUAL = enumC1000580c922;
        EnumC1000580c92[] enumC1000580c92Arr = {enumC1000580c92, enumC1000580c922};
        LLILLJJLI = enumC1000580c92Arr;
        LLILLL = new C2254308sP(enumC1000580c92Arr);
    }

    public static EnumC1000580c92[] values() {
        return (EnumC1000580c92[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1000580c92 valueOf(String str) {
        return (EnumC1000580c92) C08FF.LIZ(EnumC1000580c92.class, str);
    }

    public EnumC1000580c92(String str, int i, String str2) {
        this.LL = str2;
    }
}
