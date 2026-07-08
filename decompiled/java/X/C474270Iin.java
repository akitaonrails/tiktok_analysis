package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Iin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474270Iin {
    public static final String LIZIZ(long j) {
        return C1850730yGF.LIZJ(j).toUpperCase(Locale.ENGLISH);
    }

    public static final void LIZ(int i, InterfaceC2262081DgM interfaceC2262081DgM, final C1324720kZq c1324720kZq) {
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
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarThumb.getUrls());
                c1324610kZfLIZJ.LJI = i;
                c1324610kZfLIZJ.LJII = i;
                c1324610kZfLIZJ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0IQ4
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i2, int i3, String str) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                        C1CC2.LIZ("SubSpaceAvatarLoad", exc);
                        c1324720kZq.setActualImageResource(R.drawable.el9);
                    }
                };
                c1324610kZfLIZJ.LJJI(c1324720kZq);
                return;
            }
        }
        c1324720kZq.setActualImageResource(R.drawable.el9);
    }
}
