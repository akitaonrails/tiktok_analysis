package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Myy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586220Myy {
    public static final C586230Myz Companion;
    public static final /* synthetic */ EnumC586220Myy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586220Myy META_REQUEST_SOURCE_ADS;
    public static final EnumC586220Myy META_REQUEST_SOURCE_ANCHOR;
    public static final EnumC586220Myy META_REQUEST_SOURCE_CENTER;
    public static final EnumC586220Myy META_REQUEST_SOURCE_SEARCH;
    public static final EnumC586220Myy META_REQUEST_SOURCE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC586220Myy> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Myz] */
    static {
        EnumC586220Myy enumC586220Myy = new EnumC586220Myy("META_REQUEST_SOURCE_UNKNOWN", 0);
        META_REQUEST_SOURCE_UNKNOWN = enumC586220Myy;
        EnumC586220Myy enumC586220Myy2 = new EnumC586220Myy("META_REQUEST_SOURCE_CENTER", 1);
        META_REQUEST_SOURCE_CENTER = enumC586220Myy2;
        EnumC586220Myy enumC586220Myy3 = new EnumC586220Myy("META_REQUEST_SOURCE_ADS", 2);
        META_REQUEST_SOURCE_ADS = enumC586220Myy3;
        EnumC586220Myy enumC586220Myy4 = new EnumC586220Myy("META_REQUEST_SOURCE_ANCHOR", 3);
        META_REQUEST_SOURCE_ANCHOR = enumC586220Myy4;
        EnumC586220Myy enumC586220Myy5 = new EnumC586220Myy("META_REQUEST_SOURCE_SEARCH", 4);
        META_REQUEST_SOURCE_SEARCH = enumC586220Myy5;
        EnumC586220Myy[] enumC586220MyyArr = {enumC586220Myy, enumC586220Myy2, enumC586220Myy3, enumC586220Myy4, enumC586220Myy5};
        LL = enumC586220MyyArr;
        LLILLJJLI = new C2254308sP(enumC586220MyyArr);
        Companion = new Object() { // from class: X.0Myz
        };
    }

    public static EnumC586220Myy[] values() {
        return (EnumC586220Myy[]) LL.clone();
    }

    public static EnumC586220Myy valueOf(String str) {
        return (EnumC586220Myy) C08FF.LIZ(EnumC586220Myy.class, str);
    }

    public EnumC586220Myy(String str, int i) {
    }
}
