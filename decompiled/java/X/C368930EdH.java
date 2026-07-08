package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368930EdH extends AbstractC368670Ecr {
    public final RelativeLayout LLJ;
    public C368880EdC LLJI;
    public int LLJIJIL;
    public InterfaceC369080EdW LLJILJIL;

    public C368930EdH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.AbstractC368670Ecr
    public final void LIZ() {
    }

    public final long getCurTimePosition() {
        return (long) Math.floor(getScrollX() / C360610EBv.LIZJ());
    }

    public final InterfaceC369080EdW getMultiHighlightTrackListener$editor_trackpanel_release() {
        return this.LLJILJIL;
    }

    public final void setMultiHighlightTrackListener$editor_trackpanel_release(InterfaceC369080EdW interfaceC369080EdW) {
        this.LLJILJIL = interfaceC369080EdW;
    }

    public C368930EdH(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.LLJ = relativeLayout;
        int iLIZJ = C0FU0.LIZJ(C0EHL.LIZ()) / 2;
        int i2 = C368130Ebz.LIZ(context).LJFF;
        setHorizontalScrollBarEnabled(false);
        setClipChildren(false);
        addView(relativeLayout, 0, new FrameLayout.LayoutParams(-2, -2));
        int i3 = iLIZJ - i2;
        C369030EdR.LIZJ(relativeLayout, i3, 0, i3, 0);
        relativeLayout.setClipToPadding(false);
        relativeLayout.setClipChildren(false);
    }

    @Override // X.AbstractC368670Ecr, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C370920EgU c370920EgU;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LLJI != null && Math.abs(getScrollX() - this.LLJIJIL) >= C360610EBv.LIZJ * 5) {
            C368880EdC c368880EdC = this.LLJI;
            if (c368880EdC != null && (c370920EgU = c368880EdC.LLIZLLLIL) != null) {
                c370920EgU.LJFF(false);
            }
            this.LLJIJIL = getScrollX();
        }
        C368880EdC c368880EdC2 = this.LLJI;
        if (c368880EdC2 != null) {
            C354270Duj.LIZJ(0L, new AwS549S0100000_5(c368880EdC2, 1130));
        }
    }
}
