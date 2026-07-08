package X;

/* JADX INFO: renamed from: X.0X37, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0X37 {
    FYP("fyp"),
    ShowPush("show_push"),
    Chat("chat"),
    Detail("detail"),
    Mall("mall"),
    Live("live"),
    Pdp("pdp"),
    Profile("profile");

    public final String LL;

    public static C0X37 valueOf(String str) {
        return (C0X37) C08FF.LIZ(C0X37.class, str);
    }

    C0X37(String str) {
        this.LL = str;
    }
}
