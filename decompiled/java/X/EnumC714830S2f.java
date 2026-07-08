package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC714830S2f {
    public static final EnumC714830S2f FIX_HEIGHT;
    public static final EnumC714830S2f FIX_WIDTH;
    public static final /* synthetic */ EnumC714830S2f[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC714830S2f> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC714830S2f enumC714830S2f = new EnumC714830S2f("FIX_HEIGHT", 0);
        FIX_HEIGHT = enumC714830S2f;
        EnumC714830S2f enumC714830S2f2 = new EnumC714830S2f("FIX_WIDTH", 1);
        FIX_WIDTH = enumC714830S2f2;
        EnumC714830S2f[] enumC714830S2fArr = {enumC714830S2f, enumC714830S2f2};
        LL = enumC714830S2fArr;
        LLILLJJLI = new C2254308sP(enumC714830S2fArr);
    }

    public static EnumC714830S2f[] values() {
        return (EnumC714830S2f[]) LL.clone();
    }

    public static EnumC714830S2f valueOf(String str) {
        return (EnumC714830S2f) C08FF.LIZ(EnumC714830S2f.class, str);
    }

    public EnumC714830S2f(String str, int i) {
    }
}
