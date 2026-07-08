package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC629350OmL {
    public static final /* synthetic */ EnumC629350OmL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC629350OmL SCENE_DEFAULT;
    public static final EnumC629350OmL SCENE_PRELOAD;
    public static final EnumC629350OmL SCENE_PREVIEW;
    public static final EnumC629350OmL SCENE_SCENE_RED_DOT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC629350OmL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC629350OmL enumC629350OmL = new EnumC629350OmL("SCENE_DEFAULT", 0, 0);
        SCENE_DEFAULT = enumC629350OmL;
        EnumC629350OmL enumC629350OmL2 = new EnumC629350OmL("SCENE_SCENE_RED_DOT", 1, 1);
        SCENE_SCENE_RED_DOT = enumC629350OmL2;
        EnumC629350OmL enumC629350OmL3 = new EnumC629350OmL("SCENE_PREVIEW", 2, 2);
        SCENE_PREVIEW = enumC629350OmL3;
        EnumC629350OmL enumC629350OmL4 = new EnumC629350OmL("SCENE_PRELOAD", 3, 3);
        SCENE_PRELOAD = enumC629350OmL4;
        EnumC629350OmL[] enumC629350OmLArr = {enumC629350OmL, enumC629350OmL2, enumC629350OmL3, enumC629350OmL4};
        LLILLJJLI = enumC629350OmLArr;
        LLILLL = new C2254308sP(enumC629350OmLArr);
    }

    public static EnumC629350OmL[] values() {
        return (EnumC629350OmL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC629350OmL valueOf(String str) {
        return (EnumC629350OmL) C08FF.LIZ(EnumC629350OmL.class, str);
    }

    public EnumC629350OmL(String str, int i, int i2) {
        this.LL = i2;
    }
}
