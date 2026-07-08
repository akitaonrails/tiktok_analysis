package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0ZWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZWJ extends SmartImageView {
    public C0ZWH LLIZLLLIL;
    public InterfaceC2187608he LLJ;
    public final C0ZWF LLJI;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final C0ZWH getCallback() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC2187608he getReportableComponent() {
        return this.LLJ;
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

    public final void setCallback(C0ZWH c0zwh) {
        this.LLIZLLLIL = c0zwh;
    }

    public final void setReportableComponent(InterfaceC2187608he interfaceC2187608he) {
        this.LLJ = interfaceC2187608he;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZWF] */
    public C0ZWJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = new InterfaceC427850Gq7() { // from class: X.0ZWF
            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                C0ZWH callback = this.LL.getCallback();
                if (callback != null) {
                    callback.LIZ(C0ZWE.IN_PROGRESS);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                C0ZWH callback = this.LL.getCallback();
                if (callback != null) {
                    callback.LIZ(C0ZWE.FAILED);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                C0ZWH callback = this.LL.getCallback();
                if (callback != null) {
                    callback.LIZ(C0ZWE.SUCCESS);
                }
            }
        };
    }
}
