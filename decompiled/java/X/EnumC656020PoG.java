package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656020PoG {
    public static final EnumC656020PoG LEFT;
    public static final /* synthetic */ EnumC656020PoG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC656020PoG RIGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC656020PoG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC656020PoG enumC656020PoG = new EnumC656020PoG("LEFT", 0, "left");
        LEFT = enumC656020PoG;
        EnumC656020PoG enumC656020PoG2 = new EnumC656020PoG("RIGHT", 1, "right");
        RIGHT = enumC656020PoG2;
        EnumC656020PoG[] enumC656020PoGArr = {enumC656020PoG, enumC656020PoG2};
        LLILLJJLI = enumC656020PoGArr;
        LLILLL = new C2254308sP(enumC656020PoGArr);
    }

    public static EnumC656020PoG[] values() {
        return (EnumC656020PoG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC656020PoG valueOf(String str) {
        return (EnumC656020PoG) C08FF.LIZ(EnumC656020PoG.class, str);
    }

    public EnumC656020PoG(String str, int i, String str2) {
        this.LL = str2;
    }
}
