package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Olc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC628900Olc {
    public static final EnumC628900Olc DATE_TITLE;
    public static final EnumC628900Olc FEED_ITEM;
    public static final /* synthetic */ EnumC628900Olc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC628900Olc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC628900Olc enumC628900Olc = new EnumC628900Olc("DATE_TITLE", 0, 0);
        DATE_TITLE = enumC628900Olc;
        EnumC628900Olc enumC628900Olc2 = new EnumC628900Olc("FEED_ITEM", 1, 1);
        FEED_ITEM = enumC628900Olc2;
        EnumC628900Olc[] enumC628900OlcArr = {enumC628900Olc, enumC628900Olc2};
        LLILLJJLI = enumC628900OlcArr;
        LLILLL = new C2254308sP(enumC628900OlcArr);
    }

    public static EnumC628900Olc[] values() {
        return (EnumC628900Olc[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC628900Olc valueOf(String str) {
        return (EnumC628900Olc) C08FF.LIZ(EnumC628900Olc.class, str);
    }

    public EnumC628900Olc(String str, int i, int i2) {
        this.LL = i2;
    }
}
