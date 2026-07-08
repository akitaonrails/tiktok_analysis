package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961090b7L {
    public static final EnumC961090b7L CLICK_CACHE;
    public static final C961670b8H Companion;
    public static final EnumC961090b7L LAST_CACHE;
    public static final /* synthetic */ EnumC961090b7L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC961090b7L NETWORK_PRELOAD;
    public static final EnumC961090b7L NETWORK_REAL;
    public static final EnumC961090b7L PRELOAD_CACHE;

    public static InterfaceC2044707zh<EnumC961090b7L> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC961090b7L enumC961090b7L = new EnumC961090b7L("PRELOAD_CACHE", 0);
        PRELOAD_CACHE = enumC961090b7L;
        EnumC961090b7L enumC961090b7L2 = new EnumC961090b7L("CLICK_CACHE", 1);
        CLICK_CACHE = enumC961090b7L2;
        EnumC961090b7L enumC961090b7L3 = new EnumC961090b7L("LAST_CACHE", 2);
        LAST_CACHE = enumC961090b7L3;
        EnumC961090b7L enumC961090b7L4 = new EnumC961090b7L("NETWORK_PRELOAD", 3);
        NETWORK_PRELOAD = enumC961090b7L4;
        EnumC961090b7L enumC961090b7L5 = new EnumC961090b7L("NETWORK_REAL", 4);
        NETWORK_REAL = enumC961090b7L5;
        EnumC961090b7L[] enumC961090b7LArr = {enumC961090b7L, enumC961090b7L2, enumC961090b7L3, enumC961090b7L4, enumC961090b7L5};
        LL = enumC961090b7LArr;
        LLILLJJLI = new C2254308sP(enumC961090b7LArr);
        Companion = new C961670b8H();
    }

    public static EnumC961090b7L[] values() {
        return (EnumC961090b7L[]) LL.clone();
    }

    public static EnumC961090b7L valueOf(String str) {
        return (EnumC961090b7L) C08FF.LIZ(EnumC961090b7L.class, str);
    }

    public EnumC961090b7L(String str, int i) {
    }
}
