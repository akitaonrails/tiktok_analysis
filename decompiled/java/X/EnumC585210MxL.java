package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585210MxL {
    public static final EnumC585210MxL DRAG;
    public static final EnumC585210MxL IDLE;
    public static final /* synthetic */ EnumC585210MxL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585210MxL ZOOM;

    public static InterfaceC2044707zh<EnumC585210MxL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585210MxL enumC585210MxL = new EnumC585210MxL("IDLE", 0);
        IDLE = enumC585210MxL;
        EnumC585210MxL enumC585210MxL2 = new EnumC585210MxL("ZOOM", 1);
        ZOOM = enumC585210MxL2;
        EnumC585210MxL enumC585210MxL3 = new EnumC585210MxL("DRAG", 2);
        DRAG = enumC585210MxL3;
        EnumC585210MxL[] enumC585210MxLArr = {enumC585210MxL, enumC585210MxL2, enumC585210MxL3};
        LL = enumC585210MxLArr;
        LLILLJJLI = new C2254308sP(enumC585210MxLArr);
    }

    public static EnumC585210MxL[] values() {
        return (EnumC585210MxL[]) LL.clone();
    }

    public static EnumC585210MxL valueOf(String str) {
        return (EnumC585210MxL) C08FF.LIZ(EnumC585210MxL.class, str);
    }

    public EnumC585210MxL(String str, int i) {
    }
}
