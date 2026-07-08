package X;

/* JADX INFO: renamed from: X.1AUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180381AUy {
    public static final C2180381AUy LIZ = new C2180381AUy();

    public static void LIZ(C2180381AUy c2180381AUy, String str, String str2, String str3, String str4, String str5, EnumC2180391AUz enumC2180391AUz, EnumC2180361AUw enumC2180361AUw, Long l, String str6, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            enumC2180391AUz = null;
        }
        if ((i & 128) != 0) {
            enumC2180361AUw = null;
        }
        if ((i & 256) != 0) {
            l = null;
        }
        if ((i & 512) != 0) {
            str6 = null;
        }
        c2180381AUy.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str3 != null) {
            c2344009Gk.LJFF("enter_from", str3);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("group_id", str2);
        }
        if (str4 != null) {
            c2344009Gk.LJFF("author_id", str4);
        }
        if (str5 != null) {
            c2344009Gk.LJFF("bcg_audio_status", str5);
        }
        if (enumC2180391AUz != null) {
            c2344009Gk.LJFF("action_position", enumC2180391AUz.getValue());
        }
        if (enumC2180361AUw != null) {
            c2344009Gk.LJFF("operation_type", enumC2180361AUw.getValue());
        }
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue(), "play_duration");
        }
        if (str6 != null) {
            c2344009Gk.LJFF("toast_type", str6);
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
