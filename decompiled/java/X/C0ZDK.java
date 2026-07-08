package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZDK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDK implements InterfaceC895790ZCf {
    public static final C0ZDK LIZIZ = new C0ZDK();

    @Override // X.InterfaceC895790ZCf
    public final String LJJJ() {
        C0ZDJ.LIZ.getClass();
        return C0ZDJ.LIZJ(2131831725);
    }

    @Override // X.InterfaceC895790ZCf
    public final Integer LJIJJ() {
        if (C560910LzF.LIZIZ()) {
            return Integer.valueOf(R.raw.icon_bitmap_sticker_nudge);
        }
        return null;
    }

    @Override // X.InterfaceC895790ZCf
    public final Drawable LJJIL(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_bitmap_sticker_nudge;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }

    @Override // X.InterfaceC895790ZCf
    public final String getString(int i) {
        C0ZDJ.LIZ.getClass();
        return C0ZDJ.LIZJ(i);
    }
}
