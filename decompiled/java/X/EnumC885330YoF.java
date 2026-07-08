package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC885330YoF {
    public static final EnumC885330YoF CAMERA_ICON_SHOW;
    public static final EnumC885330YoF CHAT_SHOW;
    public static final /* synthetic */ EnumC885330YoF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC885330YoF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC885330YoF enumC885330YoF = new EnumC885330YoF("CHAT_SHOW", 0);
        CHAT_SHOW = enumC885330YoF;
        EnumC885330YoF enumC885330YoF2 = new EnumC885330YoF("CAMERA_ICON_SHOW", 1);
        CAMERA_ICON_SHOW = enumC885330YoF2;
        EnumC885330YoF[] enumC885330YoFArr = {enumC885330YoF, enumC885330YoF2};
        LL = enumC885330YoFArr;
        LLILLJJLI = new C2254308sP(enumC885330YoFArr);
    }

    public static EnumC885330YoF[] values() {
        return (EnumC885330YoF[]) LL.clone();
    }

    public static EnumC885330YoF valueOf(String str) {
        return (EnumC885330YoF) C08FF.LIZ(EnumC885330YoF.class, str);
    }

    public EnumC885330YoF(String str, int i) {
    }
}
