package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1000680c9C {
    public static final EnumC1000680c9C CACHE_WITH_ASYNC_RETRY;
    public static final EnumC1000680c9C CACHE_WITH_RETRY;
    public static final /* synthetic */ EnumC1000680c9C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1000680c9C ONLY_CACHE;
    public static final EnumC1000680c9C ONLY_RENDER;

    public static InterfaceC2044707zh<EnumC1000680c9C> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1000680c9C enumC1000680c9C = new EnumC1000680c9C("ONLY_CACHE", 0);
        ONLY_CACHE = enumC1000680c9C;
        EnumC1000680c9C enumC1000680c9C2 = new EnumC1000680c9C("CACHE_WITH_RETRY", 1);
        CACHE_WITH_RETRY = enumC1000680c9C2;
        EnumC1000680c9C enumC1000680c9C3 = new EnumC1000680c9C("ONLY_RENDER", 2);
        ONLY_RENDER = enumC1000680c9C3;
        EnumC1000680c9C enumC1000680c9C4 = new EnumC1000680c9C("CACHE_WITH_ASYNC_RETRY", 3);
        CACHE_WITH_ASYNC_RETRY = enumC1000680c9C4;
        EnumC1000680c9C[] enumC1000680c9CArr = {enumC1000680c9C, enumC1000680c9C2, enumC1000680c9C3, enumC1000680c9C4};
        LL = enumC1000680c9CArr;
        LLILLJJLI = new C2254308sP(enumC1000680c9CArr);
    }

    public static EnumC1000680c9C[] values() {
        return (EnumC1000680c9C[]) LL.clone();
    }

    public static EnumC1000680c9C valueOf(String str) {
        return (EnumC1000680c9C) C08FF.LIZ(EnumC1000680c9C.class, str);
    }

    public EnumC1000680c9C(String str, int i) {
    }
}
