package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC960560b6U {
    public static final EnumC960560b6U CO_HOST_PANEL;
    public static final /* synthetic */ EnumC960560b6U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC960560b6U SEARCH_PANEL;

    public static InterfaceC2044707zh<EnumC960560b6U> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC960560b6U enumC960560b6U = new EnumC960560b6U("CO_HOST_PANEL", 0);
        CO_HOST_PANEL = enumC960560b6U;
        EnumC960560b6U enumC960560b6U2 = new EnumC960560b6U("SEARCH_PANEL", 1);
        SEARCH_PANEL = enumC960560b6U2;
        EnumC960560b6U[] enumC960560b6UArr = {enumC960560b6U, enumC960560b6U2};
        LL = enumC960560b6UArr;
        LLILLJJLI = new C2254308sP(enumC960560b6UArr);
    }

    public static EnumC960560b6U[] values() {
        return (EnumC960560b6U[]) LL.clone();
    }

    public static EnumC960560b6U valueOf(String str) {
        return (EnumC960560b6U) C08FF.LIZ(EnumC960560b6U.class, str);
    }

    public EnumC960560b6U(String str, int i) {
    }
}
