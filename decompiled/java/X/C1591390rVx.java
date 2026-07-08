package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1591390rVx extends C1591410rVz {
    public float LLZZ;
    public float LLZZJLIL;
    public final List<InterfaceC1591420rW0> LLZZLLIL;
    public final List<InterfaceC739890T0p> LLZZZIL;
    public final C01GW LLZZZZ;

    private final int getTouchSlopDistance() {
        return ((Number) this.LLZZZZ.getValue()).intValue();
    }

    public final List<InterfaceC739890T0p> getOnActionDownListeners() {
        return this.LLZZZIL;
    }

    public final List<InterfaceC1591420rW0> getOnInterceptTouchEventListeners() {
        return this.LLZZLLIL;
    }

    private final boolean dispatchTouchEvent$redex$base(MotionEvent motionEvent) {
        Iterator it2 = ((ArrayList) this.LLZZLLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1591420rW0) it2.next()).dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final boolean dispatchTouchEvent$redex$opt(MotionEvent motionEvent) {
        ArrayList arrayList = (ArrayList) this.LLZZLLIL;
        int i = 0;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC1591420rW0) obj).dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C1591410rVz, X.C21600219g8, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!ReDexExperimentOpt.getAbTest()) {
            return dispatchTouchEvent$redex$base(motionEvent);
        }
        return dispatchTouchEvent$redex$opt(motionEvent);
    }

    @Override // X.C1591410rVz, X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                boolean z2 = false;
                if (Math.abs(this.LLZZ - x) > getTouchSlopDistance()) {
                    z = true;
                } else {
                    z = false;
                }
                Iterator it2 = ((ArrayList) this.LLZZLLIL).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((InterfaceC1591420rW0) it2.next()).k2(motionEvent, this.LLZZ, this.LLZZJLIL)) {
                        z2 = true;
                        break;
                    }
                }
                if (z && z2) {
                    this.LLILLJJLI.LIZJ(motionEvent.getX(), motionEvent.getY());
                    return true;
                }
            }
        } else {
            this.LLZZ = x;
            this.LLZZJLIL = y;
            Iterator it3 = ((ArrayList) this.LLZZZIL).iterator();
            while (it3.hasNext()) {
                ((InterfaceC739890T0p) it3.next()).F4(this.LLZZ, this.LLZZJLIL);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C1591390rVx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLZZLLIL = new ArrayList();
        this.LLZZZIL = new ArrayList();
        this.LLZZZZ = C452501pT.LIZIZ(new C1591400rVy(context));
    }
}
