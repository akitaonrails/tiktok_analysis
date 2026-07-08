package X;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: X.0Mj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576380Mj6 extends ScaleGestureDetectorOnScaleGestureListenerC19764412Uo {
    public final C576370Mj5 LLJJIJI;
    public final int LLJJIJIIJIL;
    public C538350L9l LLJJIJIL;

    public final C538350L9l getLocation() {
        return this.LLJJIJIL;
    }

    public final int getPosition() {
        return this.LLJJIJIIJIL;
    }

    public C576380Mj6(final C576370Mj5 c576370Mj5, C576370Mj5 c576370Mj52, int i) {
        super(c576370Mj52.getContext());
        this.LLJJIJI = c576370Mj52;
        this.LLJJIJIIJIL = i;
        setOnGestureInterceptor(new InterfaceC19764512Up() { // from class: X.0Mj7
            @Override // X.InterfaceC19764512Up
            public final boolean Ac() {
                InterfaceC576400Mj8 interfaceC576400Mj8 = c576370Mj5.LLILZ;
                if (interfaceC576400Mj8 == null) {
                    return false;
                }
                interfaceC576400Mj8.LIZLLL(this.getPosition());
                return true;
            }

            @Override // X.InterfaceC19764512Up
            public final boolean LIZ() {
                InterfaceC576400Mj8 interfaceC576400Mj8 = c576370Mj5.LLILZ;
                if (interfaceC576400Mj8 == null) {
                    return false;
                }
                C576380Mj6 c576380Mj6 = this;
                return interfaceC576400Mj8.LIZIZ(c576380Mj6, c576380Mj6.getPosition());
            }

            @Override // X.InterfaceC19764512Up
            public final void LIZIZ() {
                InterfaceC576400Mj8 interfaceC576400Mj8 = c576370Mj5.LLILZ;
                if (interfaceC576400Mj8 != null) {
                    interfaceC576400Mj8.LJ(this.getPosition());
                }
            }

            @Override // X.InterfaceC19764512Up
            public final void LIZJ() {
                InterfaceC576400Mj8 interfaceC576400Mj8 = c576370Mj5.LLILZ;
                if (interfaceC576400Mj8 != null) {
                    interfaceC576400Mj8.LIZ(this.getPosition());
                }
            }

            @Override // X.InterfaceC19764512Up
            public final boolean LIZLLL(ScaleGestureDetector scaleGestureDetector) {
                InterfaceC576400Mj8 interfaceC576400Mj8 = c576370Mj5.LLILZ;
                if (interfaceC576400Mj8 != null) {
                    return interfaceC576400Mj8.LIZJ(this.getPosition(), scaleGestureDetector);
                }
                return false;
            }
        });
        setMaxScale(c576370Mj5.LLJ);
    }
}
