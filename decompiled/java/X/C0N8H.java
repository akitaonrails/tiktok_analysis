package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0N8H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0N8H<CONTEXT> implements InterfaceC2258681Das {
    public final ConcurrentHashMap<C0N23, C0N86> LJ;
    public final Handler LJFF;

    public C0N8H(Object obj) {
        ConcurrentHashMap<C0N23, C0N86> concurrentHashMap = new ConcurrentHashMap<>();
        MeasurementContextModules.LIZ.getClass();
        BPEAHandler bPEAHandlerLIZ = C0N8K.LIZIZ.getValue().LIZ();
        this.LJ = concurrentHashMap;
        this.LJFF = bPEAHandlerLIZ;
    }

    @Override // X.InterfaceC2258851Db9
    public final boolean LIZLLL(C0N23 c0n23) {
        boolean z;
        if (this.LJ.remove(c0n23) != null) {
            z = true;
        } else {
            z = false;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().LIZ();
        return z;
    }

    @Override // X.InterfaceC2258851Db9
    public final boolean LJIIIIZZ(C0N23 c0n23, C0N86 c0n86) {
        this.LJ.get(c0n23);
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().LIZ();
        if (this.LJ.get(c0n23) == null) {
            this.LJ.put(c0n23, c0n86);
            return true;
        }
        return false;
    }
}
