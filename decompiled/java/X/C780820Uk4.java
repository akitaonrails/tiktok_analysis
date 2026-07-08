package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0Uk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780820Uk4 extends AbstractC1120020fFg {
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final int LLILLL;
    public final BaseFragment LLILZ;
    public final View LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 7));
    public long LLIZ;
    public final GestureDetector LLIZLLLIL;

    @Override // X.AbstractC1120020fFg
    public final int LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LLIZ = System.currentTimeMillis();
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        InputMethodManager inputMethodManager;
        if (C500260Jjc.LJJJI(Boolean.valueOf(this.LLILZ.isViewValid()))) {
            try {
                C19EG activity = this.LLILZ.getActivity();
                Object objJ2 = null;
                if (activity != null) {
                    objJ2 = C786410Ut5.J2(activity, "input_method");
                }
                if ((objJ2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objJ2) != null) {
                    inputMethodManager.hideSoftInputFromWindow(this.LLILZIL.getWindowToken(), 0);
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C781010UkN c781010UkN;
        super.onLongPress(motionEvent);
        Object objGg0 = this.LLILLJJLI.gg0(LiveCenterStatusChannel.class);
        Object objGg02 = this.LLILLJJLI.gg0(LiveExtendedScreenStatus.class);
        if (objGg0 == null || objGg0 == C0UVH.DISMISS) {
            if ((objGg02 == null || objGg02 == EnumC1083260eIO.HIDE) && (c781010UkN = (C781010UkN) this.LLILZLL.getValue()) != null) {
                c781010UkN.LIZIZ();
            }
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent == null || Math.abs(System.currentTimeMillis() - this.LLIZ) <= 1000) {
            return false;
        }
        this.LLILLJJLI.LC0(BaseSingleTapEvent.class, motionEvent);
        return false;
    }

    @Override // X.AbstractC1120020fFg
    public final boolean LJ(MotionEvent motionEvent, C0UKP c0ukp, View view) {
        if (this.LLILLJJLI.gg0(LiveCenterStatusChannel.class) == C0UVH.DISMISS && this.LLILLJJLI.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.HIDE) {
            return this.LLIZLLLIL.onTouchEvent(motionEvent);
        }
        return false;
    }

    public C780820Uk4(Context context, DataChannel dataChannel, int i, BaseFragment baseFragment, View view) {
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = i;
        this.LLILZ = baseFragment;
        this.LLILZIL = view;
        this.LLIZLLLIL = new GestureDetector(context, this);
    }
}
