package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC925840aCU {
    public static final EnumC925840aCU APPLY;
    public static final EnumC925840aCU CONNECTION_SUCCESS_AUTO;
    public static final EnumC925840aCU CONNECTION_SUCCESS_DIRECT;
    public static final EnumC925840aCU CONNECTION_SUCCESS_INVITE;
    public static final EnumC925840aCU ENTER_ACTION;
    public static final EnumC925840aCU GET_SHARED_PANEL;
    public static final EnumC925840aCU JOIN_DIRECT;
    public static final /* synthetic */ EnumC925840aCU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC925840aCU PERMIT_IM;

    public static InterfaceC2044707zh<EnumC925840aCU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC925840aCU enumC925840aCU = new EnumC925840aCU("ENTER_ACTION", 0);
        ENTER_ACTION = enumC925840aCU;
        EnumC925840aCU enumC925840aCU2 = new EnumC925840aCU("GET_SHARED_PANEL", 1);
        GET_SHARED_PANEL = enumC925840aCU2;
        EnumC925840aCU enumC925840aCU3 = new EnumC925840aCU("JOIN_DIRECT", 2);
        JOIN_DIRECT = enumC925840aCU3;
        EnumC925840aCU enumC925840aCU4 = new EnumC925840aCU("APPLY", 3);
        APPLY = enumC925840aCU4;
        EnumC925840aCU enumC925840aCU5 = new EnumC925840aCU("PERMIT_IM", 4);
        PERMIT_IM = enumC925840aCU5;
        EnumC925840aCU enumC925840aCU6 = new EnumC925840aCU("CONNECTION_SUCCESS_AUTO", 5);
        CONNECTION_SUCCESS_AUTO = enumC925840aCU6;
        EnumC925840aCU enumC925840aCU7 = new EnumC925840aCU("CONNECTION_SUCCESS_DIRECT", 6);
        CONNECTION_SUCCESS_DIRECT = enumC925840aCU7;
        EnumC925840aCU enumC925840aCU8 = new EnumC925840aCU("CONNECTION_SUCCESS_INVITE", 7);
        CONNECTION_SUCCESS_INVITE = enumC925840aCU8;
        EnumC925840aCU[] enumC925840aCUArr = {enumC925840aCU, enumC925840aCU2, enumC925840aCU3, enumC925840aCU4, enumC925840aCU5, enumC925840aCU6, enumC925840aCU7, enumC925840aCU8};
        LL = enumC925840aCUArr;
        LLILLJJLI = new C2254308sP(enumC925840aCUArr);
    }

    public static EnumC925840aCU[] values() {
        return (EnumC925840aCU[]) LL.clone();
    }

    public static EnumC925840aCU valueOf(String str) {
        return (EnumC925840aCU) C08FF.LIZ(EnumC925840aCU.class, str);
    }

    public EnumC925840aCU(String str, int i) {
    }
}
