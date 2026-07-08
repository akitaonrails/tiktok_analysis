package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC485770J3f {
    public static final EnumC485770J3f FOUNDATION;
    public static final EnumC485770J3f GAME;
    public static final EnumC485770J3f INTERACTION;
    public static final /* synthetic */ EnumC485770J3f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC485770J3f REVENUE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC485770J3f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC485770J3f enumC485770J3f = new EnumC485770J3f("FOUNDATION", 0, 1);
        FOUNDATION = enumC485770J3f;
        EnumC485770J3f enumC485770J3f2 = new EnumC485770J3f("REVENUE", 1, 2);
        REVENUE = enumC485770J3f2;
        EnumC485770J3f enumC485770J3f3 = new EnumC485770J3f("INTERACTION", 2, 3);
        INTERACTION = enumC485770J3f3;
        EnumC485770J3f enumC485770J3f4 = new EnumC485770J3f("GAME", 3, 4);
        GAME = enumC485770J3f4;
        EnumC485770J3f[] enumC485770J3fArr = {enumC485770J3f, enumC485770J3f2, enumC485770J3f3, enumC485770J3f4};
        LLILLJJLI = enumC485770J3fArr;
        LLILLL = new C2254308sP(enumC485770J3fArr);
    }

    public static EnumC485770J3f[] values() {
        return (EnumC485770J3f[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC485770J3f valueOf(String str) {
        return (EnumC485770J3f) C08FF.LIZ(EnumC485770J3f.class, str);
    }

    public EnumC485770J3f(String str, int i, int i2) {
        this.LL = i2;
    }
}
