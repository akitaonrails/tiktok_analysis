package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006880cJC {
    public static final /* synthetic */ EnumC1006880cJC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1006880cJC LOADING;
    public static final EnumC1006880cJC MINIS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1006880cJC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1006880cJC enumC1006880cJC = new EnumC1006880cJC("MINIS", 0, "mini");
        MINIS = enumC1006880cJC;
        EnumC1006880cJC enumC1006880cJC2 = new EnumC1006880cJC("LOADING", 1, "loading");
        LOADING = enumC1006880cJC2;
        EnumC1006880cJC[] enumC1006880cJCArr = {enumC1006880cJC, enumC1006880cJC2};
        LLILLJJLI = enumC1006880cJCArr;
        LLILLL = new C2254308sP(enumC1006880cJCArr);
    }

    public static EnumC1006880cJC[] values() {
        return (EnumC1006880cJC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1006880cJC valueOf(String str) {
        return (EnumC1006880cJC) C08FF.LIZ(EnumC1006880cJC.class, str);
    }

    public EnumC1006880cJC(String str, int i, String str2) {
        this.LL = str2;
    }
}
