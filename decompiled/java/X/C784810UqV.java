package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784810UqV extends ConstraintLayout {
    public int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    private final View getNetworkView() {
        return (View) this.LLILZIL.getValue();
    }

    private final View getViewLikeCount() {
        return (View) this.LLILLJJLI.getValue();
    }

    private final View getViewLiveStatus() {
        return (View) this.LLILLL.getValue();
    }

    private final View getViewLiveTime() {
        return (View) this.LLILZ.getValue();
    }

    public final void e0(float f) {
        View viewLikeCount = getViewLikeCount();
        if (viewLikeCount != null) {
            C786410Ut5.T4(viewLikeCount, f);
            if (f <= 0.0f) {
                C439101nJ.LJI(viewLikeCount);
            } else {
                C12ES.LJIILL(0, viewLikeCount);
            }
        }
    }

    public final void h0(float f) {
        int measuredWidth;
        float f2;
        View viewLiveStatus = getViewLiveStatus();
        if (viewLiveStatus != null) {
            C786410Ut5.T4(viewLiveStatus, f);
        }
        View viewLiveStatus2 = getViewLiveStatus();
        if (viewLiveStatus2 != null) {
            measuredWidth = viewLiveStatus2.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        float fLIZIZ = measuredWidth + C497740JfY.LIZIZ(4);
        if (C497740JfY.LJJ()) {
            f2 = fLIZIZ * (1.0f - f);
        } else {
            f2 = -(fLIZIZ * (1.0f - f));
        }
        View networkView = getNetworkView();
        if (networkView != null) {
            C786410Ut5.Jc(networkView, f2);
        }
        View viewLiveTime = getViewLiveTime();
        if (viewLiveTime != null) {
            C786410Ut5.Jc(viewLiveTime, f2);
        }
    }

    public final void setPercentWidth(int i) {
        this.LL = i;
        postInvalidate();
    }

    public C784810UqV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6 A[PHI: r6
      0x00d6: PHI (r6v3 float) = (r6v2 float), (r6v4 float) binds: [B:49:0x00c0, B:51:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784810UqV.onMeasure(int, int):void");
    }

    public C784810UqV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = 100;
        this.LLILLJJLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 74));
        this.LLILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 75));
        this.LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 76));
        this.LLILZIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 73));
    }
}
