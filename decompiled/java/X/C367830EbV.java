package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367830EbV extends View {
    public final Rect LL;
    public final Path LLILLJJLI;
    public int LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final RectF LLILZLL;
    public final RectF LLIZ;
    public Function0<? extends InterfaceC367710EbJ> LLIZLLLIL;
    public InterfaceC367710EbJ LLJ;
    public InterfaceC369240Edm LLJI;
    public final List<Pair<Long, Float>> LLJIJIL;
    public final List<NLETrackSlot> LLJILJIL;
    public Rect LLJILJILJ;
    public final C01GW LLJILLL;
    public List<Integer> LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public Function1<? super ArrayList<Float>, Float> LLJJIJI;

    private final InterfaceC367710EbJ getAudioWavePainter() {
        Function0<? extends InterfaceC367710EbJ> function0;
        if (this.LLJ == null && (function0 = this.LLIZLLLIL) != null) {
            this.LLJ = function0.invoke();
        }
        return this.LLJ;
    }

    private final TextPaint getDefaultTextPaint() {
        return (TextPaint) this.LLJJIII.getValue();
    }

    private final Rect getLinerBoundsRect() {
        Rect rect = new Rect();
        int iWidth = 0;
        if (!a0.LJJJIL("Sound thread")) {
            getDefaultTextPaint().getTextBounds("Sound thread", 0, 12, rect);
            iWidth = rect.width();
        }
        int iLIZ = rect.left + iWidth + C0FU0.LIZ(44.0f);
        Rect rect2 = this.LL;
        rect.left = rect2.left;
        rect.top = rect2.top;
        int i = rect2.right;
        if (iLIZ > i) {
            iLIZ = i;
        }
        rect.right = iLIZ;
        rect.bottom = rect2.bottom;
        return rect;
    }

    public final long getEndTime() {
        if (((ArrayList) this.LLJILJIL).isEmpty()) {
            return 0L;
        }
        Iterator<NLETrackSlot> it2 = this.LLJILJIL.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        long measuredEndTime = it2.next().getMeasuredEndTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = measuredEndTime / j;
        while (it2.hasNext()) {
            long measuredEndTime2 = it2.next().getMeasuredEndTime() / j;
            if (j2 < measuredEndTime2) {
                j2 = measuredEndTime2;
            }
        }
        return j2;
    }

    public final long getStartTime() {
        if (((ArrayList) this.LLJILJIL).isEmpty()) {
            return 0L;
        }
        Iterator<NLETrackSlot> it2 = this.LLJILJIL.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        long measuredStartTime = it2.next().getMeasuredStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = measuredStartTime / j;
        while (it2.hasNext()) {
            long measuredStartTime2 = it2.next().getMeasuredStartTime() / j;
            if (j2 > measuredStartTime2) {
                j2 = measuredStartTime2;
            }
        }
        return j2;
    }

    public final InterfaceC369240Edm getAudioCollectionLabelPainter$editor_trackpanel_release() {
        return this.LLJI;
    }

    public final Function0<InterfaceC367710EbJ> getAudioWavePainterCreator$editor_trackpanel_release() {
        return this.LLIZLLLIL;
    }

    public final Function1<ArrayList<Float>, Float> getOnCalcCollectionSingleHeight$editor_trackpanel_release() {
        return this.LLJJIJI;
    }

    public C367830EbV(Context context) {
        super(context, null, 0);
        this.LL = new Rect();
        this.LLILLJJLI = new Path();
        InterfaceC368720Ecw.LJLLLLLL.getClass();
        this.LLILLL = (int) C367890Ebb.LIZIZ;
        Paint paint = new Paint();
        this.LLILZ = paint;
        this.LLILZIL = new Paint();
        this.LLILZLL = new RectF();
        this.LLIZ = new RectF();
        this.LLJI = new InterfaceC369240Edm(this) { // from class: X.0EbC
            public final C367830EbV LIZ;
            public final Context LIZIZ;
            public final int LIZJ = ColorProtector.parseColor("#33FFFFFF");
            public final Paint LIZLLL;
            public final Rect LJ;
            public final TextPaint LJFF;

            {
                this.LIZ = this;
                this.LIZIZ = this.getContext();
                Paint paint2 = new Paint();
                this.LIZLLL = paint2;
                this.LJ = new Rect();
                TextPaint textPaint = new TextPaint();
                this.LJFF = textPaint;
                paint2.setAntiAlias(true);
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(C367650EbD.LLJIJIL);
                textPaint.setStrokeWidth(C0FU0.LIZ(1.0f));
                textPaint.setStyle(Paint.Style.FILL);
            }

            @Override // X.InterfaceC369240Edm
            public final void LIZ(Canvas canvas, C367830EbV c367830EbV) {
                String string = this.LIZIZ.getString(2131833428);
                Paint paint2 = this.LIZLLL;
                int i = C367740EbM.LIZ;
                paint2.setColor(C367740EbM.LIZ(this.LIZ.getAlpha(), this.LIZJ));
                Drawable drawable = this.LIZIZ.getDrawable(R.drawable.c0c);
                if (drawable != null) {
                    canvas.drawRoundRect(C0FU0.LIZ(4.0f), C0FU0.LIZ(4.0f), this.LJ.width() + C0FU0.LIZ(22.0f), C0FU0.LIZ(20.0f), C0FU0.LIZ(2.0f), C0FU0.LIZ(2.0f), this.LIZLLL);
                    drawable.setBounds(C0FU0.LIZ(6.0f), C0FU0.LIZ(6.0f), C0FU0.LIZ(18.0f), C0FU0.LIZ(18.0f));
                    drawable.draw(canvas);
                    this.LJFF.setTextSize(C367650EbD.LLJ);
                    this.LJFF.getTextBounds(string, 0, string.length(), this.LJ);
                    this.LJFF.setColor(C367740EbM.LIZ(this.LIZ.getAlpha(), -1));
                    canvas.drawText(string, C0FU0.LIZ(18.0f), C0FU0.LIZ(15.0f), this.LJFF);
                }
            }
        };
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new ArrayList();
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 0));
        this.LLJJ = C13BV.INSTANCE;
        this.LLJJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(1));
        this.LLJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(0));
        this.LLJJIJI = AFwS229S0000000_2.get$arr$(1);
        paint.setAntiAlias(true);
        paint.setTextSize(C367650EbD.LLJIJIL);
    }

    public final void LIZIZ(Map<NLETrackSlot, C369110EdZ> map) {
        int i;
        int iLIZ;
        int iLIZ2;
        int startTime = (int) getStartTime();
        Set<NLETrackSlot> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((NLENode) obj).hasExtra("audio_stick_points")) {
                arrayList.add(obj);
            }
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(arrayList);
        if (nLETrackSlot != null) {
            String extra = nLETrackSlot.getExtra("audio_stick_points");
            int iLIZ3 = C352310DrZ.LIZ(nLETrackSlot.getStartTime());
            if (iLIZ3 > startTime) {
                i = iLIZ3 - startTime;
            } else {
                i = 0;
            }
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                iLIZ = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipStart());
            } else {
                iLIZ = 0;
            }
            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast2 != null) {
                iLIZ2 = C352310DrZ.LIZ(nLESegmentAudioDynamicCast2.getTimeClipEnd());
            } else {
                iLIZ2 = 0;
            }
            int i2 = C367650EbD.LLILZLL;
            List listLIZ = C122600dM.LIZ(extra);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listLIZ) {
                int iIntValue = ((Number) obj2).intValue();
                if (iLIZ <= iIntValue && iIntValue <= iLIZ2) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf((((Number) it2.next()).intValue() - iLIZ) + i));
            }
            this.LLJJ = arrayList3;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int color;
        float f;
        View view;
        InterfaceC367710EbJ audioWavePainter;
        View view2;
        int iLIZIZ;
        if (getParent() == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (((Boolean) this.LLJJI.getValue()).booleanValue()) {
            if (measuredHeight > C360610EBv.LJ + 1) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            this.LLILLL = iLIZIZ;
        }
        canvas.getClipBounds(this.LL);
        this.LLILZLL.set(this.LL);
        this.LLILLJJLI.reset();
        Path path = this.LLILLJJLI;
        RectF rectF = this.LLILZLL;
        float f2 = this.LLILLL;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CCW);
        canvas.clipPath(this.LLILLJJLI);
        Typeface typeface = C368130Ebz.LIZ;
        Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bq_));
        if (numLIZIZ != null) {
            color = numLIZIZ.intValue();
        } else {
            color = ColorProtector.parseColor("#343434");
        }
        Paint paint = this.LLILZ;
        int i = C367740EbM.LIZ;
        paint.setColor(C367740EbM.LIZ(getAlpha(), color));
        RectF rectF2 = this.LLILZLL;
        float f3 = this.LLILLL;
        canvas.drawRoundRect(rectF2, f3, f3, this.LLILZ);
        InterfaceC367710EbJ audioWavePainter2 = getAudioWavePainter();
        if (audioWavePainter2 != null) {
            audioWavePainter2.LIZIZ(0.0f, 0.0f, 1.0f);
        }
        InterfaceC367710EbJ audioWavePainter3 = getAudioWavePainter();
        int scrollX = 0;
        if (audioWavePainter3 != null) {
            audioWavePainter3.LJFF(0.0f, 0, 0);
        }
        float measuredWidth = getMeasuredWidth();
        Object parent = getParent();
        if ((parent instanceof C368630Ecn) && (view2 = (View) parent) != null) {
            scrollX = view2.getScrollX();
        }
        float f4 = scrollX;
        int i2 = C368630Ecn.LLLLJI;
        getContext();
        float fLIZ = C369020EdQ.LIZ() + f4;
        float left = getLeft() + getTranslationX();
        if (f4 > left) {
            f = f4 - left;
        } else {
            f = 0.0f;
        }
        if (fLIZ < measuredWidth) {
            measuredWidth = fLIZ;
        }
        if (((Boolean) this.LLJILLL.getValue()).booleanValue()) {
            Rect rect = this.LL;
            this.LLIZ.set(rect.left, 0.0f, rect.right, getMeasuredHeight());
        } else {
            this.LLIZ.set(f, 0.0f, measuredWidth, getMeasuredHeight());
        }
        InterfaceC367710EbJ audioWavePainter4 = getAudioWavePainter();
        if (audioWavePainter4 != null) {
            audioWavePainter4.LIZLLL(canvas, this.LLIZ, this.LLJIJIL, C360610EBv.LIZJ(), EnumC367660EbE.MUSIC, getMeasuredWidth());
        }
        if ((!this.LLJJ.isEmpty()) && (audioWavePainter = getAudioWavePainter()) != null) {
            audioWavePainter.LJ(canvas, this.LLIZ, this.LLJJ, C360610EBv.LIZJ(), getMeasuredWidth());
        }
        int iLIZ = C446980Hfs.LIZ(getContext(), R.color.lz);
        int iLIZ2 = C446980Hfs.LIZ(getContext(), R.color.ly);
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = getLinerBoundsRect();
        }
        Rect rect2 = this.LLJILJILJ;
        if (rect2 != null) {
            this.LLILZIL.setShader(new LinearGradient(rect2.left, 0.0f, rect2.right, 0.0f, iLIZ, iLIZ2, Shader.TileMode.CLAMP));
            RectF rectF3 = new RectF(rect2);
            float f5 = this.LLILLL;
            canvas.drawRoundRect(rectF3, f5, f5, this.LLILZIL);
        }
        InterfaceC369240Edm interfaceC369240Edm = this.LLJI;
        Object parent2 = getParent();
        if ((parent2 instanceof View) && (view = (View) parent2) != null) {
            view.getScrollX();
        }
        interfaceC369240Edm.LIZ(canvas, this);
    }

    public final void setAudioCollectionLabelPainter$editor_trackpanel_release(InterfaceC369240Edm interfaceC369240Edm) {
        this.LLJI = interfaceC369240Edm;
    }

    public final void setAudioWavePainterCreator$editor_trackpanel_release(Function0<? extends InterfaceC367710EbJ> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setOnCalcCollectionSingleHeight$editor_trackpanel_release(Function1<? super ArrayList<Float>, Float> function1) {
        this.LLJJIJI = function1;
    }

    public final void LIZ(Map<NLETrackSlot, C369110EdZ> map, Map<String, ArrayList<Pair<Long, Float>>> map2) {
        NLESegmentAudio nLESegmentAudio;
        ((ArrayList) this.LLJILJIL).clear();
        List<NLETrackSlot> list = this.LLJILJIL;
        Set<NLETrackSlot> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (C351220Dpo.LLILLIZIL((NLETrackSlot) obj)) {
                arrayList.add(obj);
            }
        }
        ((ArrayList) list).addAll(C13LP.LLIIII(arrayList));
        ((ArrayList) this.LLJIJIL).clear();
        long startTime = getStartTime();
        long j = 33;
        int endTime = (int) ((getEndTime() - startTime) / j);
        for (int i = 0; i < endTime; i++) {
            long j2 = i * 33;
            long j3 = startTime + j2;
            ArrayList arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : this.LLJILJIL) {
                ArrayList<Pair<Long, Float>> arrayList3 = map2.get(nLETrackSlot.getUUID());
                float fFloatValue = 0.0f;
                if (arrayList3 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) != null) {
                    long startTime2 = nLETrackSlot.getStartTime();
                    long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                    if (j3 >= startTime2 / j4 && j3 <= nLETrackSlot.getEndTime() / j4) {
                        long startTime3 = (j3 - (nLETrackSlot.getStartTime() / j4)) + (nLESegmentAudio.getTimeClipStart() / j4);
                        int i2 = (int) (startTime3 / j);
                        int i3 = i2 + 1;
                        if (i2 > 0 && arrayList3.size() > i2 && arrayList3.size() > i3) {
                            Pair pair = (Pair) ListProtector.get(arrayList3, i2);
                            float fFloatValue2 = (((Number) ((Pair) ListProtector.get(arrayList3, i3)).getSecond()).floatValue() - ((Number) pair.getSecond()).floatValue()) / (((Number) r1.getFirst()).longValue() - ((Number) pair.getFirst()).longValue());
                            fFloatValue = (fFloatValue2 * startTime3) + (((Number) pair.getSecond()).floatValue() - (((Number) pair.getFirst()).floatValue() * fFloatValue2));
                        } else if (arrayList3.size() - 1 == i2) {
                            fFloatValue = ((Number) ((Pair) ListProtector.get(arrayList3, i2)).getSecond()).floatValue();
                        }
                    }
                }
                arrayList2.add(Float.valueOf(fFloatValue));
            }
            ((ArrayList) this.LLJIJIL).add(new Pair(Long.valueOf(j2), Float.valueOf(this.LLJJIJI.invoke(arrayList2).floatValue())));
        }
    }
}
