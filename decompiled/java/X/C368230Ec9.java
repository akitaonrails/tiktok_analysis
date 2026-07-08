package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ec9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368230Ec9 extends View {
    public static final int LLLILZLLLI = ColorProtector.parseColor("#99000000");
    public NLETrackSlot LL;
    public C368430EcT LLILLJJLI;
    public final Paint LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public final RectF LLJ;
    public final Rect LLJI;
    public final Path LLJIJIL;
    public final Path LLJILJIL;
    public C0E6E LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public final Paint LLJJI;
    public final Path LLJJIII;
    public final float[] LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public Function2<? super String, ? super Integer, Bitmap> LLJJJJJIL;
    public int LLJJJJLIIL;
    public float LLJJL;
    public final RectF LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final Rect LLJLLL;
    public final C01GW LLJZ;
    public Bitmap LLJZIJLIL;
    public final RectF LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public final ArrayList<Pair<Long, Long>> LLLFFI;
    public final Rect LLLFZ;
    public Bitmap LLLI;
    public Long LLLII;
    public Function0<Unit> LLLIIII;
    public Bitmap LLLIIIIL;
    public Long LLLIIIL;
    public NLECurveSpeedCalculator LLLIIL;
    public float LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public int LLLILZJ;

    private final Paint getBlackSlotPaint() {
        return (Paint) this.LLJJJIL.getValue();
    }

    private final C368390EcP getCheckBoxConfig() {
        return (C368390EcP) this.LLJLLIL.getValue();
    }

    private final Paint getDividerPaint() {
        return (Paint) this.LLJJJJ.getValue();
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LLJZ.getValue()).booleanValue();
    }

    public final int getFrameDuration() {
        int i = this.LLLILZJ;
        if (i > 0) {
            return i;
        }
        int i2 = C360610EBv.LIZ;
        return C360610EBv.LIZ;
    }

    public final float getPxMs() {
        float f = this.LLLIILIL;
        return f <= 0.0f ? C360610EBv.LIZJ() : f;
    }

    public final int getThumbHeight() {
        int i = this.LLLILZ;
        if (i > 0) {
            return i;
        }
        int i2 = C360610EBv.LIZ;
        return C360610EBv.LIZLLL;
    }

    public final int getThumbWidth() {
        int i = this.LLLIL;
        if (i > 0) {
            return i;
        }
        int i2 = C360610EBv.LIZ;
        return C360610EBv.LIZJ;
    }

    public final Bitmap getDragThumbMask() {
        return this.LLJZIJLIL;
    }

    public final boolean getEnablePreInitVisibleRect() {
        return this.LLLFF;
    }

    public final boolean getEnableShade() {
        return this.LLLF;
    }

    public final boolean getEndDivider() {
        return this.LLJLIL;
    }

    public final Bitmap getExtractedLastBitmap() {
        return this.LLLI;
    }

    public final Function2<String, Integer, Bitmap> getFrameFetcher() {
        return this.LLJJJJJIL;
    }

    public final float getHalfDivideWidth() {
        return this.LLJJL;
    }

    public final Function0<Unit> getOnBitmapFirstDrawn() {
        return this.LLLIIII;
    }

    public final int getRound() {
        return this.LLJJJJLIIL;
    }

    public final RectF getRoundRectF() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final NLETrackSlot getSlot() {
        return this.LL;
    }

    public final boolean getStartDivider() {
        return this.LLJL;
    }

    public final void LJ(float f) {
        int iLIZIZ;
        if (!Float.isNaN(f)) {
            iLIZIZ = C814420VxA.LIZIZ(f);
        } else {
            iLIZIZ = (int) f;
        }
        this.LLILZ = iLIZIZ;
        getLayoutParams().width = this.LLILZ;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ac A[PHI: r1
      0x02ac: PHI (r1v12 android.graphics.Rect) = (r1v11 android.graphics.Rect), (r1v55 android.graphics.Rect) binds: [B:99:0x0285, B:106:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instruction units count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368230Ec9.onDraw(android.graphics.Canvas):void");
    }

    public final void setAiExtendVisible(boolean z) {
        this.LLJLL = z;
    }

    public final void setDragThumbMask(Bitmap bitmap) {
        this.LLJZIJLIL = bitmap;
    }

    public final void setDrawMyTransitionOverlap(boolean z) {
        postInvalidate();
    }

    public final void setDrawPreTransitionOverlap(boolean z) {
        postInvalidate();
    }

    public final void setEnablePreInitVisibleRect(boolean z) {
        this.LLLFF = z;
    }

    public final void setEnableShade(boolean z) {
        this.LLLF = z;
    }

    public final void setEndDivider(boolean z) {
        this.LLJLIL = z;
    }

    public final void setFrameDuration(int i) {
        this.LLLILZJ = i;
    }

    public final void setFrameFetcher(Function2<? super String, ? super Integer, Bitmap> function2) {
        this.LLJJJJJIL = function2;
    }

    public final void setHalfDivideWidth(float f) {
        this.LLJJL = f;
    }

    public final void setIsFooter(boolean z) {
        this.LLJILLL = z;
        invalidate();
    }

    public final void setLastSlot(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setNeedRefresh(boolean z) {
        this.LLJJJ = z;
    }

    public final void setOnBitmapFirstDrawn(Function0<Unit> function0) {
        this.LLLIIII = function0;
    }

    public final void setPxMs(float f) {
        this.LLLIILIL = f;
    }

    public final void setRound(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setSlot(NLETrackSlot nLETrackSlot) {
        this.LL = nLETrackSlot;
    }

    public final void setStartDivider(boolean z) {
        this.LLJL = z;
    }

    public final void setThumbHeight(int i) {
        this.LLLILZ = i;
    }

    public final void setThumbWidth(int i) {
        this.LLLIL = i;
    }

    public final void setTrackStyle(C0E6E c0e6e) {
        this.LLJILJILJ = c0e6e;
        invalidate();
    }

    public C368230Ec9(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        this.LLILZ = C360610EBv.LIZJ;
        C0FU0.LIZJ(C786410Ut5.N3(C0EHL.LIZ()));
        this.LLJ = new RectF();
        this.LLJI = new Rect();
        this.LLJIJIL = new Path();
        this.LLJILJIL = new Path();
        this.LLJILJILJ = C0E6E.NONE;
        Paint paint2 = new Paint(1);
        this.LLJJI = paint2;
        this.LLJJIII = new Path();
        this.LLJJIJI = new float[8];
        this.LLJJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(330));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(331));
        this.LLJJLIIIJLLLLLLLZ = new RectF();
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1212));
        this.LLJLLL = new Rect();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setTextSize(C0FU0.LIZ(10.0f));
        paint3.setStrokeWidth(C0FU0.LIZ(1.0f));
        paint3.setTextAlign(Paint.Align.LEFT);
        paint3.setColor(-1);
        this.LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1215));
        this.LLL = new RectF();
        this.LLLFFI = new ArrayList<>();
        this.LLLFZ = new Rect();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ItemFrameView);
            this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ItemFrameView_video_frame_round, getCheckBoxConfig().LJIIIIZZ);
            this.LLJJL = C0FU0.LIZ(C368130Ebz.LJIIL);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.LLJJJJLIIL = getCheckBoxConfig().LJIIIIZZ;
            this.LLJJL = C0FU0.LIZ(C368130Ebz.LJIIL);
        }
        paint2.setColor(ColorProtector.parseColor("#66000000"));
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStyle(Paint.Style.FILL);
        Integer num = getCheckBoxConfig().LJIIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = LLLILZLLLI;
        }
        paint.setColor(iIntValue);
    }

    public final int LIZ(float f, int i) {
        long timeClipStart;
        float fLIZ;
        NLESegmentVideo nLESegmentVideo;
        NLESegmentVideo nLESegmentVideo2;
        int iLIZ = 0;
        if (this.LLLIIL == null) {
            Double dValueOf = Double.valueOf(((double) ((i * getFrameDuration()) * f)) / 1000.0d);
            if (!Double.isNaN(dValueOf.doubleValue())) {
                iLIZ = C814420VxA.LIZ(dValueOf.doubleValue());
            }
            return iLIZ * LSPassThroughRecordSizeConfig.DEFAULT;
        }
        C368430EcT c368430EcT = this.LLILLJJLI;
        if (c368430EcT != null && (nLESegmentVideo2 = c368430EcT.LIZ) != null) {
            timeClipStart = nLESegmentVideo2.getTimeClipStart();
        } else {
            timeClipStart = 0;
        }
        C368430EcT c368430EcT2 = this.LLILLJJLI;
        if (c368430EcT2 != null && (nLESegmentVideo = c368430EcT2.LIZ) != null) {
            fLIZ = C351220Dpo.LIZ(nLESegmentVideo);
        } else {
            fLIZ = 1.0f;
        }
        long jMax = Math.max(((long) ((i * getFrameDuration()) * LSPassThroughRecordSizeConfig.DEFAULT)) - ((long) (timeClipStart / fLIZ)), 0L);
        NLECurveSpeedCalculator nLECurveSpeedCalculator = this.LLLIIL;
        if (nLECurveSpeedCalculator != null) {
            iLIZ = C352310DrZ.LIZ(nLECurveSpeedCalculator.sequenceDelToSegmentDel(jMax));
        }
        return C814420VxA.LIZ(((double) (iLIZ + C352310DrZ.LIZ(timeClipStart))) / 1000.0d) * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public final void LIZLLL(long j, NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        long duration;
        long duration2;
        this.LL = nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        this.LLILLJJLI = C353410DtL.LIZ(nLESegmentVideoDynamicCast, nLETrackSlot);
        VecNLEPointSPtr seqCurveSpeedPoints = nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints();
        if (!seqCurveSpeedPoints.isEmpty()) {
            NLECurveSpeedCalculator nLECurveSpeedCalculator = new NLECurveSpeedCalculator(seqCurveSpeedPoints);
            this.LLLIIL = nLECurveSpeedCalculator;
            nLECurveSpeedCalculator.setSeqDuration(nLETrackSlot.getDuration());
        } else {
            this.LLLIIL = null;
        }
        this.LLLI = null;
        this.LLLIIII = null;
        C351510DqH.LIZ.getClass();
        if (C351510DqH.LJJIL(nLETrackSlot)) {
            Bitmap bitmapLIZIZ = LIZIZ(1.0f, NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()).getPlayResource().getResourceFile(), 0);
            this.LLLI = bitmapLIZIZ;
            if (bitmapLIZIZ != null) {
                Function0<Unit> function0 = this.LLLIIII;
                if (function0 != null) {
                    function0.invoke();
                }
                this.LLLIIII = null;
            }
        }
        this.LLLII = null;
        if (C351510DqH.LJJIL(nLETrackSlot)) {
            resource = C351510DqH.LJJIIJZLJL(nLETrackSlot);
        } else {
            resource = nLESegmentVideoDynamicCast.getResource();
        }
        if (resource != null) {
            duration2 = resource.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
            if (resource2 != null) {
                duration = resource2.getDuration();
            } else {
                duration = 0;
            }
            duration2 = duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        this.LLILZIL = duration2;
        this.LLJJIJIIJIL = C351220Dpo.LLJJIJIL(nLETrackSlot);
        this.LLILZ = C814420VxA.LIZIZ((this.LLILZIL * getPxMs()) / C351220Dpo.LIZ(NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())));
        getLayoutParams().width = this.LLILZ;
        this.LLILZLL = 0.0f;
        this.LLIZ = 0.0f;
        this.LLJJIJIL = Boolean.parseBoolean(nLETrackSlot.getExtra("is_black_frame"));
        this.LLJJ = j;
        requestLayout();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final Bitmap LIZIZ(float f, String str, int i) {
        Bitmap bitmapInvoke;
        long startTime;
        int i2 = 0;
        while (i >= 0 && i2 <= 20) {
            int iLIZ = LIZ(f, i);
            Function2<? super String, ? super Integer, Bitmap> function2 = this.LLJJJJJIL;
            if (function2 != null) {
                bitmapInvoke = function2.invoke(str, Integer.valueOf(iLIZ));
            } else {
                bitmapInvoke = null;
            }
            i--;
            i2++;
            if (bitmapInvoke != null) {
                long j = iLIZ * LSPassThroughRecordSizeConfig.DEFAULT;
                NLETrackSlot nLETrackSlot = this.LL;
                if (nLETrackSlot != null) {
                    startTime = nLETrackSlot.getStartTime();
                } else {
                    startTime = 0;
                }
                this.LLLII = Long.valueOf(j + startTime);
                if (bitmapInvoke != null) {
                    return bitmapInvoke;
                }
            }
        }
        Function2<? super String, ? super Integer, Bitmap> function22 = this.LLJJJJJIL;
        if (function22 == null) {
            return null;
        }
        return function22.invoke(str, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
