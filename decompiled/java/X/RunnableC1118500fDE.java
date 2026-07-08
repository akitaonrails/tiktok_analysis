package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1118500fDE extends FrameLayout implements Runnable {
    public boolean LL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public final List<View.OnTouchListener> LLIZLLLIL;
    public final C01GW LLJ;
    public Function1<? super Map<String, Long>, Unit> LLJI;

    private final Map<String, Long> getMCostTimesMap() {
        return (Map) this.LLJ.getValue();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveFrameLayout@39c9.run");
        try {
            this.LL = true;
            getMCostTimesMap().remove("traversal_start_time");
            getMCostTimesMap().put("total_traversal_times", Long.valueOf(this.LLIZ));
            Function1<? super Map<String, Long>, Unit> function1 = this.LLJI;
            if (function1 != null) {
                function1.invoke(getMCostTimesMap());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveFrameLayout@39c9.run");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerHook.viewPostDelay(this, this, ((long) PanelOpenCostTimesSetting.INSTANCE.getValue().mLimitDuration) * 1000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LL) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(this, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        long jLongValue;
        if (this.LL) {
            super.dispatchDraw(canvas);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.dispatchDraw(canvas);
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        this.LLILZLL = jUptimeMillis2;
        this.LLILZIL = jUptimeMillis2 - jUptimeMillis;
        this.LLIZ++;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        long j = this.LLILZLL - this.LLILLJJLI;
        Long l = mCostTimesMap.get("traversal_total_duration");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (j > jLongValue) {
            mCostTimesMap.put("traversal_start_time", Long.valueOf(this.LLILLJJLI));
            mCostTimesMap.put("measure_duration", Long.valueOf(this.LLILLL));
            mCostTimesMap.put("layout_duration", Long.valueOf(this.LLILZ));
            mCostTimesMap.put("draw_duration", Long.valueOf(this.LLILZIL));
            mCostTimesMap.put("traversal_end_time", Long.valueOf(this.LLILZLL));
            mCostTimesMap.put("traversal_total_duration", Long.valueOf(this.LLILZLL - this.LLILLJJLI));
            mCostTimesMap.put("current_traversal_times", Long.valueOf(this.LLIZ));
        }
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
        this.LLILZ = 0L;
        this.LLILZIL = 0L;
        this.LLILZLL = 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int size = this.LLIZLLLIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((View.OnTouchListener) ListProtector.get(this.LLIZLLLIL, size)).onTouch(this, motionEvent);
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setTraversalCallBack(Function1<? super Map<String, Long>, Unit> function1) {
        this.LLJI = function1;
    }

    public RunnableC1118500fDE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(402));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LL) {
            super.onMeasure(i, i2);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.LLILLJJLI == 0) {
            this.LLILLJJLI = jUptimeMillis;
        }
        super.onMeasure(i, i2);
        this.LLILLL += SystemClock.uptimeMillis() - jUptimeMillis;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LL) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        this.LLILZ += SystemClock.uptimeMillis() - jUptimeMillis;
    }
}
