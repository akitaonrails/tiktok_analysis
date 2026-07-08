package X;

import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LQ extends View {
    public Paint LL;
    public final C15LT LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public MusicWaveBean LLILZLL;
    public MusicWaveBean LLIZ;
    public final RectF LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final C15LS LLJILJIL;

    public final int getMaxCntOnScreen() {
        C15LS c15ls = this.LLJILJIL;
        int i = c15ls.LIZIZ;
        int i2 = c15ls.LIZJ;
        if (i + i2 != 0) {
            return this.LLJ / (i + i2);
        }
        return 60;
    }

    public final int getViewWidth() {
        float[] musicWavePointArray;
        float[] musicWavePointArray2;
        MusicWaveBean musicWaveBean = this.LLILZLL;
        int length = 0;
        int length2 = (musicWaveBean == null || (musicWavePointArray2 = musicWaveBean.getMusicWavePointArray()) == null) ? 0 : musicWavePointArray2.length;
        MusicWaveBean musicWaveBean2 = this.LLIZ;
        if (musicWaveBean2 != null && (musicWavePointArray = musicWaveBean2.getMusicWavePointArray()) != null) {
            length = musicWavePointArray.length;
        }
        C15LS c15ls = this.LLJILJIL;
        return (length2 + length) * (c15ls.LIZIZ + c15ls.LIZJ);
    }

    public final int getMMarginStartX() {
        return this.LLILZ;
    }

    public final Paint getMPlayedPaint() {
        return this.LL;
    }

    public final int getMSelectedPartWidth() {
        return this.LLJ;
    }

    public final MusicWaveBean getMusicLoopWaveBean() {
        return this.LLIZ;
    }

    public final MusicWaveBean getMusicWaveBean() {
        return this.LLILZLL;
    }

    public final int getStartX() {
        return this.LLILZ;
    }

    public C15LQ(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = new RectF();
        C20503715Kx c20503715Kx = new C20503715Kx();
        this.LLJI = C960203pA.LIZ(R.attr.a04, context);
        this.LLJIJIL = C960203pA.LIZ(R.attr.a1k, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.LLJI);
        this.LL = paint;
        C15LS c15ls = new C15LS(context, c20503715Kx);
        this.LLJILJIL = c15ls;
        C15LT c15lt = new C15LT();
        Paint paint2 = new Paint();
        c15lt.LJIIIIZZ = paint2;
        paint2.setColor(c15lt.LJIIL);
        Paint paint3 = c15lt.LJIIIIZZ;
        (paint3 == null ? null : paint3).setStyle(Paint.Style.FILL);
        Paint paint4 = c15lt.LJIIIIZZ;
        (paint4 == null ? null : paint4).setAntiAlias(true);
        Paint paint5 = new Paint();
        c15lt.LJIIIZ = paint5;
        paint5.setColor(c15lt.LJIIL);
        Paint paint6 = c15lt.LJIIIZ;
        (paint6 == null ? null : paint6).setStyle(Paint.Style.FILL);
        Paint paint7 = c15lt.LJIIIZ;
        (paint7 == null ? null : paint7).setAntiAlias(true);
        Paint paint8 = c15lt.LJIIIZ;
        (paint8 != null ? paint8 : null).setAlpha(25);
        c15lt.LJIILIIL.setStyle(Paint.Style.FILL);
        c15lt.LJIILIIL.setAntiAlias(true);
        c15lt.LIZ(this.LLJIJIL);
        c15lt.LIZ = c15ls.LIZIZ;
        c15lt.LIZIZ = c15ls.LIZJ;
        c15lt.LJ = c15ls.LJI;
        c15lt.LIZLLL = c15ls.LJ;
        c15lt.LIZJ = c15ls.LJFF;
        this.LLILLJJLI = c15lt;
        this.LLJ = c15ls.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15LQ.onDraw(android.graphics.Canvas):void");
    }

    public final void setAudioLoopWaveViewData(MusicWaveBean musicWaveBean) {
        if (musicWaveBean != null) {
            this.LLIZ = musicWaveBean;
            HandlerHook.viewPost(this, new ARunnableS100S0200000_31(this, musicWaveBean, 58));
        }
    }

    public void setAudioWaveViewData(MusicWaveBean musicWaveBean) {
        if (musicWaveBean != null) {
            this.LLILZLL = musicWaveBean;
            HandlerHook.viewPost(this, new ARunnableS100S0200000_31(this, musicWaveBean, 59));
        }
    }

    public final void setLoopWaveColor(int i) {
        this.LLILLJJLI.LJIILIIL.setColor(i);
    }

    public final void setMMarginStartX(int i) {
        this.LLILZ = i;
    }

    public final void setMPlayedPaint(Paint paint) {
        this.LL = paint;
    }

    public final void setMSelectedPartWidth(int i) {
        this.LLJ = i;
    }

    public final void setMusicLoopWaveBean(MusicWaveBean musicWaveBean) {
        this.LLIZ = musicWaveBean;
    }

    public final void setMusicWaveBean(MusicWaveBean musicWaveBean) {
        this.LLILZLL = musicWaveBean;
    }

    public final void setParam(C20503715Kx c20503715Kx) {
        this.LLJILJIL.LIZ(c20503715Kx);
        C15LT c15lt = this.LLILLJJLI;
        C15LS c15ls = this.LLJILJIL;
        c15lt.LIZ = c15ls.LIZIZ;
        c15lt.LIZIZ = c15ls.LIZJ;
        c15lt.LJ = c15ls.LJI;
        c15lt.LIZLLL = c15ls.LJ;
        c15lt.LIZJ = c15ls.LJFF;
        this.LLJ = c15ls.LJIIIIZZ;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MusicWaveBean musicWaveBean = this.LLILZLL;
        if (musicWaveBean != null) {
            C15LS c15ls = this.LLJILJIL;
            float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
            c15ls.getClass();
            if (musicWavePointArray != null && musicWavePointArray.length != 0) {
                int viewWidth = getViewWidth();
                C15LT c15lt = this.LLILLJJLI;
                C15LS c15ls2 = this.LLJILJIL;
                int i3 = c15ls2.LJFF;
                c15lt.LIZJ = i3;
                setMeasuredDimension(viewWidth, c15ls2.LIZLLL + (i3 * 2));
                C15LT c15lt2 = this.LLILLJJLI;
                C15LS c15ls3 = this.LLJILJIL;
                c15lt2.LJFF = (c15ls3.LIZLLL + (c15ls3.LJFF * 2)) - (c15lt2.LIZJ * 2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
