package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1612940s4i {
    public static final EnumC1612940s4i CHECK_CATEGORY;
    public static final EnumC1612940s4i CHECK_COLLECTION_ID;
    public static final EnumC1612940s4i CHECK_CTA_INFO;
    public static final EnumC1612940s4i CHECK_CTA_INFO_NEW;
    public static final EnumC1612940s4i CHECK_LIMITED_FREE;
    public static final /* synthetic */ EnumC1612940s4i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1612940s4i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1612940s4i enumC1612940s4i = new EnumC1612940s4i("CHECK_COLLECTION_ID", 0);
        CHECK_COLLECTION_ID = enumC1612940s4i;
        EnumC1612940s4i enumC1612940s4i2 = new EnumC1612940s4i("CHECK_LIMITED_FREE", 1);
        CHECK_LIMITED_FREE = enumC1612940s4i2;
        EnumC1612940s4i enumC1612940s4i3 = new EnumC1612940s4i("CHECK_CTA_INFO", 2);
        CHECK_CTA_INFO = enumC1612940s4i3;
        EnumC1612940s4i enumC1612940s4i4 = new EnumC1612940s4i("CHECK_CATEGORY", 3);
        CHECK_CATEGORY = enumC1612940s4i4;
        EnumC1612940s4i enumC1612940s4i5 = new EnumC1612940s4i("CHECK_CTA_INFO_NEW", 4);
        CHECK_CTA_INFO_NEW = enumC1612940s4i5;
        EnumC1612940s4i[] enumC1612940s4iArr = {enumC1612940s4i, enumC1612940s4i2, enumC1612940s4i3, enumC1612940s4i4, enumC1612940s4i5};
        LL = enumC1612940s4iArr;
        LLILLJJLI = new C2254308sP(enumC1612940s4iArr);
    }

    public static EnumC1612940s4i[] values() {
        return (EnumC1612940s4i[]) LL.clone();
    }

    public static EnumC1612940s4i valueOf(String str) {
        return (EnumC1612940s4i) C08FF.LIZ(EnumC1612940s4i.class, str);
    }

    public EnumC1612940s4i(String str, int i) {
    }
}
