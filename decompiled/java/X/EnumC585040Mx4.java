package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585040Mx4 {
    public static final /* synthetic */ EnumC585040Mx4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585040Mx4 MERGE_PAGE;
    public static final EnumC585040Mx4 REFRESH;

    public static InterfaceC2044707zh<EnumC585040Mx4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585040Mx4 enumC585040Mx4 = new EnumC585040Mx4("REFRESH", 0);
        REFRESH = enumC585040Mx4;
        EnumC585040Mx4 enumC585040Mx42 = new EnumC585040Mx4("MERGE_PAGE", 1);
        MERGE_PAGE = enumC585040Mx42;
        EnumC585040Mx4[] enumC585040Mx4Arr = {enumC585040Mx4, enumC585040Mx42};
        LL = enumC585040Mx4Arr;
        LLILLJJLI = new C2254308sP(enumC585040Mx4Arr);
    }

    public static EnumC585040Mx4[] values() {
        return (EnumC585040Mx4[]) LL.clone();
    }

    public static EnumC585040Mx4 valueOf(String str) {
        return (EnumC585040Mx4) C08FF.LIZ(EnumC585040Mx4.class, str);
    }

    public EnumC585040Mx4(String str, int i) {
    }
}
