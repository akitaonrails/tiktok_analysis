package X;

import android.view.SurfaceView;
import com.ss.android.vesdk.VEEditor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1DOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255061DOe {
    public VEEditor LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public InterfaceC1464190oCn LIZJ;
    public volatile InterfaceC1464200oCo LIZLLL;
    public volatile InterfaceC1464200oCo LJ;

    public C2255061DOe(String str, SurfaceView surfaceView) {
        new InterfaceC1464190oCn() { // from class: X.1DOg
            @Override // X.InterfaceC1464190oCn
            public final void onRendered() {
                InterfaceC1464190oCn interfaceC1464190oCn;
                if (!this.LIZ.LIZIZ.compareAndSet(false, true) || (interfaceC1464190oCn = this.LIZ.LIZJ) == null) {
                    return;
                }
                interfaceC1464190oCn.onRendered();
            }
        };
    }
}
