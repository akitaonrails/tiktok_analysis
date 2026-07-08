package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009520cNS {
    public boolean LIZ;
    public InterfaceC1009710cNl LIZIZ;
    public ViewGroup LIZJ;
    public InterfaceC1009720cNm LIZLLL;

    public final ViewGroup LIZ(InterfaceC1009710cNl interfaceC1009710cNl) {
        if (!this.LIZ) {
            this.LIZIZ = interfaceC1009710cNl;
        }
        return this.LIZJ;
    }

    public final void LIZIZ(boolean z) {
        InterfaceC1009720cNm interfaceC1009720cNm = this.LIZLLL;
        if (interfaceC1009720cNm != null) {
            interfaceC1009720cNm.LIZ(z);
        }
    }

    public final void LIZJ(C1009580cNY c1009580cNY) {
        InterfaceC1009710cNl interfaceC1009710cNl = this.LIZIZ;
        if (interfaceC1009710cNl != null && Intrinsics.LJFF(interfaceC1009710cNl, c1009580cNY)) {
            this.LIZIZ = null;
        }
    }

    public final void LIZLLL(ViewGroup viewGroup, C1619860sFs c1619860sFs) {
        this.LIZJ = viewGroup;
        this.LIZLLL = c1619860sFs;
        if (!this.LIZ) {
            this.LIZ = true;
            InterfaceC1009710cNl interfaceC1009710cNl = this.LIZIZ;
            if (interfaceC1009710cNl != null) {
                interfaceC1009710cNl.LIZ();
            }
            this.LIZIZ = null;
        }
    }
}
