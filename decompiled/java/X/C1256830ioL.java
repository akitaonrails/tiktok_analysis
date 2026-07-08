package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0ioL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256830ioL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final AvatarComponentView avatarComponentView, final long j, final boolean z, String str, String str2, int i) {
        final String str3 = str;
        final String str4 = null;
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) == 0) {
            str4 = str2;
        }
        C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.0ioK
            public final void LIZ() {
                C1606830rur c1606830rur;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("image_sub_type", str3);
                c2344009Gk.LIZLLL(j, "total_duration");
                c2344009Gk.LJIIIIZZ("is_success", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                C1608750rxx config = avatarComponentView.getConfig();
                c2344009Gk.LJIIIIZZ("enter_from", (config == null || (c1606830rur = config.LIZJ) == null) ? null : c1606830rur.LIZIZ);
                c2344009Gk.LJIIIIZZ("net_status", C0XF1.LIZ(avatarComponentView.getContext()).toString());
                c2344009Gk.LIZJ(avatarComponentView.getAvatarSizeDp(), "avatar_size");
                String str5 = str4;
                if (str5 != null) {
                    c2344009Gk.LJFF("error_message", str5);
                }
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("avatar_image_load_monitor", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AvatarImageMonitor@b534.mobAvatarImageLoad$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AvatarImageMonitor@b534.mobAvatarImageLoad$1");
            }
        });
    }
}
