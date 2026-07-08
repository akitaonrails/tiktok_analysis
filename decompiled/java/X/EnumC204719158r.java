package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.158r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC204719158r {
    public static final EnumC204719158r BLUE;
    public static final /* synthetic */ EnumC204719158r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC204719158r ORANGE;
    public static final EnumC204719158r PURPLE;
    public static final EnumC204719158r RED;

    public static InterfaceC2044707zh<EnumC204719158r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC204719158r enumC204719158r = new EnumC204719158r("RED", 0);
        RED = enumC204719158r;
        EnumC204719158r enumC204719158r2 = new EnumC204719158r("BLUE", 1);
        BLUE = enumC204719158r2;
        EnumC204719158r enumC204719158r3 = new EnumC204719158r("ORANGE", 2);
        ORANGE = enumC204719158r3;
        EnumC204719158r enumC204719158r4 = new EnumC204719158r("PURPLE", 3);
        PURPLE = enumC204719158r4;
        EnumC204719158r[] enumC204719158rArr = {enumC204719158r, enumC204719158r2, enumC204719158r3, enumC204719158r4};
        LL = enumC204719158rArr;
        LLILLJJLI = new C2254308sP(enumC204719158rArr);
    }

    public static EnumC204719158r[] values() {
        return (EnumC204719158r[]) LL.clone();
    }

    public static EnumC204719158r valueOf(String str) {
        return (EnumC204719158r) C08FF.LIZ(EnumC204719158r.class, str);
    }

    public EnumC204719158r(String str, int i) {
    }
}
