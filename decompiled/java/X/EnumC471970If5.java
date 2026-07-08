package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0If5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC471970If5 {
    public static final /* synthetic */ EnumC471970If5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC471970If5 NO_MORE_RESULT;
    public static final EnumC471970If5 NO_RESULT;

    public static InterfaceC2044707zh<EnumC471970If5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC471970If5 enumC471970If5 = new EnumC471970If5("NO_RESULT", 0);
        NO_RESULT = enumC471970If5;
        EnumC471970If5 enumC471970If52 = new EnumC471970If5("NO_MORE_RESULT", 1);
        NO_MORE_RESULT = enumC471970If52;
        EnumC471970If5[] enumC471970If5Arr = {enumC471970If5, enumC471970If52};
        LL = enumC471970If5Arr;
        LLILLJJLI = new C2254308sP(enumC471970If5Arr);
    }

    public static EnumC471970If5[] values() {
        return (EnumC471970If5[]) LL.clone();
    }

    public static EnumC471970If5 valueOf(String str) {
        return (EnumC471970If5) C08FF.LIZ(EnumC471970If5.class, str);
    }

    public EnumC471970If5(String str, int i) {
    }
}
