package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;

/* JADX INFO: renamed from: X.0F5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5Y {
    public final InlineCaptionFragment LIZ;
    public final C0F5L LIZIZ;

    public final C0F5K LIZ() {
        return this.LIZ.xT();
    }

    public final void LIZIZ(boolean z) {
        float f;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.B5(this.LIZIZ.LJ, f);
        C786410Ut5.x5(this.LIZIZ.LIZJ, f);
        C786410Ut5.x5(this.LIZIZ.LIZLLL, f);
    }

    public C0F5Y(C0F5L c0f5l, InlineCaptionFragment inlineCaptionFragment) {
        this.LIZ = inlineCaptionFragment;
        this.LIZIZ = c0f5l;
    }
}
