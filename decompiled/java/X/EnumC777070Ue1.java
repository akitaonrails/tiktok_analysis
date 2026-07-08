package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ue1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC777070Ue1 {
    public static final EnumC777070Ue1 Hover;
    public static final EnumC777070Ue1 InApp;
    public static final /* synthetic */ EnumC777070Ue1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC777070Ue1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC777070Ue1 enumC777070Ue1 = new EnumC777070Ue1("Hover", 0, "hover");
        Hover = enumC777070Ue1;
        EnumC777070Ue1 enumC777070Ue12 = new EnumC777070Ue1("InApp", 1, "inapp");
        InApp = enumC777070Ue12;
        EnumC777070Ue1[] enumC777070Ue1Arr = {enumC777070Ue1, enumC777070Ue12};
        LLILLJJLI = enumC777070Ue1Arr;
        LLILLL = new C2254308sP(enumC777070Ue1Arr);
    }

    public static EnumC777070Ue1[] values() {
        return (EnumC777070Ue1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC777070Ue1 valueOf(String str) {
        return (EnumC777070Ue1) C08FF.LIZ(EnumC777070Ue1.class, str);
    }

    public EnumC777070Ue1(String str, int i, String str2) {
        this.LL = str2;
    }
}
