package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804703Cj {
    public static final /* synthetic */ EnumC804703Cj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804703Cj OSP_PAGE;
    public static final EnumC804703Cj PANEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC804703Cj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804703Cj enumC804703Cj = new EnumC804703Cj("OSP_PAGE", 0, "osp_page");
        OSP_PAGE = enumC804703Cj;
        EnumC804703Cj enumC804703Cj2 = new EnumC804703Cj("PANEL", 1, "panel");
        PANEL = enumC804703Cj2;
        EnumC804703Cj[] enumC804703CjArr = {enumC804703Cj, enumC804703Cj2};
        LLILLJJLI = enumC804703CjArr;
        LLILLL = new C2254308sP(enumC804703CjArr);
    }

    public static EnumC804703Cj[] values() {
        return (EnumC804703Cj[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC804703Cj valueOf(String str) {
        return (EnumC804703Cj) C08FF.LIZ(EnumC804703Cj.class, str);
    }

    public EnumC804703Cj(String str, int i, String str2) {
        this.LL = str2;
    }
}
