package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.game.broadcast.service.ForegroundMirrorCastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMirrorServiceStrategySetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C433901mT {
    public static final /* synthetic */ int LIZ = 0;

    public static C11JF LIZ(Fragment fragment, Function0 function0) {
        if (LiveMirrorServiceStrategySetting.INSTANCE.isExperimentGroup()) {
            function0.invoke();
            return null;
        }
        return (C11JF) C11RB.LIZIZ(fragment).LIZIZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.01mV
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (obj == Lifecycle.Event.ON_RESUME) {
                    return true;
                }
                return false;
            }
        }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(function0, 238), new C09JN() { // from class: X.00qU
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MirrorCastServiceHelper@b08f.resumeObserve$3");
                C20441214yg.LJI("MirrorCastServiceHelper", (Throwable) obj);
                C1C7U.LIZIZ("MirrorCastServiceHelper@b08f.resumeObserve$3");
            }
        });
    }

    public static InterfaceC420801kM LIZIZ(Fragment fragment, Function0 function0) {
        return ((C0J1N) ForegroundMirrorCastService.statusNow.LJJIL(new InterfaceC19483011Ki() { // from class: X.01mU
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ForegroundMirrorCastService.isCreate();
            }
        }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(fragment))).LIZ(new C516201zk(function0, 239), new C09JN() { // from class: X.00qX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MirrorCastServiceHelper@b08f.serviceCreateObserve$3");
                C20441214yg.LJI("MirrorCastServiceHelper", (Throwable) obj);
                C1C7U.LIZIZ("MirrorCastServiceHelper@b08f.serviceCreateObserve$3");
            }
        });
    }
}
