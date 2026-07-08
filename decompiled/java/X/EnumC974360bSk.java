package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974360bSk {
    public static final EnumC974360bSk DISCONNECT;
    public static final EnumC974360bSk HADREPLY;
    public static final EnumC974360bSk INVITE;
    public static final EnumC974360bSk INVITEONE;
    public static final EnumC974360bSk INVITING;
    public static final /* synthetic */ EnumC974360bSk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC974360bSk OPEN_MODE_PANEL;
    public static final EnumC974360bSk WAITINGFORQUIT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC974360bSk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974360bSk enumC974360bSk = new EnumC974360bSk("INVITEONE", 0, "invite_one_more");
        INVITEONE = enumC974360bSk;
        EnumC974360bSk enumC974360bSk2 = new EnumC974360bSk("WAITINGFORQUIT", 1, "waitting_for_quit");
        WAITINGFORQUIT = enumC974360bSk2;
        EnumC974360bSk enumC974360bSk3 = new EnumC974360bSk("INVITING", 2, "in_inviting");
        INVITING = enumC974360bSk3;
        EnumC974360bSk enumC974360bSk4 = new EnumC974360bSk("HADREPLY", 3, "has_reply");
        HADREPLY = enumC974360bSk4;
        EnumC974360bSk enumC974360bSk5 = new EnumC974360bSk("DISCONNECT", 4, "disconnect_pk");
        DISCONNECT = enumC974360bSk5;
        EnumC974360bSk enumC974360bSk6 = new EnumC974360bSk("INVITE", 5, "invite");
        INVITE = enumC974360bSk6;
        EnumC974360bSk enumC974360bSk7 = new EnumC974360bSk("OPEN_MODE_PANEL", 6, "open_mode_panel");
        OPEN_MODE_PANEL = enumC974360bSk7;
        EnumC974360bSk[] enumC974360bSkArr = {enumC974360bSk, enumC974360bSk2, enumC974360bSk3, enumC974360bSk4, enumC974360bSk5, enumC974360bSk6, enumC974360bSk7};
        LLILLJJLI = enumC974360bSkArr;
        LLILLL = new C2254308sP(enumC974360bSkArr);
    }

    public static EnumC974360bSk[] values() {
        return (EnumC974360bSk[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC974360bSk valueOf(String str) {
        return (EnumC974360bSk) C08FF.LIZ(EnumC974360bSk.class, str);
    }

    public EnumC974360bSk(String str, int i, String str2) {
        this.LL = str2;
    }
}
