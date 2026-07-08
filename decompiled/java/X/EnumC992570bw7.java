package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992570bw7 {
    public static final EnumC992570bw7 GROUP_INVITE_CHANNEL_DEFAULT;
    public static final EnumC992570bw7 GROUP_INVITE_CHANNEL_EXTERNAL_VIDEO_SHARE;
    public static final EnumC992570bw7 GROUP_INVITE_CHANNEL_INVITE_PAGE;
    public static final EnumC992570bw7 GROUP_INVITE_CHANNEL_INVITE_PEOPLE;
    public static final /* synthetic */ EnumC992570bw7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992570bw7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992570bw7 enumC992570bw7 = new EnumC992570bw7("GROUP_INVITE_CHANNEL_DEFAULT", 0, 0);
        GROUP_INVITE_CHANNEL_DEFAULT = enumC992570bw7;
        EnumC992570bw7 enumC992570bw72 = new EnumC992570bw7("GROUP_INVITE_CHANNEL_EXTERNAL_VIDEO_SHARE", 1, 1);
        GROUP_INVITE_CHANNEL_EXTERNAL_VIDEO_SHARE = enumC992570bw72;
        EnumC992570bw7 enumC992570bw73 = new EnumC992570bw7("GROUP_INVITE_CHANNEL_INVITE_PAGE", 2, 2);
        GROUP_INVITE_CHANNEL_INVITE_PAGE = enumC992570bw73;
        EnumC992570bw7 enumC992570bw74 = new EnumC992570bw7("GROUP_INVITE_CHANNEL_INVITE_PEOPLE", 3, 3);
        GROUP_INVITE_CHANNEL_INVITE_PEOPLE = enumC992570bw74;
        EnumC992570bw7[] enumC992570bw7Arr = {enumC992570bw7, enumC992570bw72, enumC992570bw73, enumC992570bw74};
        LLILLJJLI = enumC992570bw7Arr;
        LLILLL = new C2254308sP(enumC992570bw7Arr);
    }

    public static EnumC992570bw7[] values() {
        return (EnumC992570bw7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992570bw7 valueOf(String str) {
        return (EnumC992570bw7) C08FF.LIZ(EnumC992570bw7.class, str);
    }

    public EnumC992570bw7(String str, int i, int i2) {
        this.LL = i2;
    }
}
