package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778530wNn {
    public static final /* synthetic */ EnumC1778530wNn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778530wNn STRATEGY_ERROR_RETRY;
    public static final EnumC1778530wNn STRATEGY_LOADSUCCESS_ADJUST;
    public static final EnumC1778530wNn STRATEGY_PREFETCH_GECKO;
    public static final EnumC1778530wNn STRATEGY_PRELOAD_INDEX;
    public static final EnumC1778530wNn STRATEGY_RELOAD_CACHE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1778530wNn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1778530wNn enumC1778530wNn = new EnumC1778530wNn("STRATEGY_PRELOAD_INDEX", 0, "PreloadIndex");
        STRATEGY_PRELOAD_INDEX = enumC1778530wNn;
        EnumC1778530wNn enumC1778530wNn2 = new EnumC1778530wNn("STRATEGY_PREFETCH_GECKO", 1, "PrefetchGecko");
        STRATEGY_PREFETCH_GECKO = enumC1778530wNn2;
        EnumC1778530wNn enumC1778530wNn3 = new EnumC1778530wNn("STRATEGY_RELOAD_CACHE", 2, "ReLoadCache");
        STRATEGY_RELOAD_CACHE = enumC1778530wNn3;
        EnumC1778530wNn enumC1778530wNn4 = new EnumC1778530wNn("STRATEGY_LOADSUCCESS_ADJUST", 3, "LoadSuccessAdjust");
        STRATEGY_LOADSUCCESS_ADJUST = enumC1778530wNn4;
        EnumC1778530wNn enumC1778530wNn5 = new EnumC1778530wNn("STRATEGY_ERROR_RETRY", 4, "ERROR_RETRY");
        STRATEGY_ERROR_RETRY = enumC1778530wNn5;
        EnumC1778530wNn[] enumC1778530wNnArr = {enumC1778530wNn, enumC1778530wNn2, enumC1778530wNn3, enumC1778530wNn4, enumC1778530wNn5};
        LLILLJJLI = enumC1778530wNnArr;
        LLILLL = new C2254308sP(enumC1778530wNnArr);
    }

    public static EnumC1778530wNn[] values() {
        return (EnumC1778530wNn[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1778530wNn valueOf(String str) {
        return (EnumC1778530wNn) C08FF.LIZ(EnumC1778530wNn.class, str);
    }

    public EnumC1778530wNn(String str, int i, String str2) {
        this.LL = str2;
    }
}
