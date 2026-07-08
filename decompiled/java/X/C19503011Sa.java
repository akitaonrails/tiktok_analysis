package X;

import Y.AfS138S0000000_16;
import Y.AfS198S0100000_29;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19503011Sa implements C0IVM {
    public final /* synthetic */ C1APH LIZ;
    public final /* synthetic */ long LIZIZ;

    public /* synthetic */ C19503011Sa(C1APH c1aph, long j) {
        this.LIZ = c1aph;
        this.LIZIZ = j;
    }

    public final void LIZ(boolean z) {
        C1APH c1aph = this.LIZ;
        long j = this.LIZIZ;
        c1aph.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreIo allow = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("RoomPlayer2", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            c1aph.LJJJJZI();
            return;
        }
        c1aph.LJJJJZI();
        C11QJ c11qj = C11QJ.LL;
        AfS198S0100000_29 afS198S0100000_29 = new AfS198S0100000_29(c1aph, 1);
        c11qj.getClass();
        c1aph.LLLLJI = c11qj.LJIIIZ(afS198S0100000_29, C19487811Me.LIZLLL, C19487811Me.LIZJ).LJ(j, TimeUnit.MILLISECONDS).LJIJJLI(C11S5.LIZ()).LJIJI(new AfS138S0000000_16(0), new C19773912Yf(c1aph, 0));
    }
}
