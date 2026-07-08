package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454550Hs5 {
    public static final EnumC454550Hs5 COMMENT_LIST;
    public static final /* synthetic */ EnumC454550Hs5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454550Hs5 MESSAGE_LIST;
    public static final EnumC454550Hs5 OTHERS_PROFILE_FROM_STICKER_STORE;
    public static final EnumC454550Hs5 OTHERS_PROFILE_NOT_FROM_STICKER_STORE;
    public static final EnumC454550Hs5 PERSONAL_PROFILE_FROM_STICKER_STORE;
    public static final EnumC454550Hs5 PERSONAL_PROFILE_NOT_FROM_STICKER_STORE;
    public static final EnumC454550Hs5 STICKER_STORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC454550Hs5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454550Hs5 enumC454550Hs5 = new EnumC454550Hs5("STICKER_STORE", 0, 1);
        STICKER_STORE = enumC454550Hs5;
        EnumC454550Hs5 enumC454550Hs52 = new EnumC454550Hs5("PERSONAL_PROFILE_FROM_STICKER_STORE", 1, 2);
        PERSONAL_PROFILE_FROM_STICKER_STORE = enumC454550Hs52;
        EnumC454550Hs5 enumC454550Hs53 = new EnumC454550Hs5("PERSONAL_PROFILE_NOT_FROM_STICKER_STORE", 2, 3);
        PERSONAL_PROFILE_NOT_FROM_STICKER_STORE = enumC454550Hs53;
        EnumC454550Hs5 enumC454550Hs54 = new EnumC454550Hs5("OTHERS_PROFILE_FROM_STICKER_STORE", 3, 4);
        OTHERS_PROFILE_FROM_STICKER_STORE = enumC454550Hs54;
        EnumC454550Hs5 enumC454550Hs55 = new EnumC454550Hs5("OTHERS_PROFILE_NOT_FROM_STICKER_STORE", 4, 5);
        OTHERS_PROFILE_NOT_FROM_STICKER_STORE = enumC454550Hs55;
        EnumC454550Hs5 enumC454550Hs56 = new EnumC454550Hs5("COMMENT_LIST", 5, 6);
        COMMENT_LIST = enumC454550Hs56;
        EnumC454550Hs5 enumC454550Hs57 = new EnumC454550Hs5("MESSAGE_LIST", 6, 7);
        MESSAGE_LIST = enumC454550Hs57;
        EnumC454550Hs5[] enumC454550Hs5Arr = {enumC454550Hs5, enumC454550Hs52, enumC454550Hs53, enumC454550Hs54, enumC454550Hs55, enumC454550Hs56, enumC454550Hs57};
        LLILLJJLI = enumC454550Hs5Arr;
        LLILLL = new C2254308sP(enumC454550Hs5Arr);
    }

    public static EnumC454550Hs5[] values() {
        return (EnumC454550Hs5[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC454550Hs5 valueOf(String str) {
        return (EnumC454550Hs5) C08FF.LIZ(EnumC454550Hs5.class, str);
    }

    public EnumC454550Hs5(String str, int i, int i2) {
        this.LL = i2;
    }
}
