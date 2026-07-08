package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992520bw2 {
    public static final EnumC992520bw2 BLACK_LIST_TYPE;
    public static final /* synthetic */ EnumC992520bw2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992520bw2 WHITE_LIST_TYPE;

    public static InterfaceC2044707zh<EnumC992520bw2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992520bw2 enumC992520bw2 = new EnumC992520bw2("BLACK_LIST_TYPE", 0);
        BLACK_LIST_TYPE = enumC992520bw2;
        EnumC992520bw2 enumC992520bw22 = new EnumC992520bw2("WHITE_LIST_TYPE", 1);
        WHITE_LIST_TYPE = enumC992520bw22;
        EnumC992520bw2[] enumC992520bw2Arr = {enumC992520bw2, enumC992520bw22};
        LL = enumC992520bw2Arr;
        LLILLJJLI = new C2254308sP(enumC992520bw2Arr);
    }

    public static EnumC992520bw2[] values() {
        return (EnumC992520bw2[]) LL.clone();
    }

    public static EnumC992520bw2 valueOf(String str) {
        return (EnumC992520bw2) C08FF.LIZ(EnumC992520bw2.class, str);
    }

    public EnumC992520bw2(String str, int i) {
    }
}
