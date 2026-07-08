package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC881750YiT {
    public static final EnumC881750YiT GROUP_CHAT;
    public static final /* synthetic */ EnumC881750YiT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC881750YiT ONLINE_LOGIC;
    public static final EnumC881750YiT SINGLE_CHAT_ALLOW;
    public static final EnumC881750YiT SINGLE_CHAT_FILTERED_REQUEST;
    public static final EnumC881750YiT SINGLE_CHAT_MESSAGE_REQUEST;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC881750YiT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC881750YiT enumC881750YiT = new EnumC881750YiT("ONLINE_LOGIC", 0, true);
        ONLINE_LOGIC = enumC881750YiT;
        EnumC881750YiT enumC881750YiT2 = new EnumC881750YiT("GROUP_CHAT", 1, true);
        GROUP_CHAT = enumC881750YiT2;
        EnumC881750YiT enumC881750YiT3 = new EnumC881750YiT("SINGLE_CHAT_ALLOW", 2, true);
        SINGLE_CHAT_ALLOW = enumC881750YiT3;
        EnumC881750YiT enumC881750YiT4 = new EnumC881750YiT("SINGLE_CHAT_MESSAGE_REQUEST", 3, false);
        SINGLE_CHAT_MESSAGE_REQUEST = enumC881750YiT4;
        EnumC881750YiT enumC881750YiT5 = new EnumC881750YiT("SINGLE_CHAT_FILTERED_REQUEST", 4, false);
        SINGLE_CHAT_FILTERED_REQUEST = enumC881750YiT5;
        EnumC881750YiT[] enumC881750YiTArr = {enumC881750YiT, enumC881750YiT2, enumC881750YiT3, enumC881750YiT4, enumC881750YiT5};
        LLILLJJLI = enumC881750YiTArr;
        LLILLL = new C2254308sP(enumC881750YiTArr);
    }

    public static EnumC881750YiT[] values() {
        return (EnumC881750YiT[]) LLILLJJLI.clone();
    }

    public final boolean getCanShowSeen() {
        return this.LL;
    }

    public static EnumC881750YiT valueOf(String str) {
        return (EnumC881750YiT) C08FF.LIZ(EnumC881750YiT.class, str);
    }

    public EnumC881750YiT(String str, int i, boolean z) {
        this.LL = z;
    }
}
