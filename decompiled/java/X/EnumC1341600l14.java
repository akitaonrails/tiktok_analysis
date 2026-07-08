package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341600l14 {
    public static final EnumC1341600l14 DETAIL_FULL_INNER;
    public static final EnumC1341600l14 DETAIL_FULL_LEGACY;
    public static final EnumC1341600l14 INNER_FIRST_PHOTO;
    public static final EnumC1341600l14 LIST_AVATAR;
    public static final EnumC1341600l14 LIST_PHOTO;
    public static final EnumC1341600l14 LIST_STICKER;
    public static final /* synthetic */ EnumC1341600l14[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1341600l14> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1341600l14 enumC1341600l14 = new EnumC1341600l14("LIST_PHOTO", 0, "CommentList_Photo");
        LIST_PHOTO = enumC1341600l14;
        EnumC1341600l14 enumC1341600l142 = new EnumC1341600l14("LIST_STICKER", 1, "CommentList_Sticker");
        LIST_STICKER = enumC1341600l142;
        EnumC1341600l14 enumC1341600l143 = new EnumC1341600l14("LIST_AVATAR", 2, "CommentList_Avatar");
        LIST_AVATAR = enumC1341600l143;
        EnumC1341600l14 enumC1341600l144 = new EnumC1341600l14("INNER_FIRST_PHOTO", 3, "CommentInner_First");
        INNER_FIRST_PHOTO = enumC1341600l144;
        EnumC1341600l14 enumC1341600l145 = new EnumC1341600l14("DETAIL_FULL_LEGACY", 4, "PhotoDetail_Full_Legacy");
        DETAIL_FULL_LEGACY = enumC1341600l145;
        EnumC1341600l14 enumC1341600l146 = new EnumC1341600l14("DETAIL_FULL_INNER", 5, "PhotoDetail_Full_Inner");
        DETAIL_FULL_INNER = enumC1341600l146;
        EnumC1341600l14[] enumC1341600l14Arr = {enumC1341600l14, enumC1341600l142, enumC1341600l143, enumC1341600l144, enumC1341600l145, enumC1341600l146};
        LLILLJJLI = enumC1341600l14Arr;
        LLILLL = new C2254308sP(enumC1341600l14Arr);
    }

    public static EnumC1341600l14[] values() {
        return (EnumC1341600l14[]) LLILLJJLI.clone();
    }

    public final String getCallerId() {
        return this.LL;
    }

    public static EnumC1341600l14 valueOf(String str) {
        return (EnumC1341600l14) C08FF.LIZ(EnumC1341600l14.class, str);
    }

    public EnumC1341600l14(String str, int i, String str2) {
        this.LL = str2;
    }
}
