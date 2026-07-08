package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0RR2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RR2 implements View.OnTouchListener {
    public final View LL;
    public final View.OnTouchListener LLILLJJLI;
    public final boolean LLILLL = C695780RQy.LIZ();
    public final C698900RbE LLILZ = new InterfaceC712550RxF() { // from class: X.0RbE
        public InterfaceC698970RbL LIZ;

        @Override // X.InterfaceC712550RxF
        public final boolean LIZ() {
            InterfaceC698970RbL interfaceC698970RbL = this.LIZ;
            return interfaceC698970RbL != null && (interfaceC698970RbL instanceof C700520Rdq);
        }

        @Override // X.InterfaceC712550RxF
        public final void LIZIZ(MotionEvent motionEvent) {
            InterfaceC698970RbL interfaceC698970RbL = this.LIZ;
            if (interfaceC698970RbL == null) {
                return;
            }
            try {
                if (interfaceC698970RbL instanceof C700520Rdq) {
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    Rect rectLIZ = ((C700520Rdq) interfaceC698970RbL).LIZ();
                    if (rectLIZ != null && rectLIZ.contains(rawX, rawY)) {
                        ((C700520Rdq) interfaceC698970RbL).LIZ.performClick();
                        ((C700520Rdq) interfaceC698970RbL).LIZLLL(motionEvent);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("component unify hotspot error:");
                sbLIZ.append(e);
                C1AF0.LJ(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
            }
        }

        @Override // X.InterfaceC712550RxF
        public final boolean LIZJ(MotionEvent motionEvent) {
            C698930RbH c698930RbH;
            Iterable<InterfaceC698970RbL> iterable;
            try {
                this.LIZ = null;
                TouchDelegate touchDelegate = this.LIZIZ.LL.getTouchDelegate();
                if (!(touchDelegate instanceof C698930RbH) || (c698930RbH = (C698930RbH) touchDelegate) == null || !c698930RbH.LIZLLL || (c698930RbH.LJ && c698930RbH.LJFF)) {
                    return false;
                }
                Rect rect = new Rect();
                this.LIZIZ.LL.getGlobalVisibleRect(rect);
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (!rect.contains(rawX, rawY)) {
                    return false;
                }
                if (!c698930RbH.LIZLLL) {
                    iterable = C13BV.INSTANCE;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!c698930RbH.LJ) {
                        arrayList.addAll(c698930RbH.LIZIZ.LIZJ);
                    }
                    iterable = arrayList;
                    if (!c698930RbH.LJFF) {
                        arrayList.addAll(c698930RbH.LIZIZ.LIZIZ);
                        iterable = arrayList;
                    }
                }
                for (InterfaceC698970RbL interfaceC698970RbL : iterable) {
                    Rect rectLIZ = interfaceC698970RbL.LIZ();
                    if (rectLIZ != null && rectLIZ.contains(rawX, rawY)) {
                        this.LIZ = interfaceC698970RbL;
                        return interfaceC698970RbL instanceof C700540Rds;
                    }
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0RbE] */
    public C0RR2(View.OnTouchListener onTouchListener, View view) {
        this.LL = view;
        this.LLILLJJLI = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0RR3 c0rr3;
        if (this.LLILLL) {
            View.OnTouchListener onTouchListener = this.LLILLJJLI;
            if ((onTouchListener instanceof C0RR3) && (c0rr3 = (C0RR3) onTouchListener) != null) {
                c0rr3.Kl(this.LLILZ);
            }
        }
        return this.LLILLJJLI.onTouch(view, motionEvent);
    }
}
