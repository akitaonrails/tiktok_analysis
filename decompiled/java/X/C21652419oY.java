package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.19oY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21652419oY extends FrameLayout {
    public static long LLJIJIL;
    public static long LLJILJIL;
    public static final Object LLJILJILJ = new Object();
    public EnumC900290ZTn LL;
    public Function0<Boolean> LLILLJJLI;
    public EnumC1779570wPT LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public Function1<? super MotionEvent, Boolean> LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public C898860ZOa LLJ;
    public final C19290410dS LLJI;

    public C21652419oY(Context context) {
        this(context, null, 6);
    }

    public C21652419oY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<View> it2 = new C09RD(this).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                return;
            }
            View view = (View) c09re.next();
            int i = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LJIIIIZZ = AFwS224S0000000_33.get$arr$(338);
            c1397760mTe.LJII = getContext().getString(2131858380);
            C20094813ju.LIZ(view, c1397760mTe.LIZ());
        }
    }

    public final Function0<Unit> getDefaultOnDoubleTapAction() {
        return this.LLILZ;
    }

    public final Function0<Unit> getDefaultOnLongPressAction() {
        return this.LLILZIL;
    }

    public final Function1<MotionEvent, Boolean> getDefaultSwipeAction() {
        return this.LLILZLL;
    }

    public final C898860ZOa getGestureConfig() {
        return this.LLJ;
    }

    public final float getLastLongPressRawX() {
        return this.LLIZ;
    }

    public final float getLastLongPressRawY() {
        return this.LLIZLLLIL;
    }

    public final Function0<Boolean> getSingleClickInterceptor() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Boolean> function1;
        if (this.LL == EnumC900290ZTn.ONLINE) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            if (motionEvent.getActionMasked() == 0) {
                this.LLILLL = EnumC1779570wPT.INIT;
            }
            EnumC1779570wPT enumC1779570wPT = this.LLILLL;
            EnumC1779570wPT enumC1779570wPT2 = EnumC1779570wPT.SWIPE;
            if (enumC1779570wPT != enumC1779570wPT2) {
                this.LLJI.LIZ(motionEvent);
            }
            if (this.LLILLL != EnumC1779570wPT.LONG_PRESS && this.LLJ.LIZ && (function1 = this.LLILZLL) != null && function1.invoke(motionEvent).booleanValue()) {
                this.LLILLL = enumC1779570wPT2;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL == EnumC900290ZTn.ONLINE) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setDefaultOnDoubleTapAction(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setDefaultOnLongPressAction(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setDefaultSwipeAction(Function1<? super MotionEvent, Boolean> function1) {
        this.LLILZLL = function1;
    }

    public final void setGestureConfig(C898860ZOa c898860ZOa) {
        this.LLJ = c898860ZOa;
    }

    public final void setSingleClickInterceptor(Function0<Boolean> function0) {
        this.LLILLJJLI = function0;
    }

    public C21652419oY(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = EnumC900290ZTn.ONLINE;
        this.LLILLL = EnumC1779570wPT.INIT;
        this.LLIZ = Float.NaN;
        this.LLIZLLLIL = Float.NaN;
        this.LLJ = new C898860ZOa(true, true, true, true);
        this.LLJI = new C19290410dS(context, new C2189811An5(this, 1), new BPEAHandler(Looper.getMainLooper()));
    }
}
