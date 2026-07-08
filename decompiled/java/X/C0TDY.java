package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TDY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDY {
    public static final C0TDY CAST_DUAL_DEVICE;
    public static final C0TDY CAST_PHONE_AS_CAMERA;
    public static final /* synthetic */ C0TDY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0TDY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TDY c0tdy = new C0TDY("CAST_DUAL_DEVICE", 0);
        CAST_DUAL_DEVICE = c0tdy;
        C0TDY c0tdy2 = new C0TDY("CAST_PHONE_AS_CAMERA", 1);
        CAST_PHONE_AS_CAMERA = c0tdy2;
        C0TDY[] c0tdyArr = {c0tdy, c0tdy2};
        LL = c0tdyArr;
        LLILLJJLI = new C2254308sP(c0tdyArr);
    }

    public static C0TDY[] values() {
        return (C0TDY[]) LL.clone();
    }

    public static C0TDY valueOf(String str) {
        return (C0TDY) C08FF.LIZ(C0TDY.class, str);
    }

    public C0TDY(String str, int i) {
    }
}
