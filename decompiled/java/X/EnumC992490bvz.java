package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992490bvz {
    public static final EnumC992490bvz FAVORITES_TYPE;
    public static final EnumC992490bvz GO_LIVE_ANCHOR_TYPE;
    public static final /* synthetic */ EnumC992490bvz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992490bvz POLY_FAVORITES_TYPE;
    public static final EnumC992490bvz RECOMMENDATIONS_TYPE;

    public static InterfaceC2044707zh<EnumC992490bvz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992490bvz enumC992490bvz = new EnumC992490bvz("POLY_FAVORITES_TYPE", 0);
        POLY_FAVORITES_TYPE = enumC992490bvz;
        EnumC992490bvz enumC992490bvz2 = new EnumC992490bvz("FAVORITES_TYPE", 1);
        FAVORITES_TYPE = enumC992490bvz2;
        EnumC992490bvz enumC992490bvz3 = new EnumC992490bvz("RECOMMENDATIONS_TYPE", 2);
        RECOMMENDATIONS_TYPE = enumC992490bvz3;
        EnumC992490bvz enumC992490bvz4 = new EnumC992490bvz("GO_LIVE_ANCHOR_TYPE", 3);
        GO_LIVE_ANCHOR_TYPE = enumC992490bvz4;
        EnumC992490bvz[] enumC992490bvzArr = {enumC992490bvz, enumC992490bvz2, enumC992490bvz3, enumC992490bvz4};
        LL = enumC992490bvzArr;
        LLILLJJLI = new C2254308sP(enumC992490bvzArr);
    }

    public static EnumC992490bvz[] values() {
        return (EnumC992490bvz[]) LL.clone();
    }

    public static EnumC992490bvz valueOf(String str) {
        return (EnumC992490bvz) C08FF.LIZ(EnumC992490bvz.class, str);
    }

    public EnumC992490bvz(String str, int i) {
    }
}
