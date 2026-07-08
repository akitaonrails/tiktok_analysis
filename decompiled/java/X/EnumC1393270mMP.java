package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mMP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1393270mMP {
    public static final /* synthetic */ EnumC1393270mMP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1393270mMP MESSAGE_BUTTON;
    public static final EnumC1393270mMP NEW_VIDEOS_LINK;
    public static final EnumC1393270mMP NOW_HEAD;
    public static final EnumC1393270mMP OTHERS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1393270mMP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1393270mMP enumC1393270mMP = new EnumC1393270mMP("MESSAGE_BUTTON", 0, "message_button");
        MESSAGE_BUTTON = enumC1393270mMP;
        EnumC1393270mMP enumC1393270mMP2 = new EnumC1393270mMP("NEW_VIDEOS_LINK", 1, "new_videos_link");
        NEW_VIDEOS_LINK = enumC1393270mMP2;
        EnumC1393270mMP enumC1393270mMP3 = new EnumC1393270mMP("NOW_HEAD", 2, "now_head");
        NOW_HEAD = enumC1393270mMP3;
        EnumC1393270mMP enumC1393270mMP4 = new EnumC1393270mMP("OTHERS", 3, "others");
        OTHERS = enumC1393270mMP4;
        EnumC1393270mMP[] enumC1393270mMPArr = {enumC1393270mMP, enumC1393270mMP2, enumC1393270mMP3, enumC1393270mMP4};
        LLILLJJLI = enumC1393270mMPArr;
        LLILLL = new C2254308sP(enumC1393270mMPArr);
    }

    public static EnumC1393270mMP[] values() {
        return (EnumC1393270mMP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1393270mMP valueOf(String str) {
        return (EnumC1393270mMP) C08FF.LIZ(EnumC1393270mMP.class, str);
    }

    public EnumC1393270mMP(String str, int i, String str2) {
        this.LL = str2;
    }
}
