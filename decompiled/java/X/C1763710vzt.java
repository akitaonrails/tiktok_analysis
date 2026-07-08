package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0vzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763710vzt extends C21599719g3 {
    public float LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public InterfaceC1763740vzw LLLLZLLIL;
    public boolean LLLLZLLLI;
    public float LLLZ;
    public float LLLZI;

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC1763740vzw interfaceC1763740vzw;
        InterfaceC1763740vzw interfaceC1763740vzw2;
        boolean z2;
        InterfaceC1763740vzw interfaceC1763740vzw3 = this.LLLLZLLIL;
        if (interfaceC1763740vzw3 != null && interfaceC1763740vzw3.isFullScreen()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (motionEvent != null && (numValueOf2 = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf2.intValue() == 0) {
                    this.LLLLZIL = false;
                    this.LLLLZI = motionEvent.getX();
                } else if (numValueOf2.intValue() == 2) {
                    if (this.LLLLZLL) {
                        if (getLayoutDirection() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if ((motionEvent.getX() - this.LLLLZI) / C418440Gaw.LIZLLL(getContext()) >= 0.25d) {
                                if (!this.LLLLZIL) {
                                    requestDisallowInterceptTouchEvent(true);
                                }
                                this.LLLLZIL = true;
                            }
                        } else if ((this.LLLLZI - motionEvent.getX()) / C418440Gaw.LIZLLL(getContext()) >= 0.25d) {
                            if (!this.LLLLZIL) {
                                requestDisallowInterceptTouchEvent(true);
                            }
                            this.LLLLZIL = true;
                        }
                    }
                } else if ((numValueOf2.intValue() == 1 || numValueOf2.intValue() == 3) && this.LLLLZLL && this.LLLLZIL) {
                    if (getLayoutDirection() == 1) {
                        if (this.LLLLZI < motionEvent.getX() && (interfaceC1763740vzw2 = this.LLLLZLLIL) != null) {
                            interfaceC1763740vzw2.LJJLJLI();
                        }
                    } else if (motionEvent.getX() < this.LLLLZI && (interfaceC1763740vzw = this.LLLLZLLIL) != null) {
                        interfaceC1763740vzw.LJJLJLI();
                    }
                }
            }
            if (!this.LLLLZIL && !super.dispatchTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && this.LLLLZLLLI)) {
            this.LLLLZLLLI = false;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC1763740vzw interfaceC1763740vzw = this.LLLLZLLIL;
        if (interfaceC1763740vzw != null && !interfaceC1763740vzw.isFullScreen() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLLZ = motionEvent.getX();
                this.LLLZI = motionEvent.getY();
            } else if (numValueOf.intValue() == 2 && !this.LLLLZLLLI) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float fAbs = Math.abs(x - this.LLLZ);
                if (fAbs > Math.abs(y - this.LLLZI) && fAbs > 15.0f) {
                    this.LLLLZLLLI = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setHeadPager(InterfaceC1763740vzw interfaceC1763740vzw) {
        this.LLLLZLLIL = interfaceC1763740vzw;
    }

    public final void setMoreVisible(boolean z) {
        this.LLLLZLL = z;
    }

    public C1763710vzt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
