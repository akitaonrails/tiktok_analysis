package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599720Nfe {
    public static final /* synthetic */ EnumC599720Nfe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599720Nfe LYNX;
    public static final EnumC599720Nfe NATIVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599720Nfe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599720Nfe enumC599720Nfe = new EnumC599720Nfe("NATIVE", 0, "native");
        NATIVE = enumC599720Nfe;
        EnumC599720Nfe enumC599720Nfe2 = new EnumC599720Nfe("LYNX", 1, "lynx");
        LYNX = enumC599720Nfe2;
        EnumC599720Nfe[] enumC599720NfeArr = {enumC599720Nfe, enumC599720Nfe2};
        LLILLJJLI = enumC599720NfeArr;
        LLILLL = new C2254308sP(enumC599720NfeArr);
    }

    public static EnumC599720Nfe[] values() {
        return (EnumC599720Nfe[]) LLILLJJLI.clone();
    }

    public final String getSource() {
        return this.LL;
    }

    public static EnumC599720Nfe valueOf(String str) {
        return (EnumC599720Nfe) C08FF.LIZ(EnumC599720Nfe.class, str);
    }

    public EnumC599720Nfe(String str, int i, String str2) {
        this.LL = str2;
    }
}
