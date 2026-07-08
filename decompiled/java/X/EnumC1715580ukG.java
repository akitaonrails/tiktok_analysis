package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ukG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1715580ukG {
    public static final C1715590ukH Companion;
    public static final EnumC1715580ukG DARK;
    public static final /* synthetic */ EnumC1715580ukG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1715580ukG TRANSPARENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1715580ukG> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ukH] */
    static {
        EnumC1715580ukG enumC1715580ukG = new EnumC1715580ukG("TRANSPARENT", 0, "transparent");
        TRANSPARENT = enumC1715580ukG;
        EnumC1715580ukG enumC1715580ukG2 = new EnumC1715580ukG("DARK", 1, "dark");
        DARK = enumC1715580ukG2;
        EnumC1715580ukG[] enumC1715580ukGArr = {enumC1715580ukG, enumC1715580ukG2};
        LLILLJJLI = enumC1715580ukGArr;
        LLILLL = new C2254308sP(enumC1715580ukGArr);
        Companion = new Object() { // from class: X.0ukH
        };
    }

    public static EnumC1715580ukG[] values() {
        return (EnumC1715580ukG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1715580ukG valueOf(String str) {
        return (EnumC1715580ukG) C08FF.LIZ(EnumC1715580ukG.class, str);
    }

    public EnumC1715580ukG(String str, int i, String str2) {
        this.LL = str2;
    }
}
