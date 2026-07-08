package X;

import Y.AObjectS360S0100000_17;
import Y.AObjectS392S0100000_17;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078400eAY extends C1078410eAZ {
    public final BaseFragment LL;
    public final DataChannel LLILLJJLI;
    public final View LLILLL;
    public final Function0<Boolean> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function1<MotionEvent, Boolean> LLILZLL;
    public final InterfaceC1631630sYr<MotionEvent, MotionEvent, Float, Float, Boolean> LLIZ;
    public final InterfaceC1631630sYr<MotionEvent, MotionEvent, Float, Float, Boolean> LLIZLLLIL;
    public final Function1<MotionEvent, Boolean> LLJ = null;
    public final Function1<? super MotionEvent, Boolean> LLJI;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Boolean> function1 = this.LLJI;
        if (function1 == null || !function1.invoke(motionEvent).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        Boolean boolValueOf;
        Object objJ2;
        InputMethodManager inputMethodManager;
        C19EG activity;
        BaseFragment baseFragment = this.LL;
        IBinder windowToken = null;
        if (baseFragment != null) {
            boolValueOf = Boolean.valueOf(baseFragment.isViewValid());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            try {
                BaseFragment baseFragment2 = this.LL;
                if (baseFragment2 != null && (activity = baseFragment2.getActivity()) != null) {
                    objJ2 = C786410Ut5.J2(activity, "input_method");
                } else {
                    objJ2 = null;
                }
                if ((objJ2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objJ2) != null) {
                    View view = this.LLILLL;
                    if (view != null) {
                        windowToken = view.getWindowToken();
                    }
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                    return true;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return true;
            }
        }
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ViewParent viewParent;
        Function0<Boolean> function0 = this.LLILZ;
        if (function0 != null && function0.invoke().booleanValue()) {
            return;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C781120UkY.class), Boolean.TRUE)) {
            return;
        }
        super.onLongPress(motionEvent);
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && dataChannel2.gg0(RoomChannel.class) != null) {
            C784440Upu.LIZ().LIZIZ(new C465900IOu());
            Function0<Unit> function02 = this.LLILZIL;
            if (function02 != null) {
                function02.invoke();
            }
            KeyEvent.Callback callback = this.LLILLL;
            if ((callback instanceof ViewParent) && (viewParent = (ViewParent) callback) != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean zOnSingleTapConfirmed;
        if (motionEvent != null) {
            Function1<MotionEvent, Boolean> function1 = this.LLILZLL;
            if (function1 != null) {
                zOnSingleTapConfirmed = function1.invoke(motionEvent).booleanValue();
            } else {
                zOnSingleTapConfirmed = super.onSingleTapConfirmed(motionEvent);
            }
            if (zOnSingleTapConfirmed) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null && this.LLIZ.invoke(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC1631630sYr<MotionEvent, MotionEvent, Float, Float, Boolean> interfaceC1631630sYr;
        if (motionEvent == null || motionEvent2 == null || (interfaceC1631630sYr = this.LLIZLLLIL) == null || !interfaceC1631630sYr.invoke(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) {
            return false;
        }
        return true;
    }

    public C1078400eAY(BaseFragment baseFragment, DataChannel dataChannel, View view, AObjectS392S0100000_17 aObjectS392S0100000_17, AObjectS392S0100000_17 aObjectS392S0100000_172, AObjectS360S0100000_17 aObjectS360S0100000_17, C1077880e9i c1077880e9i, C1077890e9j c1077890e9j, AObjectS360S0100000_17 aObjectS360S0100000_172) {
        this.LL = baseFragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = view;
        this.LLILZ = aObjectS392S0100000_17;
        this.LLILZIL = aObjectS392S0100000_172;
        this.LLILZLL = aObjectS360S0100000_17;
        this.LLIZ = c1077880e9i;
        this.LLIZLLLIL = c1077890e9j;
        this.LLJI = aObjectS360S0100000_172;
    }
}
