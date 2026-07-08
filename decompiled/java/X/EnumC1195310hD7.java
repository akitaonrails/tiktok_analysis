package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1195310hD7 {
    public static final EnumC1195310hD7 FALLBACK;
    public static final /* synthetic */ EnumC1195310hD7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1195310hD7 NO_SHOW;
    public static final EnumC1195310hD7 POI_DATA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1195310hD7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1195310hD7 enumC1195310hD7 = new EnumC1195310hD7("POI_DATA", 0, 1);
        POI_DATA = enumC1195310hD7;
        EnumC1195310hD7 enumC1195310hD72 = new EnumC1195310hD7("FALLBACK", 1, 2);
        FALLBACK = enumC1195310hD72;
        EnumC1195310hD7 enumC1195310hD73 = new EnumC1195310hD7("NO_SHOW", 2, 3);
        NO_SHOW = enumC1195310hD73;
        EnumC1195310hD7[] enumC1195310hD7Arr = {enumC1195310hD7, enumC1195310hD72, enumC1195310hD73};
        LLILLJJLI = enumC1195310hD7Arr;
        LLILLL = new C2254308sP(enumC1195310hD7Arr);
    }

    public static EnumC1195310hD7[] values() {
        return (EnumC1195310hD7[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1195310hD7 valueOf(String str) {
        return (EnumC1195310hD7) C08FF.LIZ(EnumC1195310hD7.class, str);
    }

    public EnumC1195310hD7(String str, int i, int i2) {
        this.LL = i2;
    }
}
