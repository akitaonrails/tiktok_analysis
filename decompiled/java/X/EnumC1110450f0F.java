package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1110450f0F {
    public static final EnumC1110450f0F EXTENDSSCREEN_MESSAGE_TYPE;
    public static final EnumC1110450f0F INPUT_LIST;
    public static final EnumC1110450f0F INPUT_PANNEL;
    public static final /* synthetic */ EnumC1110450f0F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1110450f0F PUBLICSCREEN_MESSAGE_TYPE;
    public static final EnumC1110450f0F REPLY_STAYTYPE;

    public static InterfaceC2044707zh<EnumC1110450f0F> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1110450f0F enumC1110450f0F = new EnumC1110450f0F("REPLY_STAYTYPE", 0);
        REPLY_STAYTYPE = enumC1110450f0F;
        EnumC1110450f0F enumC1110450f0F2 = new EnumC1110450f0F("PUBLICSCREEN_MESSAGE_TYPE", 1);
        PUBLICSCREEN_MESSAGE_TYPE = enumC1110450f0F2;
        EnumC1110450f0F enumC1110450f0F3 = new EnumC1110450f0F("EXTENDSSCREEN_MESSAGE_TYPE", 2);
        EXTENDSSCREEN_MESSAGE_TYPE = enumC1110450f0F3;
        EnumC1110450f0F enumC1110450f0F4 = new EnumC1110450f0F("INPUT_PANNEL", 3);
        INPUT_PANNEL = enumC1110450f0F4;
        EnumC1110450f0F enumC1110450f0F5 = new EnumC1110450f0F("INPUT_LIST", 4);
        INPUT_LIST = enumC1110450f0F5;
        EnumC1110450f0F[] enumC1110450f0FArr = {enumC1110450f0F, enumC1110450f0F2, enumC1110450f0F3, enumC1110450f0F4, enumC1110450f0F5};
        LL = enumC1110450f0FArr;
        LLILLJJLI = new C2254308sP(enumC1110450f0FArr);
    }

    public static EnumC1110450f0F[] values() {
        return (EnumC1110450f0F[]) LL.clone();
    }

    public static EnumC1110450f0F valueOf(String str) {
        return (EnumC1110450f0F) C08FF.LIZ(EnumC1110450f0F.class, str);
    }

    public EnumC1110450f0F(String str, int i) {
    }
}
