package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC898060ZKy {
    public static final EnumC898060ZKy DOUBLE_TAP;
    public static final /* synthetic */ EnumC898060ZKy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC898060ZKy LONG_PRESS;
    public static final EnumC898060ZKy SINGLE_TAP;
    public static final EnumC898060ZKy SWIPE;

    public static InterfaceC2044707zh<EnumC898060ZKy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC898060ZKy enumC898060ZKy = new EnumC898060ZKy("SWIPE", 0);
        SWIPE = enumC898060ZKy;
        EnumC898060ZKy enumC898060ZKy2 = new EnumC898060ZKy("SINGLE_TAP", 1);
        SINGLE_TAP = enumC898060ZKy2;
        EnumC898060ZKy enumC898060ZKy3 = new EnumC898060ZKy("DOUBLE_TAP", 2);
        DOUBLE_TAP = enumC898060ZKy3;
        EnumC898060ZKy enumC898060ZKy4 = new EnumC898060ZKy("LONG_PRESS", 3);
        LONG_PRESS = enumC898060ZKy4;
        EnumC898060ZKy[] enumC898060ZKyArr = {enumC898060ZKy, enumC898060ZKy2, enumC898060ZKy3, enumC898060ZKy4};
        LL = enumC898060ZKyArr;
        LLILLJJLI = new C2254308sP(enumC898060ZKyArr);
    }

    public static EnumC898060ZKy[] values() {
        return (EnumC898060ZKy[]) LL.clone();
    }

    public static EnumC898060ZKy valueOf(String str) {
        return (EnumC898060ZKy) C08FF.LIZ(EnumC898060ZKy.class, str);
    }

    public EnumC898060ZKy(String str, int i) {
    }
}
