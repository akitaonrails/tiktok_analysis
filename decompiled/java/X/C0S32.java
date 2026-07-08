package X;

import Y.AObjectS386S0100000_11;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.mediabox.arch.viewmodel.SimArchLiveData;
import com.ss.android.ugc.mediabox.playerui.viewmodel.GestureViewModel;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0S32, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S32 extends C0S34 {
    public final C01GW LJI = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 26));
    public final C0S35 LJII = new C0S3A() { // from class: X.0S35
        @Override // X.C0S3A
        public final void LIZ(MotionEvent motionEvent) {
            SimArchLiveData<Unit> simArchLiveData;
            GestureViewModel gestureViewModel = (GestureViewModel) this.LIZ.LJI.getValue();
            if (gestureViewModel != null && (simArchLiveData = gestureViewModel.LLILLJJLI) != null) {
                simArchLiveData.setValue(Unit.LIZ);
            }
        }
    };
    public final C0S39 LJIIIIZZ = new C0S39();

    @Override // X.C0S34, X.C0S3C
    public final void LJI(InterfaceC690390R6f interfaceC690390R6f) {
        C0S19 c0s19;
        Context context;
        super.LJI(interfaceC690390R6f);
        View viewLJFF = LJFF();
        if ((viewLJFF instanceof C0S19) && (c0s19 = (C0S19) viewLJFF) != null) {
            InterfaceC690370R6d interfaceC690370R6d = this.LJ;
            if (interfaceC690370R6d != null) {
                interfaceC690370R6d.LIZLLL();
            }
            if (c0s19.getDetector() == null) {
                C0S36 c0s36 = this.LJIIIIZZ.LIZ;
                C0S35 c0s35 = this.LJII;
                if (!((ArrayList) c0s36.LIZ).contains(c0s35)) {
                    ((ArrayList) c0s36.LIZ).add(c0s35);
                }
                InterfaceC715010S2x interfaceC715010S2x = this.LIZ;
                if (interfaceC715010S2x != null && (context = interfaceC715010S2x.context()) != null) {
                    C0S37 c0s37 = new C0S37(context, this.LJIIIIZZ.LIZ);
                    c0s19.setEnableDetectChildTouch(true);
                    c0s19.setDetector(c0s37);
                }
            }
        }
    }
}
