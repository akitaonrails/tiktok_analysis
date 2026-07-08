package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083750eJB {
    public static final EnumC1083750eJB BOTTOM;
    public static final EnumC1083750eJB CENTER;
    public static final EnumC1083750eJB LEFT;
    public static final /* synthetic */ EnumC1083750eJB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083750eJB RIGHT;
    public static final EnumC1083750eJB TOP;

    public static InterfaceC2044707zh<EnumC1083750eJB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083750eJB enumC1083750eJB = new EnumC1083750eJB("LEFT", 0);
        LEFT = enumC1083750eJB;
        EnumC1083750eJB enumC1083750eJB2 = new EnumC1083750eJB("TOP", 1);
        TOP = enumC1083750eJB2;
        EnumC1083750eJB enumC1083750eJB3 = new EnumC1083750eJB("RIGHT", 2);
        RIGHT = enumC1083750eJB3;
        EnumC1083750eJB enumC1083750eJB4 = new EnumC1083750eJB("BOTTOM", 3);
        BOTTOM = enumC1083750eJB4;
        EnumC1083750eJB enumC1083750eJB5 = new EnumC1083750eJB("CENTER", 4);
        CENTER = enumC1083750eJB5;
        EnumC1083750eJB[] enumC1083750eJBArr = {enumC1083750eJB, enumC1083750eJB2, enumC1083750eJB3, enumC1083750eJB4, enumC1083750eJB5};
        LL = enumC1083750eJBArr;
        LLILLJJLI = new C2254308sP(enumC1083750eJBArr);
    }

    public static EnumC1083750eJB[] values() {
        return (EnumC1083750eJB[]) LL.clone();
    }

    public static EnumC1083750eJB valueOf(String str) {
        return (EnumC1083750eJB) C08FF.LIZ(EnumC1083750eJB.class, str);
    }

    public EnumC1083750eJB(String str, int i) {
    }
}
