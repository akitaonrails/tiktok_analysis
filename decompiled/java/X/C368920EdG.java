package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368920EdG extends View {
    public final List<Float> LL;
    public final int LLILLJJLI;
    public AbstractC368670Ecr LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public float LLJI;
    public InterfaceC369260Edo LLJIJIL;
    public final C01GW LLJILJIL;
    public int LLJILJILJ;
    public long LLJILLL;

    public final void LIZ() {
        Iterator<Float> it2 = this.LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            float fFloatValue = it2.next().floatValue();
            float f = this.LLJILJILJ / ((this.LLJILLL / fFloatValue) / LSPassThroughRecordSizeConfig.DEFAULT);
            this.LLILZIL = f;
            if (C814420VxA.LIZIZ(f) >= this.LLILLJJLI) {
                this.LLILZ = fFloatValue;
                break;
            }
        }
        requestLayout();
    }

    private final int getScreenWidth() {
        return C0FU0.LIZJ(getContext());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC368670Ecr abstractC368670Ecr = (AbstractC368670Ecr) getParent();
        this.LLILLL = abstractC368670Ecr;
        abstractC368670Ecr.setScrollChangeListener(new AwS619S0100000_5(this, 41));
    }

    public final long getDurationTime() {
        return this.LLJILLL;
    }

    private final void setDurationWidth(int i) {
        if (this.LLJILJILJ != i && i > 0) {
            this.LLJILJILJ = i;
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int scrollX;
        super.onDraw(canvas);
        if (this.LLJILJILJ > 0 && this.LLJILLL > 0 && C814420VxA.LIZIZ(this.LLILZIL) >= this.LLILLJJLI) {
            int screenWidth = getScreenWidth() / 2;
            int scrollX2 = 0;
            if (((Boolean) this.LLJILJIL.getValue()).booleanValue()) {
                int measuredWidth = getMeasuredWidth();
                AbstractC368670Ecr abstractC368670Ecr = this.LLILLL;
                if (abstractC368670Ecr != null) {
                    scrollX2 = abstractC368670Ecr.getScrollX();
                }
                int iMin = measuredWidth + Math.min(scrollX2, -screenWidth);
                this.LLIZLLLIL = iMin;
                this.LLJ = Math.max(iMin - ((int) (((double) getScreenWidth()) * 1.5d)), screenWidth);
                this.LLIZ = (int) (((getMeasuredWidth() - screenWidth) - this.LLIZLLLIL) / this.LLILZIL);
                this.LLILZLL = (getMeasuredWidth() - screenWidth) - (this.LLIZ * this.LLILZIL);
                while (true) {
                    float f = this.LLILZLL;
                    if (f > this.LLJ) {
                        int i = this.LLIZ;
                        float f2 = i * this.LLILZ;
                        InterfaceC369260Edo interfaceC369260Edo = this.LLJIJIL;
                        if (interfaceC369260Edo != null) {
                            interfaceC369260Edo.LIZ(canvas, i, f, this.LLJI, f2);
                        }
                        this.LLILZLL -= this.LLILZIL + 0.0f;
                        this.LLIZ++;
                    } else {
                        return;
                    }
                }
            } else {
                AbstractC368670Ecr abstractC368670Ecr2 = this.LLILLL;
                if (abstractC368670Ecr2 != null) {
                    scrollX = abstractC368670Ecr2.getScrollX();
                } else {
                    scrollX = 0;
                }
                this.LLIZLLLIL = scrollX;
                int screenWidth2 = (int) (((double) scrollX) + (((double) getScreenWidth()) * 1.5d));
                this.LLJ = screenWidth2;
                int i2 = this.LLJILJILJ + screenWidth;
                if (screenWidth2 >= i2) {
                    screenWidth2 = i2;
                }
                this.LLJ = screenWidth2;
                if (this.LLIZLLLIL > screenWidth) {
                    scrollX2 = (int) ((r0 - screenWidth) / this.LLILZIL);
                }
                this.LLIZ = scrollX2;
                this.LLILZLL = screenWidth + (scrollX2 * this.LLILZIL);
                while (true) {
                    float f3 = this.LLILZLL;
                    if (f3 < this.LLJ) {
                        int i3 = this.LLIZ;
                        float f4 = i3 * this.LLILZ;
                        InterfaceC369260Edo interfaceC369260Edo2 = this.LLJIJIL;
                        if (interfaceC369260Edo2 != null) {
                            interfaceC369260Edo2.LIZ(canvas, i3, f3, this.LLJI, f4);
                        }
                        this.LLILZLL += this.LLILZIL + 0.0f;
                        this.LLIZ++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void setDurationTime(long j) {
        if (this.LLJILLL != j && j > 0) {
            this.LLJILLL = j;
            LIZ();
        }
    }

    public final void setTimeLinePaint(InterfaceC369260Edo interfaceC369260Edo) {
        this.LLJIJIL = interfaceC369260Edo;
    }

    public C368920EdG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        List<Float> listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(0.033334f), Float.valueOf(0.05f), Float.valueOf(0.083334f), Float.valueOf(0.166667f), Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.5f), Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(15.0f), Float.valueOf(30.0f), Float.valueOf(60.0f), Float.valueOf(90.0f), Float.valueOf(150.0f), Float.valueOf(300.0f), Float.valueOf(600.0f), Float.valueOf(900.0f));
        this.LL = listLJIIJJI;
        this.LLILLJJLI = C360610EBv.LIZJ / 2;
        this.LLILZ = ((Number) C13LP.LJJJJZI(listLJIIJJI)).floatValue();
        ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_EDIT_VIDEO_LIMIT_TIME_MILLIS, Long.MAX_VALUE)).longValue();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1217));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.LLJILLL;
        int i3 = C360610EBv.LIZ;
        setDurationWidth((int) (f * (C360610EBv.LIZJ / C360610EBv.LIZ)));
        setMeasuredDimension(this.LLJILJILJ + ((getScreenWidth() / 2) * 2), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJI = i2 / 2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSizeChanged::viewCenterY = ");
        sbLIZ.append(this.LLJI);
        C355090Dw3.LIZIZ("TrackRuler", C2188811AlT.LIZIZ(sbLIZ));
    }
}
