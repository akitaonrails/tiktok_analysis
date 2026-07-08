package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1578206Fw {
    public static final EnumC1578206Fw CHAT_LIST;
    public static final EnumC1578206Fw CHAT_PAGE;
    public static final EnumC1578206Fw DM_IN_APP_PUSH;
    public static final EnumC1578206Fw FRIENDS;
    public static final /* synthetic */ EnumC1578206Fw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1578206Fw NOTICE_IN_APP_PUSH;
    public static final EnumC1578206Fw SHARE_PANEL;
    public static final EnumC1578206Fw STORY;

    public static InterfaceC2044707zh<EnumC1578206Fw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1578206Fw enumC1578206Fw = new EnumC1578206Fw("CHAT_LIST", 0);
        CHAT_LIST = enumC1578206Fw;
        EnumC1578206Fw enumC1578206Fw2 = new EnumC1578206Fw("SHARE_PANEL", 1);
        SHARE_PANEL = enumC1578206Fw2;
        EnumC1578206Fw enumC1578206Fw3 = new EnumC1578206Fw("DM_IN_APP_PUSH", 2);
        DM_IN_APP_PUSH = enumC1578206Fw3;
        EnumC1578206Fw enumC1578206Fw4 = new EnumC1578206Fw("NOTICE_IN_APP_PUSH", 3);
        NOTICE_IN_APP_PUSH = enumC1578206Fw4;
        EnumC1578206Fw enumC1578206Fw5 = new EnumC1578206Fw("CHAT_PAGE", 4);
        CHAT_PAGE = enumC1578206Fw5;
        EnumC1578206Fw enumC1578206Fw6 = new EnumC1578206Fw("FRIENDS", 5);
        FRIENDS = enumC1578206Fw6;
        EnumC1578206Fw enumC1578206Fw7 = new EnumC1578206Fw("STORY", 6);
        STORY = enumC1578206Fw7;
        EnumC1578206Fw[] enumC1578206FwArr = {enumC1578206Fw, enumC1578206Fw2, enumC1578206Fw3, enumC1578206Fw4, enumC1578206Fw5, enumC1578206Fw6, enumC1578206Fw7};
        LL = enumC1578206FwArr;
        LLILLJJLI = new C2254308sP(enumC1578206FwArr);
    }

    public static EnumC1578206Fw[] values() {
        return (EnumC1578206Fw[]) LL.clone();
    }

    public static EnumC1578206Fw valueOf(String str) {
        return (EnumC1578206Fw) C08FF.LIZ(EnumC1578206Fw.class, str);
    }

    public EnumC1578206Fw(String str, int i) {
    }
}
