package X;

import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPatienceConfig;
import com.ss.android.ugc.aweme.shortvideo.experiment.UploadTargetAnimationConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436140nTY extends C2251071D8v {
    public final PublishPatienceConfig LJIJI;
    public final UploadTargetAnimationConfig LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;

    @Override // X.C2251071D8v
    public final boolean LIZLLL() {
        return ((Boolean) this.LJIL.getValue()).booleanValue();
    }

    @Override // X.C2251071D8v
    public final boolean LJ() {
        return ((Boolean) this.LJIJJLI.getValue()).booleanValue();
    }

    @Override // X.C2251071D8v
    public final long LJII() {
        return this.LJIJI.simulateProgressDuration;
    }

    @Override // X.C2251071D8v
    public final long LJIIIIZZ() {
        return this.LJIJJ.uploadTargetAnimationDurationInMs;
    }

    @Override // X.C2251071D8v
    public final long LJIIIZ() {
        return this.LJIJJ.bridgeAnimationMaxDurationMs;
    }

    @Override // X.C2251071D8v
    public final long LJIIJ() {
        return this.LJIJJ.bridgeAnimationMsPerPercent;
    }

    @Override // X.C2251071D8v
    public final float LJIIJJI() {
        return this.LJIJJ.startProgress;
    }

    public C1436140nTY(ArrayList arrayList, InterfaceC1434300nQa interfaceC1434300nQa, AwS636S0100000_22 awS636S0100000_22) {
        super(arrayList, interfaceC1434300nQa, "DefaultWavePublisher", awS636S0100000_22);
        this.LJIJI = (PublishPatienceConfig) C1434980nRg.LIZIZ.getValue();
        this.LJIJJ = (UploadTargetAnimationConfig) C1436150nTZ.LIZIZ.getValue();
        this.LJIJJLI = C452501pT.LIZIZ(new AwS171S1100000_22(this, 1));
        this.LJIL = C452501pT.LIZIZ(new AwS171S1100000_22(this, 0));
    }
}
