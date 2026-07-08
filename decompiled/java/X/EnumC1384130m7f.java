package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1384130m7f {
    public static final C1384140m7g Companion;
    public static final EnumC1384130m7f EDUCATION;
    public static final /* synthetic */ EnumC1384130m7f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1384130m7f NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1384130m7f> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0m7g] */
    static {
        EnumC1384130m7f enumC1384130m7f = new EnumC1384130m7f("NORMAL", 0, 0);
        NORMAL = enumC1384130m7f;
        EnumC1384130m7f enumC1384130m7f2 = new EnumC1384130m7f("EDUCATION", 1, 1);
        EDUCATION = enumC1384130m7f2;
        EnumC1384130m7f[] enumC1384130m7fArr = {enumC1384130m7f, enumC1384130m7f2};
        LLILLJJLI = enumC1384130m7fArr;
        LLILLL = new C2254308sP(enumC1384130m7fArr);
        Companion = new Object() { // from class: X.0m7g
        };
        values();
    }

    public static EnumC1384130m7f[] values() {
        return (EnumC1384130m7f[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1384130m7f valueOf(String str) {
        return (EnumC1384130m7f) C08FF.LIZ(EnumC1384130m7f.class, str);
    }

    public EnumC1384130m7f(String str, int i, int i2) {
        this.LL = i2;
    }
}
