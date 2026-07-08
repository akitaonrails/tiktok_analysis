package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367180EaS implements InterfaceC367810EbT {
    public final Context LIZ;
    public final C444890HcV LIZIZ;
    public final TuxIconDrawable LIZJ;
    public final Rect LIZLLL;
    public final Rect LJ;
    public String LJFF;
    public C0E5S LJI;
    public int LJII;
    public final C01GW LJIIIIZZ;
    public C367200EaU LJIIIZ;

    public C367180EaS(Context context) {
        float f;
        this.LIZ = context;
        C444890HcV c444890HcV = new C444890HcV();
        this.LIZIZ = c444890HcV;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_list_music_note;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = false;
        this.LIZJ = c419910GdJ.LIZ(context);
        this.LIZLLL = new Rect();
        this.LJ = new Rect();
        this.LJFF = "";
        float f2 = 8.0f;
        if (C297330Bl5.LIZIZ()) {
            f = 9.0f;
        } else if (C297330Bl5.LIZJ()) {
            f = 10.0f;
        } else {
            f = 8.0f;
        }
        C0FU0.LIZ(f);
        if (!C297330Bl5.LIZIZ()) {
            if (C297330Bl5.LIZJ()) {
                f2 = 9.0f;
            } else {
                f2 = 7.0f;
            }
        }
        C0FU0.LIZ(f2);
        this.LJII = C0FU0.LIZ(14.0f);
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 695));
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C0FU0.LIZ(13.0f));
        c444890HcV.setColor(-14601095);
        c444890HcV.setStrokeWidth(C0FU0.LIZ(1.0f));
        c444890HcV.setStyle(Paint.Style.FILL);
        c444890HcV.LIZ(62);
        this.LJIIIZ = new C367200EaU(0, 0.0f, 0.0f, 0, 0, 31);
    }

    @Override // X.InterfaceC367810EbT
    public final void LIZ(C367200EaU c367200EaU) {
        this.LJIIIZ = c367200EaU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC367810EbT
    public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
        C367270Eab c367270Eab;
        canvas.getClipBounds(this.LJ);
        C0FU0.LIZ(18.0f);
        this.LJII = this.LJIIIZ.LJ;
        float measuredWidth = 0.0f;
        if (((Boolean) this.LJIIIIZZ.getValue()).booleanValue() && (interfaceC368560Ecg instanceof View)) {
            measuredWidth = interfaceC368560Ecg.getClipRectF().width() == 0.0f ? ((View) interfaceC368560Ecg).getMeasuredWidth() : interfaceC368560Ecg.getClipRectF().width();
        }
        int i2 = (int) this.LJIIIZ.LIZIZ;
        if (((Boolean) this.LJIIIIZZ.getValue()).booleanValue()) {
            int i3 = ((int) measuredWidth) - i2;
            this.LIZJ.setBounds(i3 - this.LJII, this.LJ.centerY() - (this.LJII / 2), i3, this.LJ.centerY() + (this.LJII / 2));
        } else {
            TuxIconDrawable tuxIconDrawable = this.LIZJ;
            int i4 = ((int) measuredWidth) + i2;
            int iCenterY = this.LJ.centerY();
            int i5 = this.LJII;
            tuxIconDrawable.setBounds(i4, iCenterY - (i5 / 2), i5 + i4, this.LJ.centerY() + (this.LJII / 2));
        }
        this.LIZJ.LJFF(-14601095);
        this.LIZJ.draw(canvas);
        int i6 = this.LJII;
        C367200EaU c367200EaU = this.LJIIIZ;
        int i7 = (int) c367200EaU.LIZJ;
        this.LIZIZ.LIZ(c367200EaU.LIZLLL);
        if ((interfaceC368560Ecg instanceof C367270Eab) && (c367270Eab = (C367270Eab) interfaceC368560Ecg) != null) {
            float fCenterY = this.LJ.centerY() - ((this.LIZIZ.descent() + this.LIZIZ.ascent()) / 2);
            if (((Boolean) this.LJIIIIZZ.getValue()).booleanValue()) {
                if (c367270Eab.getText().length() == 0) {
                    this.LIZLLL.set(0, 0, 0, 0);
                    this.LJFF = "";
                } else if (!Intrinsics.LJFF(this.LJFF, c367270Eab.getText())) {
                    this.LIZIZ.getTextBounds(c367270Eab.getText(), 0, c367270Eab.getText().length(), this.LIZLLL);
                    this.LJFF = c367270Eab.getText();
                }
                canvas.drawText(c367270Eab.getText(), measuredWidth - (((i2 + i6) + i7) + this.LIZLLL.width()), fCenterY, this.LIZIZ);
                return;
            }
            canvas.drawText(c367270Eab.getText(), ((int) measuredWidth) + i2 + i6 + i7, fCenterY, this.LIZIZ);
        }
    }
}
