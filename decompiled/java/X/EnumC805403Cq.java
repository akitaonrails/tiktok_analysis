package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC805403Cq {
    public static final EnumC805403Cq ADD_ITEM_INTERCEPT;
    public static final EnumC805403Cq ADD_ITEM_ORDER;
    public static final /* synthetic */ EnumC805403Cq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC805403Cq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC805403Cq enumC805403Cq = new EnumC805403Cq("ADD_ITEM_ORDER", 0);
        ADD_ITEM_ORDER = enumC805403Cq;
        EnumC805403Cq enumC805403Cq2 = new EnumC805403Cq("ADD_ITEM_INTERCEPT", 1);
        ADD_ITEM_INTERCEPT = enumC805403Cq2;
        EnumC805403Cq[] enumC805403CqArr = {enumC805403Cq, enumC805403Cq2};
        LL = enumC805403CqArr;
        LLILLJJLI = new C2254308sP(enumC805403CqArr);
    }

    public static EnumC805403Cq[] values() {
        return (EnumC805403Cq[]) LL.clone();
    }

    public static EnumC805403Cq valueOf(String str) {
        return (EnumC805403Cq) C08FF.LIZ(EnumC805403Cq.class, str);
    }

    public EnumC805403Cq(String str, int i) {
    }
}
