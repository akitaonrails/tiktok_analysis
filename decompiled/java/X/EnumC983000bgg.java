package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC983000bgg {
    public static final EnumC983000bgg COUNT_DOWN;
    public static final EnumC983000bgg COUNT_UP;
    public static final /* synthetic */ EnumC983000bgg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC983000bgg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC983000bgg enumC983000bgg = new EnumC983000bgg("COUNT_DOWN", 0, 0);
        COUNT_DOWN = enumC983000bgg;
        EnumC983000bgg enumC983000bgg2 = new EnumC983000bgg("COUNT_UP", 1, 1);
        COUNT_UP = enumC983000bgg2;
        EnumC983000bgg[] enumC983000bggArr = {enumC983000bgg, enumC983000bgg2};
        LLILLJJLI = enumC983000bggArr;
        LLILLL = new C2254308sP(enumC983000bggArr);
    }

    public static EnumC983000bgg[] values() {
        return (EnumC983000bgg[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC983000bgg valueOf(String str) {
        return (EnumC983000bgg) C08FF.LIZ(EnumC983000bgg.class, str);
    }

    public EnumC983000bgg(String str, int i, int i2) {
        this.LL = i2;
    }
}
