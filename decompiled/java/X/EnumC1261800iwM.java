package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261800iwM {
    public static final EnumC1261800iwM FIND_FRIENDS_PAGE;
    public static final /* synthetic */ EnumC1261800iwM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1261800iwM NOTIFICATION_PAGE;
    public static final EnumC1261800iwM PERSONAL_HOMEPAGE;

    public static InterfaceC2044707zh<EnumC1261800iwM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1261800iwM enumC1261800iwM = new EnumC1261800iwM("NOTIFICATION_PAGE", 0);
        NOTIFICATION_PAGE = enumC1261800iwM;
        EnumC1261800iwM enumC1261800iwM2 = new EnumC1261800iwM("PERSONAL_HOMEPAGE", 1);
        PERSONAL_HOMEPAGE = enumC1261800iwM2;
        EnumC1261800iwM enumC1261800iwM3 = new EnumC1261800iwM("FIND_FRIENDS_PAGE", 2);
        FIND_FRIENDS_PAGE = enumC1261800iwM3;
        EnumC1261800iwM[] enumC1261800iwMArr = {enumC1261800iwM, enumC1261800iwM2, enumC1261800iwM3};
        LL = enumC1261800iwMArr;
        LLILLJJLI = new C2254308sP(enumC1261800iwMArr);
    }

    public static EnumC1261800iwM[] values() {
        return (EnumC1261800iwM[]) LL.clone();
    }

    public static EnumC1261800iwM valueOf(String str) {
        return (EnumC1261800iwM) C08FF.LIZ(EnumC1261800iwM.class, str);
    }

    public EnumC1261800iwM(String str, int i) {
    }
}
