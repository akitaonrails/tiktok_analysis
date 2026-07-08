package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0302008m {
    public static final /* synthetic */ EnumC0302008m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0302008m STICKER_SETS;
    public static final EnumC0302008m UNKNOWN;
    public static final EnumC0302008m VIDEO_STICKER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0302008m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0302008m enumC0302008m = new EnumC0302008m("UNKNOWN", 0, -1);
        UNKNOWN = enumC0302008m;
        EnumC0302008m enumC0302008m2 = new EnumC0302008m("VIDEO_STICKER", 1, 0);
        VIDEO_STICKER = enumC0302008m2;
        EnumC0302008m enumC0302008m3 = new EnumC0302008m("STICKER_SETS", 2, 1);
        STICKER_SETS = enumC0302008m3;
        EnumC0302008m[] enumC0302008mArr = {enumC0302008m, enumC0302008m2, enumC0302008m3};
        LLILLJJLI = enumC0302008mArr;
        LLILLL = new C2254308sP(enumC0302008mArr);
    }

    public static EnumC0302008m[] values() {
        return (EnumC0302008m[]) LLILLJJLI.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public static EnumC0302008m valueOf(String str) {
        return (EnumC0302008m) C08FF.LIZ(EnumC0302008m.class, str);
    }

    public EnumC0302008m(String str, int i, int i2) {
        this.LL = i2;
    }
}
