package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0son, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641510son {
    public static final EnumC1641510son EMPTY;
    public static final EnumC1641510son GIF;
    public static final /* synthetic */ EnumC1641510son[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641510son SOCIAL_AVATAR;
    public static final EnumC1641510son STICKERSET;

    public static InterfaceC2044707zh<EnumC1641510son> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641510son enumC1641510son = new EnumC1641510son("EMPTY", 0);
        EMPTY = enumC1641510son;
        EnumC1641510son enumC1641510son2 = new EnumC1641510son("GIF", 1);
        GIF = enumC1641510son2;
        EnumC1641510son enumC1641510son3 = new EnumC1641510son("STICKERSET", 2);
        STICKERSET = enumC1641510son3;
        EnumC1641510son enumC1641510son4 = new EnumC1641510son("SOCIAL_AVATAR", 3);
        SOCIAL_AVATAR = enumC1641510son4;
        EnumC1641510son[] enumC1641510sonArr = {enumC1641510son, enumC1641510son2, enumC1641510son3, enumC1641510son4};
        LL = enumC1641510sonArr;
        LLILLJJLI = new C2254308sP(enumC1641510sonArr);
    }

    public static EnumC1641510son[] values() {
        return (EnumC1641510son[]) LL.clone();
    }

    public static EnumC1641510son valueOf(String str) {
        return (EnumC1641510son) C08FF.LIZ(EnumC1641510son.class, str);
    }

    public EnumC1641510son(String str, int i) {
    }
}
