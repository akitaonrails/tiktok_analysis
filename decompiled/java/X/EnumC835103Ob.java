package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC835103Ob {
    public static final EnumC835103Ob ADDRESS_EDIT;
    public static final EnumC835103Ob ADD_CCDC;
    public static final /* synthetic */ EnumC835103Ob[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC835103Ob ORDER_SUBMIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC835103Ob> getEntries() {
        return LLILLL;
    }

    static {
        EnumC835103Ob enumC835103Ob = new EnumC835103Ob("ORDER_SUBMIT", 0, 1);
        ORDER_SUBMIT = enumC835103Ob;
        EnumC835103Ob enumC835103Ob2 = new EnumC835103Ob("ADDRESS_EDIT", 1, 2);
        ADDRESS_EDIT = enumC835103Ob2;
        EnumC835103Ob enumC835103Ob3 = new EnumC835103Ob("ADD_CCDC", 2, 3);
        ADD_CCDC = enumC835103Ob3;
        EnumC835103Ob[] enumC835103ObArr = {enumC835103Ob, enumC835103Ob2, enumC835103Ob3};
        LLILLJJLI = enumC835103ObArr;
        LLILLL = new C2254308sP(enumC835103ObArr);
    }

    public static EnumC835103Ob[] values() {
        return (EnumC835103Ob[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC835103Ob valueOf(String str) {
        return (EnumC835103Ob) C08FF.LIZ(EnumC835103Ob.class, str);
    }

    public EnumC835103Ob(String str, int i, int i2) {
        this.LL = i2;
    }
}
