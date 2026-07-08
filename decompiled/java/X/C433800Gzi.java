package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: renamed from: X.0Gzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433800Gzi extends SmartImageView {
    public boolean LLIZLLLIL;
    public AnonymousClass0956 LLJ;

    public C433800Gzi() {
        throw null;
    }

    public C433800Gzi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final AnonymousClass0956 LJIIIIZZ(MediaModel mediaModel, Bitmap bitmap) {
        return C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C433780Gzg(bitmap, mediaModel, this, null), 3);
    }

    public final void LJIIIZ(MediaModel mediaModel, Bitmap bitmap) {
        if (C433810Gzj.LIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJ = LJIIIIZZ(mediaModel, bitmap);
            return;
        }
        LJIIIIZZ(mediaModel, bitmap).LIZIZ(null);
        LJIIIIZZ(mediaModel, bitmap);
    }

    public C433800Gzi(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
