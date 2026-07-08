package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1301750jyn {
    public static final EnumC1301750jyn BOTTOM;
    public static final EnumC1301750jyn LEFT;
    public static final /* synthetic */ EnumC1301750jyn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1301750jyn RIGHT;
    public static final EnumC1301750jyn TOP;

    public static InterfaceC2044707zh<EnumC1301750jyn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1301750jyn enumC1301750jyn = new EnumC1301750jyn("LEFT", 0);
        LEFT = enumC1301750jyn;
        EnumC1301750jyn enumC1301750jyn2 = new EnumC1301750jyn("TOP", 1);
        TOP = enumC1301750jyn2;
        EnumC1301750jyn enumC1301750jyn3 = new EnumC1301750jyn("RIGHT", 2);
        RIGHT = enumC1301750jyn3;
        EnumC1301750jyn enumC1301750jyn4 = new EnumC1301750jyn("BOTTOM", 3);
        BOTTOM = enumC1301750jyn4;
        EnumC1301750jyn[] enumC1301750jynArr = {enumC1301750jyn, enumC1301750jyn2, enumC1301750jyn3, enumC1301750jyn4};
        LL = enumC1301750jynArr;
        LLILLJJLI = new C2254308sP(enumC1301750jynArr);
    }

    public static EnumC1301750jyn[] values() {
        return (EnumC1301750jyn[]) LL.clone();
    }

    public static EnumC1301750jyn valueOf(String str) {
        return (EnumC1301750jyn) C08FF.LIZ(EnumC1301750jyn.class, str);
    }

    public EnumC1301750jyn(String str, int i) {
    }
}
