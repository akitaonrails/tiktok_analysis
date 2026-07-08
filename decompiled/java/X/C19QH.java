package X;

import Y.ARunnableS128S0100000_28;
import Y.ARunnableS66S0300000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19QH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QH extends FrameLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public final BPEAHandler LL;
    public final List<View> LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public final LinkedList<InterfaceC984120biU> LLILZIL;
    public ValueAnimator LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.removeCallbacksAndMessages(null);
        this.LLILZIL.clear();
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            C962250b9D.LIZLLL(valueAnimator);
        }
        this.LLILZ = false;
    }

    public final View getCurShowingView() {
        return this.LLILLL;
    }

    public final void LJFF(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("èèèèèèèèè tryFlipView isFlipping:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", fromAnimEnd:");
        sbLIZ.append(z);
        sbLIZ.append(", size:");
        sbLIZ.append(this.LLILZIL.size());
        C20441214yg.LIZIZ("CustomViewFlipper", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZ && !z) {
            return;
        }
        View curShowingView = getCurShowingView();
        if (curShowingView == null) {
            C20441214yg.LJ("CustomViewFlipper", "èèèèèèèèè tryFlipView return, curShowingView is null");
            return;
        }
        while (this.LLILZIL.size() > 0) {
            InterfaceC984120biU interfaceC984120biUPoll = this.LLILZIL.poll();
            if (interfaceC984120biUPoll instanceof C19QJ) {
                C20441214yg.LIZIZ("CustomViewFlipper", "èèèèèèèèè launchNextAnim DelayAction");
                this.LL.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(((C19QJ) interfaceC984120biUPoll).LIZ, this.LL, new ARunnableS128S0100000_28(this, 14));
            } else if (interfaceC984120biUPoll instanceof C19QG) {
                C19QG c19qg = (C19QG) interfaceC984120biUPoll;
                if (Intrinsics.LJFF(c19qg.LIZ, curShowingView)) {
                    C20441214yg.LJ("CustomViewFlipper", "èèèèèèèèè launchNextAnim Flip2UpAction return, due to same nextView");
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("èèèèèèèèè launchFlip2UpAnim animDuration:");
                    sbLIZ2.append(c19qg.LIZIZ);
                    C20441214yg.LIZIZ("CustomViewFlipper", C2188811AlT.LIZIZ(sbLIZ2));
                    if (c19qg.LIZIZ <= 0) {
                        LJ(curShowingView, c19qg, this);
                    } else {
                        ARunnableS66S0300000_33 aRunnableS66S0300000_33 = new ARunnableS66S0300000_33(curShowingView, c19qg, this, 1);
                        if (getWidth() > 0) {
                            aRunnableS66S0300000_33.run();
                        } else {
                            HandlerHook.viewPost(this, aRunnableS66S0300000_33);
                        }
                    }
                }
            } else if (interfaceC984120biUPoll instanceof C983850bi3) {
                C983850bi3 c983850bi3 = (C983850bi3) interfaceC984120biUPoll;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("èèèèèèèèè launchFlip2StartAnim animDuration:");
                sbLIZ3.append(c983850bi3.LIZ);
                C20441214yg.LIZIZ("CustomViewFlipper", C2188811AlT.LIZIZ(sbLIZ3));
                if (c983850bi3.LIZ <= 0) {
                    LIZLLL(curShowingView, this);
                } else {
                    ARunnableS66S0300000_33 aRunnableS66S0300000_332 = new ARunnableS66S0300000_33(curShowingView, c983850bi3, this, 0);
                    if (getWidth() > 0) {
                        aRunnableS66S0300000_332.run();
                    } else {
                        HandlerHook.viewPost(this, aRunnableS66S0300000_332);
                    }
                }
            }
            C20441214yg.LIZIZ("CustomViewFlipper", "èèèèèèèèè tryFlipView set isFlipping to true");
            this.LLILZ = true;
            return;
        }
        C20441214yg.LIZIZ("CustomViewFlipper", "èèèèèèèèè tryFlipView set isFlipping to false");
        this.LLILZ = false;
    }

    public C19QH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new BPEAHandler(Looper.getMainLooper());
        this.LLILLJJLI = new ArrayList();
        this.LLILZIL = new LinkedList<>();
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.19QI
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (view2 != null) {
                    if (this.LL.LLILLL != null) {
                        C500260Jjc.LJIILIIL(view2);
                        ((ArrayList) this.LL.LLILLJJLI).add(view2);
                    } else {
                        C500260Jjc.LLFFF(view2);
                        C19QH c19qh = this.LL;
                        c19qh.LLILLL = view2;
                        ListProtector.add(c19qh.LLILLJJLI, 0, view2);
                    }
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
                if (view2 != null) {
                    ((ArrayList) this.LL.LLILLJJLI).remove(view2);
                }
                if (((ArrayList) this.LL.LLILLJJLI).size() == 0 || view2 == this.LL.LLILLL) {
                    this.LL.LLILLL = null;
                }
            }
        });
    }

    public static final void LIZLLL(View view, C19QH c19qh) {
        C20441214yg.LIZIZ("CustomViewFlipper", "èèèèèèèèè launchFlip2StartAnim doOnAnimationEnd");
        C500260Jjc.LJIILIIL(view);
        C786410Ut5.Jc(view, view.getWidth() * (-1.0f));
        C786410Ut5.ed(view, 0.0f);
        view.invalidate();
        HandlerHook.viewPost(c19qh, new ARunnableS128S0100000_28(c19qh, 12));
    }

    public final void LIZ(InterfaceC984120biU interfaceC984120biU, long j) {
        if (!(interfaceC984120biU instanceof C19QJ) && j > 0) {
            InterfaceC984120biU interfaceC984120biUPeekLast = this.LLILZIL.peekLast();
            if (interfaceC984120biUPeekLast instanceof C19QJ) {
                C19QJ c19qj = (C19QJ) interfaceC984120biUPeekLast;
                c19qj.LIZ = Math.max(c19qj.LIZ, j);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("èèèèèèèèè update DelayAction delayInMs:");
                sbLIZ.append(c19qj.LIZ);
                C20441214yg.LIZIZ("CustomViewFlipper", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("èèèèèèèèè offer DelayAction delayInMs:");
                sbLIZ2.append(j);
                C20441214yg.LIZIZ("CustomViewFlipper", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLILZIL.offer(new C19QJ(j));
            }
        }
        this.LLILZIL.offer(interfaceC984120biU);
        LJFF(false);
    }

    public static final void LJ(View view, C19QG c19qg, C19QH c19qh) {
        C20441214yg.LIZIZ("CustomViewFlipper", "èèèèèèèèè launchFlip2UpAnim doOnAnimationEnd");
        C500260Jjc.LJIILIIL(view);
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, c19qh.getHeight() * (-1.0f));
        ((ArrayList) c19qh.LLILLJJLI).remove(view);
        ((ArrayList) c19qh.LLILLJJLI).add(view);
        View view2 = c19qg.LIZ;
        c19qh.LLILLL = view2;
        if (view2 != null) {
            C786410Ut5.Jc(view2, 0.0f);
        }
        View view3 = c19qh.LLILLL;
        if (view3 != null) {
            C786410Ut5.ed(view3, 0.0f);
        }
        C500260Jjc.LLFFF(c19qh.LLILLL);
        View view4 = c19qh.LLILLL;
        if (view4 != null) {
            view4.invalidate();
        }
        View view5 = c19qg.LIZ;
        ((ArrayList) c19qh.LLILLJJLI).remove(view5);
        ListProtector.add(c19qh.LLILLJJLI, 0, view5);
        HandlerHook.viewPost(c19qh, new ARunnableS128S0100000_28(c19qh, 13));
    }

    public final void LIZIZ(long j, long j2, View view) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next == view) {
                if (next != null) {
                    LIZ(new C19QG(j2, view), j);
                    return;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flip2Up can not find nextChild, delayInMs:");
        sbLIZ.append(j);
        sbLIZ.append(", flipUpAnimDuration:");
        sbLIZ.append(j2);
        sbLIZ.append(", childIndex size:");
        sbLIZ.append(((ArrayList) this.LLILLJJLI).size());
        C20441214yg.LJ("CustomViewFlipper", C2188811AlT.LIZIZ(sbLIZ));
    }
}
