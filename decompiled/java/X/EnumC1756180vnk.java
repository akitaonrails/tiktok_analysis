package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756180vnk {
    public static final C1756680voY Companion;
    public static final EnumC1756180vnk HALF_SCREEN_TOP;
    public static final /* synthetic */ EnumC1756180vnk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "half_screen_top";

    public static InterfaceC2044707zh<EnumC1756180vnk> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0voY] */
    static {
        EnumC1756180vnk enumC1756180vnk = new EnumC1756180vnk();
        HALF_SCREEN_TOP = enumC1756180vnk;
        EnumC1756180vnk[] enumC1756180vnkArr = {enumC1756180vnk};
        LLILLJJLI = enumC1756180vnkArr;
        LLILLL = new C2254308sP(enumC1756180vnkArr);
        Companion = new Object() { // from class: X.0voY
        };
    }

    public static EnumC1756180vnk[] values() {
        return (EnumC1756180vnk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756180vnk valueOf(String str) {
        return (EnumC1756180vnk) C08FF.LIZ(EnumC1756180vnk.class, str);
    }
}
