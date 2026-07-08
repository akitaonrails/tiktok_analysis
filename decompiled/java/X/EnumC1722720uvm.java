package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1722720uvm {
    public static final EnumC1722720uvm BOTTOM_SHEET;
    public static final EnumC1722720uvm DIALOG;
    public static final EnumC1722720uvm FULL_PAGE;
    public static final /* synthetic */ EnumC1722720uvm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1722720uvm TOAST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1722720uvm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1722720uvm enumC1722720uvm = new EnumC1722720uvm("TOAST", 0, "toast");
        TOAST = enumC1722720uvm;
        EnumC1722720uvm enumC1722720uvm2 = new EnumC1722720uvm("DIALOG", 1, "dialog");
        DIALOG = enumC1722720uvm2;
        EnumC1722720uvm enumC1722720uvm3 = new EnumC1722720uvm("BOTTOM_SHEET", 2, "bottom_sheet");
        BOTTOM_SHEET = enumC1722720uvm3;
        EnumC1722720uvm enumC1722720uvm4 = new EnumC1722720uvm("FULL_PAGE", 3, "fullpage");
        FULL_PAGE = enumC1722720uvm4;
        EnumC1722720uvm[] enumC1722720uvmArr = {enumC1722720uvm, enumC1722720uvm2, enumC1722720uvm3, enumC1722720uvm4};
        LLILLJJLI = enumC1722720uvmArr;
        LLILLL = new C2254308sP(enumC1722720uvmArr);
    }

    public static EnumC1722720uvm[] values() {
        return (EnumC1722720uvm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1722720uvm valueOf(String str) {
        return (EnumC1722720uvm) C08FF.LIZ(EnumC1722720uvm.class, str);
    }

    public EnumC1722720uvm(String str, int i, String str2) {
        this.LL = str2;
    }
}
