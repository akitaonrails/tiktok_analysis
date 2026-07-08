package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656150PoT {
    public static final EnumC656150PoT AUTHOR;
    public static final EnumC656150PoT AUTHOR_DIGG;
    public static final EnumC656150PoT AUTHOR_TIME;
    public static final EnumC656150PoT DIGG;
    public static final EnumC656150PoT DIGG_CLA;
    public static final /* synthetic */ EnumC656150PoT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC656150PoT NONE;
    public static final EnumC656150PoT PRODUCT_SELLING_POINT;
    public static final EnumC656150PoT TIME;
    public final C657250PqF LL;

    public static InterfaceC2044707zh<EnumC656150PoT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC656150PoT enumC656150PoT = new EnumC656150PoT("NONE", 0, new C657250PqF(false, false, false, false, false, 24));
        NONE = enumC656150PoT;
        EnumC656150PoT enumC656150PoT2 = new EnumC656150PoT("AUTHOR", 1, new C657250PqF(true, false, false, false, false, 24));
        AUTHOR = enumC656150PoT2;
        EnumC656150PoT enumC656150PoT3 = new EnumC656150PoT("DIGG", 2, new C657250PqF(false, true, false, false, false, 24));
        DIGG = enumC656150PoT3;
        EnumC656150PoT enumC656150PoT4 = new EnumC656150PoT("DIGG_CLA", 3, new C657250PqF(false, true, false, true, false, 16));
        DIGG_CLA = enumC656150PoT4;
        EnumC656150PoT enumC656150PoT5 = new EnumC656150PoT("TIME", 4, new C657250PqF(false, false, true, false, false, 24));
        TIME = enumC656150PoT5;
        EnumC656150PoT enumC656150PoT6 = new EnumC656150PoT("AUTHOR_DIGG", 5, new C657250PqF(true, true, false, false, false, 24));
        AUTHOR_DIGG = enumC656150PoT6;
        EnumC656150PoT enumC656150PoT7 = new EnumC656150PoT("AUTHOR_TIME", 6, new C657250PqF(true, false, true, false, false, 24));
        AUTHOR_TIME = enumC656150PoT7;
        EnumC656150PoT enumC656150PoT8 = new EnumC656150PoT("PRODUCT_SELLING_POINT", 7, new C657250PqF(false, false, false, false, true, 8));
        PRODUCT_SELLING_POINT = enumC656150PoT8;
        EnumC656150PoT[] enumC656150PoTArr = {enumC656150PoT, enumC656150PoT2, enumC656150PoT3, enumC656150PoT4, enumC656150PoT5, enumC656150PoT6, enumC656150PoT7, enumC656150PoT8};
        LLILLJJLI = enumC656150PoTArr;
        LLILLL = new C2254308sP(enumC656150PoTArr);
    }

    public static EnumC656150PoT[] values() {
        return (EnumC656150PoT[]) LLILLJJLI.clone();
    }

    public final C657250PqF getItemVisibility() {
        return this.LL;
    }

    public static EnumC656150PoT valueOf(String str) {
        return (EnumC656150PoT) C08FF.LIZ(EnumC656150PoT.class, str);
    }

    public EnumC656150PoT(String str, int i, C657250PqF c657250PqF) {
        this.LL = c657250PqF;
    }
}
