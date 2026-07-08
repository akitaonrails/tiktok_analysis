package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20498081g {
    public static final EnumC20498081g FALSE;
    public static final /* synthetic */ EnumC20498081g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20498081g TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20498081g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20498081g enumC20498081g = new EnumC20498081g("FALSE", 0, "false");
        FALSE = enumC20498081g;
        EnumC20498081g enumC20498081g2 = new EnumC20498081g("TRUE", 1, "true");
        TRUE = enumC20498081g2;
        EnumC20498081g[] enumC20498081gArr = {enumC20498081g, enumC20498081g2};
        LLILLJJLI = enumC20498081gArr;
        LLILLL = new C2254308sP(enumC20498081gArr);
    }

    public static EnumC20498081g[] values() {
        return (EnumC20498081g[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20498081g valueOf(String str) {
        return (EnumC20498081g) C08FF.LIZ(EnumC20498081g.class, str);
    }

    public EnumC20498081g(String str, int i, String str2) {
        this.LL = str2;
    }
}
