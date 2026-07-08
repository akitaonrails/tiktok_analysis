package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1903200zcs {
    public static final EnumC1903200zcs ACTIVITY;
    public static final EnumC1903200zcs BULLETIN;
    public static final EnumC1903200zcs CHAT;
    public static final EnumC1903200zcs EMPTY;
    public static final EnumC1903200zcs FOLLOWERS;
    public static final EnumC1903200zcs INBOX;
    public static final /* synthetic */ EnumC1903200zcs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1903200zcs NOTIFICATIONS;

    public static InterfaceC2044707zh<EnumC1903200zcs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1903200zcs enumC1903200zcs = new EnumC1903200zcs("EMPTY", 0);
        EMPTY = enumC1903200zcs;
        EnumC1903200zcs enumC1903200zcs2 = new EnumC1903200zcs("INBOX", 1);
        INBOX = enumC1903200zcs2;
        EnumC1903200zcs enumC1903200zcs3 = new EnumC1903200zcs("CHAT", 2);
        CHAT = enumC1903200zcs3;
        EnumC1903200zcs enumC1903200zcs4 = new EnumC1903200zcs("BULLETIN", 3);
        BULLETIN = enumC1903200zcs4;
        EnumC1903200zcs enumC1903200zcs5 = new EnumC1903200zcs("FOLLOWERS", 4);
        FOLLOWERS = enumC1903200zcs5;
        EnumC1903200zcs enumC1903200zcs6 = new EnumC1903200zcs("ACTIVITY", 5);
        ACTIVITY = enumC1903200zcs6;
        EnumC1903200zcs enumC1903200zcs7 = new EnumC1903200zcs("NOTIFICATIONS", 6);
        NOTIFICATIONS = enumC1903200zcs7;
        EnumC1903200zcs[] enumC1903200zcsArr = {enumC1903200zcs, enumC1903200zcs2, enumC1903200zcs3, enumC1903200zcs4, enumC1903200zcs5, enumC1903200zcs6, enumC1903200zcs7};
        LL = enumC1903200zcsArr;
        LLILLJJLI = new C2254308sP(enumC1903200zcsArr);
    }

    public static EnumC1903200zcs[] values() {
        return (EnumC1903200zcs[]) LL.clone();
    }

    public static EnumC1903200zcs valueOf(String str) {
        return (EnumC1903200zcs) C08FF.LIZ(EnumC1903200zcs.class, str);
    }

    public EnumC1903200zcs(String str, int i) {
    }
}
