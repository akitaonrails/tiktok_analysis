package X;

import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0KsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531210KsR implements InterfaceC782970UnX {
    public final FrameLayout LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1053));

    @Override // X.InterfaceC782970UnX
    public final SurfaceView LJLIIIL() {
        return (SurfaceView) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC782970UnX
    public final void LLLJIL() {
        C436180H8m.LIZIZ((View) this.LLILLJJLI.getValue());
    }

    public C531210KsR(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }
}
