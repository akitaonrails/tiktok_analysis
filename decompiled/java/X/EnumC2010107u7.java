package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2010107u7 {
    public static final EnumC2010107u7 BE_DROP_BEAN;
    public static final EnumC2010107u7 BE_DROP_BOMB;
    public static final EnumC2010107u7 BE_RECEIVE_AVATAR;
    public static final /* synthetic */ EnumC2010107u7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2010107u7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2010107u7 enumC2010107u7 = new EnumC2010107u7("BE_DROP_BEAN", 0, "drop_bean");
        BE_DROP_BEAN = enumC2010107u7;
        EnumC2010107u7 enumC2010107u72 = new EnumC2010107u7("BE_DROP_BOMB", 1, "drop_bomb");
        BE_DROP_BOMB = enumC2010107u72;
        EnumC2010107u7 enumC2010107u73 = new EnumC2010107u7("BE_RECEIVE_AVATAR", 2, "receive_avatar");
        BE_RECEIVE_AVATAR = enumC2010107u73;
        EnumC2010107u7[] enumC2010107u7Arr = {enumC2010107u7, enumC2010107u72, enumC2010107u73};
        LLILLJJLI = enumC2010107u7Arr;
        LLILLL = new C2254308sP(enumC2010107u7Arr);
    }

    public static EnumC2010107u7[] values() {
        return (EnumC2010107u7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2010107u7 valueOf(String str) {
        return (EnumC2010107u7) C08FF.LIZ(EnumC2010107u7.class, str);
    }

    public EnumC2010107u7(String str, int i, String str2) {
        this.LL = str2;
    }
}
