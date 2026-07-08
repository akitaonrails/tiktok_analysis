package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ea7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366970Ea7 implements InterfaceC369240Edm {
    public final C19EG LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;
    public final C444890HcV LIZLLL;
    public final TuxIconDrawable LJ;
    public final int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final C01GW LJIIJJI;
    public C0E5S LJIIL;

    public C366970Ea7(C19EG c19eg) {
        LiveState<TrackShowType> liveStateQ82;
        Integer numLIZJ;
        this.LIZ = c19eg;
        Paint paint = new Paint();
        this.LIZIZ = new Rect();
        this.LIZJ = new Rect();
        C444890HcV c444890HcV = new C444890HcV();
        this.LIZLLL = c444890HcV;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_music_note_s_alt;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = false;
        this.LJ = c419910GdJ.LIZ(c19eg);
        this.LJFF = C0FU0.LIZ(2.0f);
        this.LJI = C0FU0.LIZ(2.0f);
        C0FU0.LIZ(1.5f);
        this.LJII = C0FU0.LIZ(2.0f);
        C0FU0.LIZ(1.0f);
        this.LJIIIIZZ = C0FU0.LIZ(12.0f);
        this.LJIIIZ = c19eg.getString(2131833428);
        int iLIZ = C960203pA.LIZ(R.attr.ee, c19eg);
        this.LJIIJ = iLIZ;
        this.LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 399));
        paint.setAntiAlias(true);
        Integer numValueOf = Integer.valueOf(R.attr.e6);
        TrackShowType trackShowTypeLIZJ = null;
        if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), c19eg)) != null) {
            paint.setColor(numLIZJ.intValue());
        }
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C0FU0.LIZ(13.0f));
        c444890HcV.LIZ(62);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bq7, c19eg);
        c444890HcV.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : iLIZ);
        c444890HcV.setStrokeWidth(C0FU0.LIZ(1.0f));
        c444890HcV.setStyle(Paint.Style.FILL);
        C0E5S c0e5s = this.LJIIL;
        if (c0e5s != null && (liveStateQ82 = c0e5s.Q82()) != null) {
            trackShowTypeLIZJ = liveStateQ82.LIZJ();
        }
        if (trackShowTypeLIZJ == TrackShowType.NORMAL) {
            C0FU0.LIZ(24.0f);
        } else {
            C0FU0.LIZ(34.0f);
        }
        C0FU0.LIZ(18.0f);
        C0FU0.LIZ(17.0f);
        this.LJIIIIZZ = C0FU0.LIZ(14.0f);
        this.LJFF = 0;
        this.LJI = C0FU0.LIZ(4.0f);
    }

    @Override // X.InterfaceC369240Edm
    public final void LIZ(Canvas canvas, C367830EbV c367830EbV) {
        int measuredWidth;
        int iIntValue;
        int measuredHeight = c367830EbV.getMeasuredHeight();
        if (C293820BfQ.LIZ()) {
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            int i = AbstractC367990Ebl.LJIILJJIL;
            if (measuredHeight > i + 1) {
                this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                this.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                this.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else if (measuredHeight > i - 1) {
                this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                this.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                this.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            } else {
                this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                this.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                this.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            }
        }
        canvas.getClipBounds(this.LIZJ);
        if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            measuredWidth = c367830EbV.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        C444890HcV c444890HcV = this.LIZLLL;
        String str = this.LJIIIZ;
        c444890HcV.getTextBounds(str, 0, str.length(), this.LIZIZ);
        if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            this.LJ.setBounds(((measuredWidth - this.LJFF) - this.LJI) - this.LJIIIIZZ, this.LIZJ.centerY() - (this.LJIIIIZZ / 2), (measuredWidth - this.LJFF) - this.LJI, this.LIZJ.centerY() + (this.LJIIIIZZ / 2));
        } else {
            TuxIconDrawable tuxIconDrawable = this.LJ;
            int i2 = this.LJFF + measuredWidth + this.LJI;
            int iCenterY = this.LIZJ.centerY();
            int i3 = this.LJIIIIZZ;
            tuxIconDrawable.setBounds(i2, iCenterY - (i3 / 2), this.LJFF + measuredWidth + this.LJI + i3, this.LIZJ.centerY() + (this.LJIIIIZZ / 2));
        }
        TuxIconDrawable tuxIconDrawable2 = this.LJ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bq7, this.LIZ);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = this.LJIIJ;
        }
        tuxIconDrawable2.LJFF(iIntValue);
        this.LJ.draw(canvas);
        float fCenterY = this.LIZJ.centerY() - ((this.LIZLLL.descent() + this.LIZLLL.ascent()) / 2);
        if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            canvas.drawText(this.LJIIIZ, ((((measuredWidth - this.LJFF) - this.LJI) - this.LJIIIIZZ) - this.LJII) - this.LIZIZ.width(), fCenterY, this.LIZLLL);
        } else {
            canvas.drawText(this.LJIIIZ, this.LJFF + measuredWidth + this.LJI + this.LJIIIIZZ + this.LJII, fCenterY, this.LIZLLL);
        }
    }
}
