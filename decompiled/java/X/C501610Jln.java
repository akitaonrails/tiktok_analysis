package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501610Jln {
    public static Drawable LIZ(Context context, boolean z) {
        int i;
        if (z) {
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                i = R.drawable.e4i;
            } else {
                i = R.drawable.e4h;
            }
        } else {
            i = R.drawable.e4g;
        }
        return C800330VaR.LIZIZ(context, i);
    }
}
