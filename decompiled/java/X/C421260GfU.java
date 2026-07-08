package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421260GfU extends FrameLayout {
    public final SmartImageView LL;
    public final C417240GXq LLILLJJLI;

    public C421260GfU(Context context) {
        super(context, null);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e3e, this, true);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.r58);
        this.LL = smartImageView;
        this.LLILLJJLI = (C417240GXq) findViewById(R.id.r59);
        setBackground(null);
        if (smartImageView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zq, context);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            Drawable drawableLIZ = c384050F3z.LIZ(context);
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c19659111vp.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            smartImageView.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
        }
        C786410Ut5.LJLLLLLL(4, this);
    }
}
