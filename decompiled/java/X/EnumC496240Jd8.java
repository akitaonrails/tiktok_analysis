package X;

import webcast.api.room.BusinessDataFilter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC496240Jd8 {
    public static final EnumC496240Jd8 BIO;
    public static final EnumC496240Jd8 GIFT_GALLERY_ENTRANCE;
    public static final EnumC496240Jd8 LABELS;
    public static final /* synthetic */ EnumC496240Jd8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC496240Jd8 PRIVILEGE_ENTRANCE;

    public static InterfaceC2044707zh<EnumC496240Jd8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC496240Jd8 enumC496240Jd8 = new EnumC496240Jd8("BIO", 0);
        BIO = enumC496240Jd8;
        EnumC496240Jd8 enumC496240Jd82 = new EnumC496240Jd8("LABELS", 1);
        LABELS = enumC496240Jd82;
        EnumC496240Jd8 enumC496240Jd83 = new EnumC496240Jd8("PRIVILEGE_ENTRANCE", 2);
        PRIVILEGE_ENTRANCE = enumC496240Jd83;
        EnumC496240Jd8 enumC496240Jd84 = new EnumC496240Jd8("GIFT_GALLERY_ENTRANCE", 3);
        GIFT_GALLERY_ENTRANCE = enumC496240Jd84;
        EnumC496240Jd8[] enumC496240Jd8Arr = {enumC496240Jd8, enumC496240Jd82, enumC496240Jd83, enumC496240Jd84};
        LL = enumC496240Jd8Arr;
        LLILLJJLI = new C2254308sP(enumC496240Jd8Arr);
    }

    public static EnumC496240Jd8[] values() {
        return (EnumC496240Jd8[]) LL.clone();
    }

    public static EnumC496240Jd8 valueOf(String str) {
        return (EnumC496240Jd8) C08FF.LIZ(EnumC496240Jd8.class, str);
    }

    public final void filter(BusinessDataFilter businessDataFilter) {
        int i = C496250Jd9.LIZ[ordinal()];
        if (i != 1) {
            if (i == 2) {
                businessDataFilter.needGiftGalleryEntrance = true;
                return;
            }
            return;
        }
        businessDataFilter.needPrivilegeEntrance = true;
    }

    public EnumC496240Jd8(String str, int i) {
    }
}
