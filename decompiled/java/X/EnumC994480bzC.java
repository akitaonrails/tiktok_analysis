package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994480bzC {
    public static final EnumC994480bzC HIDE;
    public static final EnumC994480bzC HIDE_ANIM;
    public static final /* synthetic */ EnumC994480bzC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994480bzC SHOW;
    public static final EnumC994480bzC SHOW_ANIM;

    public static InterfaceC2044707zh<EnumC994480bzC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994480bzC enumC994480bzC = new EnumC994480bzC("HIDE", 0);
        HIDE = enumC994480bzC;
        EnumC994480bzC enumC994480bzC2 = new EnumC994480bzC("SHOW", 1);
        SHOW = enumC994480bzC2;
        EnumC994480bzC enumC994480bzC3 = new EnumC994480bzC("SHOW_ANIM", 2);
        SHOW_ANIM = enumC994480bzC3;
        EnumC994480bzC enumC994480bzC4 = new EnumC994480bzC("HIDE_ANIM", 3);
        HIDE_ANIM = enumC994480bzC4;
        EnumC994480bzC[] enumC994480bzCArr = {enumC994480bzC, enumC994480bzC2, enumC994480bzC3, enumC994480bzC4};
        LL = enumC994480bzCArr;
        LLILLJJLI = new C2254308sP(enumC994480bzCArr);
    }

    public static EnumC994480bzC[] values() {
        return (EnumC994480bzC[]) LL.clone();
    }

    public static EnumC994480bzC valueOf(String str) {
        return (EnumC994480bzC) C08FF.LIZ(EnumC994480bzC.class, str);
    }

    public EnumC994480bzC(String str, int i) {
    }
}
