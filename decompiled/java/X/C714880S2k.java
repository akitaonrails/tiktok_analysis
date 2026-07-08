package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.mediabox.playerui.viewmodel.LegacyPlayerVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714880S2k implements InterfaceC715080S3e {
    public final C0R7T LIZ;
    public final C714930S2p LIZIZ;
    public InterfaceC1484830ok5 LIZJ;
    public InterfaceC1483670oiD LIZLLL;

    @Override // X.InterfaceC715080S3e
    public final InterfaceC1484830ok5 getPlayer() {
        C0R7T c0r7t = this.LIZ;
        if (c0r7t != null && c0r7t.LIZ != null) {
            return null;
        }
        if (this.LIZJ == null) {
            this.LIZJ = C582130MsN.LIZ().LIZJ(null);
        }
        return this.LIZJ;
    }

    public final void LIZ(InterfaceC1483670oiD interfaceC1483670oiD) {
        if (Intrinsics.LJFF(interfaceC1483670oiD, this.LIZLLL)) {
            return;
        }
        ((LegacyPlayerVM) new ViewModelProvider(this.LIZIZ.LIZ.LLIIIILZ()).get(LegacyPlayerVM.class)).LLILLJJLI.setValue(new C714890S2l(this.LIZLLL, interfaceC1483670oiD));
        C0R7T c0r7t = this.LIZ;
        if (c0r7t != null) {
            c0r7t.LIZ = interfaceC1483670oiD;
        }
        this.LIZLLL = interfaceC1483670oiD;
    }

    public C714880S2k(C0R7T c0r7t, C714930S2p c714930S2p) {
        this.LIZ = c0r7t;
        this.LIZIZ = c714930S2p;
    }
}
