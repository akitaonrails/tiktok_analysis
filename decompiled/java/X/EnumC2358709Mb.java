package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2358709Mb {
    public static final EnumC2358709Mb CACHE;
    public static final /* synthetic */ EnumC2358709Mb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "y+2T0brqfIqkZDbYHfFiN/8XI5fyqrwX5cSWeGVK0ys=";

    public static InterfaceC2044707zh<EnumC2358709Mb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2358709Mb enumC2358709Mb = new EnumC2358709Mb();
        CACHE = enumC2358709Mb;
        EnumC2358709Mb[] enumC2358709MbArr = {enumC2358709Mb};
        LLILLJJLI = enumC2358709MbArr;
        LLILLL = new C2254308sP(enumC2358709MbArr);
    }

    public static EnumC2358709Mb[] values() {
        return (EnumC2358709Mb[]) LLILLJJLI.clone();
    }

    public final String getToken() {
        return this.LL;
    }

    public static EnumC2358709Mb valueOf(String str) {
        return (EnumC2358709Mb) C08FF.LIZ(EnumC2358709Mb.class, str);
    }
}
