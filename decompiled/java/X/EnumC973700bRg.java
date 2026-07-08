package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973700bRg {
    public static final EnumC973700bRg INVITE_WAITING;
    public static final /* synthetic */ EnumC973700bRg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973700bRg TEAMMATE_SELECTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973700bRg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973700bRg enumC973700bRg = new EnumC973700bRg("TEAMMATE_SELECTION", 0, "teammate_selection");
        TEAMMATE_SELECTION = enumC973700bRg;
        EnumC973700bRg enumC973700bRg2 = new EnumC973700bRg("INVITE_WAITING", 1, "invite_waiting");
        INVITE_WAITING = enumC973700bRg2;
        EnumC973700bRg[] enumC973700bRgArr = {enumC973700bRg, enumC973700bRg2};
        LLILLJJLI = enumC973700bRgArr;
        LLILLL = new C2254308sP(enumC973700bRgArr);
    }

    public static EnumC973700bRg[] values() {
        return (EnumC973700bRg[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC973700bRg valueOf(String str) {
        return (EnumC973700bRg) C08FF.LIZ(EnumC973700bRg.class, str);
    }

    public EnumC973700bRg(String str, int i, String str2) {
        this.LL = str2;
    }
}
