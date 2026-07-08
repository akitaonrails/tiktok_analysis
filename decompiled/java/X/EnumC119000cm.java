package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC119000cm {
    public static final EnumC119000cm ALBUM_WHITELIST;
    public static final EnumC119000cm CAMERA;
    public static final EnumC119000cm FAVORITE;
    public static final /* synthetic */ EnumC119000cm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC119000cm OTHER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC119000cm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC119000cm enumC119000cm = new EnumC119000cm("FAVORITE", 0, 0);
        FAVORITE = enumC119000cm;
        EnumC119000cm enumC119000cm2 = new EnumC119000cm("ALBUM_WHITELIST", 1, 1);
        ALBUM_WHITELIST = enumC119000cm2;
        EnumC119000cm enumC119000cm3 = new EnumC119000cm("CAMERA", 2, 2);
        CAMERA = enumC119000cm3;
        EnumC119000cm enumC119000cm4 = new EnumC119000cm("OTHER", 3, 3);
        OTHER = enumC119000cm4;
        EnumC119000cm[] enumC119000cmArr = {enumC119000cm, enumC119000cm2, enumC119000cm3, enumC119000cm4};
        LLILLJJLI = enumC119000cmArr;
        LLILLL = new C2254308sP(enumC119000cmArr);
    }

    public static EnumC119000cm[] values() {
        return (EnumC119000cm[]) LLILLJJLI.clone();
    }

    public final boolean isPrivileged() {
        return this == FAVORITE || this == ALBUM_WHITELIST;
    }

    public final int getRank() {
        return this.LL;
    }

    public static EnumC119000cm valueOf(String str) {
        return (EnumC119000cm) C08FF.LIZ(EnumC119000cm.class, str);
    }

    public EnumC119000cm(String str, int i, int i2) {
        this.LL = i2;
    }
}
