package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1423060n8S {
    public static final EnumC1423060n8S FETCH_CATEGORY_ERROR;
    public static final EnumC1423060n8S FETCH_TEMPLATE_ERROR;
    public static final /* synthetic */ EnumC1423060n8S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1423060n8S LOAD_MORE_TEMPLATES_ERROR;
    public static final EnumC1423060n8S REFRESH_SAME;
    public static final EnumC1423060n8S REFRESH_TEMPLATES_ERROR;

    public static InterfaceC2044707zh<EnumC1423060n8S> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1423060n8S enumC1423060n8S = new EnumC1423060n8S("FETCH_CATEGORY_ERROR", 0);
        FETCH_CATEGORY_ERROR = enumC1423060n8S;
        EnumC1423060n8S enumC1423060n8S2 = new EnumC1423060n8S("FETCH_TEMPLATE_ERROR", 1);
        FETCH_TEMPLATE_ERROR = enumC1423060n8S2;
        EnumC1423060n8S enumC1423060n8S3 = new EnumC1423060n8S("REFRESH_SAME", 2);
        REFRESH_SAME = enumC1423060n8S3;
        EnumC1423060n8S enumC1423060n8S4 = new EnumC1423060n8S("LOAD_MORE_TEMPLATES_ERROR", 3);
        LOAD_MORE_TEMPLATES_ERROR = enumC1423060n8S4;
        EnumC1423060n8S enumC1423060n8S5 = new EnumC1423060n8S("REFRESH_TEMPLATES_ERROR", 4);
        REFRESH_TEMPLATES_ERROR = enumC1423060n8S5;
        EnumC1423060n8S[] enumC1423060n8SArr = {enumC1423060n8S, enumC1423060n8S2, enumC1423060n8S3, enumC1423060n8S4, enumC1423060n8S5};
        LL = enumC1423060n8SArr;
        LLILLJJLI = new C2254308sP(enumC1423060n8SArr);
    }

    public static EnumC1423060n8S[] values() {
        return (EnumC1423060n8S[]) LL.clone();
    }

    public static EnumC1423060n8S valueOf(String str) {
        return (EnumC1423060n8S) C08FF.LIZ(EnumC1423060n8S.class, str);
    }

    public EnumC1423060n8S(String str, int i) {
    }
}
