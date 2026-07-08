package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC865603Zu {
    public static final EnumC865603Zu HEIGHT_73;
    public static final EnumC865603Zu HEIGHT_90;
    public static final EnumC865603Zu HEIGHT_93;
    public static final /* synthetic */ EnumC865603Zu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC865603Zu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC865603Zu enumC865603Zu = new EnumC865603Zu("HEIGHT_90", 0);
        HEIGHT_90 = enumC865603Zu;
        EnumC865603Zu enumC865603Zu2 = new EnumC865603Zu("HEIGHT_73", 1);
        HEIGHT_73 = enumC865603Zu2;
        EnumC865603Zu enumC865603Zu3 = new EnumC865603Zu("HEIGHT_93", 2);
        HEIGHT_93 = enumC865603Zu3;
        EnumC865603Zu[] enumC865603ZuArr = {enumC865603Zu, enumC865603Zu2, enumC865603Zu3};
        LL = enumC865603ZuArr;
        LLILLJJLI = new C2254308sP(enumC865603ZuArr);
    }

    public static EnumC865603Zu[] values() {
        return (EnumC865603Zu[]) LL.clone();
    }

    public static EnumC865603Zu valueOf(String str) {
        return (EnumC865603Zu) C08FF.LIZ(EnumC865603Zu.class, str);
    }

    public EnumC865603Zu(String str, int i) {
    }
}
