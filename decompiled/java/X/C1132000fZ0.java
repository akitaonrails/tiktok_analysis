package X;

/* JADX INFO: renamed from: X.0fZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132000fZ0 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(EnumC994150byf enumC994150byf) {
        String str;
        if (enumC994150byf == EnumC994150byf.ANCHOR) {
            str = "host_unable_receive";
        } else {
            str = "guest_unable_receive";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_unable_gift_toast");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "reason");
        c474500IjALIZ.LIZ();
    }
}
