package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC777270UeL {
    public static final /* synthetic */ EnumC777270UeL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC777270UeL PAUSED;
    public static final EnumC777270UeL RESET;
    public static final EnumC777270UeL STARTED;

    public static InterfaceC2044707zh<EnumC777270UeL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC777270UeL enumC777270UeL = new EnumC777270UeL("STARTED", 0);
        STARTED = enumC777270UeL;
        EnumC777270UeL enumC777270UeL2 = new EnumC777270UeL("PAUSED", 1);
        PAUSED = enumC777270UeL2;
        EnumC777270UeL enumC777270UeL3 = new EnumC777270UeL("RESET", 2);
        RESET = enumC777270UeL3;
        EnumC777270UeL[] enumC777270UeLArr = {enumC777270UeL, enumC777270UeL2, enumC777270UeL3};
        LL = enumC777270UeLArr;
        LLILLJJLI = new C2254308sP(enumC777270UeLArr);
    }

    public static EnumC777270UeL[] values() {
        return (EnumC777270UeL[]) LL.clone();
    }

    public static EnumC777270UeL valueOf(String str) {
        return (EnumC777270UeL) C08FF.LIZ(EnumC777270UeL.class, str);
    }

    public EnumC777270UeL(String str, int i) {
    }
}
