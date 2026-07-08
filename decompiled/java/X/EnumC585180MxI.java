package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585180MxI {
    public static final EnumC585180MxI IDLE;
    public static final /* synthetic */ EnumC585180MxI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585180MxI ZOOM;

    public static InterfaceC2044707zh<EnumC585180MxI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585180MxI enumC585180MxI = new EnumC585180MxI("IDLE", 0);
        IDLE = enumC585180MxI;
        EnumC585180MxI enumC585180MxI2 = new EnumC585180MxI("ZOOM", 1);
        ZOOM = enumC585180MxI2;
        EnumC585180MxI[] enumC585180MxIArr = {enumC585180MxI, enumC585180MxI2};
        LL = enumC585180MxIArr;
        LLILLJJLI = new C2254308sP(enumC585180MxIArr);
    }

    public static EnumC585180MxI[] values() {
        return (EnumC585180MxI[]) LL.clone();
    }

    public static EnumC585180MxI valueOf(String str) {
        return (EnumC585180MxI) C08FF.LIZ(EnumC585180MxI.class, str);
    }

    public EnumC585180MxI(String str, int i) {
    }
}
