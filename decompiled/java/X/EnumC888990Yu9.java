package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC888990Yu9 {
    public static final EnumC888990Yu9 AUTO_ARCHIVE_INACTIVE_CHATS;
    public static final EnumC888990Yu9 KEEP_CHATS_ARCHIVED;
    public static final /* synthetic */ EnumC888990Yu9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC888990Yu9 PIN_TO_TOP;

    public static InterfaceC2044707zh<EnumC888990Yu9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC888990Yu9 enumC888990Yu9 = new EnumC888990Yu9("PIN_TO_TOP", 0);
        PIN_TO_TOP = enumC888990Yu9;
        EnumC888990Yu9 enumC888990Yu92 = new EnumC888990Yu9("KEEP_CHATS_ARCHIVED", 1);
        KEEP_CHATS_ARCHIVED = enumC888990Yu92;
        EnumC888990Yu9 enumC888990Yu93 = new EnumC888990Yu9("AUTO_ARCHIVE_INACTIVE_CHATS", 2);
        AUTO_ARCHIVE_INACTIVE_CHATS = enumC888990Yu93;
        EnumC888990Yu9[] enumC888990Yu9Arr = {enumC888990Yu9, enumC888990Yu92, enumC888990Yu93};
        LL = enumC888990Yu9Arr;
        LLILLJJLI = new C2254308sP(enumC888990Yu9Arr);
    }

    public static EnumC888990Yu9[] values() {
        return (EnumC888990Yu9[]) LL.clone();
    }

    public static EnumC888990Yu9 valueOf(String str) {
        return (EnumC888990Yu9) C08FF.LIZ(EnumC888990Yu9.class, str);
    }

    public EnumC888990Yu9(String str, int i) {
    }
}
