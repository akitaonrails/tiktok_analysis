package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1514605wO {
    public static final EnumC1514605wO CHAT;
    public static final EnumC1514605wO INBOX;
    public static final /* synthetic */ EnumC1514605wO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1514605wO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1514605wO enumC1514605wO = new EnumC1514605wO("CHAT", 0, "chat");
        CHAT = enumC1514605wO;
        EnumC1514605wO enumC1514605wO2 = new EnumC1514605wO("INBOX", 1, "notification_page");
        INBOX = enumC1514605wO2;
        EnumC1514605wO[] enumC1514605wOArr = {enumC1514605wO, enumC1514605wO2};
        LLILLJJLI = enumC1514605wOArr;
        LLILLL = new C2254308sP(enumC1514605wOArr);
    }

    public static EnumC1514605wO[] values() {
        return (EnumC1514605wO[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1514605wO valueOf(String str) {
        return (EnumC1514605wO) C08FF.LIZ(EnumC1514605wO.class, str);
    }

    public EnumC1514605wO(String str, int i, String str2) {
        this.LL = str2;
    }
}
