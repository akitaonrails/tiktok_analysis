package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367850EbX implements InterfaceC367810EbT {
    public static final int LJIIJ = C0FU0.LIZ(18.0f);
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static final int LJIILL;
    public static final int LJIILLIIL;
    public static final int LJIIZILJ;
    public final C19EG LIZ;
    public final Path LIZIZ = new Path();
    public final TuxIconDrawable LIZJ = LJII(R.raw.icon_speaker_x_mark_fill_ltr);
    public final TuxIconDrawable LIZLLL = LJII(R.raw.icon_speed_meter_fill);
    public final Paint LJ;
    public final C444890HcV LJFF;
    public final Rect LJI;
    public final C01GW LJII;
    public NLETrackSlot LJIIIIZZ;
    public C367620EbA LJIIIZ;

    @Override // X.InterfaceC367810EbT
    public final void LIZ(C367200EaU c367200EaU) {
    }

    static {
        LJIIJJI = C293820BfQ.LIZ() ? C0FU0.LIZ(4.0f) : C0FU0.LIZ(2.0f);
        LJIIL = C0FU0.LIZ(3.0f);
        LJIILIIL = C293820BfQ.LIZ() ? C0FU0.LIZ(6.0f) : C0FU0.LIZ(4.0f);
        LJIILJJIL = C0FU0.LIZ(4.0f);
        LJIILL = C0FU0.LIZ(24.0f);
        LJIILLIIL = C0FU0.LIZ(4.0f);
        LJIIZILJ = C0FU0.LIZ(2.0f);
    }

    public final boolean LJI() {
        return ((Boolean) this.LJII.getValue()).booleanValue();
    }

    public C367850EbX(C19EG c19eg) {
        int i;
        Integer numLIZJ;
        this.LIZ = c19eg;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LJ = paint;
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setColor(-1);
        c444890HcV.setAntiAlias(true);
        c444890HcV.setStyle(Paint.Style.FILL);
        if (C297330Bl5.LIZIZ()) {
            i = 71;
        } else {
            i = 91;
        }
        c444890HcV.LIZ(i);
        this.LJFF = c444890HcV;
        this.LJI = new Rect();
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 924));
        Integer numValueOf = Integer.valueOf(R.attr.zc);
        if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), c19eg)) != null) {
            int iIntValue = numLIZJ.intValue();
            if (C293820BfQ.LIZ()) {
                paint.setColor(iIntValue);
            } else {
                paint.setColor(1291845632);
            }
        }
    }

    public final TuxIconDrawable LJII(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        c419910GdJ.LIZIZ = C0FU0.LIZ(12.0f);
        c419910GdJ.LIZJ = C0FU0.LIZ(12.0f);
        return c419910GdJ.LIZ(this.LIZ);
    }

    public final float LJFF(float f, float f2) {
        return f + (((f2 - this.LJFF.descent()) - this.LJFF.ascent()) / 2.0f);
    }

    public final float LIZJ(NLETrackSlot nLETrackSlot, Canvas canvas, float f) {
        String string;
        float fWidth;
        float fWidth2 = f;
        if (C0E5J.LIZJ(nLETrackSlot)) {
            string = this.LIZ.getString(2131825367);
        } else if (C0E5J.LIZLLL(nLETrackSlot)) {
            string = this.LIZ.getString(2131825365);
        } else {
            string = this.LIZ.getString(2131825366);
        }
        this.LJFF.getTextBounds(string, 0, string.length(), this.LJI);
        float f2 = LJIIJJI;
        float f3 = LJIIJ;
        float f4 = f2 + f3;
        if (LJI()) {
            fWidth = (fWidth2 - (LJIILJJIL * 2)) - this.LJI.width();
        } else {
            fWidth = fWidth2;
        }
        if (!LJI()) {
            fWidth2 = (LJIILJJIL * 2) + fWidth + this.LJI.width();
        }
        LIZLLL(canvas, fWidth, f2, fWidth2, f4);
        canvas.drawText(string, LJIILJJIL + fWidth, LJFF(f2, f3), this.LJFF);
        return fWidth2 - fWidth;
    }

    public final void LIZLLL(Canvas canvas, float f, float f2, float f3, float f4) {
        InterfaceC368720Ecw.LJLLLLLL.getClass();
        float f5 = C367890Ebb.LIZIZ;
        this.LIZIZ.reset();
        float f6 = f + f5;
        this.LIZIZ.moveTo(f6, f2);
        float f7 = f3 - f5;
        this.LIZIZ.lineTo(f7, f2);
        float f8 = f2 + f5;
        this.LIZIZ.quadTo(f3, f2, f3, f8);
        float f9 = f4 - f5;
        this.LIZIZ.lineTo(f3, f9);
        this.LIZIZ.quadTo(f3, f4, f7, f4);
        this.LIZIZ.lineTo(f6, f4);
        this.LIZIZ.quadTo(f, f4, f, f9);
        this.LIZIZ.lineTo(f, f8);
        this.LIZIZ.quadTo(f, f2, f6, f2);
        this.LIZIZ.close();
        canvas.drawPath(this.LIZIZ, this.LJ);
        this.LIZIZ.reset();
    }

    @Override // X.InterfaceC367810EbT
    public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
        C367620EbA c367620EbA;
        float f;
        int i2;
        int i3;
        int i4;
        float clipLength;
        float fWidth;
        float fWidth2;
        float f2;
        float fLJ;
        float f3;
        float f4;
        this.LJIIIIZZ = nLETrackSlot;
        if ((interfaceC368560Ecg instanceof C367620EbA) && (c367620EbA = (C367620EbA) interfaceC368560Ecg) != null) {
            this.LJIIIZ = c367620EbA;
            if (LJI()) {
                f = canvas.getClipBounds().right;
            } else {
                float left = c367620EbA.getLeft() + c367620EbA.getClipStart();
                float f5 = i;
                if (f5 > left) {
                    f = f5 - left;
                } else {
                    f = 0.0f;
                }
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null && C367730EbL.LIZ[c367620EbA.getLabelType().ordinal()] == 1) {
                C367900Ebc c367900Ebc = new C367900Ebc(0);
                if (nLESegmentVideoDynamicCast.getSegCurveSpeedPoints().isEmpty() && nLESegmentVideoDynamicCast.getCurveSpeedPoints().isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                c367900Ebc.LIZIZ = i2;
                c367900Ebc.LIZ = nLESegmentVideoDynamicCast.getAbsSpeed();
                nLESegmentVideoDynamicCast.getCurveAveSpeed();
                C351510DqH.LIZ.getClass();
                c367900Ebc.LIZJ = C351510DqH.LJJI(nLETrackSlot);
                if (c367620EbA.LLJILJILJ) {
                    if (LJI()) {
                        i4 = -LJIILIIL;
                    } else {
                        i4 = LJIILIIL;
                    }
                    float f6 = f + i4;
                    float clipStart = c367620EbA.getClipStart();
                    if (c367620EbA.getClipLength() == 0.0f) {
                        clipLength = (nLETrackSlot.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * c367620EbA.getTimelineScale();
                    } else {
                        clipLength = c367620EbA.getClipLength();
                    }
                    String strLIZ = C367880Eba.LIZ((long) ((clipLength - clipStart) / c367620EbA.getTimelineScale()));
                    this.LJFF.getTextBounds(strLIZ, 0, strLIZ.length(), this.LJI);
                    int i5 = LJIIJJI;
                    float f7 = i5;
                    int i6 = LJIIJ;
                    float f8 = i6;
                    float f9 = f7 + f8;
                    if (LJI()) {
                        fWidth = (f6 - (LJIILJJIL * 2)) - this.LJI.width();
                    } else {
                        fWidth = f6;
                    }
                    if (LJI()) {
                        fWidth2 = f6;
                    } else {
                        fWidth2 = (LJIILJJIL * 2) + fWidth + this.LJI.width();
                    }
                    LIZLLL(canvas, fWidth, f7, fWidth2, f9);
                    canvas.drawText(strLIZ, LJIILJJIL + fWidth, LJFF(f7, f8), this.LJFF);
                    float f10 = fWidth2 - fWidth;
                    if (LJI()) {
                        f2 = (-f10) - LJIILIIL;
                    } else {
                        f2 = f10 + LJIILIIL;
                    }
                    float f11 = f6 + f2;
                    if (C0E5J.LIZ(nLETrackSlot)) {
                        float fLIZJ = LIZJ(nLETrackSlot, canvas, f11);
                        if (LJI()) {
                            f4 = fLIZJ - LJIILIIL;
                        } else {
                            f4 = fLIZJ + LJIILIIL;
                        }
                        f11 += f4;
                    }
                    if (!C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                        TuxIconDrawable tuxIconDrawable = this.LIZLLL;
                        if (c367900Ebc.LIZIZ == 0) {
                            float f12 = c367900Ebc.LIZ;
                            if (f12 == 1.0f) {
                                fLJ = 0.0f;
                            } else {
                                String strK4 = C786410Ut5.k4(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f12)}, 1));
                                float f13 = i5;
                                fLJ = LJ(c367620EbA, canvas, f13, f13 + i6, tuxIconDrawable, strK4, f11);
                            }
                        } else {
                            float f14 = i5;
                            fLJ = LJ(c367620EbA, canvas, f14, f14 + i6, tuxIconDrawable, c367900Ebc.LIZJ, f11);
                        }
                        if (LJI()) {
                            f3 = fLJ - LJIILIIL;
                        } else {
                            f3 = fLJ + LJIILIIL;
                        }
                        f11 += f3;
                    }
                    if (C351220Dpo.LLLFZ(nLETrackSlot) && !C351220Dpo.LLJJIJIL(nLETrackSlot) && C351220Dpo.LLI(nLETrackSlot)) {
                        LJ(c367620EbA, canvas, f7, f9, this.LIZJ, "", f11);
                        return;
                    }
                    return;
                }
                if (!C0E5J.LIZJ(nLETrackSlot) && !C0E5J.LIZLLL(nLETrackSlot) && !C0E5J.LIZ(nLETrackSlot)) {
                    return;
                }
                if (LJI()) {
                    i3 = -LJIILIIL;
                } else {
                    i3 = LJIILIIL;
                }
                LIZJ(nLETrackSlot, canvas, f + i3);
            }
        }
    }

    public final float LJ(C367620EbA c367620EbA, Canvas canvas, float f, float f2, TuxIconDrawable tuxIconDrawable, String str, float f3) {
        float f4;
        float f5;
        float f6;
        float measuredWidth = f3;
        float fMeasureText = this.LJFF.measureText(str);
        C367620EbA c367620EbA2 = this.LJIIIZ;
        if (c367620EbA2 == null || !c367620EbA2.LLJILJILJ) {
            if (LJI()) {
                measuredWidth = c367620EbA.getMeasuredWidth();
            } else {
                measuredWidth = 0.0f;
            }
        }
        if (LJI()) {
            f4 = measuredWidth - (LJIILL + fMeasureText);
        } else {
            f4 = LJIILL + measuredWidth + fMeasureText;
        }
        if (LJI()) {
            LIZLLL(canvas, f4, f, measuredWidth, f2);
        } else {
            LIZLLL(canvas, measuredWidth, f, f4, f2);
        }
        canvas.save();
        if (LJI()) {
            f5 = (measuredWidth - LJIILLIIL) - tuxIconDrawable.LJII;
        } else {
            f5 = LJIILLIIL + measuredWidth;
        }
        canvas.translate(f5, LJIIL + f);
        tuxIconDrawable.setBounds(0, 0, tuxIconDrawable.LJII, tuxIconDrawable.LJIIIIZZ);
        tuxIconDrawable.draw(canvas);
        canvas.restore();
        if (LJI()) {
            f6 = (f5 - LJIIZILJ) - fMeasureText;
        } else {
            f6 = f5 + tuxIconDrawable.LJII + LJIIZILJ;
        }
        canvas.drawText(str, f6, LJFF(f, LJIIJ), this.LJFF);
        return f4 - measuredWidth;
    }
}
