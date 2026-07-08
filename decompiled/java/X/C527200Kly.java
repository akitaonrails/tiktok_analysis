package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0Kly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527200Kly {
    public static final Drawable LIZ(Context context, boolean z) {
        int i;
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            i = R.attr.zi;
        } else {
            i = R.attr.a03;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        return c384050F3z.LIZ(context);
    }

    public static final Drawable LIZIZ(Context context, boolean z, boolean z2, AlbumNextButtonConfig albumNextButtonConfig) {
        int i;
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(context, albumNextButtonConfig, 163);
        if (z2) {
            Drawable drawable = context.getDrawable(R.drawable.a4a);
            if (drawable != null) {
                if (z) {
                    i = 255;
                } else {
                    i = 102;
                }
                drawable.setAlpha(i);
                return drawable;
            }
            return (Drawable) awS409S0200000_8.invoke();
        }
        return (Drawable) awS409S0200000_8.invoke();
    }
}
