package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249691D3n {
    public static final EnumC2249691D3n DISABLE;
    public static final EnumC2249691D3n DUET;
    public static final EnumC2249691D3n LIVE;
    public static final /* synthetic */ EnumC2249691D3n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2249691D3n NOW;
    public static final EnumC2249691D3n PHOTO;
    public static final EnumC2249691D3n QUICK_SHOOT;
    public static final EnumC2249691D3n SCAN;
    public static final EnumC2249691D3n SPLIT_SHOOT;

    public static InterfaceC2044707zh<EnumC2249691D3n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2249691D3n enumC2249691D3n = new EnumC2249691D3n("QUICK_SHOOT", 0);
        QUICK_SHOOT = enumC2249691D3n;
        EnumC2249691D3n enumC2249691D3n2 = new EnumC2249691D3n("SPLIT_SHOOT", 1);
        SPLIT_SHOOT = enumC2249691D3n2;
        EnumC2249691D3n enumC2249691D3n3 = new EnumC2249691D3n("DUET", 2);
        DUET = enumC2249691D3n3;
        EnumC2249691D3n enumC2249691D3n4 = new EnumC2249691D3n("NOW", 3);
        NOW = enumC2249691D3n4;
        EnumC2249691D3n enumC2249691D3n5 = new EnumC2249691D3n("PHOTO", 4);
        PHOTO = enumC2249691D3n5;
        EnumC2249691D3n enumC2249691D3n6 = new EnumC2249691D3n("SCAN", 5);
        SCAN = enumC2249691D3n6;
        EnumC2249691D3n enumC2249691D3n7 = new EnumC2249691D3n("LIVE", 6);
        LIVE = enumC2249691D3n7;
        EnumC2249691D3n enumC2249691D3n8 = new EnumC2249691D3n("DISABLE", 7);
        DISABLE = enumC2249691D3n8;
        EnumC2249691D3n[] enumC2249691D3nArr = {enumC2249691D3n, enumC2249691D3n2, enumC2249691D3n3, enumC2249691D3n4, enumC2249691D3n5, enumC2249691D3n6, enumC2249691D3n7, enumC2249691D3n8};
        LL = enumC2249691D3nArr;
        LLILLJJLI = new C2254308sP(enumC2249691D3nArr);
    }

    public static EnumC2249691D3n[] values() {
        return (EnumC2249691D3n[]) LL.clone();
    }

    public static EnumC2249691D3n valueOf(String str) {
        return (EnumC2249691D3n) C08FF.LIZ(EnumC2249691D3n.class, str);
    }

    public EnumC2249691D3n(String str, int i) {
    }
}
