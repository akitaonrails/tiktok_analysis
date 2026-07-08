package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1803160x1W implements InterfaceC1284030jWD {
    public static final /* synthetic */ EnumC1803160x1W[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1803160x1W NON_USE;
    public static final EnumC1803160x1W NON_USE_AND_NON_CACHE;
    public static final EnumC1803160x1W USE;
    public final boolean LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1803160x1W> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1803160x1W enumC1803160x1W = new EnumC1803160x1W("USE", 0, true, true);
        USE = enumC1803160x1W;
        EnumC1803160x1W enumC1803160x1W2 = new EnumC1803160x1W("NON_USE", 1, false, true);
        NON_USE = enumC1803160x1W2;
        EnumC1803160x1W enumC1803160x1W3 = new EnumC1803160x1W("NON_USE_AND_NON_CACHE", 2, false, false);
        NON_USE_AND_NON_CACHE = enumC1803160x1W3;
        EnumC1803160x1W[] enumC1803160x1WArr = {enumC1803160x1W, enumC1803160x1W2, enumC1803160x1W3};
        LLILLL = enumC1803160x1WArr;
        LLILZ = new C2254308sP(enumC1803160x1WArr);
    }

    public static EnumC1803160x1W[] values() {
        return (EnumC1803160x1W[]) LLILLL.clone();
    }

    @Override // X.InterfaceC1284030jWD
    public boolean canCache() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1284030jWD
    public boolean canUse() {
        return this.LL;
    }

    public static EnumC1803160x1W valueOf(String str) {
        return (EnumC1803160x1W) C08FF.LIZ(EnumC1803160x1W.class, str);
    }

    public EnumC1803160x1W(String str, int i, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
