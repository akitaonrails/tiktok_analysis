package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC805503Cr {
    public static final EnumC805503Cr BUTTON;
    public static final EnumC805503Cr CHANGE;
    public static final /* synthetic */ EnumC805503Cr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC805503Cr OTHER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC805503Cr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC805503Cr enumC805503Cr = new EnumC805503Cr("BUTTON", 0, "button");
        BUTTON = enumC805503Cr;
        EnumC805503Cr enumC805503Cr2 = new EnumC805503Cr("OTHER", 1, "other");
        OTHER = enumC805503Cr2;
        EnumC805503Cr enumC805503Cr3 = new EnumC805503Cr("CHANGE", 2, "change_button");
        CHANGE = enumC805503Cr3;
        EnumC805503Cr[] enumC805503CrArr = {enumC805503Cr, enumC805503Cr2, enumC805503Cr3};
        LLILLJJLI = enumC805503CrArr;
        LLILLL = new C2254308sP(enumC805503CrArr);
    }

    public static EnumC805503Cr[] values() {
        return (EnumC805503Cr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC805503Cr valueOf(String str) {
        return (EnumC805503Cr) C08FF.LIZ(EnumC805503Cr.class, str);
    }

    public EnumC805503Cr(String str, int i, String str2) {
        this.LL = str2;
    }
}
