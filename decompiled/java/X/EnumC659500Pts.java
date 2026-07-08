package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC659500Pts {
    public static final EnumC659500Pts CLICK;
    public static final /* synthetic */ EnumC659500Pts[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC659500Pts PRESS_DOWN;
    public static final EnumC659500Pts PRESS_UP;

    public static InterfaceC2044707zh<EnumC659500Pts> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC659500Pts enumC659500Pts = new EnumC659500Pts("CLICK", 0);
        CLICK = enumC659500Pts;
        EnumC659500Pts enumC659500Pts2 = new EnumC659500Pts("PRESS_DOWN", 1);
        PRESS_DOWN = enumC659500Pts2;
        EnumC659500Pts enumC659500Pts3 = new EnumC659500Pts("PRESS_UP", 2);
        PRESS_UP = enumC659500Pts3;
        EnumC659500Pts[] enumC659500PtsArr = {enumC659500Pts, enumC659500Pts2, enumC659500Pts3};
        LL = enumC659500PtsArr;
        LLILLJJLI = new C2254308sP(enumC659500PtsArr);
    }

    public static EnumC659500Pts[] values() {
        return (EnumC659500Pts[]) LL.clone();
    }

    public static EnumC659500Pts valueOf(String str) {
        return (EnumC659500Pts) C08FF.LIZ(EnumC659500Pts.class, str);
    }

    public EnumC659500Pts(String str, int i) {
    }
}
