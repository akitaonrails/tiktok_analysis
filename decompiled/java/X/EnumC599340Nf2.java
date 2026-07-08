package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599340Nf2 {
    public static final /* synthetic */ EnumC599340Nf2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599340Nf2 LYNX_AIR;
    public static final EnumC599340Nf2 NATIVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599340Nf2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599340Nf2 enumC599340Nf2 = new EnumC599340Nf2("NATIVE", 0, "native");
        NATIVE = enumC599340Nf2;
        EnumC599340Nf2 enumC599340Nf22 = new EnumC599340Nf2("LYNX_AIR", 1, "lynx_air");
        LYNX_AIR = enumC599340Nf22;
        EnumC599340Nf2[] enumC599340Nf2Arr = {enumC599340Nf2, enumC599340Nf22};
        LLILLJJLI = enumC599340Nf2Arr;
        LLILLL = new C2254308sP(enumC599340Nf2Arr);
    }

    public static EnumC599340Nf2[] values() {
        return (EnumC599340Nf2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC599340Nf2 valueOf(String str) {
        return (EnumC599340Nf2) C08FF.LIZ(EnumC599340Nf2.class, str);
    }

    public EnumC599340Nf2(String str, int i, String str2) {
        this.LL = str2;
    }
}
