package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367620EbA extends AbstractC368090Ebv {
    public final C368390EcP LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public RectF LLJJ;
    public float LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public final Paint LLJJIJIIJIL;
    public final Rect LLJJIJIL;
    public final RectF LLJJJ;
    public final Rect LLJJJIL;
    public InterfaceC367810EbT LLJJJJ;
    public EnumC367680EbG LLJJJJJIL;
    public Function2<? super String, ? super Integer, Bitmap> LLJJJJLIIL;
    public Bitmap LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public NLECurveSpeedCalculator LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final Path LLJLL;
    public final C01GW LLJLLIL;
    public InterfaceC367590Eb7 LLJLLL;

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        return true;
    }

    private final C367540Eb2 getOldTrackViewModel() {
        return (C367540Eb2) this.LLJLLIL.getValue();
    }

    private final InterfaceC367590Eb7 getTrackViewModel() {
        InterfaceC367590Eb7 interfaceC367590Eb7 = this.LLJLLL;
        return interfaceC367590Eb7 == null ? getOldTrackViewModel() : interfaceC367590Eb7;
    }

    public final boolean LJIIL() {
        return ((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC368560Ecg
    public final boolean LJII() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public int getBgColor() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC368090Ebv
    public int getBgRadius() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC368090Ebv
    public float getClipLength() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public RectF getClipRectF() {
        return this.LLJJ;
    }

    public final C368390EcP getConfig() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC368090Ebv
    public boolean getDrawDivider() {
        return this.LLJILJIL;
    }

    public final EnumC367680EbG getLabelType() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC368090Ebv
    public float getTimelineScale() {
        return this.LLJJI;
    }

    public final InterfaceC367590Eb7 getTrackViewModelCompat() {
        return this.LLJLLL;
    }

    public C367620EbA(C19EG c19eg) {
        super(c19eg, null, 0);
        new C368200Ec6(this, c19eg);
        this.LLJIJIL = C368130Ebz.LIZ(c19eg);
        this.LLJILJIL = true;
        this.LLJJ = new RectF();
        this.LLJJI = C360610EBv.LIZJ();
        this.LLJJIJIIJIL = new Paint();
        this.LLJJIJIL = new Rect();
        this.LLJJJ = new RectF();
        this.LLJJJIL = new Rect();
        this.LLJJJJ = new InterfaceC367810EbT(this) { // from class: X.0EbY
            public static final int LJII = C0FU0.LIZ(30.0f);
            public static final int LJIIIIZZ = C0FU0.LIZ(12.0f);
            public static final int LJIIIZ = C0FU0.LIZ(24.0f);
            public static final int LJIIJ = C0FU0.LIZ(16.0f);
            public static final int LJIIJJI = C0FU0.LIZ(2.0f);
            public static final int LJIIL = C0FU0.LIZ(4.0f);
            public static final int LJIILIIL = C0FU0.LIZ(2.0f);
            public static final int LJIILJJIL = C0FU0.LIZ(1.0f);
            public static final int LJIILL = C0FU0.LIZ(3.0f);
            public static final int LJIILLIIL = ColorProtector.parseColor("#66101010");
            public final C367620EbA LIZ;
            public final Context LIZIZ;
            public final Path LIZJ = new Path();
            public final Paint LIZLLL;
            public final Paint LJ;
            public final Rect LJFF;
            public NLETrackSlot LJI;

            @Override // X.InterfaceC367810EbT
            public final void LIZ(C367200EaU c367200EaU) {
            }

            {
                this.LIZ = this;
                this.LIZIZ = this.getContext();
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                this.LIZLLL = paint;
                Paint paint2 = new Paint();
                paint2.setColor(-1);
                paint2.setAntiAlias(true);
                paint2.setTextSize(C0FU0.LIZ(8.0f));
                paint2.setStyle(Paint.Style.FILL);
                this.LJ = paint2;
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setColor(ColorProtector.parseColor("#6603bac8"));
                this.LJFF = new Rect();
            }

            public final float LIZLLL(Canvas canvas, Drawable drawable, String str, float f) {
                float f2 = LJIIJJI;
                float f3 = LJIIJ;
                this.LJ.setTypeface(Typeface.DEFAULT);
                float fMeasureText = LJIIIZ + f + this.LJ.measureText(str);
                LIZJ(canvas, f, f2, fMeasureText, f2 + f3, EnumC367870EbZ.LL);
                canvas.save();
                float f4 = LJIIL + f;
                canvas.translate(f4, LJIILIIL + f2);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(canvas);
                canvas.restore();
                canvas.drawText(str, f4 + drawable.getIntrinsicWidth() + LJIILJJIL, f2 + (((f3 - this.LJ.descent()) - this.LJ.ascent()) / 2.0f), this.LJ);
                return fMeasureText - f;
            }

            @Override // X.InterfaceC367810EbT
            public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
                float f;
                float clipLength;
                float f2;
                int i2;
                NLEFilter audioFilter;
                NLESegmentFilter segment;
                String filterName;
                Drawable drawableLIZIZ;
                Float fValueOf;
                Drawable drawableLIZIZ2;
                float fLIZLLL;
                this.LJI = nLETrackSlot;
                float left = this.LIZ.getLeft() + this.LIZ.getClipStart();
                float f3 = i;
                if (f3 > left) {
                    f = f3 - left;
                } else {
                    f = 0.0f;
                }
                if (this.LIZ.getClipLength() == 0.0f) {
                    this.LIZ.getMeasuredWidth();
                } else {
                    this.LIZ.getClipLength();
                    this.LIZ.getClipStart();
                }
                int i3 = C368630Ecn.LLLLJI;
                C369020EdQ.LIZ();
                this.LIZ.getClipStart();
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (C367720EbK.LIZ[this.LIZ.getLabelType().ordinal()] == 1) {
                    float f4 = LJIILL;
                    float f5 = f + f4;
                    C367620EbA c367620EbA = this.LIZ;
                    float clipStart = c367620EbA.getClipStart();
                    if (c367620EbA.getClipLength() == 0.0f) {
                        clipLength = (nLETrackSlot.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * c367620EbA.getTimelineScale();
                    } else {
                        clipLength = c367620EbA.getClipLength();
                    }
                    long timelineScale = (long) ((clipLength - clipStart) / c367620EbA.getTimelineScale());
                    float f6 = LJIIJJI;
                    float f7 = f6 + LJIIJ;
                    float f8 = LJII;
                    float f9 = 0.0f - f8;
                    if (f9 < 0.0f) {
                        f2 = f8 + f5;
                        f9 = f5;
                    } else {
                        f2 = 0.0f;
                    }
                    LIZJ(canvas, f9, f6, f2, f7, EnumC367870EbZ.LLILLJJLI);
                    String strLIZ = C367880Eba.LIZ(timelineScale);
                    this.LJ.getTextBounds(strLIZ, 0, strLIZ.length(), this.LJFF);
                    this.LJ.setTypeface(Typeface.DEFAULT_BOLD);
                    canvas.drawText(strLIZ, f9 + ((r12 - this.LJFF.width()) / 2.0f), f6 + (((LJIIIIZZ - this.LJ.descent()) - this.LJ.ascent()) / 2.0f), this.LJ);
                    float f10 = f5 + (f2 - f5) + f4;
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
                    if (!C351220Dpo.LLJJIJIL(nLETrackSlot) && (drawableLIZIZ2 = C800330VaR.LIZIZ(this.LIZIZ, R.drawable.c2l)) != null) {
                        if (c367900Ebc.LIZIZ == 0) {
                            float f11 = c367900Ebc.LIZ;
                            if (f11 != 1.0f) {
                                fLIZLLL = LIZLLL(canvas, drawableLIZIZ2, C786410Ut5.k4(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1)), f10);
                            }
                        } else {
                            fLIZLLL = LIZLLL(canvas, drawableLIZIZ2, c367900Ebc.LIZJ, f10);
                        }
                        if (fLIZLLL > 0.0f) {
                            f10 += fLIZLLL + f4;
                        }
                    }
                    if (nLETrackSlot.getAudioFilter() != null && (audioFilter = nLETrackSlot.getAudioFilter()) != null && (segment = audioFilter.getSegment()) != null && (filterName = segment.getFilterName()) != null && filterName.length() != 0 && (drawableLIZIZ = C800330VaR.LIZIZ(this.LIZIZ, R.drawable.c3x)) != null && (fValueOf = Float.valueOf(LIZLLL(canvas, drawableLIZIZ, filterName, f10))) != null) {
                        fValueOf.floatValue();
                    }
                }
            }

            public final void LIZJ(Canvas canvas, float f, float f2, float f3, float f4, EnumC367870EbZ enumC367870EbZ) {
                float f5;
                if (enumC367870EbZ == EnumC367870EbZ.LL) {
                    InterfaceC368720Ecw.LJLLLLLL.getClass();
                    f5 = C367890Ebb.LIZIZ;
                } else {
                    InterfaceC368720Ecw.LJLLLLLL.getClass();
                    f5 = -C367890Ebb.LIZIZ;
                    f3 = f;
                    f = f3;
                }
                this.LIZJ.reset();
                this.LIZJ.moveTo(f, f2);
                float f6 = f3 - f5;
                this.LIZJ.lineTo(f6, f2);
                Path path = this.LIZJ;
                InterfaceC368720Ecw.LJLLLLLL.getClass();
                float f7 = C367890Ebb.LIZIZ;
                path.quadTo(f3, f2, f3, f2 + f7);
                this.LIZJ.lineTo(f3, f4 - f7);
                this.LIZJ.quadTo(f3, f4, f6, f4);
                this.LIZJ.lineTo(f, f4);
                this.LIZJ.close();
                this.LIZLLL.setColor(LJIILLIIL);
                canvas.drawPath(this.LIZJ, this.LIZLLL);
                this.LIZJ.reset();
            }
        };
        this.LLJJJJJIL = EnumC367680EbG.NONE;
        this.LLJL = "";
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(c19eg, 1076));
        this.LLJLL = new Path();
        this.LLJLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(301));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367620EbA.LJI(android.graphics.Canvas):void");
    }

    @Override // X.AbstractC368090Ebv, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLJILJILJ) {
            setBgRadius(LJIIJ(getTrackViewModel().LIZIZ()));
            LJI(canvas);
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgColor(int i) {
        this.LLJJIII = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgRadius(int i) {
        this.LLJJIJI = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipLength(float f) {
        this.LLJILLL = f;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipRectF(RectF rectF) {
        this.LLJJ = rectF;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setDrawDivider(boolean z) {
        if (this.LLJILJIL != z) {
            this.LLJILJIL = z;
            invalidate();
        }
    }

    public final void setFrameFetcher$editor_trackpanel_release(Function2<? super String, ? super Integer, Bitmap> function2) {
        this.LLJJJJLIIL = function2;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setItemSelected(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(InterfaceC367810EbT interfaceC367810EbT) {
        this.LLJJJJ = interfaceC367810EbT;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setSegment(NLETrackSlot nLETrackSlot) {
        super.setSegment(nLETrackSlot);
        setNleTrackSlot$editor_trackpanel_release(nLETrackSlot);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        VecNLEPointSPtr seqCurveSpeedPoints = nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints();
        if (!seqCurveSpeedPoints.isEmpty()) {
            NLECurveSpeedCalculator nLECurveSpeedCalculator = new NLECurveSpeedCalculator(seqCurveSpeedPoints);
            this.LLJLIL = nLECurveSpeedCalculator;
            nLECurveSpeedCalculator.setSeqDuration(nLETrackSlot.getDuration());
        } else {
            this.LLJLIL = null;
        }
        this.LLJJL = null;
        if (this.LLJILJILJ) {
            ViewGroup parentView = getParentView();
            if (parentView != null) {
                parentView.invalidate();
            }
        } else {
            invalidate();
        }
        this.LLJJLIIIJLLLLLLLZ = C351220Dpo.LLJJIJIL(nLETrackSlot);
        C370720EgA.LIZ.getClass();
        this.LLJL = C370720EgA.LIZIZ(nLETrackSlot);
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setTimelineScale(float f) {
        this.LLJJI = f;
    }

    public final void setTrackViewModelCompat(InterfaceC367590Eb7 interfaceC367590Eb7) {
        this.LLJLLL = interfaceC367590Eb7;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        invalidate();
    }
}
