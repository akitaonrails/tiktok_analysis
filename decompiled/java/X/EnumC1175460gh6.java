package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1175460gh6 {
    public static final EnumC1175460gh6 CAPSULE;
    public static final /* synthetic */ EnumC1175460gh6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1175460gh6 RECTANGLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1175460gh6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1175460gh6 enumC1175460gh6 = new EnumC1175460gh6("CAPSULE", 0, 200);
        CAPSULE = enumC1175460gh6;
        EnumC1175460gh6 enumC1175460gh62 = new EnumC1175460gh6("RECTANGLE", 1, 5);
        RECTANGLE = enumC1175460gh62;
        EnumC1175460gh6[] enumC1175460gh6Arr = {enumC1175460gh6, enumC1175460gh62};
        LLILLJJLI = enumC1175460gh6Arr;
        LLILLL = new C2254308sP(enumC1175460gh6Arr);
    }

    public static EnumC1175460gh6[] values() {
        return (EnumC1175460gh6[]) LLILLJJLI.clone();
    }

    public final int getCornerRadiusDp() {
        return this.LL;
    }

    public static EnumC1175460gh6 valueOf(String str) {
        return (EnumC1175460gh6) C08FF.LIZ(EnumC1175460gh6.class, str);
    }

    public EnumC1175460gh6(String str, int i, int i2) {
        this.LL = i2;
    }
}
