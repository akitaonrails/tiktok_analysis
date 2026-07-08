package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1244930iV9 {
    public static final EnumC1244930iV9 DELETE;
    public static final /* synthetic */ EnumC1244930iV9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1244930iV9 LOAD_MORE;
    public static final EnumC1244930iV9 REFRESH;

    public static InterfaceC2044707zh<EnumC1244930iV9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1244930iV9 enumC1244930iV9 = new EnumC1244930iV9("REFRESH", 0);
        REFRESH = enumC1244930iV9;
        EnumC1244930iV9 enumC1244930iV92 = new EnumC1244930iV9("LOAD_MORE", 1);
        LOAD_MORE = enumC1244930iV92;
        EnumC1244930iV9 enumC1244930iV93 = new EnumC1244930iV9("DELETE", 2);
        DELETE = enumC1244930iV93;
        EnumC1244930iV9[] enumC1244930iV9Arr = {enumC1244930iV9, enumC1244930iV92, enumC1244930iV93};
        LL = enumC1244930iV9Arr;
        LLILLJJLI = new C2254308sP(enumC1244930iV9Arr);
    }

    public static EnumC1244930iV9[] values() {
        return (EnumC1244930iV9[]) LL.clone();
    }

    public static EnumC1244930iV9 valueOf(String str) {
        return (EnumC1244930iV9) C08FF.LIZ(EnumC1244930iV9.class, str);
    }

    public EnumC1244930iV9(String str, int i) {
    }
}
