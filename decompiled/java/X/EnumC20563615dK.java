package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15dK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20563615dK {
    public static final EnumC20563615dK CENTER_SPOTLIGHT;
    public static final EnumC20563615dK CROP;
    public static final EnumC20563615dK FIT;
    public static final /* synthetic */ EnumC20563615dK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC20563615dK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20563615dK enumC20563615dK = new EnumC20563615dK("FIT", 0);
        FIT = enumC20563615dK;
        EnumC20563615dK enumC20563615dK2 = new EnumC20563615dK("CROP", 1);
        CROP = enumC20563615dK2;
        EnumC20563615dK enumC20563615dK3 = new EnumC20563615dK("CENTER_SPOTLIGHT", 2);
        CENTER_SPOTLIGHT = enumC20563615dK3;
        EnumC20563615dK[] enumC20563615dKArr = {enumC20563615dK, enumC20563615dK2, enumC20563615dK3};
        LL = enumC20563615dKArr;
        LLILLJJLI = new C2254308sP(enumC20563615dKArr);
    }

    public static EnumC20563615dK[] values() {
        return (EnumC20563615dK[]) LL.clone();
    }

    public final float getThreshold() {
        int i = C20563915dN.LIZ[ordinal()];
        if (i == 1) {
            return Float.MAX_VALUE;
        }
        if (i == 2) {
            return Float.MIN_VALUE;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        return Float.MAX_VALUE;
    }

    public static EnumC20563615dK valueOf(String str) {
        return (EnumC20563615dK) C08FF.LIZ(EnumC20563615dK.class, str);
    }

    public EnumC20563615dK(String str, int i) {
    }
}
