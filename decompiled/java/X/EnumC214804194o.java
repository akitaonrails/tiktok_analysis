package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.194o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC214804194o {
    public static final EnumC214804194o AUTO_SIZE;
    public static final EnumC214804194o DYNAMIC;
    public static final EnumC214804194o FIXED;
    public static final EnumC214804194o FREEDOM_HEIGHT;
    public static final EnumC214804194o FULLSCREEN;
    public static final /* synthetic */ EnumC214804194o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC214804194o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC214804194o enumC214804194o = new EnumC214804194o("AUTO_SIZE", 0);
        AUTO_SIZE = enumC214804194o;
        EnumC214804194o enumC214804194o2 = new EnumC214804194o("FIXED", 1);
        FIXED = enumC214804194o2;
        EnumC214804194o enumC214804194o3 = new EnumC214804194o("DYNAMIC", 2);
        DYNAMIC = enumC214804194o3;
        EnumC214804194o enumC214804194o4 = new EnumC214804194o("FULLSCREEN", 3);
        FULLSCREEN = enumC214804194o4;
        EnumC214804194o enumC214804194o5 = new EnumC214804194o("FREEDOM_HEIGHT", 4);
        FREEDOM_HEIGHT = enumC214804194o5;
        EnumC214804194o[] enumC214804194oArr = {enumC214804194o, enumC214804194o2, enumC214804194o3, enumC214804194o4, enumC214804194o5};
        LL = enumC214804194oArr;
        LLILLJJLI = new C2254308sP(enumC214804194oArr);
    }

    public static EnumC214804194o[] values() {
        return (EnumC214804194o[]) LL.clone();
    }

    public static EnumC214804194o valueOf(String str) {
        return (EnumC214804194o) C08FF.LIZ(EnumC214804194o.class, str);
    }

    public EnumC214804194o(String str, int i) {
    }
}
