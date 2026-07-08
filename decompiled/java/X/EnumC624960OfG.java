package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624960OfG {
    public static final EnumC624960OfG CLEAR_CACHE;
    public static final C624970OfH Companion;
    public static final EnumC624960OfG DOWNLOAD_FINISH;
    public static final /* synthetic */ EnumC624960OfG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624960OfG NOT_WIFI;
    public static final EnumC624960OfG NO_NET;
    public static final EnumC624960OfG OTHERS;
    public static final EnumC624960OfG STORAGE_NOT_ENOUGH;
    public static final EnumC624960OfG USER_PAUSE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC624960OfG> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0OfH] */
    static {
        EnumC624960OfG enumC624960OfG = new EnumC624960OfG("DOWNLOAD_FINISH", 0, 0);
        DOWNLOAD_FINISH = enumC624960OfG;
        EnumC624960OfG enumC624960OfG2 = new EnumC624960OfG("USER_PAUSE", 1, 1);
        USER_PAUSE = enumC624960OfG2;
        EnumC624960OfG enumC624960OfG3 = new EnumC624960OfG("CLEAR_CACHE", 2, 2);
        CLEAR_CACHE = enumC624960OfG3;
        EnumC624960OfG enumC624960OfG4 = new EnumC624960OfG("NOT_WIFI", 3, 3);
        NOT_WIFI = enumC624960OfG4;
        EnumC624960OfG enumC624960OfG5 = new EnumC624960OfG("NO_NET", 4, 4);
        NO_NET = enumC624960OfG5;
        EnumC624960OfG enumC624960OfG6 = new EnumC624960OfG("STORAGE_NOT_ENOUGH", 5, 5);
        STORAGE_NOT_ENOUGH = enumC624960OfG6;
        EnumC624960OfG enumC624960OfG7 = new EnumC624960OfG("OTHERS", 6, 6);
        OTHERS = enumC624960OfG7;
        EnumC624960OfG[] enumC624960OfGArr = {enumC624960OfG, enumC624960OfG2, enumC624960OfG3, enumC624960OfG4, enumC624960OfG5, enumC624960OfG6, enumC624960OfG7};
        LLILLJJLI = enumC624960OfGArr;
        LLILLL = new C2254308sP(enumC624960OfGArr);
        Companion = new Object() { // from class: X.0OfH
        };
    }

    public static EnumC624960OfG[] values() {
        return (EnumC624960OfG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC624960OfG valueOf(String str) {
        return (EnumC624960OfG) C08FF.LIZ(EnumC624960OfG.class, str);
    }

    public EnumC624960OfG(String str, int i, int i2) {
        this.LL = i2;
    }
}
