package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1371620lnU {
    public static final /* synthetic */ EnumC1371620lnU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1371620lnU SYNC;
    public static final EnumC1371620lnU USE_CACHE;

    public static InterfaceC2044707zh<EnumC1371620lnU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1371620lnU enumC1371620lnU = new EnumC1371620lnU("SYNC", 0);
        SYNC = enumC1371620lnU;
        EnumC1371620lnU enumC1371620lnU2 = new EnumC1371620lnU("USE_CACHE", 1);
        USE_CACHE = enumC1371620lnU2;
        EnumC1371620lnU[] enumC1371620lnUArr = {enumC1371620lnU, enumC1371620lnU2};
        LL = enumC1371620lnUArr;
        LLILLJJLI = new C2254308sP(enumC1371620lnUArr);
    }

    public static EnumC1371620lnU[] values() {
        return (EnumC1371620lnU[]) LL.clone();
    }

    public static EnumC1371620lnU valueOf(String str) {
        return (EnumC1371620lnU) C08FF.LIZ(EnumC1371620lnU.class, str);
    }

    public EnumC1371620lnU(String str, int i) {
    }
}
