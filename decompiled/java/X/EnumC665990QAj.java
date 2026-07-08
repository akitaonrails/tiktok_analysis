package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC665990QAj implements C0Q0Q {
    public static final EnumC665990QAj CARD;
    public static final EnumC665990QAj COMPONENT;
    public static final EnumC665990QAj CONTAINER;
    public static final EnumC665990QAj LIST;
    public static final /* synthetic */ EnumC665990QAj[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC665990QAj VIEW;
    public final String LL;
    public final String LLILLJJLI;

    public EnumC665990QAj() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC665990QAj> getEntries() {
        return LLILZ;
    }

    static {
        EnumC665990QAj enumC665990QAj = new EnumC665990QAj("CONTAINER", 0, "container");
        CONTAINER = enumC665990QAj;
        EnumC665990QAj enumC665990QAj2 = new EnumC665990QAj("LIST", 1, "list");
        LIST = enumC665990QAj2;
        EnumC665990QAj enumC665990QAj3 = new EnumC665990QAj("CARD", 2, "card");
        CARD = enumC665990QAj3;
        EnumC665990QAj enumC665990QAj4 = new EnumC665990QAj("COMPONENT", 3, "component");
        COMPONENT = enumC665990QAj4;
        EnumC665990QAj enumC665990QAj5 = new EnumC665990QAj("VIEW", 4, "view");
        VIEW = enumC665990QAj5;
        EnumC665990QAj[] enumC665990QAjArr = {enumC665990QAj, enumC665990QAj2, enumC665990QAj3, enumC665990QAj4, enumC665990QAj5};
        LLILLL = enumC665990QAjArr;
        LLILZ = new C2254308sP(enumC665990QAjArr);
    }

    public static EnumC665990QAj[] values() {
        return (EnumC665990QAj[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public static EnumC665990QAj valueOf(String str) {
        return (EnumC665990QAj) C08FF.LIZ(EnumC665990QAj.class, str);
    }

    public EnumC665990QAj(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = "UI";
    }
}
