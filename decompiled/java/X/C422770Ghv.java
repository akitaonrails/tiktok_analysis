package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ghv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422770Ghv extends C424620Gku {
    public Drawable LLJJIII;

    @Override // X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public final void LIZJ() {
        super.LIZJ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_replay_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.bw, getContext());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext()));
        if (this.LLJJIII == null) {
            this.LLJJIII = layerDrawableLJIILIIL;
        }
        Drawable drawable = this.LLJJIII;
        if (!(drawable instanceof BitmapDrawable)) {
            getHierarchy().LJJIFFI(layerDrawableLJIILIIL, InterfaceC1320380kSq.LJI);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            getHierarchy().LJJIFFI(layerDrawableLJIILIIL, InterfaceC1320380kSq.LJI);
        } else {
            getHierarchy().LJJIFFI(new BitmapDrawable(getResources(), bitmap), InterfaceC1320380kSq.LJI);
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C422770Ghv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
