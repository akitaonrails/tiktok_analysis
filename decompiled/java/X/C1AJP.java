package X;

import Y.AcS499S0100000_33;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS277S0300000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AJP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJP extends ConstraintLayout {
    public boolean LL;
    public TextView LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public final int[] LLIZ;
    public final int[] LLIZLLLIL;
    public final int[] LLJ;
    public final Rect LLJI;
    public final Rect LLJIJIL;
    public boolean LLJILJIL;
    public final int LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public final int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public int[] LLJJJJJIL;
    public InterfaceC2177371AJj LLJJJJLIIL;
    public AbstractC1847300yAi LLJJL;

    public final void reset() {
        this.LLJJL = null;
        this.LLJJIJIIJIL = -1.0f;
        this.LLJJIJI = -1.0f;
        this.LLJJ = -1.0f;
        this.LLJILLL = -1.0f;
        this.LL = false;
        this.LLJJJ = false;
        this.LLJJJIL = false;
    }

    public final void e0() {
        List<AbstractC1847300yAi> listU;
        InterfaceC2177371AJj interfaceC2177371AJj = this.LLJJJJLIIL;
        if (interfaceC2177371AJj != null && (listU = interfaceC2177371AJj.U()) != null) {
            for (AbstractC1847300yAi abstractC1847300yAi : listU) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, abstractC1847300yAi);
                removeView(abstractC1847300yAi);
            }
        }
        reset();
    }

    public final boolean h0() {
        AbstractC1847300yAi abstractC1847300yAi = this.LLJJL;
        if (abstractC1847300yAi == null) {
            return false;
        }
        abstractC1847300yAi.getLocationOnScreen(this.LLJ);
        Rect rect = this.LLJI;
        int[] iArr = this.LLJ;
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + abstractC1847300yAi.getMeasuredWidth();
        rect.bottom = rect.top + abstractC1847300yAi.getMeasuredHeight();
        this.LLJI.offset(0, abstractC1847300yAi.getMeasuredHeight() / 100);
        View view = this.LLILZ;
        if (view != null) {
            view.getLocationOnScreen(this.LLIZLLLIL);
            Rect rect2 = this.LLJIJIL;
            int[] iArr2 = this.LLIZLLLIL;
            int i2 = iArr2[0];
            rect2.left = i2;
            rect2.top = iArr2[1];
            rect2.right = i2 + view.getMeasuredWidth();
            rect2.bottom = rect2.top + view.getMeasuredHeight();
        }
        return this.LLJI.intersect(this.LLJIJIL);
    }

    public final void j0() {
        ViewGroup.LayoutParams layoutParams;
        int[] iArr = this.LLIZ;
        int[] iArr2 = this.LLJJJJJIL;
        iArr[0] = iArr2[0];
        iArr[2] = iArr2[2];
        iArr[3] = iArr2[3];
        iArr[1] = iArr2[1];
        int i = this.LLJILJILJ - iArr2[1];
        View view = this.LLILZIL;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = i;
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams);
        }
        View view3 = this.LLILZIL;
        if (view3 != null) {
            view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2189561Amg(this, 6));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.LLJJJJ) {
            return false;
        }
        return zDispatchTouchEvent;
    }

    public final void l0(boolean z) {
        View view;
        View view2;
        if (z) {
            View view3 = this.LLILLL;
            if ((view3 != null && view3.getVisibility() == 0) || (view2 = this.LLILLL) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            return;
        }
        View view4 = this.LLILLL;
        if ((view4 != null && view4.getVisibility() == 4) || (view = this.LLILLL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, view);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC2177371AJj interfaceC2177371AJj;
        List<AbstractC1847300yAi> listU;
        List<AbstractC1847300yAi> listU2;
        if (!this.LLJJJJ || ((interfaceC2177371AJj = this.LLJJJJLIIL) != null && (listU2 = interfaceC2177371AJj.U()) != null && listU2.isEmpty())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (!this.LLJJJ && !super.onInterceptTouchEvent(motionEvent)) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    if (this.LLJJJ) {
                        return true;
                    }
                    if (this.LLJJJIL && this.LLJJL != null) {
                        float fAbs = Math.abs(motionEvent.getX() - this.LLJILLL);
                        float fAbs2 = Math.abs(motionEvent.getY() - this.LLJJ);
                        int i = this.LLJJIJIL;
                        if (fAbs >= i || fAbs2 >= i) {
                            this.LLJJIJI = motionEvent.getX();
                            this.LLJJIJIIJIL = motionEvent.getY();
                            this.LLJJJ = true;
                        }
                        if (!this.LLJJJ && !super.onInterceptTouchEvent(motionEvent)) {
                            return false;
                        }
                        return true;
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
            if (!this.LLJJJ) {
                reset();
            }
            if (!this.LLJJJ && !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        reset();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        InterfaceC2177371AJj interfaceC2177371AJj2 = this.LLJJJJLIIL;
        AbstractC1847300yAi abstractC1847300yAi = null;
        if (interfaceC2177371AJj2 != null && (listU = interfaceC2177371AJj2.U()) != null) {
            ListIterator<AbstractC1847300yAi> listIterator = listU.listIterator(listU.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                AbstractC1847300yAi abstractC1847300yAiPrevious = listIterator.previous();
                AbstractC1847300yAi abstractC1847300yAi2 = abstractC1847300yAiPrevious;
                if (x >= abstractC1847300yAi2.getX() && x <= abstractC1847300yAi2.getX() + abstractC1847300yAi2.getMeasuredWidth() && y >= abstractC1847300yAi2.getY() && y <= abstractC1847300yAi2.getY() + abstractC1847300yAi2.getMeasuredHeight()) {
                    abstractC1847300yAi = abstractC1847300yAiPrevious;
                    break;
                }
            }
            abstractC1847300yAi = abstractC1847300yAi;
        }
        this.LLJJL = abstractC1847300yAi;
        if (abstractC1847300yAi != null) {
            this.LLJILLL = motionEvent.getX();
            this.LLJJ = motionEvent.getY();
            this.LLJJI = abstractC1847300yAi.getX();
            this.LLJJIII = abstractC1847300yAi.getY();
            this.LLJJJIL = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC2177371AJj interfaceC2177371AJj;
        InterfaceC2177371AJj interfaceC2177371AJj2;
        C1847220yAa c1847220yAaI0;
        InterfaceC2177371AJj interfaceC2177371AJj3;
        View view;
        View view2;
        int iLIZIZ;
        int i;
        List<AbstractC1847300yAi> listU;
        if (!this.LLJJJJ || ((interfaceC2177371AJj = this.LLJJJJLIIL) != null && (listU = interfaceC2177371AJj.U()) != null && listU.isEmpty())) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.LLJJJ) {
            return super.onTouchEvent(motionEvent);
        }
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 4109);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return true;
                }
                awS577S0100000_33.invoke();
                return true;
            }
            float x = motionEvent.getX() - this.LLJJIJI;
            float y = motionEvent.getY() - this.LLJJIJIIJIL;
            AbstractC1847300yAi abstractC1847300yAi = this.LLJJL;
            if (abstractC1847300yAi == null) {
                return true;
            }
            float x2 = abstractC1847300yAi.getX() + x;
            float f = this.LLIZ[2];
            if (x2 < f) {
                x2 = f;
            }
            float measuredWidth = abstractC1847300yAi.getMeasuredWidth() + x2;
            int i2 = this.LLIZ[3];
            if (measuredWidth > i2) {
                x2 = i2 - abstractC1847300yAi.getMeasuredWidth();
            }
            if (x2 != abstractC1847300yAi.getX()) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1847300yAi);
                abstractC1847300yAi.setX(x2);
                this.LLJJIJI = motionEvent.getX();
                this.LL = true;
            }
            float y2 = abstractC1847300yAi.getY() + y;
            float f2 = this.LLIZ[0];
            if (y2 < f2) {
                y2 = f2;
            }
            float measuredHeight = abstractC1847300yAi.getMeasuredHeight();
            float f3 = y2 + measuredHeight;
            float f4 = this.LLIZ[1];
            if (f3 > f4) {
                y2 = f4 - measuredHeight;
            }
            if (y2 != abstractC1847300yAi.getY()) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1847300yAi);
                abstractC1847300yAi.setY(y2);
                this.LLJJIJIIJIL = motionEvent.getY();
                this.LL = true;
            }
            boolean zH0 = h0();
            if (zH0 != this.LLJILJIL) {
                this.LLJILJIL = zH0;
                TextView textView = this.LLILLJJLI;
                if (textView != null) {
                    if (zH0) {
                        i = R.drawable.fb8;
                    } else {
                        i = R.drawable.fb7;
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
                }
                View view3 = this.LLILZ;
                if (view3 != null) {
                    if (zH0) {
                        iLIZIZ = C20736316Cj.LIZIZ(R.attr.c6e, getContext());
                    } else {
                        iLIZIZ = C20736316Cj.LIZIZ(R.attr.exj, getContext());
                    }
                    view3.setBackgroundColor(iLIZIZ);
                }
            }
            AbstractC1847300yAi abstractC1847300yAi2 = this.LLJJL;
            if (abstractC1847300yAi2 != null) {
                if (abstractC1847300yAi2.getY() + abstractC1847300yAi2.getMeasuredHeight() >= this.LLIZ[1]) {
                    View view4 = this.LLILZLL;
                    if ((view4 == null || view4.getVisibility() != 0) && (view2 = this.LLILZLL) != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                } else {
                    View view5 = this.LLILZLL;
                    if ((view5 == null || view5.getVisibility() != 4) && (view = this.LLILZLL) != null) {
                        C786410Ut5.LJLLLLLL(4, view);
                    }
                }
            }
            if (C497740JfY.LJIL() && (interfaceC2177371AJj3 = this.LLJJJJLIIL) != null) {
                interfaceC2177371AJj3.LJIJI(true);
            }
            l0(true);
            return true;
        }
        if (h0()) {
            AbstractC1847300yAi abstractC1847300yAi3 = this.LLJJL;
            if (abstractC1847300yAi3 != null && (c1847220yAaI0 = abstractC1847300yAi3.i0()) != null) {
                AwS277S0300000_33 awS277S0300000_33 = new AwS277S0300000_33(this, c1847220yAaI0, awS577S0100000_33, 9);
                AwS277S0300000_33 awS277S0300000_332 = new AwS277S0300000_33(this, c1847220yAaI0, awS577S0100000_33, 10);
                C782110Um9 c782110Um9 = new C782110Um9(getContext());
                c782110Um9.LJIIZILJ(2131855495);
                c782110Um9.LJII(2131855491);
                c782110Um9.LJIILIIL(2131855494, new AcS499S0100000_33(awS277S0300000_33, 2));
                c782110Um9.LJIIJ(2131855493, new AcS499S0100000_33(awS277S0300000_332, 3));
                c782110Um9.LJIILL = false;
                c782110Um9.LJIILLIIL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
                return true;
            }
            InterfaceC2177371AJj interfaceC2177371AJj4 = this.LLJJJJLIIL;
            if (interfaceC2177371AJj4 != null) {
                interfaceC2177371AJj4.LLJILLL(this.LLJJL);
            }
        } else if (this.LL && (interfaceC2177371AJj2 = this.LLJJJJLIIL) != null) {
            interfaceC2177371AJj2.LLILZIL(this.LLJJL);
        }
        awS577S0100000_33.invoke();
        return true;
    }

    public final void i0(AbstractC1847300yAi abstractC1847300yAi, RoomSticker roomSticker) {
        Integer numValueOf;
        int iIntValue;
        int iIntValue2;
        float f;
        int i;
        int dimensionPixelSize;
        String str;
        if (abstractC1847300yAi == null) {
            return;
        }
        int[] iArr = this.LLIZ;
        Pair<Integer, Integer> pairB0 = abstractC1847300yAi.B0();
        int iIntValue3 = pairB0.getFirst().intValue();
        int iIntValue4 = pairB0.getSecond().intValue();
        ViewGroup.LayoutParams layoutParams = abstractC1847300yAi.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new C19ME(iIntValue3, iIntValue4);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1847300yAi);
        abstractC1847300yAi.setLayoutParams(layoutParams);
        if (roomSticker != null && (str = roomSticker.extra) != null && !Intrinsics.LJFF(abstractC1847300yAi.LL.extra, str)) {
            abstractC1847300yAi.LL.extra = roomSticker.extra;
        }
        Integer numValueOf2 = null;
        if (roomSticker != null) {
            numValueOf = Integer.valueOf(roomSticker.xPosition);
            numValueOf2 = Integer.valueOf(roomSticker.yPosition);
        } else {
            numValueOf = null;
        }
        int i2 = iIntValue3 / 2;
        int i3 = iIntValue4 / 2;
        RoomSticker roomSticker2 = abstractC1847300yAi.LL;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = roomSticker2.xPosition;
        }
        if (numValueOf2 != null) {
            iIntValue2 = numValueOf2.intValue();
        } else {
            iIntValue2 = roomSticker2.yPosition;
        }
        if (iIntValue == -1 && iIntValue2 == -1) {
            i = ((iArr[2] + iArr[3]) / 2) - i2;
            dimensionPixelSize = (abstractC1847300yAi.getResources().getDimensionPixelSize(R.dimen.ayt) + iArr[1]) / 2;
        } else {
            int i4 = roomSticker2.screenWidth;
            float f2 = 1.0f;
            if (i4 > 0) {
                f = abstractC1847300yAi.LLILZLL / i4;
            } else {
                f = 1.0f;
            }
            int i5 = roomSticker2.screenHeight;
            if (i5 > 0) {
                f2 = abstractC1847300yAi.LLIZ / i5;
            }
            i = ((int) (iIntValue * f)) - i2;
            dimensionPixelSize = (int) (iIntValue2 * f2);
        }
        Pair<Integer, Integer> pairH0 = abstractC1847300yAi.h0(i, dimensionPixelSize - i3, iArr);
        int iIntValue5 = pairH0.getFirst().intValue();
        int iIntValue6 = pairH0.getSecond().intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1847300yAi);
        abstractC1847300yAi.setX(iIntValue5);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1847300yAi);
        abstractC1847300yAi.setY(iIntValue6);
        roomSticker2.xPosition = iIntValue5 + i2;
        roomSticker2.yPosition = iIntValue6 + i3;
        if (abstractC1847300yAi.LLILZIL) {
            abstractC1847300yAi.LLILZIL = false;
            abstractC1847300yAi.z0();
        }
    }

    public C1AJP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = new int[4];
        this.LLIZLLLIL = new int[2];
        this.LLJ = new int[2];
        this.LLJI = new Rect();
        this.LLJIJIL = new Rect();
        C12ES.LJIIJ(getContext());
        this.LLJILJILJ = C12ES.LJIIIIZZ(getContext());
        this.LLJJIJIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJJJJJIL = new int[4];
        ViewGroup.inflate(context, R.layout.hn0, this);
        this.LLILLL = findViewById(R.id.me7);
        this.LLILZ = findViewById(R.id.fl3);
        this.LLILZIL = findViewById(R.id.cg9);
        this.LLILLJJLI = (TextView) findViewById(R.id.fl4);
        this.LLILZLL = findViewById(R.id.cg8);
    }
}
