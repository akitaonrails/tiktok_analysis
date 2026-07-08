package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC484320Iz0 {
    public static final /* synthetic */ EnumC484320Iz0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC484320Iz0 LOAD_MORE;
    public static final EnumC484320Iz0 PRELOAD;
    public static final EnumC484320Iz0 REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC484320Iz0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC484320Iz0 enumC484320Iz0 = new EnumC484320Iz0("PRELOAD", 0, "preload");
        PRELOAD = enumC484320Iz0;
        EnumC484320Iz0 enumC484320Iz02 = new EnumC484320Iz0("REFRESH", 1, "refresh");
        REFRESH = enumC484320Iz02;
        EnumC484320Iz0 enumC484320Iz03 = new EnumC484320Iz0("LOAD_MORE", 2, "load_more");
        LOAD_MORE = enumC484320Iz03;
        EnumC484320Iz0[] enumC484320Iz0Arr = {enumC484320Iz0, enumC484320Iz02, enumC484320Iz03};
        LLILLJJLI = enumC484320Iz0Arr;
        LLILLL = new C2254308sP(enumC484320Iz0Arr);
    }

    public static EnumC484320Iz0[] values() {
        return (EnumC484320Iz0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC484320Iz0 valueOf(String str) {
        return (EnumC484320Iz0) C08FF.LIZ(EnumC484320Iz0.class, str);
    }

    public EnumC484320Iz0(String str, int i, String str2) {
        this.LL = str2;
    }
}
