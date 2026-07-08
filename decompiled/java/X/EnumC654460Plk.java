package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Plk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC654460Plk implements InterfaceC654480Plm {
    public static final EnumC654460Plk COMMON;
    public static final /* synthetic */ EnumC654460Plk[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public EnumC654460Plk() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC654460Plk> getEntries() {
        return LLILZ;
    }

    static {
        EnumC654460Plk enumC654460Plk = new EnumC654460Plk(0);
        COMMON = enumC654460Plk;
        EnumC654460Plk[] enumC654460PlkArr = {enumC654460Plk};
        LLILLL = enumC654460PlkArr;
        LLILZ = new C2254308sP(enumC654460PlkArr);
    }

    public static EnumC654460Plk[] values() {
        return (EnumC654460Plk[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public EnumC654460Plk(int i) {
        this.LL = "common";
        this.LLILLJJLI = "vertical";
    }

    public static EnumC654460Plk valueOf(String str) {
        return (EnumC654460Plk) C08FF.LIZ(EnumC654460Plk.class, str);
    }
}
