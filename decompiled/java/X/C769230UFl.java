package X;

import android.app.Dialog;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS152S0101000_12;

/* JADX INFO: renamed from: X.0UFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769230UFl extends AbstractC1120020fFg {
    public final DataChannel LL;
    public final int LLILLJJLI = 2;
    public final float LLILLL;
    public final BaseFragment LLILZ;
    public boolean LLILZIL;
    public VelocityTracker LLILZLL;
    public final InterfaceC767240U7u LLIZ;
    public final InterfaceC767150U7l<? extends LiveEffect> LLIZLLLIL;
    public final GestureDetector LLJ;
    public final C01GW LLJI;

    @Override // X.AbstractC1120020fFg
    public final void LIZLLL() {
        VelocityTracker velocityTracker = this.LLILZLL;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        VelocityTracker velocityTracker2 = this.LLILZLL;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.LLILZLL = null;
    }

    public final InterfaceC769240UFm LJFF() {
        return (InterfaceC769240UFm) this.LLJI.getValue();
    }

    @Override // X.AbstractC1120020fFg
    public final int LIZIZ() {
        return this.LLILLJJLI;
    }

    public final void LJI(int i) {
        DialogFragment dialogFragment;
        Dialog dialog;
        if (this.LLILZ.isAdded()) {
            Fragment fragmentLJJJJZI = this.LLILZ.getChildFragmentManager().LJJJJZI("LiveBeautyFilterDialogFragment");
            if ((fragmentLJJJJZI instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                return;
            }
        }
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        if (numLIZIZ != null && numLIZIZ.intValue() == i) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIFFI;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            c20337914i1.LJFF(Boolean.TRUE);
        }
        InterfaceC767150U7l<? extends LiveEffect> interfaceC767150U7l = this.LLIZLLLIL;
        if (interfaceC767150U7l != null) {
            interfaceC767150U7l.LIZJ(i);
        }
        C768460UCm.LJFF();
        C767120U7i.LIZJ("FilterGestureDetector#setLiveFilterPos", false);
        C768460UCm.LJFF();
        C767120U7i.LJI(this.LL, "FilterGestureDetector#setLiveFilterPos", false, false);
        C768460UCm.LJFF();
        C767120U7i.LIZ("FilterGestureDetector#setLiveFilterPos");
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        LJFF().LIZ(this.LL, true);
        return super.onDown(motionEvent);
    }

    @Override // X.AbstractC1120020fFg
    public final boolean LJ(MotionEvent motionEvent, C0UKP c0ukp, View view) {
        float xVelocity;
        if (C0UK0.LIZIZ) {
            C20441214yg.LIZIZ("FilterGestureDetector", "onTouchEvent: ExposureBar.adjusting");
            return false;
        }
        if (!LJFF().LJIIIIZZ()) {
            return false;
        }
        if (this.LLILZLL == null) {
            this.LLILZLL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LLILZLL;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 0) {
            C20441214yg.LIZIZ("FilterGestureDetector", "onTouchEvent: action down");
            this.LLILZIL = false;
            LJFF().LJFF();
        }
        boolean zOnTouchEvent = true;
        if (motionEvent.getPointerCount() > 1) {
            this.LLILZIL = true;
        }
        if (this.LLILZIL) {
            return false;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !LJFF().LIZIZ()) {
            VelocityTracker velocityTracker2 = this.LLILZLL;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            VelocityTracker velocityTracker3 = this.LLILZLL;
            float yVelocity = 0.0f;
            if (velocityTracker3 != null) {
                xVelocity = velocityTracker3.getXVelocity();
            } else {
                xVelocity = 0.0f;
            }
            VelocityTracker velocityTracker4 = this.LLILZLL;
            if (velocityTracker4 != null) {
                yVelocity = velocityTracker4.getYVelocity();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processUpOrCancel: ACTION_UP, velocityX: ");
            sbLIZ.append(xVelocity);
            sbLIZ.append(", velocityY: ");
            sbLIZ.append(yVelocity);
            C20441214yg.LIZIZ("FilterGestureDetector", C2188811AlT.LIZIZ(sbLIZ));
            if (Math.abs(xVelocity) > 100.0f) {
                zOnTouchEvent = this.LLJ.onTouchEvent(motionEvent);
            } else {
                LJFF().LJIIIZ(new AwS152S0101000_12(this, LJFF().LJII(), 1));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onTouchEvent: ACTION_UP, result: ");
            sbLIZ2.append(zOnTouchEvent);
            C20441214yg.LIZIZ("FilterGestureDetector", C2188811AlT.LIZIZ(sbLIZ2));
            return zOnTouchEvent;
        }
        return this.LLJ.onTouchEvent(motionEvent);
    }

    public C769230UFl(Context context, DataChannel dataChannel, float f, BaseFragment baseFragment) {
        AbstractC766100U3k<T> abstractC766100U3k;
        this.LL = dataChannel;
        this.LLILLL = f;
        this.LLILZ = baseFragment;
        InterfaceC767240U7u liveComposerFilterHelper = C781270Ukn.LJI().getLiveComposerFilterHelper();
        this.LLIZ = liveComposerFilterHelper;
        this.LLIZLLLIL = C768460UCm.LJI();
        this.LLJ = new GestureDetector(context, this);
        this.LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(6));
        int iIntValue = InterfaceC766480U4w.LIZ.LIZIZ().intValue();
        C767210U7r c767210U7r = (C767210U7r) liveComposerFilterHelper;
        int iLIZJ = c767210U7r.LIZJ();
        if (iIntValue >= 0 && iIntValue < ((ArrayList) c767210U7r.LIZ.LIZ).size()) {
            C0U5Z c0u5z = c767210U7r.LIZ;
            if (!c0u5z.LJI((LiveEffect) ListProtector.get(c0u5z.LIZ, iIntValue))) {
                C0U5Z c0u5z2 = c767210U7r.LIZ;
                Object obj = ListProtector.get(c0u5z2.LIZ, iIntValue);
                ComposerFilterViewModel composerFilterViewModel = c0u5z2.LJ;
                if (composerFilterViewModel == null || (abstractC766100U3k = composerFilterViewModel.LL) == 0 || !abstractC766100U3k.LIZ.contains(obj)) {
                    C0U5Z c0u5z3 = c767210U7r.LIZ;
                    c0u5z3.LJ((LiveEffect) ListProtector.get(c0u5z3.LIZ, iIntValue));
                    return;
                }
                return;
            }
            c767210U7r.LJ(iLIZJ, iIntValue);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (motionEvent2 == null || motionEvent == null) {
            return false;
        }
        if (Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) > Math.abs(motionEvent.getRawY() - motionEvent2.getRawY())) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFling, isScrollX: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("FilterGestureDetector", C2188811AlT.LIZIZ(sbLIZ));
        if (!z && !C769260UFo.LIZ) {
            return false;
        }
        LJFF().LJ(new AwS152S0101000_12(this, LJFF().LJII(), 0));
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs;
        boolean z;
        if (motionEvent2 == null || motionEvent == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScroll, x: ");
        sbLIZ.append(motionEvent.getRawX() - motionEvent2.getRawX());
        sbLIZ.append(", y: ");
        sbLIZ.append(motionEvent.getRawY() - motionEvent2.getRawY());
        C20441214yg.LIZIZ("FilterGestureDetector", C2188811AlT.LIZIZ(sbLIZ));
        if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) > Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) {
            return false;
        }
        C769260UFo.LIZ = true;
        if (LJFF().LIZIZ()) {
            float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
            InterfaceC769240UFm interfaceC769240UFmLJFF = LJFF();
            if (rawX > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            interfaceC769240UFmLJFF.LJI(z);
            LJFF().LIZ(this.LL, false);
            LJFF().LJIIJ();
        }
        if (LJFF().LIZLLL()) {
            fAbs = Math.abs(Math.max(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LLILLL);
        } else {
            fAbs = 1 - Math.abs(Math.min(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LLILLL);
        }
        LJFF().LIZJ(fAbs);
        return false;
    }
}
