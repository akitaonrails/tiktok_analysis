package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.044e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10382044e {
    public static final EnumC10382044e BATCH_PRELOAD;
    public static final EnumC10382044e CACHE;
    public static final EnumC10382044e INIT;
    public static final /* synthetic */ EnumC10382044e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC10382044e LOADING;
    public static final EnumC10382044e NORMAL;

    public static InterfaceC2044707zh<EnumC10382044e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC10382044e enumC10382044e = new EnumC10382044e("INIT", 0);
        INIT = enumC10382044e;
        EnumC10382044e enumC10382044e2 = new EnumC10382044e("LOADING", 1);
        LOADING = enumC10382044e2;
        EnumC10382044e enumC10382044e3 = new EnumC10382044e("BATCH_PRELOAD", 2);
        BATCH_PRELOAD = enumC10382044e3;
        EnumC10382044e enumC10382044e4 = new EnumC10382044e("CACHE", 3);
        CACHE = enumC10382044e4;
        EnumC10382044e enumC10382044e5 = new EnumC10382044e("NORMAL", 4);
        NORMAL = enumC10382044e5;
        EnumC10382044e[] enumC10382044eArr = {enumC10382044e, enumC10382044e2, enumC10382044e3, enumC10382044e4, enumC10382044e5};
        LL = enumC10382044eArr;
        LLILLJJLI = new C2254308sP(enumC10382044eArr);
    }

    public static EnumC10382044e[] values() {
        return (EnumC10382044e[]) LL.clone();
    }

    public static EnumC10382044e valueOf(String str) {
        return (EnumC10382044e) C08FF.LIZ(EnumC10382044e.class, str);
    }

    public EnumC10382044e(String str, int i) {
    }
}
