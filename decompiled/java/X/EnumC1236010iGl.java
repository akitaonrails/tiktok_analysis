package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1236010iGl {
    public static final EnumC1236010iGl BORDERLESS;
    public static final /* synthetic */ EnumC1236010iGl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1236010iGl NOBUTTON;
    public static final EnumC1236010iGl SECONDARY;

    public static InterfaceC2044707zh<EnumC1236010iGl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1236010iGl enumC1236010iGl = new EnumC1236010iGl("SECONDARY", 0);
        SECONDARY = enumC1236010iGl;
        EnumC1236010iGl enumC1236010iGl2 = new EnumC1236010iGl("BORDERLESS", 1);
        BORDERLESS = enumC1236010iGl2;
        EnumC1236010iGl enumC1236010iGl3 = new EnumC1236010iGl("NOBUTTON", 2);
        NOBUTTON = enumC1236010iGl3;
        EnumC1236010iGl[] enumC1236010iGlArr = {enumC1236010iGl, enumC1236010iGl2, enumC1236010iGl3};
        LL = enumC1236010iGlArr;
        LLILLJJLI = new C2254308sP(enumC1236010iGlArr);
    }

    public static EnumC1236010iGl[] values() {
        return (EnumC1236010iGl[]) LL.clone();
    }

    public static EnumC1236010iGl valueOf(String str) {
        return (EnumC1236010iGl) C08FF.LIZ(EnumC1236010iGl.class, str);
    }

    public EnumC1236010iGl(String str, int i) {
    }
}
