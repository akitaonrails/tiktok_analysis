package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1169700gXo {
    public static final EnumC1169700gXo ADD_ICON;
    public static final EnumC1169700gXo ADD_PHOTO;
    public static final EnumC1169700gXo CANCEL;
    public static final EnumC1169700gXo EDIT_NICKNAME;
    public static final EnumC1169700gXo ELSEWHERE;
    public static final /* synthetic */ EnumC1169700gXo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1169700gXo NOT_NOW;
    public static final EnumC1169700gXo REEDIT_AVATAR;
    public static final EnumC1169700gXo SAVE;
    public static final EnumC1169700gXo X_SIGN;

    public static InterfaceC2044707zh<EnumC1169700gXo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1169700gXo enumC1169700gXo = new EnumC1169700gXo("X_SIGN", 0);
        X_SIGN = enumC1169700gXo;
        EnumC1169700gXo enumC1169700gXo2 = new EnumC1169700gXo("ADD_PHOTO", 1);
        ADD_PHOTO = enumC1169700gXo2;
        EnumC1169700gXo enumC1169700gXo3 = new EnumC1169700gXo("ADD_ICON", 2);
        ADD_ICON = enumC1169700gXo3;
        EnumC1169700gXo enumC1169700gXo4 = new EnumC1169700gXo("ELSEWHERE", 3);
        ELSEWHERE = enumC1169700gXo4;
        EnumC1169700gXo enumC1169700gXo5 = new EnumC1169700gXo("NOT_NOW", 4);
        NOT_NOW = enumC1169700gXo5;
        EnumC1169700gXo enumC1169700gXo6 = new EnumC1169700gXo("EDIT_NICKNAME", 5);
        EDIT_NICKNAME = enumC1169700gXo6;
        EnumC1169700gXo enumC1169700gXo7 = new EnumC1169700gXo("REEDIT_AVATAR", 6);
        REEDIT_AVATAR = enumC1169700gXo7;
        EnumC1169700gXo enumC1169700gXo8 = new EnumC1169700gXo("SAVE", 7);
        SAVE = enumC1169700gXo8;
        EnumC1169700gXo enumC1169700gXo9 = new EnumC1169700gXo("CANCEL", 8);
        CANCEL = enumC1169700gXo9;
        EnumC1169700gXo[] enumC1169700gXoArr = {enumC1169700gXo, enumC1169700gXo2, enumC1169700gXo3, enumC1169700gXo4, enumC1169700gXo5, enumC1169700gXo6, enumC1169700gXo7, enumC1169700gXo8, enumC1169700gXo9};
        LL = enumC1169700gXoArr;
        LLILLJJLI = new C2254308sP(enumC1169700gXoArr);
    }

    public static EnumC1169700gXo[] values() {
        return (EnumC1169700gXo[]) LL.clone();
    }

    public static EnumC1169700gXo valueOf(String str) {
        return (EnumC1169700gXo) C08FF.LIZ(EnumC1169700gXo.class, str);
    }

    public EnumC1169700gXo(String str, int i) {
    }
}
