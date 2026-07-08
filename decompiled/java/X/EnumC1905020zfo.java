package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905020zfo {
    public static final EnumC1905020zfo Click;
    public static final /* synthetic */ EnumC1905020zfo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1905020zfo Show;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1905020zfo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1905020zfo enumC1905020zfo = new EnumC1905020zfo("Show", 0, "show");
        Show = enumC1905020zfo;
        EnumC1905020zfo enumC1905020zfo2 = new EnumC1905020zfo("Click", 1, "click");
        Click = enumC1905020zfo2;
        EnumC1905020zfo[] enumC1905020zfoArr = {enumC1905020zfo, enumC1905020zfo2};
        LLILLJJLI = enumC1905020zfoArr;
        LLILLL = new C2254308sP(enumC1905020zfoArr);
    }

    public static EnumC1905020zfo[] values() {
        return (EnumC1905020zfo[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1905020zfo valueOf(String str) {
        return (EnumC1905020zfo) C08FF.LIZ(EnumC1905020zfo.class, str);
    }

    public EnumC1905020zfo(String str, int i, String str2) {
        this.LL = str2;
    }
}
