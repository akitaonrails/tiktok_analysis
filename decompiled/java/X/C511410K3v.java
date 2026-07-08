package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0K3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511410K3v {
    public static final String LIZIZ(long j) {
        String strK4;
        if (j < 1000) {
            strK4 = String.valueOf(j);
        } else if (j < 1000000) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(j / 100.0d) / 10.0d)}, 1));
        } else if (j < 1000000000) {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(j / 100000.0d) / 10.0d)}, 1));
        } else {
            strK4 = C786410Ut5.k4(Locale.US, "%.1fB", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(j / 1.0E8d) / 10.0d)}, 1));
        }
        return strK4.toUpperCase(Locale.ENGLISH);
    }

    public static final void LIZ(final C417410GYh c417410GYh, InterfaceC2262081DgM interfaceC2262081DgM, int i) {
        List urls;
        ImageModel avatarThumb;
        List urls2 = null;
        if (interfaceC2262081DgM != null) {
            ImageModel avatarMedium = interfaceC2262081DgM.getAvatarMedium();
            if (avatarMedium != null) {
                urls2 = avatarMedium.getUrls();
            }
            if (urls2 != null && !urls2.isEmpty()) {
                avatarThumb = interfaceC2262081DgM.getAvatarMedium();
            } else {
                ImageModel avatarThumb2 = interfaceC2262081DgM.getAvatarThumb();
                if (avatarThumb2 != null && (urls = avatarThumb2.getUrls()) != null && !urls.isEmpty()) {
                    avatarThumb = interfaceC2262081DgM.getAvatarThumb();
                }
            }
            if (avatarThumb != null) {
                C511420K3w.LJIIJ.getClass();
                C511420K3w c511420K3w = new C511420K3w();
                c511420K3w.LIZIZ = avatarThumb.getUrls();
                c511420K3w.LIZJ = Integer.valueOf(i);
                c511420K3w.LIZLLL = Integer.valueOf(i);
                c511420K3w.LJIIIZ = new C0K4P() { // from class: X.0K47
                    @Override // X.C0K4P
                    public final void LIZ() {
                    }

                    @Override // X.C0K4P
                    public final void LIZJ() {
                    }

                    @Override // X.C0K4P
                    public final void LJIJJLI() {
                    }

                    @Override // X.C0K4P
                    public final void LIZIZ(Exception exc) throws JSONException {
                        C0K6D.LIZJ(exc, "SubSpaceAvatarLoad", C2097608Jq.LJ());
                        c417410GYh.setActualImageResource(R.drawable.db_);
                    }
                };
                c511420K3w.LIZ(c417410GYh);
                return;
            }
        }
        c417410GYh.setActualImageResource(R.drawable.db_);
    }
}
