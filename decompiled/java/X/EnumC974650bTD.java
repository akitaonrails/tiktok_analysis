package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bTD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974650bTD {
    public static final EnumC974650bTD CLICKCOUTDOWN;
    public static final EnumC974650bTD CLICKGUIDE;
    public static final EnumC974650bTD CLICKICON;
    public static final EnumC974650bTD CLICKREMATCH;
    public static final EnumC974650bTD INVITEREJECT;
    public static final /* synthetic */ EnumC974650bTD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC974650bTD TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC974650bTD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974650bTD enumC974650bTD = new EnumC974650bTD("CLICKICON", 0, "click_icon");
        CLICKICON = enumC974650bTD;
        EnumC974650bTD enumC974650bTD2 = new EnumC974650bTD("INVITEREJECT", 1, "invite_reject");
        INVITEREJECT = enumC974650bTD2;
        EnumC974650bTD enumC974650bTD3 = new EnumC974650bTD("CLICKCOUTDOWN", 2, "click_countdown");
        CLICKCOUTDOWN = enumC974650bTD3;
        EnumC974650bTD enumC974650bTD4 = new EnumC974650bTD("TIMEOUT", 3, "time_out");
        TIMEOUT = enumC974650bTD4;
        EnumC974650bTD enumC974650bTD5 = new EnumC974650bTD("CLICKGUIDE", 4, "click_guide");
        CLICKGUIDE = enumC974650bTD5;
        EnumC974650bTD enumC974650bTD6 = new EnumC974650bTD("CLICKREMATCH", 5, "click_rematch");
        CLICKREMATCH = enumC974650bTD6;
        EnumC974650bTD[] enumC974650bTDArr = {enumC974650bTD, enumC974650bTD2, enumC974650bTD3, enumC974650bTD4, enumC974650bTD5, enumC974650bTD6};
        LLILLJJLI = enumC974650bTDArr;
        LLILLL = new C2254308sP(enumC974650bTDArr);
    }

    public static EnumC974650bTD[] values() {
        return (EnumC974650bTD[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC974650bTD valueOf(String str) {
        return (EnumC974650bTD) C08FF.LIZ(EnumC974650bTD.class, str);
    }

    public EnumC974650bTD(String str, int i, String str2) {
        this.LL = str2;
    }
}
