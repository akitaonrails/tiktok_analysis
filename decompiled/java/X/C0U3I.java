package X;

import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U3I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3I extends ConstraintLayout {
    public View LL;
    public C21561119Zp LLILLJJLI;
    public C1324720kZq LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public ValueAnimator LLJJ;
    public int LLJJI;
    public DataChannel LLJJIII;
    public Function1<? super C0U0N, Unit> LLJJIJI;

    public final void e0() {
        ValueAnimator valueAnimatorOfFloat = this.LLJJ;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setDuration(4000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 4));
            this.LLJJ = valueAnimatorOfFloat;
        }
        if (valueAnimatorOfFloat.isPaused()) {
            valueAnimatorOfFloat.resume();
        } else {
            valueAnimatorOfFloat.start();
        }
        DataChannel dataChannel = this.LLJJIII;
        if (dataChannel != null) {
            dataChannel.SX0(C0U28.class, 1);
        }
    }

    public final void h0() {
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        DataChannel dataChannel = this.LLJJIII;
        if (dataChannel != null) {
            dataChannel.SX0(C0U28.class, 2);
        }
    }

    public final void reset() {
        this.LLIZLLLIL = -1.0f;
        this.LLIZ = -1.0f;
        this.LLILZLL = -1.0f;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
    }

    public final Function1<C0U0N, Unit> getCarrier() {
        return this.LLJJIJI;
    }

    public final C1324720kZq getCoverView() {
        return this.LLILLL;
    }

    public final int getCurRedDotCount() {
        return this.LLJJI;
    }

    public final C16F5 getDebugView() {
        return this.LLILZIL;
    }

    public final View getHoverContainer() {
        return this.LL;
    }

    public final boolean getInStickerRegion() {
        return this.LLJILJIL;
    }

    public final C21561119Zp getLyricView() {
        return this.LLILLJJLI;
    }

    public final boolean getNeedDragSticker() {
        return this.LLJIJIL;
    }

    public final boolean getNeedUpdatePosition() {
        return this.LLJI;
    }

    public final C16F5 getRedDotView() {
        return this.LLILZ;
    }

    public final ValueAnimator getRotateAnimator() {
        return this.LLJJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x;
        int measuredHeight;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouch-Event: ");
        sbLIZ.append(motionEvent.getAction());
        C20441214yg.LIZIZ("KLyric", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        int measuredWidth = 0;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (this.LLJIJIL || super.onInterceptTouchEvent(motionEvent)) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    C20441214yg.LIZIZ("KLyric", "onInterceptTouch-Move");
                    if (this.LLJIJIL) {
                        return true;
                    }
                    C20441214yg.LIZIZ("KLyric", "onInterceptTouch-Move1");
                    if (!this.LLJILJIL) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    C20441214yg.LIZIZ("KLyric", "onInterceptTouch-Move2");
                    Math.abs(motionEvent.getX() - this.LLILZLL);
                    if (Math.abs(motionEvent.getY() - this.LLIZ) >= this.LLJ) {
                        C20441214yg.LIZIZ("KLyric", "onInterceptTouch-Move3");
                        motionEvent.getX();
                        this.LLIZLLLIL = motionEvent.getY();
                        this.LLJIJIL = true;
                        int measuredHeight2 = getMeasuredHeight();
                        View view = this.LL;
                        if (view != null) {
                            measuredHeight = view.getMeasuredHeight();
                        } else {
                            measuredHeight = 0;
                        }
                        this.LLJILLL = measuredHeight2 - measuredHeight;
                    }
                    if (this.LLJIJIL || super.onInterceptTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
            }
            C20441214yg.LIZIZ("KLyric", "onInterceptTouch-CancelUp");
            if (!this.LLJIJIL) {
                C20441214yg.LIZIZ("KLyric", "onInterceptTouch-CancelUp2");
                reset();
            }
            if (this.LLJIJIL || super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        View view2 = this.LL;
        if (view2 != null) {
            C20441214yg.LIZIZ("KLyric", "onInterceptTouch-Down");
            reset();
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq != null) {
                x = c1324720kZq.getX();
            } else {
                x = 0.0f;
            }
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 != null) {
                measuredWidth = c1324720kZq2.getMeasuredWidth();
            }
            if (x2 >= view2.getX() + x && x2 <= view2.getX() + x + measuredWidth && y >= view2.getY() && y <= view2.getY() + view2.getMeasuredHeight()) {
                C20441214yg.LIZIZ("KLyric", "onInterceptTouch-Down2");
                this.LLILZLL = motionEvent.getX();
                this.LLIZ = motionEvent.getY();
                this.LLJILJIL = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTouch-Event: ");
        sbLIZ.append(motionEvent.getAction());
        C20441214yg.LIZIZ("KLyric", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.LLJIJIL) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    reset();
                    return true;
                }
                return true;
            }
            View view2 = this.LL;
            if (view2 != null) {
                C20441214yg.LIZIZ("KLyric", "onTouch-Move");
                motionEvent.getX();
                float y = view2.getY() + (motionEvent.getY() - this.LLIZLLLIL);
                if (y < 0.0f) {
                    y = 0.0f;
                }
                if (y > this.LLJILLL) {
                    C20441214yg.LIZIZ("KLyric", "onTouch-Move1");
                    y = this.LLJILLL;
                }
                if (y == view2.getY()) {
                    return true;
                }
                C20441214yg.LIZIZ("KLyric", "onTouch-Move2");
                View view3 = this.LL;
                if (view3 != null) {
                    C786410Ut5.Ld(view3, y);
                }
                this.LLIZLLLIL = motionEvent.getY();
                this.LLJI = true;
                return true;
            }
            return false;
        }
        if (this.LLJI && (view = this.LL) != null) {
            if (this.LLJILJILJ == 1) {
                InterfaceC766480U4w.LJJLJ.LJFF(Float.valueOf(view.getY()));
            } else {
                InterfaceC766480U4w.LJJLJLI.LJFF(Float.valueOf(view.getY()));
            }
        }
        reset();
        return true;
    }

    public final void setCarrier(Function1<? super C0U0N, Unit> function1) {
        this.LLJJIJI = function1;
    }

    public final void setCoverView(C1324720kZq c1324720kZq) {
        this.LLILLL = c1324720kZq;
    }

    public final void setCurRedDotCount(int i) {
        this.LLJJI = i;
    }

    public final void setDebugView(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final void setHoverContainer(View view) {
        this.LL = view;
    }

    public final void setInStickerRegion(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setLyricView(C21561119Zp c21561119Zp) {
        this.LLILLJJLI = c21561119Zp;
    }

    public final void setNeedDragSticker(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setNeedUpdatePosition(boolean z) {
        this.LLJI = z;
    }

    public final void setRedDot(int i) {
        this.LLJJI = i;
        if (i == 0) {
            C0GZA.LIZIZ(findViewById(R.id.vou));
        } else {
            C0GZA.LIZ(findViewById(R.id.vou), i, 0.0f, 0.0f);
        }
    }

    public final void setRedDotView(C16F5 c16f5) {
        this.LLILZ = c16f5;
    }

    public final void setRole(int i) {
        Float fLIZIZ;
        this.LLJILJILJ = i;
        View view = this.LL;
        if (view != null) {
            if (i == 1) {
                fLIZIZ = InterfaceC766480U4w.LJJLJ.LIZIZ();
            } else {
                fLIZIZ = InterfaceC766480U4w.LJJLJLI.LIZIZ();
            }
            if (!Intrinsics.LIZLLL(fLIZIZ, -1.0f)) {
                C786410Ut5.Ld(view, fLIZIZ.floatValue());
            } else {
                C786410Ut5.Ld(view, (int) C497740JfY.LIZIZ(70.0f));
            }
        }
        requestLayout();
    }

    public final void setRotateAnimator(ValueAnimator valueAnimator) {
        this.LLJJ = valueAnimator;
    }

    public final void setRtl$liveeffect_impl_release(boolean z) {
        if (z) {
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
                c1324720kZq.setRotationY(180.0f);
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq2 = this.LLILLL;
        if (c1324720kZq2 == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq2);
        c1324720kZq2.setRotationY(0.0f);
    }

    public C0U3I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = ViewConfiguration.get(context).getScaledTouchSlop();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.gwb, this, false);
        C1324720kZq c1324720kZq = null;
        if (viewTd != null) {
            this.LLILZIL = (C16F5) viewTd.findViewById(R.id.fh5);
            C21561119Zp c21561119Zp = (C21561119Zp) viewTd.findViewById(R.id.nuk);
            if (c21561119Zp != null) {
                C19SA displayConfig = c21561119Zp.getDisplayConfig();
                Context context2 = c21561119Zp.getContext();
                displayConfig.getClass();
                int iLIZLLL = C497740JfY.LIZLLL(R.attr.eov, context2);
                displayConfig.LJFF.setTextSize((int) C497740JfY.LIZIZ(17.0f));
                displayConfig.LJFF.setColor(C497740JfY.LJFF(R.color.a74));
                displayConfig.LJFF.setDither(true);
                displayConfig.LJFF.setFakeBoldText(true);
                displayConfig.LJFF.setShadowLayer(10.0f, 0.0f, 0.0f, iLIZLLL);
                displayConfig.LJFF.setAntiAlias(true);
                displayConfig.LJFF.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                displayConfig.LJI.setTextSize((int) C497740JfY.LIZIZ(17.0f));
                displayConfig.LJI.setColor(C497740JfY.LIZLLL(R.attr.eou, context2));
                displayConfig.LJI.setDither(true);
                displayConfig.LJI.setAntiAlias(true);
                displayConfig.LJI.setFakeBoldText(true);
                displayConfig.LJI.setShadowLayer(10.0f, 0.0f, 0.0f, iLIZLLL);
                displayConfig.LJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                displayConfig.LJII.setTextSize((int) C497740JfY.LIZIZ(17.0f));
                displayConfig.LJII.setColor(C497740JfY.LJFF(R.color.f588a75));
                displayConfig.LJII.setDither(true);
                displayConfig.LJII.setAntiAlias(true);
                displayConfig.LJII.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                displayConfig.LJ.setTextSize((int) C497740JfY.LIZIZ(17.0f));
                displayConfig.LJ.setColor(C497740JfY.LJFF(R.color.a74));
                displayConfig.LJ.setDither(true);
                displayConfig.LJ.setFakeBoldText(true);
                displayConfig.LJ.setShadowLayer(10.0f, 0.0f, 0.0f, iLIZLLL);
                displayConfig.LJ.setAntiAlias(true);
                displayConfig.LJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                if (InterfaceC766480U4w.LJJLL.LIZIZ().booleanValue()) {
                    C16F5 c16f5 = this.LLILZIL;
                    if (c16f5 != null) {
                        C786410Ut5.LLJJJJ(c16f5, 0);
                    }
                    C20441214yg.LIZIZ("LyricDebug", "Add Listener");
                    InterfaceC766140U3o interfaceC766140U3o = new InterfaceC766140U3o() { // from class: X.0U3J
                        @Override // X.InterfaceC766140U3o
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC766140U3o
                        public final void LIZIZ(String str) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("DebugLog: ");
                            sbLIZ.append(str);
                            sbLIZ.append(", ");
                            sbLIZ.append(this.LIZ.getDebugView());
                            C20441214yg.LIZIZ("LyricDebug", C2188811AlT.LIZIZ(sbLIZ));
                            C16F5 debugView = this.LIZ.getDebugView();
                            if (debugView != null) {
                                debugView.setText(str);
                            }
                        }
                    };
                    if (!((ArrayList) c21561119Zp.LLJLILLLLZIIL).contains(interfaceC766140U3o)) {
                        ((ArrayList) c21561119Zp.LLJLILLLLZIIL).add(interfaceC766140U3o);
                    }
                }
            } else {
                c21561119Zp = null;
            }
            this.LLILLJJLI = c21561119Zp;
            this.LLILZ = (C16F5) viewTd.findViewById(R.id.p7n);
            C1324720kZq c1324720kZq2 = (C1324720kZq) viewTd.findViewById(R.id.vot);
            if (c1324720kZq2 != null) {
                C500260Jjc.LJLIIIL(500L, c1324720kZq2, new AwS591S0100000_12(this, 74));
                c1324720kZq = c1324720kZq2;
            }
            this.LLILLL = c1324720kZq;
        } else {
            viewTd = null;
        }
        this.LL = viewTd;
        if (viewTd != null) {
            addView(viewTd);
            setRtl$liveeffect_impl_release(C497740JfY.LJJ());
        }
    }
}
