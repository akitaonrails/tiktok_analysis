package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C350680Dow {
    public final C0E48 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1678));
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final C0E55 LIZLLL;

    public final NLETrackSlot LLJJI() {
        return this.LIZ.LLLLLLIL();
    }

    public final NLETrack LLJJIII() {
        return this.LIZ.Pt();
    }

    public final NLEModel LLZ() {
        NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
        if (!Intrinsics.LJFF("true", nLEModelLJI.getExtra("DisableGlobalEffect"))) {
            nLEModelLJI.setExtra("DisableGlobalEffect", "true");
        }
        return nLEModelLJI;
    }

    public C350680Dow(C0E48 c0e48) {
        this.LIZ = c0e48;
        this.LIZLLL = c0e48.getPlayer();
    }

    public final void LLJJ(String str, EnumC356070Dxd enumC356070Dxd) {
        if (enumC356070Dxd != null) {
            int i = C350590Don.LIZ[enumC356070Dxd.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    return;
                } else {
                    C350870DpF.LIZJ(this.LIZ, str);
                    return;
                }
            }
            C350870DpF.LIZ(this.LIZ, false);
        }
    }
}
