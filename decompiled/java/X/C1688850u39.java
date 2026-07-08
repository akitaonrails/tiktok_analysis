package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0u39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1688850u39 extends FrameLayout implements InterfaceC1213420hgK {
    public View LL;
    public FrameLayout LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;

    public final void LIZIZ() {
        if (this.LLILZIL) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
            int i = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int screenHeight = (((ScreenUtils.getScreenHeight(getContext()) - this.LLILZLL) - iArr[1]) / 2) - (i / 2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = screenHeight;
            C786410Ut5.a6(this.LLILLJJLI, layoutParams);
        }
    }

    @Override // X.InterfaceC1213420hgK
    public final void LIZ(int i) {
        if (this.LLILLL != i) {
            this.LLILLL = i;
        }
    }

    public void setLoadingLayoutUsage(int i) {
        this.LLILZ = i;
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LL.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.W5(this.LL, layoutParams);
        }
    }

    public void setUseScreenHeight(int i) {
        this.LLILZIL = true;
        this.LLILZLL = i;
        LIZIZ();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C0MVY c0mvy;
        super.setVisibility(i);
        View view = this.LL;
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
        int i2 = this.LLILZ;
        if (i2 != -1) {
            C194353111z c194353111z = C194353111z.LIZ;
            if (i == 0) {
                c0mvy = C0MVY.SHOW;
            } else {
                c0mvy = C0MVY.DISMISS;
            }
            c194353111z.LIZIZ(i2, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE);
        }
    }

    public C1688850u39(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0CHQ.LIZ().getUiService().getClass();
        this.LLILLL = 0;
        this.LLILZ = -1;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fva, this, true);
        this.LL = viewTd.findViewById(R.id.g3w);
        this.LLILLJJLI = (FrameLayout) viewTd.findViewById(R.id.s8l);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
    }
}
