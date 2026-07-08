package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC863790Xub {
    public static final /* synthetic */ EnumC863790Xub[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC863790Xub RECEIVE_PULL_MSG;
    public static final EnumC863790Xub RECEIVE_WS_MSG;
    public static final EnumC863790Xub SEND_MSG;

    public static InterfaceC2044707zh<EnumC863790Xub> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC863790Xub enumC863790Xub = new EnumC863790Xub("SEND_MSG", 0);
        SEND_MSG = enumC863790Xub;
        EnumC863790Xub enumC863790Xub2 = new EnumC863790Xub("RECEIVE_WS_MSG", 1);
        RECEIVE_WS_MSG = enumC863790Xub2;
        EnumC863790Xub enumC863790Xub3 = new EnumC863790Xub("RECEIVE_PULL_MSG", 2);
        RECEIVE_PULL_MSG = enumC863790Xub3;
        EnumC863790Xub[] enumC863790XubArr = {enumC863790Xub, enumC863790Xub2, enumC863790Xub3};
        LL = enumC863790XubArr;
        LLILLJJLI = new C2254308sP(enumC863790XubArr);
    }

    public static EnumC863790Xub[] values() {
        return (EnumC863790Xub[]) LL.clone();
    }

    public static EnumC863790Xub valueOf(String str) {
        return (EnumC863790Xub) C08FF.LIZ(EnumC863790Xub.class, str);
    }

    public EnumC863790Xub(String str, int i) {
    }
}
