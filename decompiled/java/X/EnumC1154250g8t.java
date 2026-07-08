package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154250g8t {
    public static final EnumC1154250g8t FIRST_IN_TEMPLATE_LIST;
    public static final EnumC1154250g8t LEFT_IN_BAR;
    public static final EnumC1154250g8t LEFT_TOP_CORNER;
    public static final /* synthetic */ EnumC1154250g8t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154250g8t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154250g8t enumC1154250g8t = new EnumC1154250g8t("FIRST_IN_TEMPLATE_LIST", 0);
        FIRST_IN_TEMPLATE_LIST = enumC1154250g8t;
        EnumC1154250g8t enumC1154250g8t2 = new EnumC1154250g8t("LEFT_TOP_CORNER", 1);
        LEFT_TOP_CORNER = enumC1154250g8t2;
        EnumC1154250g8t enumC1154250g8t3 = new EnumC1154250g8t("LEFT_IN_BAR", 2);
        LEFT_IN_BAR = enumC1154250g8t3;
        EnumC1154250g8t[] enumC1154250g8tArr = {enumC1154250g8t, enumC1154250g8t2, enumC1154250g8t3};
        LL = enumC1154250g8tArr;
        LLILLJJLI = new C2254308sP(enumC1154250g8tArr);
    }

    public static EnumC1154250g8t[] values() {
        return (EnumC1154250g8t[]) LL.clone();
    }

    public static EnumC1154250g8t valueOf(String str) {
        return (EnumC1154250g8t) C08FF.LIZ(EnumC1154250g8t.class, str);
    }

    public EnumC1154250g8t(String str, int i) {
    }
}
