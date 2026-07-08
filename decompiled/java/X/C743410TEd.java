package X;

import Y.AfS181S0100000_12;
import android.util.Log;
import com.bytedance.android.livesdk.game.broadcast.widget.PhoneAsCameraSurfaceWidget;

/* JADX INFO: renamed from: X.0TEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743410TEd implements InterfaceC743420TEe {
    public final /* synthetic */ PhoneAsCameraSurfaceWidget LIZ;

    @Override // X.InterfaceC743420TEe
    public final void LIZ() {
        ((C0J1N) this.LIZ.LLJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS181S0100000_12(this.LIZ, 102), new C09JN() { // from class: X.0T6v
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PhoneAsCameraSurfaceWidget@525f.listener$1$onInitSucceed$2");
                C20441214yg.LJ("phoneAsCameraSurface", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("PhoneAsCameraSurfaceWidget@525f.listener$1$onInitSucceed$2");
            }
        });
    }

    public C743410TEd(PhoneAsCameraSurfaceWidget phoneAsCameraSurfaceWidget) {
        this.LIZ = phoneAsCameraSurfaceWidget;
    }
}
