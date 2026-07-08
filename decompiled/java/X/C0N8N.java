package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0N8N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0N8N<CONTEXT> implements InterfaceC2258651Dap {
    public final ConcurrentHashMap<C0N23, C0N87> LJ;

    public C0N8N(int i) {
        ConcurrentHashMap<C0N23, C0N87> concurrentHashMap = new ConcurrentHashMap<>();
        MeasurementContextModules.LIZ.getClass();
        C0N8K.LIZIZ.getValue().LIZ();
        this.LJ = concurrentHashMap;
    }

    @Override // X.InterfaceC2258711Dav
    public final boolean LJIIIIZZ(C0N23 c0n23) {
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

    @Override // X.InterfaceC2258711Dav
    public final boolean LIZIZ(C0N23 c0n23, C0N87 c0n87) {
        this.LJ.get(c0n23);
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().LIZ();
        if (this.LJ.get(c0n23) == null) {
            this.LJ.put(c0n23, c0n87);
            return true;
        }
        return false;
    }
}
