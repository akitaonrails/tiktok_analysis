package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221780hto {
    public static final EnumC1221780hto BACK_TO_EDIT_PROFILE;
    public static final EnumC1221780hto CANCEL;
    public static final EnumC1221780hto GONE;
    public static final /* synthetic */ EnumC1221780hto[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221780hto RETRY;
    public static final EnumC1221780hto SELECT_OTHER_PHOTO;

    public static InterfaceC2044707zh<EnumC1221780hto> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221780hto enumC1221780hto = new EnumC1221780hto("GONE", 0);
        GONE = enumC1221780hto;
        EnumC1221780hto enumC1221780hto2 = new EnumC1221780hto("RETRY", 1);
        RETRY = enumC1221780hto2;
        EnumC1221780hto enumC1221780hto3 = new EnumC1221780hto("BACK_TO_EDIT_PROFILE", 2);
        BACK_TO_EDIT_PROFILE = enumC1221780hto3;
        EnumC1221780hto enumC1221780hto4 = new EnumC1221780hto("SELECT_OTHER_PHOTO", 3);
        SELECT_OTHER_PHOTO = enumC1221780hto4;
        EnumC1221780hto enumC1221780hto5 = new EnumC1221780hto("CANCEL", 4);
        CANCEL = enumC1221780hto5;
        EnumC1221780hto[] enumC1221780htoArr = {enumC1221780hto, enumC1221780hto2, enumC1221780hto3, enumC1221780hto4, enumC1221780hto5};
        LL = enumC1221780htoArr;
        LLILLJJLI = new C2254308sP(enumC1221780htoArr);
    }

    public static EnumC1221780hto[] values() {
        return (EnumC1221780hto[]) LL.clone();
    }

    public static EnumC1221780hto valueOf(String str) {
        return (EnumC1221780hto) C08FF.LIZ(EnumC1221780hto.class, str);
    }

    public EnumC1221780hto(String str, int i) {
    }
}
