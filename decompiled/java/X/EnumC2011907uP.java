package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2011907uP {
    public static final EnumC2011907uP ANIMATION;
    public static final EnumC2011907uP BANNER;
    public static final /* synthetic */ EnumC2011907uP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2011907uP NORMAL;

    public static InterfaceC2044707zh<EnumC2011907uP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2011907uP enumC2011907uP = new EnumC2011907uP("BANNER", 0);
        BANNER = enumC2011907uP;
        EnumC2011907uP enumC2011907uP2 = new EnumC2011907uP("ANIMATION", 1);
        ANIMATION = enumC2011907uP2;
        EnumC2011907uP enumC2011907uP3 = new EnumC2011907uP("NORMAL", 2);
        NORMAL = enumC2011907uP3;
        EnumC2011907uP[] enumC2011907uPArr = {enumC2011907uP, enumC2011907uP2, enumC2011907uP3};
        LL = enumC2011907uPArr;
        LLILLJJLI = new C2254308sP(enumC2011907uPArr);
    }

    public static EnumC2011907uP[] values() {
        return (EnumC2011907uP[]) LL.clone();
    }

    public static EnumC2011907uP valueOf(String str) {
        return (EnumC2011907uP) C08FF.LIZ(EnumC2011907uP.class, str);
    }

    public EnumC2011907uP(String str, int i) {
    }
}
