package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367170EaR implements InterfaceC367810EbT {
    public final C19EG LIZ;
    public final C0E48 LIZIZ;
    public final C444890HcV LIZJ;
    public final TuxIconDrawable LIZLLL;
    public final TuxIconDrawable LJ;
    public final Rect LJFF;
    public String LJI;
    public C0E5S LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final C01GW LJIIJJI;
    public C367200EaU LJIIL;

    @Override // X.InterfaceC367810EbT
    public final void LIZ(C367200EaU c367200EaU) {
        this.LJIIL = c367200EaU;
    }

    public C367170EaR(C19EG c19eg, C0E48 c0e48) {
        float f;
        this.LIZ = c19eg;
        this.LIZIZ = c0e48;
        C444890HcV c444890HcV = new C444890HcV();
        this.LIZJ = c444890HcV;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_effect_rectangle_alt_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = false;
        this.LIZLLL = c419910GdJ.LIZ(c19eg);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_triple_ellipse_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ2.LJFF = false;
        this.LJ = c419910GdJ2.LIZ(c19eg);
        float f2 = 8.0f;
        C0FU0.LIZ(8.0f);
        this.LJFF = new Rect();
        this.LJI = "";
        if (C297330Bl5.LIZIZ()) {
            f = 9.0f;
        } else if (C297330Bl5.LIZJ()) {
            f = 10.0f;
        } else {
            f = 8.0f;
        }
        this.LJIIIIZZ = C0FU0.LIZ(f);
        C0FU0.LIZ(4.0f);
        if (!C297330Bl5.LIZIZ()) {
            if (C297330Bl5.LIZJ()) {
                f2 = 9.0f;
            } else {
                f2 = 7.0f;
            }
        }
        this.LJIIIZ = C0FU0.LIZ(f2);
        this.LJIIJ = C0FU0.LIZ(14.0f);
        this.LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 514));
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C0FU0.LIZ(13.0f));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bq9, c19eg);
        if (numLIZJ != null) {
            c444890HcV.setColor(numLIZJ.intValue());
        }
        c444890HcV.setStrokeWidth(C0FU0.LIZ(1.0f));
        c444890HcV.setStyle(Paint.Style.FILL);
        c444890HcV.LIZ(62);
        this.LJIIL = new C367200EaU(0, 0.0f, 0.0f, 0, 0, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC367810EbT
    public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
        int iLJJIJL;
        boolean z;
        TrackShowType trackShowTypeLIZJ;
        boolean z2;
        TuxIconDrawable tuxIconDrawable;
        LiveState<TrackShowType> liveStateQ82;
        this.LJIIIZ = (this.LJIIL.LIZ - C0FU0.LIZ(18.0f)) / 2;
        C367200EaU c367200EaU = this.LJIIL;
        this.LJIIIIZZ = (c367200EaU.LIZ - this.LJIIJ) / 2;
        this.LJIIJ = c367200EaU.LJ;
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 != null) {
            iLJJIJL = C351220Dpo.LJJIJL(C350870DpF.LJI(c0e48));
        } else {
            iLJJIJL = 0;
        }
        if (iLJJIJL > 1) {
            z = true;
        } else {
            z = false;
        }
        C0E5S c0e5s = this.LJII;
        C367560Eb4 c367560Eb4 = null;
        if (c0e5s != null && (liveStateQ82 = c0e5s.Q82()) != null) {
            trackShowTypeLIZJ = liveStateQ82.LIZJ();
        } else {
            trackShowTypeLIZJ = null;
        }
        if (trackShowTypeLIZJ == TrackShowType.NORMAL && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        ((View) interfaceC368560Ecg).getLeft();
        interfaceC368560Ecg.getClipStart();
        float fWidth = 0.0f;
        if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            if (interfaceC368560Ecg.getClipRectF().width() == 0.0f) {
                fWidth = ((View) interfaceC368560Ecg).getMeasuredWidth();
            } else {
                fWidth = interfaceC368560Ecg.getClipRectF().width();
            }
        }
        if (z2) {
            int i2 = (int) this.LJIIL.LIZIZ;
            if (C351220Dpo.LLLLIL(nLETrackSlot) && C350660Dou.LIZJ()) {
                tuxIconDrawable = this.LJ;
            } else {
                tuxIconDrawable = this.LIZLLL;
            }
            if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
                int i3 = ((int) fWidth) - i2;
                int i4 = this.LJIIJ;
                int i5 = this.LJIIIIZZ;
                tuxIconDrawable.setBounds(i3 - i4, i5, i3, i4 + i5);
            } else {
                int i6 = i2 + ((int) fWidth);
                int i7 = this.LJIIIIZZ;
                int i8 = this.LJIIJ;
                tuxIconDrawable.setBounds(i6, i7, i6 + i8, i8 + i7);
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bq9, this.LIZ);
            if (numLIZJ != null) {
                tuxIconDrawable.LJFF(numLIZJ.intValue());
            }
            tuxIconDrawable.draw(canvas);
        }
        if (interfaceC368560Ecg instanceof C367560Eb4) {
            c367560Eb4 = (C367560Eb4) interfaceC368560Ecg;
        }
        int i9 = this.LJIIJ;
        C367200EaU c367200EaU2 = this.LJIIL;
        int i10 = (int) c367200EaU2.LIZIZ;
        int i11 = (int) c367200EaU2.LIZJ;
        if (!z2) {
            i9 = 0;
            i11 = i10;
            i10 = 0;
        }
        this.LIZJ.LIZ(c367200EaU2.LIZLLL);
        if (c367560Eb4 != null) {
            if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
                if (c367560Eb4.getText().length() == 0) {
                    this.LJFF.set(0, 0, 0, 0);
                    this.LJI = "";
                } else if (!Intrinsics.LJFF(this.LJI, c367560Eb4.getText())) {
                    this.LIZJ.getTextBounds(c367560Eb4.getText(), 0, c367560Eb4.getText().length(), this.LJFF);
                    this.LJI = c367560Eb4.getText();
                }
                canvas.drawText(c367560Eb4.getText(), fWidth - (((i10 + i9) + i11) + this.LJFF.width()), this.LJIIIZ + this.LIZJ.getTextSize(), this.LIZJ);
                return;
            }
            canvas.drawText(c367560Eb4.getText(), ((int) fWidth) + i10 + i9 + i11, this.LJIIIZ + this.LIZJ.getTextSize(), this.LIZJ);
        }
    }
}
