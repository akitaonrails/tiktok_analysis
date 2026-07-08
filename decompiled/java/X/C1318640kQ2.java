package X;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import android.widget.ScrollView;

/* JADX INFO: renamed from: X.0kQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318640kQ2 {
    public final boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final View LIZLLL;
    public int LJ;
    public int LJFF;
    public final C1317550kOH LJI;

    public final void LIZ() {
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (this.LIZ) {
            View view = this.LIZLLL;
            if (view instanceof C1318620kQ0) {
                C1318620kQ0 c1318620kQ0 = (C1318620kQ0) view;
                if (this.LIZIZ) {
                    c1318620kQ0.LIZIZ(scrollX, this.LJFF);
                    this.LIZIZ = false;
                    return;
                } else {
                    if (this.LIZJ) {
                        c1318620kQ0.LIZIZ(scrollX, this.LJFF);
                        this.LIZJ = false;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        View view2 = this.LIZLLL;
        if (view2 instanceof C1318610kPz) {
            C1318610kPz c1318610kPz = (C1318610kPz) view2;
            if (this.LIZIZ) {
                c1318610kPz.LIZJ(this.LJFF, scrollY);
                this.LIZIZ = false;
            } else if (this.LIZJ) {
                c1318610kPz.LIZJ(this.LJFF, scrollY);
                this.LIZJ = false;
            }
        }
    }

    public final boolean LIZIZ() {
        OverScroller vScroller;
        OverScroller hScroller;
        if (this.LIZ) {
            View view = this.LIZLLL;
            return (!(view instanceof C1318620kQ0) || (vScroller = ((C1318620kQ0) view).getVScroller()) == null || vScroller.isFinished()) ? false : true;
        }
        View view2 = this.LIZLLL;
        return (!(view2 instanceof C1318610kPz) || (hScroller = ((C1318610kPz) view2).getHScroller()) == null || hScroller.isFinished()) ? false : true;
    }

    public final void LJ(int i) {
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (1 == i) {
            return;
        }
        if (!this.LIZ) {
            View view = this.LIZLLL;
            if (view instanceof C1318610kPz) {
                C1318610kPz c1318610kPz = (C1318610kPz) view;
                int i2 = this.LJFF;
                if (scrollX != i2) {
                    c1318610kPz.LIZJ(i2, scrollY);
                }
                c1318610kPz.stopNestedScroll(i);
                return;
            }
            return;
        }
        View view2 = this.LIZLLL;
        if (!(view2 instanceof C1318620kQ0)) {
            return;
        }
        C1318620kQ0 c1318620kQ0 = (C1318620kQ0) view2;
        int i3 = this.LJFF;
        if (scrollY != i3) {
            c1318620kQ0.LIZIZ(scrollX, i3);
        }
        c1318620kQ0.stopNestedScroll(i);
    }

    public C1318640kQ2(View view, boolean z, C1317550kOH c1317550kOH) {
        this.LIZLLL = view;
        this.LIZ = z;
        this.LJI = c1317550kOH;
    }

    public final void LIZJ(View view, int i, int i2, int[] iArr, int i3) {
        if (1 == i3) {
            return;
        }
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (!this.LIZ) {
            View view2 = this.LIZLLL;
            if (view2 instanceof C1318610kPz) {
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view2;
                int i4 = this.LJ;
                int i5 = this.LJFF;
                if (!view.canScrollHorizontally(-1) && i < 0) {
                    if (scrollX + i < 0) {
                        horizontalScrollView.scrollTo(0, scrollY);
                    } else {
                        horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                        horizontalScrollView.scrollBy(i, 0);
                    }
                    iArr[0] = i;
                } else if (scrollX < i5 && i > 0) {
                    horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                    if (scrollX + i > i5) {
                        horizontalScrollView.scrollBy(i5 - scrollX, 0);
                    } else {
                        horizontalScrollView.scrollBy(i, 0);
                    }
                    iArr[0] = i;
                }
                if (!view.canScrollHorizontally(1) && i > 0) {
                    if (scrollX + i > i4) {
                        horizontalScrollView.scrollTo(i4, scrollY);
                    } else {
                        horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                        horizontalScrollView.scrollBy(i, 0);
                    }
                    iArr[0] = i;
                    return;
                }
                if (i5 >= scrollX || scrollX > i4 || i >= 0) {
                    return;
                }
                horizontalScrollView.requestDisallowInterceptTouchEvent(true);
                if (scrollX + i < i5) {
                    horizontalScrollView.scrollBy(i5 - scrollX, 0);
                } else {
                    horizontalScrollView.scrollBy(i, 0);
                }
                iArr[0] = i;
                return;
            }
            return;
        }
        View view3 = this.LIZLLL;
        if (!(view3 instanceof C1318620kQ0)) {
            return;
        }
        ScrollView scrollView = (ScrollView) view3;
        int i6 = this.LJ;
        int i7 = this.LJFF;
        if (!view.canScrollVertically(-1) && i2 < 0) {
            if (scrollY + i2 < 0) {
                scrollView.scrollTo(scrollX, 0);
            } else {
                scrollView.requestDisallowInterceptTouchEvent(true);
                scrollView.scrollBy(0, i2);
            }
            iArr[1] = i2;
        } else if (scrollY < i7 && i2 > 0) {
            scrollView.requestDisallowInterceptTouchEvent(true);
            if (scrollY + i2 > i7) {
                scrollView.scrollBy(0, i7 - scrollY);
            } else {
                scrollView.scrollBy(0, i2);
            }
            iArr[1] = i2;
        }
        if (!view.canScrollVertically(1) && i2 > 0) {
            if (scrollY + i2 > i6) {
                scrollView.scrollTo(scrollX, i6);
            } else {
                scrollView.requestDisallowInterceptTouchEvent(true);
                scrollView.scrollBy(0, i2);
            }
            iArr[1] = i2;
            return;
        }
        if (i7 >= scrollY || scrollY > i6 || i2 >= 0) {
            return;
        }
        scrollView.requestDisallowInterceptTouchEvent(true);
        if (scrollY + i2 < i7) {
            scrollView.scrollBy(0, i7 - scrollY);
        } else {
            scrollView.scrollBy(0, i2);
        }
        iArr[1] = i2;
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5) {
        C1318620kQ0 c1318620kQ0;
        OverScroller vScroller;
        C1318610kPz c1318610kPz;
        OverScroller hScroller;
        if (i5 == 0) {
            return;
        }
        int scrollX = this.LIZLLL.getScrollX();
        int scrollY = this.LIZLLL.getScrollY();
        if (!this.LIZ) {
            View view = this.LIZLLL;
            if (!(view instanceof C1318610kPz) || (hScroller = (c1318610kPz = (C1318610kPz) view).getHScroller()) == null) {
                return;
            }
            int i6 = this.LJ;
            int i7 = this.LJFF;
            if (!this.LIZIZ) {
                if (i < 0 && i3 < 0) {
                    c1318610kPz.LIZJ(0, scrollY);
                    this.LIZIZ = true;
                }
            } else if (scrollX == 0 && hScroller.isFinished()) {
                c1318610kPz.LIZJ(i7, scrollY);
                this.LIZIZ = false;
            }
            if (!this.LIZJ) {
                if (i > 0 && i3 > 0) {
                    c1318610kPz.LIZJ(i6, scrollY);
                    this.LIZJ = true;
                    return;
                }
                return;
            }
            if (scrollX != i6 || !hScroller.isFinished()) {
                return;
            }
            c1318610kPz.LIZJ(i7, scrollY);
            this.LIZJ = false;
            return;
        }
        View view2 = this.LIZLLL;
        if (!(view2 instanceof C1318620kQ0) || (vScroller = (c1318620kQ0 = (C1318620kQ0) view2).getVScroller()) == null) {
            return;
        }
        int i8 = this.LJ;
        int i9 = this.LJFF;
        if (!this.LIZIZ) {
            if (i2 < 0 && i4 < 0) {
                c1318620kQ0.LIZIZ(scrollX, 0);
                this.LIZIZ = true;
            }
        } else if (scrollY == 0 && vScroller.isFinished()) {
            c1318620kQ0.LIZIZ(scrollX, i9);
            this.LIZIZ = false;
        }
        if (!this.LIZJ) {
            if (i2 > 0 && i4 > 0) {
                c1318620kQ0.LIZIZ(scrollX, i8);
                this.LIZJ = true;
                return;
            }
            return;
        }
        if (scrollY == i8 && vScroller.isFinished()) {
            c1318620kQ0.LIZIZ(scrollX, i9);
            this.LIZJ = false;
        }
    }
}
