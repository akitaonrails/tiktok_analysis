package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1998607sG {
    public static final EnumC1998607sG DURATION;
    public static final EnumC1998607sG FPS;
    public static final /* synthetic */ EnumC1998607sG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1998607sG NORMAL;
    public static final EnumC1998607sG TOGGLE_MODE;

    public static InterfaceC2044707zh<EnumC1998607sG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1998607sG enumC1998607sG = new EnumC1998607sG("NORMAL", 0);
        NORMAL = enumC1998607sG;
        EnumC1998607sG enumC1998607sG2 = new EnumC1998607sG("FPS", 1);
        FPS = enumC1998607sG2;
        EnumC1998607sG enumC1998607sG3 = new EnumC1998607sG("DURATION", 2);
        DURATION = enumC1998607sG3;
        EnumC1998607sG enumC1998607sG4 = new EnumC1998607sG("TOGGLE_MODE", 3);
        TOGGLE_MODE = enumC1998607sG4;
        EnumC1998607sG[] enumC1998607sGArr = {enumC1998607sG, enumC1998607sG2, enumC1998607sG3, enumC1998607sG4};
        LL = enumC1998607sGArr;
        LLILLJJLI = new C2254308sP(enumC1998607sGArr);
    }

    public static EnumC1998607sG[] values() {
        return (EnumC1998607sG[]) LL.clone();
    }

    public static EnumC1998607sG valueOf(String str) {
        return (EnumC1998607sG) C08FF.LIZ(EnumC1998607sG.class, str);
    }

    public EnumC1998607sG(String str, int i) {
    }
}
