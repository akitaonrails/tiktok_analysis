package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1454080nwU {
    public static final EnumC1454080nwU ENTER;
    public static final EnumC1454080nwU EXCEED_MAX_IMAGE_COUNT;
    public static final /* synthetic */ EnumC1454080nwU[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1454080nwU NEED_MORE_PHOTO;
    public static final EnumC1454080nwU NOT_SUPPORT_LAYOUT;
    public static final EnumC1454080nwU OTHER_DISABLE;
    public final boolean LL;
    public final Integer LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1454080nwU> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1454080nwU enumC1454080nwU = new EnumC1454080nwU(null, "ENTER", 0, true);
        ENTER = enumC1454080nwU;
        EnumC1454080nwU enumC1454080nwU2 = new EnumC1454080nwU(2131829959, "NOT_SUPPORT_LAYOUT", 1, false);
        NOT_SUPPORT_LAYOUT = enumC1454080nwU2;
        EnumC1454080nwU enumC1454080nwU3 = new EnumC1454080nwU(2131829966, "EXCEED_MAX_IMAGE_COUNT", 2, false);
        EXCEED_MAX_IMAGE_COUNT = enumC1454080nwU3;
        EnumC1454080nwU enumC1454080nwU4 = new EnumC1454080nwU(null, "OTHER_DISABLE", 3, false);
        OTHER_DISABLE = enumC1454080nwU4;
        EnumC1454080nwU enumC1454080nwU5 = new EnumC1454080nwU(2131829967, "NEED_MORE_PHOTO", 4, false);
        NEED_MORE_PHOTO = enumC1454080nwU5;
        EnumC1454080nwU[] enumC1454080nwUArr = {enumC1454080nwU, enumC1454080nwU2, enumC1454080nwU3, enumC1454080nwU4, enumC1454080nwU5};
        LLILLL = enumC1454080nwUArr;
        LLILZ = new C2254308sP(enumC1454080nwUArr);
    }

    public static EnumC1454080nwU[] values() {
        return (EnumC1454080nwU[]) LLILLL.clone();
    }

    public final boolean getEnableEnter() {
        return this.LL;
    }

    public final Integer getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1454080nwU valueOf(String str) {
        return (EnumC1454080nwU) C08FF.LIZ(EnumC1454080nwU.class, str);
    }

    public EnumC1454080nwU(Integer num, String str, int i, boolean z) {
        this.LL = z;
        this.LLILLJJLI = num;
    }
}
