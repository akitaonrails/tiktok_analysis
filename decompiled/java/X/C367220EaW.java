package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367220EaW implements InterfaceC367810EbT {
    public final C19EG LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;
    public final C444890HcV LIZLLL;
    public TuxIconDrawable LJ;
    public final TuxIconDrawable LJFF;
    public int LJI;
    public final TuxIconDrawable LJII;
    public final TuxIconDrawable LJIIIIZZ;
    public int LJIIIZ;
    public final int LJIIJ;
    public int LJIIJJI;
    public final int LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public C0E5S LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public C367200EaU LJIJJLI;

    public final boolean LIZLLL() {
        return ((Boolean) this.LJIJJ.getValue()).booleanValue();
    }

    public C367220EaW(C19EG c19eg) {
        Integer numLIZJ;
        this.LIZ = c19eg;
        Paint paint = new Paint();
        this.LIZIZ = new Rect();
        this.LIZJ = new Rect();
        C444890HcV c444890HcV = new C444890HcV();
        this.LIZLLL = c444890HcV;
        this.LJ = LJ(R.raw.icon_music_note_s_alt);
        this.LJFF = LJ(R.raw.icon_speaker_x_mark_fill_ltr);
        this.LJI = C0FU0.LIZ(2.0f);
        C0FU0.LIZ(2.0f);
        this.LJII = LJ(R.raw.icon_speed_meter_fill);
        this.LJIIIIZZ = LJ(R.raw.icon_music_note_star_fill);
        C0FU0.LIZ(15.0f);
        this.LJIIIZ = C0FU0.LIZ(2.0f);
        C0FU0.LIZ(1.5f);
        C0FU0.LIZ(2.0f);
        C0FU0.LIZ(1.5f);
        this.LJIIJ = C0FU0.LIZ(4.0f);
        this.LJIIJJI = C0FU0.LIZ(12.0f);
        C0FU0.LIZ(C297330Bl5.LIZIZ() ? 12.0f : 10.0f);
        C0FU0.LIZ(4.0f);
        C0FU0.LIZ(10.0f);
        int iLIZ = C960203pA.LIZ(R.attr.ee, c19eg);
        this.LJIIL = iLIZ;
        this.LJIILIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 407));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 405));
        this.LJIILL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 403));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 402));
        this.LJIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 406));
        this.LJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 408));
        this.LJIJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 404));
        paint.setAntiAlias(true);
        Integer numValueOf = Integer.valueOf(R.attr.e6);
        if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), c19eg)) != null) {
            paint.setColor(numLIZJ.intValue());
        }
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C0FU0.LIZ(13.0f));
        c444890HcV.LIZ(62);
        c444890HcV.setColor(iLIZ);
        c444890HcV.setStrokeWidth(C0FU0.LIZ(1.0f));
        c444890HcV.setStyle(Paint.Style.FILL);
        this.LJIJJLI = new C367200EaU(0, 0.0f, 0.0f, 0, 0, 31);
    }

    @Override // X.InterfaceC367810EbT
    public final void LIZ(C367200EaU c367200EaU) {
        this.LJIJJLI = c367200EaU;
    }

    public final TuxIconDrawable LJ(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        return c419910GdJ.LIZ(this.LIZ);
    }

    public final float LIZJ(Canvas canvas, String str, TuxIconDrawable tuxIconDrawable, View view, float f) {
        int i = (int) this.LJIJJLI.LIZJ;
        if (str.length() == 0) {
            this.LIZIZ.set(0, 0, 0, 0);
            i = 0;
        } else {
            this.LIZLLL.getTextBounds(str, 0, str.length(), this.LIZIZ);
        }
        this.LIZLLL.LIZ(this.LJIJJLI.LIZLLL);
        C0FU0.LIZ(18.0f);
        C0FU0.LIZ(18.0f);
        C367200EaU c367200EaU = this.LJIJJLI;
        this.LJIIJJI = c367200EaU.LJ;
        this.LJI = 0;
        this.LJIIIZ = (int) c367200EaU.LIZIZ;
        if (LIZLLL()) {
            int i2 = (int) f;
            tuxIconDrawable.setBounds(((i2 - this.LJI) - this.LJIIIZ) - this.LJIIJJI, this.LIZJ.centerY() - (this.LJIIJJI / 2), (i2 - this.LJI) - this.LJIIIZ, this.LIZJ.centerY() + (this.LJIIJJI / 2));
        } else {
            int i3 = (int) f;
            int i4 = this.LJI + i3 + this.LJIIIZ;
            int iCenterY = this.LIZJ.centerY();
            int i5 = this.LJIIJJI;
            tuxIconDrawable.setBounds(i4, iCenterY - (i5 / 2), i3 + this.LJI + this.LJIIIZ + i5, this.LIZJ.centerY() + (this.LJIIJJI / 2));
        }
        float f2 = 255;
        tuxIconDrawable.setAlpha((int) (view.getAlpha() * f2));
        tuxIconDrawable.draw(canvas);
        if (str.length() > 0) {
            float fCenterY = this.LIZJ.centerY() - ((this.LIZLLL.descent() + this.LIZLLL.ascent()) / 2);
            this.LIZLLL.setAlpha((int) (view.getAlpha() * f2));
            if (LIZLLL()) {
                canvas.drawText(str, f - ((((this.LJI + this.LJIIIZ) + this.LJIIJJI) + i) + this.LIZIZ.width()), fCenterY, this.LIZLLL);
            } else {
                canvas.drawText(str, this.LJI + this.LJIIIZ + this.LJIIJJI + i + f, fCenterY, this.LIZLLL);
            }
        }
        float fWidth = this.LJI + this.LJIIIZ + this.LJIIJJI + i + this.LIZIZ.width() + this.LJIIJ;
        if (LIZLLL()) {
            return f - fWidth;
        }
        return f + fWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC367810EbT
    public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
        NLEResType resourceType;
        NLEResType resourceType2;
        TuxIconDrawable tuxIconDrawable;
        boolean z;
        NLEResourceNode resource;
        int iIntValue;
        NLEResType resourceType3;
        String resourceName;
        float fLIZJ;
        boolean z2;
        LiveState<TrackShowType> liveStateQ82;
        int iIntValue2;
        NLEResourceNode resource2;
        canvas.getClipBounds(this.LIZJ);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        TrackShowType trackShowTypeLIZJ = null;
        if (mainSegment != null && (resource2 = mainSegment.getResource()) != null) {
            resourceType = resource2.getResourceType();
        } else {
            resourceType = null;
        }
        if (resourceType == NLEResType.SOUND) {
            tuxIconDrawable = (TuxIconDrawable) this.LJIILIIL.getValue();
            z = true;
        } else {
            NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
            if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null) {
                resourceType2 = resource.getResourceType();
            } else {
                resourceType2 = null;
            }
            if (resourceType2 == NLEResType.RECORD) {
                tuxIconDrawable = (TuxIconDrawable) this.LJIILJJIL.getValue();
            } else {
                tuxIconDrawable = (TuxIconDrawable) this.LJIILL.getValue();
            }
            z = false;
        }
        this.LJ = tuxIconDrawable;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bqc, this.LIZ);
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = this.LJIIL;
            }
            this.LIZLLL.setColor(iIntValue2);
            this.LJ.LJFF(iIntValue2);
            this.LJFF.LJFF(iIntValue2);
            ((TuxIconDrawable) this.LJIJI.getValue()).LJFF(iIntValue2);
            this.LJII.LJFF(iIntValue2);
            this.LJIIIIZZ.LJFF(iIntValue2);
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bq7, this.LIZ);
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = this.LJIIL;
            }
            this.LIZLLL.setColor(iIntValue);
            this.LJ.LJFF(iIntValue);
            this.LJFF.LJFF(iIntValue);
            ((TuxIconDrawable) this.LJIJI.getValue()).LJFF(iIntValue);
            this.LJII.LJFF(iIntValue);
            this.LJIIIIZZ.LJFF(iIntValue);
        }
        if (C351220Dpo.LLLF(nLETrackSlot)) {
            this.LJ = (TuxIconDrawable) this.LJIILLIIL.getValue();
            this.LIZLLL.setColor(this.LJIIL);
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast == null) {
            return;
        }
        nLESegmentAudioDynamicCast.getVolume();
        NLEResourceNode resource3 = nLESegmentAudioDynamicCast.getResource();
        if (resource3 != null) {
            resourceType3 = resource3.getResourceType();
        } else {
            resourceType3 = null;
        }
        if (resourceType3 == NLEResType.RECORD) {
            resourceName = (String) this.LJIJ.getValue();
        } else {
            NLEResourceNode resource4 = nLESegmentAudioDynamicCast.getResource();
            if (resource4 == null || (resourceName = resource4.getResourceName()) == null) {
                resourceName = "";
            }
        }
        if (resourceName.length() == 0) {
            resourceName = nLETrackSlot.getExtra("d_bgmName");
        }
        String extra = nLETrackSlot.getExtra("extra_voice_change_effect_name");
        if (!(interfaceC368560Ecg instanceof View)) {
            return;
        }
        if (LIZLLL()) {
            if (interfaceC368560Ecg.getClipRectF().width() == 0.0f) {
                fLIZJ = ((View) interfaceC368560Ecg).getMeasuredWidth();
            } else {
                fLIZJ = interfaceC368560Ecg.getClipRectF().width();
            }
        } else {
            fLIZJ = 0.0f;
        }
        canvas.save();
        if (!a0.LJJJIL(resourceName)) {
            fLIZJ = LIZJ(canvas, resourceName, this.LJ, (View) interfaceC368560Ecg, fLIZJ);
        }
        if (extra.length() > 0) {
            fLIZJ = LIZJ(canvas, extra, (TuxIconDrawable) this.LJIJI.getValue(), (View) interfaceC368560Ecg, fLIZJ);
        }
        if (C351220Dpo.LLLFZ(nLETrackSlot) && !C351220Dpo.LLLF(nLETrackSlot)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0E5S c0e5s = this.LJIIZILJ;
        if (c0e5s != null && (liveStateQ82 = c0e5s.Q82()) != null) {
            trackShowTypeLIZJ = liveStateQ82.LIZJ();
        }
        if (trackShowTypeLIZJ != TrackShowType.NORMAL && z2) {
            fLIZJ = LIZJ(canvas, "", this.LJFF, (View) interfaceC368560Ecg, fLIZJ);
        }
        if (!a0.LJJJIL("")) {
            LIZJ(canvas, "", this.LJII, (View) interfaceC368560Ecg, fLIZJ);
        }
        canvas.restore();
    }
}
