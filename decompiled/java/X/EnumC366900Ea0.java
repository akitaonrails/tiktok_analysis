package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ea0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC366900Ea0 {
    public static final EnumC366900Ea0 ARROW;
    public static final /* synthetic */ EnumC366900Ea0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC366900Ea0 ROUNDED;

    public static InterfaceC2044707zh<EnumC366900Ea0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC366900Ea0 enumC366900Ea0 = new EnumC366900Ea0("ARROW", 0);
        ARROW = enumC366900Ea0;
        EnumC366900Ea0 enumC366900Ea02 = new EnumC366900Ea0("ROUNDED", 1);
        ROUNDED = enumC366900Ea02;
        EnumC366900Ea0[] enumC366900Ea0Arr = {enumC366900Ea0, enumC366900Ea02};
        LL = enumC366900Ea0Arr;
        LLILLJJLI = new C2254308sP(enumC366900Ea0Arr);
    }

    public static EnumC366900Ea0[] values() {
        return (EnumC366900Ea0[]) LL.clone();
    }

    public static EnumC366900Ea0 valueOf(String str) {
        return (EnumC366900Ea0) C08FF.LIZ(EnumC366900Ea0.class, str);
    }

    public EnumC366900Ea0(String str, int i) {
    }
}
