package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368250EcB extends View {
    public List<C368430EcT> LL;
    public float LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public long LLILZIL;
    public final Rect LLILZLL;
    public final Rect LLIZ;
    public final C01GW LLIZLLLIL;
    public final int LLJ;
    public final Path LLJI;
    public final RectF LLJIJIL;
    public Bitmap LLJILJIL;
    public NLECurveSpeedCalculator LLJILJILJ;
    public Function2<? super String, ? super Integer, Bitmap> LLJILLL;
    public final Rect LLJJ;
    public int LLJJI;
    public float LLJJIII;

    public final Function2<String, Integer, Bitmap> getFrameFetcher() {
        return this.LLJILLL;
    }

    public final int getFrameWidth() {
        return this.LLILLL;
    }

    public final int getMaxRepeatCount() {
        return this.LLJJI;
    }

    public final Rect getPreInitVisibleRect() {
        return this.LLJJ;
    }

    public final float getPxPerMs() {
        return this.LLILZ;
    }

    public final float getStepDuration() {
        return this.LLJJIII;
    }

    public C368250EcB(Context context) {
        super(context);
        this.LL = C13BV.INSTANCE;
        this.LLILLJJLI = 1000.0f;
        int iLIZ = C0FU0.LIZ(48.0f);
        this.LLILLL = iLIZ;
        this.LLILZ = iLIZ / this.LLILLJJLI;
        this.LLILZLL = new Rect();
        this.LLIZ = new Rect();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1672));
        this.LLJ = C0FU0.LIZ(4.0f);
        this.LLJI = new Path();
        this.LLJIJIL = new RectF();
        this.LLJJ = new Rect();
        this.LLJJI = 20;
        this.LLJJIII = -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368250EcB.onDraw(android.graphics.Canvas):void");
    }

    public final void setData(List<? extends NLETrackSlot> list) {
        ArrayList<C368430EcT> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (NLETrackSlot nLETrackSlot : list) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast == null) {
                return;
            } else {
                arrayList.add(C353410DtL.LIZ(nLESegmentVideoDynamicCast, nLETrackSlot));
            }
        }
        this.LL = arrayList;
        long j = 0;
        for (C368430EcT c368430EcT : arrayList) {
            j += c368430EcT.LIZJ - c368430EcT.LJFF;
        }
        this.LLILZIL = j;
        requestLayout();
        invalidate();
    }

    public final void setFrameFetcher(Function2<? super String, ? super Integer, Bitmap> function2) {
        this.LLJILLL = function2;
    }

    public final void setFrameWidth(int i) {
        this.LLILLL = i;
    }

    public final void setMaxRepeatCount(int i) {
        this.LLJJI = i;
    }

    public final void setPxPerMs(float f) {
        this.LLILZ = f;
        this.LLILLJJLI = this.LLILLL / f;
    }

    public final void setStepDuration(float f) {
        this.LLJJIII = f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            size = View.MeasureSpec.getSize(i);
            float f = size / (this.LLILZIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            this.LLILZ = f;
            this.LLILLJJLI = this.LLILLL / f;
        } else {
            size = (int) ((this.LLILZIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * this.LLILZ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            size2 = View.MeasureSpec.getSize(i2);
        } else {
            size2 = this.LLILLL;
        }
        setMeasuredDimension(size, size2);
    }
}
