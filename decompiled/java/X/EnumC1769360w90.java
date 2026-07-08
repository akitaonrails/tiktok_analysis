package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769360w90 {
    public static final EnumC1769360w90 FLIP;
    public static final /* synthetic */ EnumC1769360w90[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1769360w90 SCALE;

    public static InterfaceC2044707zh<EnumC1769360w90> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1769360w90 enumC1769360w90 = new EnumC1769360w90("SCALE", 0);
        SCALE = enumC1769360w90;
        EnumC1769360w90 enumC1769360w902 = new EnumC1769360w90("FLIP", 1);
        FLIP = enumC1769360w902;
        EnumC1769360w90[] enumC1769360w90Arr = {enumC1769360w90, enumC1769360w902};
        LL = enumC1769360w90Arr;
        LLILLJJLI = new C2254308sP(enumC1769360w90Arr);
    }

    public static EnumC1769360w90[] values() {
        return (EnumC1769360w90[]) LL.clone();
    }

    public static EnumC1769360w90 valueOf(String str) {
        return (EnumC1769360w90) C08FF.LIZ(EnumC1769360w90.class, str);
    }

    public EnumC1769360w90(String str, int i) {
    }
}
