package X;

import com.ss.android.ugc.aweme.video.simkit.picker.exp.AdPlayForDynamicBitrateExp;

/* JADX INFO: renamed from: X.0N96, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0N96 {
    public int LIZ;
    public int LIZIZ;
    public final AdPlayForDynamicBitrateExp.AdPlayConfig LIZJ = C0N97.LIZ;

    public C0N96() {
        C1479130oat.LJIIIIZZ().LJI(new InterfaceC1478780oaK() { // from class: X.0N95
            @Override // X.InterfaceC1478780oaK
            public final void LIZIZ() {
                C0N96 c0n96 = this.LIZ;
                if (c0n96.LIZJ != null) {
                    int iLJII = C1479130oat.LJII();
                    c0n96.LIZIZ++;
                    if (iLJII >= c0n96.LIZJ.minSpeedInKBps) {
                        c0n96.LIZ++;
                    } else {
                        c0n96.LIZ = 0;
                    }
                }
            }
        });
    }
}
