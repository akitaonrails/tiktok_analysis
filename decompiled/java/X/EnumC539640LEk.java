package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC539640LEk {
    public static final /* synthetic */ EnumC539640LEk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC539640LEk MIX;
    public static final EnumC539640LEk PHOTO;
    public static final EnumC539640LEk UNKNOWN;
    public static final EnumC539640LEk VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC539640LEk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC539640LEk enumC539640LEk = new EnumC539640LEk("UNKNOWN", 0, 0);
        UNKNOWN = enumC539640LEk;
        EnumC539640LEk enumC539640LEk2 = new EnumC539640LEk("PHOTO", 1, 1);
        PHOTO = enumC539640LEk2;
        EnumC539640LEk enumC539640LEk3 = new EnumC539640LEk("VIDEO", 2, 2);
        VIDEO = enumC539640LEk3;
        EnumC539640LEk enumC539640LEk4 = new EnumC539640LEk("MIX", 3, 3);
        MIX = enumC539640LEk4;
        EnumC539640LEk[] enumC539640LEkArr = {enumC539640LEk, enumC539640LEk2, enumC539640LEk3, enumC539640LEk4};
        LLILLJJLI = enumC539640LEkArr;
        LLILLL = new C2254308sP(enumC539640LEkArr);
    }

    public static EnumC539640LEk[] values() {
        return (EnumC539640LEk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC539640LEk valueOf(String str) {
        return (EnumC539640LEk) C08FF.LIZ(EnumC539640LEk.class, str);
    }

    public EnumC539640LEk(String str, int i, int i2) {
        this.LL = i2;
    }
}
