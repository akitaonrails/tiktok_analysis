package X;

/* JADX INFO: renamed from: X.0eAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078610eAt {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j, boolean z, EnumC1083180eIG enumC1083180eIG) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pinch_return");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        if (z) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LJJII(enumC1083180eIG.getReason(), "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(long j, float f, boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pinch_zoom");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        if (z) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LJJIFFI(Float.valueOf(f), "pinch_size");
        c474500IjALIZ.LIZ();
    }
}
