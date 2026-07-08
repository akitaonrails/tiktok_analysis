package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490680JMc extends FrameLayout {
    public C1390410mHn LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public ValueAnimator LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public InterfaceC490740JMi LLIZLLLIL;
    public boolean LLJ;

    private final C1390410mHn getLoadMoreBall() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nkr);
            this.LL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    private final VideoPlayerPagerAbility getPagerAbility() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        if (interfaceC665370Q7z == null) {
            return null;
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, VideoPlayerFragmentScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(VideoPlayerPagerAbility.class) : null;
        return (VideoPlayerPagerAbility) (ability instanceof VideoPlayerPagerAbility ? ability : null);
    }

    private final int getViewPagerMarginTop() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        VideoPlayerPagerAbility pagerAbility = getPagerAbility();
        ViewGroup.LayoutParams layoutParams = pagerAbility != null ? pagerAbility.getLayoutParams() : null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    private final void setDragging(boolean z) {
        InterfaceC490740JMi interfaceC490740JMi = this.LLIZLLLIL;
        if (interfaceC490740JMi != null) {
            interfaceC490740JMi.LIZ(z);
        }
        this.LLIZ = z;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VideoPlayerPagerAbility pagerAbility;
        Integer numValueOf;
        if (!this.LLJ || (pagerAbility = getPagerAbility()) == null || pagerAbility.getItemCount() == 0 || pagerAbility.qr() < pagerAbility.getItemCount() - 1) {
            return false;
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                setDragging(false);
                this.LLILZLL = motionEvent.getY();
            } else if (numValueOf.intValue() == 2) {
                if (pagerAbility.getItemCount() - 1 == pagerAbility.qr() && this.LLILZLL - motionEvent.getY() > this.LLILZIL && !this.LLIZ) {
                    setDragging(true);
                    ValueAnimator valueAnimator = this.LLILLL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                setDragging(false);
            }
        }
        return this.LLIZ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        C1390410mHn loadMoreBall;
        C1390410mHn loadMoreBall2;
        if (!this.LLJ) {
            return super.onTouchEvent(motionEvent);
        }
        VideoPlayerPagerAbility pagerAbility = getPagerAbility();
        if (pagerAbility != null) {
            if (pagerAbility.getItemCount() == 0 || pagerAbility.qr() < pagerAbility.getItemCount() - 1) {
                return false;
            }
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    setDragging(false);
                } else if (numValueOf != null) {
                    if (numValueOf.intValue() == 2) {
                        if (this.LLIZ) {
                            int y = (int) ((motionEvent.getY() - this.LLILZLL) / 1.0f);
                            if (y > 0) {
                                y = 0;
                            }
                            int i = -this.LLILZ;
                            if (y < i) {
                                y = i;
                            }
                            setViewPagerMarginTopByDelta(y);
                            if (!C500260Jjc.LJJJJIZL(getLoadMoreBall())) {
                                C1390410mHn loadMoreBall3 = getLoadMoreBall();
                                if (loadMoreBall3 != null) {
                                    C500260Jjc.LLFFF(loadMoreBall3);
                                }
                                C1390410mHn loadMoreBall4 = getLoadMoreBall();
                                if ((loadMoreBall4 == null || !loadMoreBall4.LLIZLLLIL) && (loadMoreBall2 = getLoadMoreBall()) != null) {
                                    loadMoreBall2.LIZJ();
                                }
                            }
                        }
                    } else if ((numValueOf.intValue() == 3 || numValueOf.intValue() == 1) && this.LLIZ) {
                        this.LLILLL = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final int viewPagerMarginTop = getViewPagerMarginTop();
                        ValueAnimator valueAnimator = this.LLILLL;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(200);
                        }
                        ValueAnimator valueAnimator2 = this.LLILLL;
                        if (valueAnimator2 != null) {
                            valueAnimator2.setInterpolator(new DecelerateInterpolator());
                        }
                        ValueAnimator valueAnimator3 = this.LLILLL;
                        if (valueAnimator3 != null) {
                            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0JMd
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                    this.LL.setViewPagerMarginTopByDelta(viewPagerMarginTop + ((int) (((double) 1) - (Math.pow(valueAnimator4.getAnimatedFraction(), 3.0d) * ((double) viewPagerMarginTop)))));
                                }
                            });
                        }
                        ValueAnimator valueAnimator4 = this.LLILLL;
                        if (valueAnimator4 != null) {
                            valueAnimator4.start();
                        }
                        C1390410mHn loadMoreBall5 = getLoadMoreBall();
                        if (loadMoreBall5 != null && loadMoreBall5.LLIZLLLIL && (loadMoreBall = getLoadMoreBall()) != null) {
                            loadMoreBall.LIZLLL();
                        }
                        C1390410mHn loadMoreBall6 = getLoadMoreBall();
                        if (loadMoreBall6 != null) {
                            C500260Jjc.LJIILLIIL(loadMoreBall6);
                        }
                        setDragging(false);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setEnableLoadMore(boolean z) {
        this.LLJ = z;
    }

    public final void setFragmentScope(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI = interfaceC665370Q7z;
    }

    public final void setLoadMoreListener(InterfaceC490740JMi interfaceC490740JMi) {
        this.LLIZLLLIL = interfaceC490740JMi;
    }

    public final void setViewPagerMarginTopByDelta(int i) {
        VideoPlayerPagerAbility pagerAbility = getPagerAbility();
        if (pagerAbility != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pagerAbility.getLayoutParams();
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = -i;
            pagerAbility.setLayoutParams(marginLayoutParams);
        }
    }

    public C490680JMc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = (int) C497740JfY.LIZIZ(218.0f);
        this.LLJ = true;
        this.LLILZIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
