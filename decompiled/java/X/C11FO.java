package X;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

/* JADX INFO: renamed from: X.11FO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11FO extends RemoteImageView {
    public final C12Z2 LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public final void LIZJ() {
        setOutlineProvider(new C19772912Xv(this, 3));
        setClipToOutline(true);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZLLL(InterfaceC1330440kj4 interfaceC1330440kj4) {
        if (interfaceC1330440kj4 != null) {
            setAspectRatio(interfaceC1330440kj4.getWidth() / interfaceC1330440kj4.getHeight());
            invalidateOutline();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C11FO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C1322110kVd
    public final void setImageURI(Uri uri, Object obj) {
        C1320810kTX c1320810kTX = (C1320810kTX) getControllerBuilder();
        c1320810kTX.LJIIIIZZ = this.LLILLJJLI;
        c1320810kTX.LIZJ = obj;
        c1320810kTX.LJI(uri);
        c1320810kTX.LJIILJJIL = getController();
        setController(c1320810kTX.LIZ());
    }

    public C11FO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = new C12Z2(this, 2);
    }
}
