package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.0cRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011930cRL extends C21599719g3 {
    public C1011950cRN LLLLZI;
    public final C1011960cRO LLLLZIL;
    public AnonymousClass0956 LLLLZLL;
    public int LLLLZLLIL;
    public int LLLLZLLLI;
    public final C054G LLLZ;
    public boolean LLLZI;
    public boolean LLLZIIL;
    public boolean LLLZIL;
    public long LLLZL;
    public long LLLZLL;
    public boolean LLLZLZ;

    public final void LJJJJ() {
        this.LLLZIIL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLLLZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LLLZLZ) {
            this.LLLZLL += System.currentTimeMillis() - this.LLLZL;
            this.LLLZLZ = false;
            this.LLLZL = 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[stopAutoScroll] accumulatedPlayTime = ");
            sbLIZ.append(this.LLLZLL);
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2510609se.LIZ;
        }
    }

    public final long getCurrentPlayTime() {
        return this.LLLZLZ ? this.LLLZLL + (System.currentTimeMillis() - this.LLLZL) : this.LLLZLL;
    }

    public final int getFirstPhotoIndex() {
        int i = this.LLLLZI.LIZJ;
        if (i <= 0 || i >= this.LLLLZLLLI) {
            return 0;
        }
        return i;
    }

    public final void LJJJIL() {
        LJJJJ();
        if (this.LLLZIL) {
            return;
        }
        PagerAdapter adapter = getAdapter();
        this.LLLLZLLLI = adapter != null ? adapter.getCount() : 1;
        this.LLLLZLL = C23250099c.LIZLLL(this.LLLZ, null, null, new C1011920cRK(this, null), 3);
    }

    public final int getCurrentPhotoIndex() {
        return this.LLLLZLLIL;
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void LJJJI(C1011950cRN c1011950cRN) {
        this.LLLLZI = c1011950cRN;
        this.LLLLZLLLI = getAdapter().getCount();
        setCurrentItem(getFirstPhotoIndex());
        this.LLLLZIL.LIZ = (int) c1011950cRN.LIZ;
        LIZLLL(new C1077470e93(this, c1011950cRN, 0));
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LLLZI) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLZI) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLZI) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSupportSlide(boolean z) {
        this.LLLZI = z;
    }

    public C1011930cRL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZI = new C1011950cRN(1700L, 800L, 0);
        C1011960cRO c1011960cRO = new C1011960cRO(context);
        this.LLLLZIL = c1011960cRO;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        getCurrentItem();
        setScroller(c1011960cRO);
    }
}
