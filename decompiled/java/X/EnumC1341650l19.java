package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341650l19 {
    public static final EnumC1341650l19 ALPHA_BUTTON;
    public static final EnumC1341650l19 AVATAR;
    public static final EnumC1341650l19 BUTTON;
    public static final EnumC1341650l19 CELL;
    public static final EnumC1341650l19 IMAGE;
    public static final /* synthetic */ EnumC1341650l19[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1341650l19 NULL;
    public static final EnumC1341650l19 STICKER;
    public static final EnumC1341650l19 USERNAME;

    public static InterfaceC2044707zh<EnumC1341650l19> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341650l19 enumC1341650l19 = new EnumC1341650l19("CELL", 0);
        CELL = enumC1341650l19;
        EnumC1341650l19 enumC1341650l192 = new EnumC1341650l19("AVATAR", 1);
        AVATAR = enumC1341650l192;
        EnumC1341650l19 enumC1341650l193 = new EnumC1341650l19("USERNAME", 2);
        USERNAME = enumC1341650l193;
        EnumC1341650l19 enumC1341650l194 = new EnumC1341650l19("BUTTON", 3);
        BUTTON = enumC1341650l194;
        EnumC1341650l19 enumC1341650l195 = new EnumC1341650l19("ALPHA_BUTTON", 4);
        ALPHA_BUTTON = enumC1341650l195;
        EnumC1341650l19 enumC1341650l196 = new EnumC1341650l19("STICKER", 5);
        STICKER = enumC1341650l196;
        EnumC1341650l19 enumC1341650l197 = new EnumC1341650l19("IMAGE", 6);
        IMAGE = enumC1341650l197;
        EnumC1341650l19 enumC1341650l198 = new EnumC1341650l19("NULL", 7);
        NULL = enumC1341650l198;
        EnumC1341650l19[] enumC1341650l19Arr = {enumC1341650l19, enumC1341650l192, enumC1341650l193, enumC1341650l194, enumC1341650l195, enumC1341650l196, enumC1341650l197, enumC1341650l198};
        LL = enumC1341650l19Arr;
        LLILLJJLI = new C2254308sP(enumC1341650l19Arr);
    }

    public static EnumC1341650l19[] values() {
        return (EnumC1341650l19[]) LL.clone();
    }

    public static EnumC1341650l19 valueOf(String str) {
        return (EnumC1341650l19) C08FF.LIZ(EnumC1341650l19.class, str);
    }

    public EnumC1341650l19(String str, int i) {
    }
}
