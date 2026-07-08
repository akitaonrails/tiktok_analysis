package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311340CIi {
    public static final EnumC311340CIi ANIMATING_IN;
    public static final EnumC311340CIi ANIMATING_OUT;
    public static final EnumC311340CIi IDLE;
    public static final /* synthetic */ EnumC311340CIi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC311340CIi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC311340CIi enumC311340CIi = new EnumC311340CIi("ANIMATING_IN", 0);
        ANIMATING_IN = enumC311340CIi;
        EnumC311340CIi enumC311340CIi2 = new EnumC311340CIi("ANIMATING_OUT", 1);
        ANIMATING_OUT = enumC311340CIi2;
        EnumC311340CIi enumC311340CIi3 = new EnumC311340CIi("IDLE", 2);
        IDLE = enumC311340CIi3;
        EnumC311340CIi[] enumC311340CIiArr = {enumC311340CIi, enumC311340CIi2, enumC311340CIi3};
        LL = enumC311340CIiArr;
        LLILLJJLI = new C2254308sP(enumC311340CIiArr);
    }

    public static EnumC311340CIi[] values() {
        return (EnumC311340CIi[]) LL.clone();
    }

    public static EnumC311340CIi valueOf(String str) {
        return (EnumC311340CIi) C08FF.LIZ(EnumC311340CIi.class, str);
    }

    public EnumC311340CIi(String str, int i) {
    }
}
