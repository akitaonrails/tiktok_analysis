package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0t5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651700t5E implements InterfaceC2187111Aij {
    public final ShortVideoContext LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 317));

    @Override // X.InterfaceC2187111Aij
    public final Integer LIZ() {
        if (this.LIZIZ || !Intrinsics.LJFF(this.LIZLLL.getValue(), Boolean.TRUE)) {
            return Integer.valueOf(Intrinsics.LJFF(this.LIZLLL.getValue(), Boolean.TRUE) ? this.LIZJ : C0CHQ.LIZ().LJJIIZI().LJJJJZI(1));
        }
        return 0;
    }

    public C1651700t5E(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        o.LJIIJ.getClass();
        if (C1238740iLA.LIZ().LIZJ("key_first_use_camera", true)) {
            o.LJIIJ.getClass();
            C1238740iLA.LIZ().LJI("key_first_use_camera", false);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "rear_camera", true, false)) {
                LIZIZ(0);
            } else {
                LIZIZ(1);
            }
        }
    }

    @Override // X.InterfaceC2187111Aij
    public final void LIZIZ(int i) {
        if (Intrinsics.LJFF(this.LIZLLL.getValue(), Boolean.TRUE)) {
            if (!this.LIZIZ) {
                i = 0;
            }
            this.LIZJ = i;
        } else {
            C0CHQ.LIZ().LJJIIZI().LJJLIIIJ(i);
        }
        this.LIZIZ = true;
    }
}
