package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763720vzu extends C21599719g3 {
    public C1763720vzu LLLLZI;
    public float LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLIL;
    public InterfaceC1763730vzv LLLLZLLLI;
    public boolean LLLZ;
    public float LLLZI;
    public float LLLZIIL;

    public final C1763720vzu getCommerceHeaderPagerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLZI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.egr);
            this.LLLLZI = (C1763720vzu) callbackFindViewById;
        }
        return (C1763720vzu) callbackFindViewById;
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC1763730vzv interfaceC1763730vzv;
        InterfaceC1763730vzv interfaceC1763730vzv2;
        boolean z2;
        InterfaceC1763730vzv interfaceC1763730vzv3 = this.LLLLZLLLI;
        if (interfaceC1763730vzv3 != null && interfaceC1763730vzv3.isFullScreen()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (motionEvent != null && (numValueOf2 = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf2.intValue() == 0) {
                    this.LLLLZLL = false;
                    this.LLLLZIL = motionEvent.getX();
                } else if (numValueOf2.intValue() == 2) {
                    if (this.LLLLZLLIL) {
                        if (getLayoutDirection() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if ((motionEvent.getX() - this.LLLLZIL) / C418440Gaw.LIZLLL(getContext()) >= 0.25d) {
                                if (!this.LLLLZLL) {
                                    requestDisallowInterceptTouchEvent(true);
                                }
                                this.LLLLZLL = true;
                            }
                        } else if ((this.LLLLZIL - motionEvent.getX()) / C418440Gaw.LIZLLL(getContext()) >= 0.25d) {
                            if (!this.LLLLZLL) {
                                requestDisallowInterceptTouchEvent(true);
                            }
                            this.LLLLZLL = true;
                        }
                    }
                } else if ((numValueOf2.intValue() == 1 || numValueOf2.intValue() == 3) && this.LLLLZLLIL && this.LLLLZLL) {
                    if (getLayoutDirection() == 1) {
                        if (this.LLLLZIL < motionEvent.getX() && (interfaceC1763730vzv2 = this.LLLLZLLLI) != null) {
                            interfaceC1763730vzv2.LJJLJLI();
                        }
                    } else if (motionEvent.getX() < this.LLLLZIL && (interfaceC1763730vzv = this.LLLLZLLLI) != null) {
                        interfaceC1763730vzv.LJJLJLI();
                    }
                }
            }
            if (!this.LLLLZLL && !super.dispatchTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && this.LLLZ)) {
            this.LLLZ = false;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("requestDisallowInterceptTouchEvent false");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC1763730vzv interfaceC1763730vzv = this.LLLLZLLLI;
        if (interfaceC1763730vzv != null && !interfaceC1763730vzv.isFullScreen() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLLZI = motionEvent.getX();
                this.LLLZIIL = motionEvent.getY();
            } else if (numValueOf.intValue() == 2 && !this.LLLZ) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float fAbs = Math.abs(x - this.LLLZI);
                float fAbs2 = Math.abs(y - this.LLLZIIL);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dx ");
                sbLIZ.append(fAbs);
                sbLIZ.append(" dy ");
                sbLIZ.append(fAbs2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                if (fAbs > fAbs2 && fAbs > 15.0f) {
                    this.LLLZ = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    C2341109Fh.LIZ("requestDisallowInterceptTouchEvent true");
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setCommerceHeaderPagerFromXml(C1763720vzu c1763720vzu) {
        this.LLLLZI = c1763720vzu;
    }

    public final void setHeadPager(InterfaceC1763730vzv interfaceC1763730vzv) {
        this.LLLLZLLLI = interfaceC1763730vzv;
    }

    public final void setMoreVisible(boolean z) {
        this.LLLLZLLIL = z;
    }

    public C1763720vzu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
