package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341680l1C {
    public static final EnumC1341680l1C ADD_PHOTO;
    public static final EnumC1341680l1C CREATE_IMAGE;
    public static final EnumC1341680l1C EMOJI;
    public static final EnumC1341680l1C GIFT;
    public static final /* synthetic */ EnumC1341680l1C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1341680l1C MENTION;
    public static final EnumC1341680l1C PHOTO;
    public static final EnumC1341680l1C TEXT;

    public static InterfaceC2044707zh<EnumC1341680l1C> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341680l1C enumC1341680l1C = new EnumC1341680l1C("TEXT", 0);
        TEXT = enumC1341680l1C;
        EnumC1341680l1C enumC1341680l1C2 = new EnumC1341680l1C("EMOJI", 1);
        EMOJI = enumC1341680l1C2;
        EnumC1341680l1C enumC1341680l1C3 = new EnumC1341680l1C("GIFT", 2);
        GIFT = enumC1341680l1C3;
        EnumC1341680l1C enumC1341680l1C4 = new EnumC1341680l1C("PHOTO", 3);
        PHOTO = enumC1341680l1C4;
        EnumC1341680l1C enumC1341680l1C5 = new EnumC1341680l1C("MENTION", 4);
        MENTION = enumC1341680l1C5;
        EnumC1341680l1C enumC1341680l1C6 = new EnumC1341680l1C("ADD_PHOTO", 5);
        ADD_PHOTO = enumC1341680l1C6;
        EnumC1341680l1C enumC1341680l1C7 = new EnumC1341680l1C("CREATE_IMAGE", 6);
        CREATE_IMAGE = enumC1341680l1C7;
        EnumC1341680l1C[] enumC1341680l1CArr = {enumC1341680l1C, enumC1341680l1C2, enumC1341680l1C3, enumC1341680l1C4, enumC1341680l1C5, enumC1341680l1C6, enumC1341680l1C7};
        LL = enumC1341680l1CArr;
        LLILLJJLI = new C2254308sP(enumC1341680l1CArr);
    }

    public static EnumC1341680l1C[] values() {
        return (EnumC1341680l1C[]) LL.clone();
    }

    public static EnumC1341680l1C valueOf(String str) {
        return (EnumC1341680l1C) C08FF.LIZ(EnumC1341680l1C.class, str);
    }

    public EnumC1341680l1C(String str, int i) {
    }
}
