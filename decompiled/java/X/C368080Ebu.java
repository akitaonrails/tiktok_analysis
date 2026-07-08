package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368080Ebu extends View {
    public static final float LLILZLL;
    public final Paint LL;
    public final List<NLETrackSlot> LLILLJJLI;
    public final float LLILLL;
    public long LLILZ;
    public final C01GW LLILZIL;

    static {
        LLILZLL = C368130Ebz.LJII ? C0FU0.LIZ(1.5f) : C0FU0.LIZ(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = C368690Ect.LJIIJ / 2.0f;
        long j = -1;
        for (NLETimeSpaceNode nLETimeSpaceNode : (ArrayList) this.LLILLJJLI) {
            long startTime = nLETimeSpaceNode.getStartTime();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j3 = startTime / j2;
            long endTime = nLETimeSpaceNode.getEndTime() / j2;
            float f2 = this.LLILLL / 2;
            if (j3 >= j) {
                j = j3;
            } else if (j <= endTime) {
            }
            if (((Boolean) this.LLILZIL.getValue()).booleanValue()) {
                canvas.drawLine((getMeasuredWidth() - (endTime * C360610EBv.LIZJ())) - f, f2, (getMeasuredWidth() - (j * C360610EBv.LIZJ())) - f, f2, this.LL);
            } else {
                canvas.drawLine((j * C360610EBv.LIZJ()) + f, f2, (endTime * C360610EBv.LIZJ()) + f, f2, this.LL);
            }
            j = endTime;
        }
    }

    public final void setLineColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public final void setTrackList(List<C350030Dnt> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        this.LLILZ = 0L;
        Iterator<C350030Dnt> it2 = list.iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it2.next().LIZLLL) {
                ((ArrayList) this.LLILLJJLI).add(nLETrackSlot);
                this.LLILZ = Math.max(this.LLILZ, nLETrackSlot.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
        }
        ArrayList arrayList = (ArrayList) this.LLILLJJLI;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(47));
        }
        requestLayout();
        invalidate();
    }

    public C368080Ebu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LL = paint;
        this.LLILLJJLI = new ArrayList();
        float f = LLILZLL;
        this.LLILLL = f;
        int color = getResources().getColor(R.color.sp);
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1629));
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZJ;
        int size;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            iLIZJ = View.MeasureSpec.getSize(i);
        } else {
            iLIZJ = (int) ((this.LLILZ * C360610EBv.LIZJ()) + C368690Ect.LJIIJ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = (int) this.LLILLL;
        }
        setMeasuredDimension(iLIZJ, size);
    }
}
