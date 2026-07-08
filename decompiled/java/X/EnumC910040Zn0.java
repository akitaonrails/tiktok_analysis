package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC910040Zn0 {
    public static final EnumC910040Zn0 FULL_PAGE;
    public static final /* synthetic */ EnumC910040Zn0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC910040Zn0 PANEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC910040Zn0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC910040Zn0 enumC910040Zn0 = new EnumC910040Zn0("FULL_PAGE", 0, "full_page");
        FULL_PAGE = enumC910040Zn0;
        EnumC910040Zn0 enumC910040Zn02 = new EnumC910040Zn0("PANEL", 1, "panel");
        PANEL = enumC910040Zn02;
        EnumC910040Zn0[] enumC910040Zn0Arr = {enumC910040Zn0, enumC910040Zn02};
        LLILLJJLI = enumC910040Zn0Arr;
        LLILLL = new C2254308sP(enumC910040Zn0Arr);
    }

    public static EnumC910040Zn0[] values() {
        return (EnumC910040Zn0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC910040Zn0 valueOf(String str) {
        return (EnumC910040Zn0) C08FF.LIZ(EnumC910040Zn0.class, str);
    }

    public EnumC910040Zn0(String str, int i, String str2) {
        this.LL = str2;
    }
}
