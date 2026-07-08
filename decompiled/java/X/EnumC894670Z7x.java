package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC894670Z7x {
    public static final /* synthetic */ EnumC894670Z7x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC894670Z7x PREDICT_AWEME_VIDEO_PRELOAD;
    public static final EnumC894670Z7x PREDICT_ENTER_CHAT;
    public static final EnumC894670Z7x PREDICT_ENTER_INBOX;

    public static InterfaceC2044707zh<EnumC894670Z7x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC894670Z7x enumC894670Z7x = new EnumC894670Z7x("PREDICT_ENTER_CHAT", 0);
        PREDICT_ENTER_CHAT = enumC894670Z7x;
        EnumC894670Z7x enumC894670Z7x2 = new EnumC894670Z7x("PREDICT_ENTER_INBOX", 1);
        PREDICT_ENTER_INBOX = enumC894670Z7x2;
        EnumC894670Z7x enumC894670Z7x3 = new EnumC894670Z7x("PREDICT_AWEME_VIDEO_PRELOAD", 2);
        PREDICT_AWEME_VIDEO_PRELOAD = enumC894670Z7x3;
        EnumC894670Z7x[] enumC894670Z7xArr = {enumC894670Z7x, enumC894670Z7x2, enumC894670Z7x3};
        LL = enumC894670Z7xArr;
        LLILLJJLI = new C2254308sP(enumC894670Z7xArr);
    }

    public static EnumC894670Z7x[] values() {
        return (EnumC894670Z7x[]) LL.clone();
    }

    public static EnumC894670Z7x valueOf(String str) {
        return (EnumC894670Z7x) C08FF.LIZ(EnumC894670Z7x.class, str);
    }

    public EnumC894670Z7x(String str, int i) {
    }
}
