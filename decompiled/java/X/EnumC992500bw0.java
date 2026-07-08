package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992500bw0 {
    public static final EnumC992500bw0 INNER_BORDER;
    public static final /* synthetic */ EnumC992500bw0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992500bw0 OUTLINE_BORDER;

    public static InterfaceC2044707zh<EnumC992500bw0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992500bw0 enumC992500bw0 = new EnumC992500bw0("OUTLINE_BORDER", 0);
        OUTLINE_BORDER = enumC992500bw0;
        EnumC992500bw0 enumC992500bw02 = new EnumC992500bw0("INNER_BORDER", 1);
        INNER_BORDER = enumC992500bw02;
        EnumC992500bw0[] enumC992500bw0Arr = {enumC992500bw0, enumC992500bw02};
        LL = enumC992500bw0Arr;
        LLILLJJLI = new C2254308sP(enumC992500bw0Arr);
    }

    public static EnumC992500bw0[] values() {
        return (EnumC992500bw0[]) LL.clone();
    }

    public static EnumC992500bw0 valueOf(String str) {
        return (EnumC992500bw0) C08FF.LIZ(EnumC992500bw0.class, str);
    }

    public EnumC992500bw0(String str, int i) {
    }
}
