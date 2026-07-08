package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0S0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714490S0x implements InterfaceC714480S0w {
    public final C01GW LIZ = C452501pT.LIZIZ(new C714500S0y());

    @Override // X.InterfaceC714480S0w
    public final void LIZ(int i) {
        Iterator it2 = ((ConcurrentHashSet) this.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC714480S0w) it2.next()).LIZ(i);
        }
    }

    @Override // X.InterfaceC714480S0w
    public final void LIZIZ(MotionEvent motionEvent, View view) {
        Iterator it2 = ((ConcurrentHashSet) this.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC714480S0w) it2.next()).LIZIZ(motionEvent, view);
        }
    }

    @Override // X.InterfaceC714480S0w
    public final void LIZJ(View view, MotionEvent motionEvent, MotionEvent motionEvent2) {
        Iterator it2 = ((ConcurrentHashSet) this.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC714480S0w) it2.next()).LIZJ(view, motionEvent, motionEvent2);
        }
    }
}
