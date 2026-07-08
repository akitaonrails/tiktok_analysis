package X;

import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.19gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21602019gQ {
    public final InterfaceC21604919gt LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public EnumC21602519gV LJ = EnumC21602519gV.NOT_OPT;
    public int LJFF = -1;

    public final boolean LIZ() {
        if (this.LIZJ) {
            return this.LIZIZ;
        }
        return false;
    }

    public final void LIZIZ() {
        if (LIZ()) {
            if (this.LJ == EnumC21602519gV.WAIT_OPT) {
                this.LJ = EnumC21602519gV.OPT_ING;
                int childCount = this.LIZ.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewLIZ = this.LIZ.LIZ(i);
                    if (viewLIZ != null) {
                        if (this.LIZ.LIZIZ(viewLIZ)) {
                            if (LIZ()) {
                                C788440UwM.LIZIZ(viewLIZ);
                            }
                        } else if (LIZ()) {
                            C788440UwM.LIZ(viewLIZ);
                        }
                    }
                }
            }
        }
    }

    public final void LIZJ() {
        if (LIZ()) {
            EnumC21602519gV enumC21602519gV = this.LJ;
            EnumC21602519gV enumC21602519gV2 = EnumC21602519gV.NOT_OPT;
            if (enumC21602519gV == enumC21602519gV2) {
                return;
            }
            this.LJ = enumC21602519gV2;
            int childCount = this.LIZ.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = this.LIZ.LIZ(i);
                if (viewLIZ != null && LIZ()) {
                    C788440UwM.LIZIZ(viewLIZ);
                }
            }
        }
    }

    public C21602019gQ(C21602819gY c21602819gY) {
        this.LIZ = c21602819gY;
    }
}
