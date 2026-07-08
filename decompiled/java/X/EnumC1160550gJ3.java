package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160550gJ3 {
    public static final EnumC1160550gJ3 BODY;
    public static final EnumC1160550gJ3 FRAGMENT;
    public static final /* synthetic */ EnumC1160550gJ3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1160550gJ3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1160550gJ3 enumC1160550gJ3 = new EnumC1160550gJ3("FRAGMENT", 0);
        FRAGMENT = enumC1160550gJ3;
        EnumC1160550gJ3 enumC1160550gJ32 = new EnumC1160550gJ3("BODY", 1);
        BODY = enumC1160550gJ32;
        EnumC1160550gJ3[] enumC1160550gJ3Arr = {enumC1160550gJ3, enumC1160550gJ32};
        LL = enumC1160550gJ3Arr;
        LLILLJJLI = new C2254308sP(enumC1160550gJ3Arr);
    }

    public static EnumC1160550gJ3[] values() {
        return (EnumC1160550gJ3[]) LL.clone();
    }

    public static EnumC1160550gJ3 valueOf(String str) {
        return (EnumC1160550gJ3) C08FF.LIZ(EnumC1160550gJ3.class, str);
    }

    public EnumC1160550gJ3(String str, int i) {
    }
}
