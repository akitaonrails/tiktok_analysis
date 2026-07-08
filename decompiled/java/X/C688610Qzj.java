package X;

import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Qzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688610Qzj implements InterfaceC431410Gvr {
    public final HashMap<String, String> LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ;
    public int LJFF;
    public long LJII;
    public long LJIIIIZZ;
    public int LJIIJ;
    public String LJIIJJI;
    public C1DFK LJIIL;
    public final int LJIILIIL;
    public boolean LJI = true;
    public boolean LJIIIZ = true;

    public C688610Qzj(HashMap<String, String> map) {
        this.LIZ = map;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LJIIL = c1dfkLIZ;
        C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
        C688500QzY.LIZ.getClass();
        this.LJIILIIL = ((PressedPrefetchConfig) C688500QzY.LIZJ.getValue()).firstWaitTime;
    }

    public final void LIZIZ(ClickableSpan clickableSpan, TextView textView) {
        C1353380lK4 c1353380lK4;
        TextExtraStruct textExtraStruct;
        C1353380lK4 c1353380lK42;
        TextExtraStruct textExtraStruct2;
        boolean z = clickableSpan instanceof C1353380lK4;
        if (z && (c1353380lK4 = (C1353380lK4) clickableSpan) != null && (textExtraStruct = c1353380lK4.LLILZ) != null && textExtraStruct.getType() == 6 && z && (c1353380lK42 = (C1353380lK4) clickableSpan) != null && (textExtraStruct2 = c1353380lK42.LLILZ) != null) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.z(textExtraStruct2.getSearchKeyword());
            this.LJIIJJI = textExtraStruct2.getSearchKeyword();
            c1er1.LJJIL(textView.getContext(), textExtraStruct2.getSearchKeyword(), textExtraStruct2, this.LIZ);
        }
    }

    @Override // X.InterfaceC431410Gvr
    public final void LIZ(ClickableSpan clickableSpan, MotionEvent motionEvent, TextView textView) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            if (this.LJIILIIL > 0) {
                this.LIZIZ = System.currentTimeMillis();
                this.LJIIIZ = true;
                this.LJIIJ = 0;
                this.LIZLLL = motionEvent.getRawX();
                this.LJ = motionEvent.getRawY();
                int scaledTouchSlop = ViewConfiguration.get(textView.getContext()).getScaledTouchSlop();
                C688500QzY.LIZ.getClass();
                this.LJFF = scaledTouchSlop / ((PressedPrefetchConfig) C688500QzY.LIZJ.getValue()).touchSlopRatio;
                C1DFK c1dfkLIZ = C23118094a.LIZ();
                this.LJIIL = c1dfkLIZ;
                C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
                this.LJI = true;
                C23250099c.LIZLLL(c054gLIZ, null, null, new C688600Qzi(this, clickableSpan, textView, null), 3);
                return;
            }
            LIZIZ(clickableSpan, textView);
            return;
        }
        if (action != 3 && action != 1) {
            if (action != 2 || this.LJIILIIL <= 0) {
                return;
            }
            this.LJIIJ++;
            if (this.LJIIIZ) {
                this.LJIIIIZZ = System.currentTimeMillis();
                this.LJIIIZ = false;
            }
            this.LIZJ = true;
            float fAbs = Math.abs(this.LIZLLL - motionEvent.getRawX());
            float fAbs2 = Math.abs(this.LJ - motionEvent.getRawY());
            float f = this.LJFF;
            if ((fAbs <= f || fAbs * 0.5f <= fAbs2) && fAbs2 <= f) {
                return;
            }
            this.LJI = false;
            return;
        }
        if (motionEvent.getAction() == 3) {
            z = true;
        }
        String str = this.LJIIJJI;
        if (str != null) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.LJLI(this.LJIIJ, "comment_highlighted_words", z, str, this.LJII, this.LJIIIIZZ - this.LIZIZ);
            if (z) {
                c1er1.LLLJ("cancel", str, "ACTION_CANCEL");
            }
            this.LJIIJJI = null;
            this.LJII = 0L;
        }
        this.LJIIL.LIZIZ(null);
    }
}
