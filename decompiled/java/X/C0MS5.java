package X;

import Y.ALAdapterS5S0100000_8;
import Y.AUListenerS258S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0MS5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MS5 extends C0MS4 {
    public static final /* synthetic */ int LLJI = 0;
    public float LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;

    public void setBounceScrollListener(C0MS7 c0ms7) {
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        if ((this.LLILZ == 0 && motionEvent.getX() > this.LLILZLL) || (getAdapter() != null && this.LLILZ == getAdapter().getCount() - 1 && motionEvent.getX() < this.LLILZLL)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        double d;
        double width;
        int width2;
        float rawX;
        if (motionEvent.getAction() == 0) {
            this.LLILLJJLI = motionEvent.getX();
            this.LLILLL = motionEvent.getY();
            C1440005kM.LIZ(new IEvent() { // from class: X.0MS6
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        } else {
            char c = 1;
            if (motionEvent.getAction() == 1 && this.LLJ) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.LLILLJJLI) <= 60.0f && Math.abs(y - this.LLILLL) <= 60.0f) {
                    int childCount = getChildCount();
                    int currentItem = getCurrentItem();
                    int[] iArr = new int[2];
                    char c2 = 0;
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            break;
                        }
                        View childAt = getChildAt(i);
                        int iIntValue = ((Integer) childAt.getTag()).intValue();
                        childAt.getLocationOnScreen(iArr);
                        int i2 = iArr[c2];
                        int i3 = iArr[c];
                        int width3 = childAt.getWidth() + i2;
                        int height = iArr[c] + childAt.getHeight();
                        if (iIntValue < currentItem) {
                            width3 = (int) (((double) width3) - ((((double) (childAt.getWidth() * 0.100000024f)) * 0.5d) + (((double) (childAt.getWidth() * Math.abs(0.0f))) * 0.5d)));
                            d = i2;
                            width = (((double) (childAt.getWidth() * 0.100000024f)) * 0.5d) + (((double) (childAt.getWidth() * Math.abs(0.0f))) * 0.5d);
                        } else if (iIntValue == currentItem) {
                            width2 = (int) (i2 + (childAt.getWidth() * Math.abs(0.0f)));
                            rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (rawX <= width2 && rawX < width3 && rawY > i3 && rawY < height) {
                                int iIntValue2 = ((Integer) childAt.getTag()).intValue();
                                if (getCurrentItem() != iIntValue2) {
                                    setCurrentItem(iIntValue2, true);
                                }
                            } else {
                                i++;
                                c = 1;
                                c2 = 0;
                            }
                        } else {
                            width3 = (int) (((double) width3) - (((double) (childAt.getWidth() * Math.abs(0.0f))) * 0.5d));
                            d = i2;
                            width = ((double) (childAt.getWidth() * Math.abs(0.0f))) * 0.5d;
                        }
                        width2 = (int) (d - width);
                        rawX = motionEvent.getRawX();
                        float rawY2 = motionEvent.getRawY();
                        if (rawX <= width2) {
                        }
                        i++;
                        c = 1;
                        c2 = 0;
                    }
                    super.dispatchTouchEvent(motionEvent);
                } else {
                    super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C0MS4, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && LIZ(motionEvent)) {
                return true;
            }
        } else {
            this.LLILZLL = motionEvent.getX();
            this.LLILZ = getCurrentItem();
            this.LLIZLLLIL = getTranslationX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C0MS4, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLIZ && getAdapter() != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && LIZ(motionEvent)) {
                    float x = motionEvent.getX();
                    float f = x - this.LLILZLL;
                    if (Math.abs(f) > 4.0f) {
                        this.LLILZIL = true;
                        float translationX = getTranslationX() + (f * 0.45f);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setTranslationX(translationX);
                        this.LLILZLL = x;
                    }
                }
            } else {
                if (getTranslationX() != this.LLIZLLLIL && this.LLILZIL) {
                    ValueAnimator duration = ValueAnimator.ofFloat(getTranslationX(), 0.0f).setDuration(200L);
                    duration.addUpdateListener(new AUListenerS258S0100000_8(this, 10));
                    duration.addListener(new ALAdapterS5S0100000_8(this, 11));
                    duration.start();
                    this.LLIZ = true;
                }
                this.LLILZIL = false;
            }
            if (!this.LLILZIL && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setHandleClickChange(boolean z) {
        this.LLJ = z;
    }

    public C0MS5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = true;
    }
}
