package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201300hMm {
    public static final EnumC1201300hMm ALLOW;
    public static final EnumC1201300hMm CLOSE;
    public static final /* synthetic */ EnumC1201300hMm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1201300hMm SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1201300hMm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1201300hMm enumC1201300hMm = new EnumC1201300hMm("SHOW", 0, "show");
        SHOW = enumC1201300hMm;
        EnumC1201300hMm enumC1201300hMm2 = new EnumC1201300hMm("CLOSE", 1, "close");
        CLOSE = enumC1201300hMm2;
        EnumC1201300hMm enumC1201300hMm3 = new EnumC1201300hMm("ALLOW", 2, "allow");
        ALLOW = enumC1201300hMm3;
        EnumC1201300hMm[] enumC1201300hMmArr = {enumC1201300hMm, enumC1201300hMm2, enumC1201300hMm3};
        LLILLJJLI = enumC1201300hMmArr;
        LLILLL = new C2254308sP(enumC1201300hMmArr);
    }

    public static EnumC1201300hMm[] values() {
        return (EnumC1201300hMm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1201300hMm valueOf(String str) {
        return (EnumC1201300hMm) C08FF.LIZ(EnumC1201300hMm.class, str);
    }

    public EnumC1201300hMm(String str, int i, String str2) {
        this.LL = str2;
    }
}
