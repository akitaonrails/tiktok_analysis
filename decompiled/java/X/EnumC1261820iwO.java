package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261820iwO {
    public static final EnumC1261820iwO INBOX_FIRST_PAGE;
    public static final /* synthetic */ EnumC1261820iwO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1261820iwO NEW_ACTIVITIES;
    public static final EnumC1261820iwO NEW_FOLLOWERS;

    public static InterfaceC2044707zh<EnumC1261820iwO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1261820iwO enumC1261820iwO = new EnumC1261820iwO("INBOX_FIRST_PAGE", 0);
        INBOX_FIRST_PAGE = enumC1261820iwO;
        EnumC1261820iwO enumC1261820iwO2 = new EnumC1261820iwO("NEW_FOLLOWERS", 1);
        NEW_FOLLOWERS = enumC1261820iwO2;
        EnumC1261820iwO enumC1261820iwO3 = new EnumC1261820iwO("NEW_ACTIVITIES", 2);
        NEW_ACTIVITIES = enumC1261820iwO3;
        EnumC1261820iwO[] enumC1261820iwOArr = {enumC1261820iwO, enumC1261820iwO2, enumC1261820iwO3};
        LL = enumC1261820iwOArr;
        LLILLJJLI = new C2254308sP(enumC1261820iwOArr);
    }

    public static EnumC1261820iwO[] values() {
        return (EnumC1261820iwO[]) LL.clone();
    }

    public static EnumC1261820iwO valueOf(String str) {
        return (EnumC1261820iwO) C08FF.LIZ(EnumC1261820iwO.class, str);
    }

    public EnumC1261820iwO(String str, int i) {
    }
}
