package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992120bvO {
    public static final /* synthetic */ EnumC992120bvO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992120bvO TO_BOTTOM;
    public static final EnumC992120bvO TO_TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992120bvO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992120bvO enumC992120bvO = new EnumC992120bvO("TO_TOP", 0, 1);
        TO_TOP = enumC992120bvO;
        EnumC992120bvO enumC992120bvO2 = new EnumC992120bvO("TO_BOTTOM", 1, 2);
        TO_BOTTOM = enumC992120bvO2;
        EnumC992120bvO[] enumC992120bvOArr = {enumC992120bvO, enumC992120bvO2};
        LLILLJJLI = enumC992120bvOArr;
        LLILLL = new C2254308sP(enumC992120bvOArr);
    }

    public static EnumC992120bvO[] values() {
        return (EnumC992120bvO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992120bvO valueOf(String str) {
        return (EnumC992120bvO) C08FF.LIZ(EnumC992120bvO.class, str);
    }

    public EnumC992120bvO(String str, int i, int i2) {
        this.LL = i2;
    }
}
