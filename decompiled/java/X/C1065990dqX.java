package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementExperimentModules;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0dqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065990dqX implements InterfaceC2258641Dao {
    public static final long LIZLLL;
    public AnonymousClass0956 LIZIZ;
    public final C054G LIZ = C2296808zG.LIZ(C2296908zH.LIZ());
    public final ConcurrentHashMap<C0N23, C1065940dqS> LIZJ = new ConcurrentHashMap<>();

    static {
        MeasurementExperimentModules.LIZ.getClass();
        LIZLLL = C589110N8r.LIZIZ.getValue().LIZIZ();
    }

    @Override // X.InterfaceC2258641Dao
    public final void LIZ(InterfaceC1065950dqT interfaceC1065950dqT) {
        C09AE c09ae;
        if (this.LIZJ.remove(interfaceC1065950dqT.LJ()) != null) {
            C589080N8o.LJ(this, null, new AwS417S0200000_16(this, interfaceC1065950dqT, 3));
        }
        if (this.LIZJ.isEmpty() && (c09ae = (C09AE) this.LIZ.LL.get(C09AE.LJJLJ)) != null) {
            C23118094a.LJFF(c09ae);
        }
    }

    @Override // X.InterfaceC2258641Dao
    public final void LIZIZ(InterfaceC1065950dqT interfaceC1065950dqT) {
        boolean z;
        if (this.LIZJ.get(interfaceC1065950dqT.LJ()) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C589080N8o.LJ(this, null, new C1065980dqW(interfaceC1065950dqT));
            this.LIZJ.put(interfaceC1065950dqT.LJ(), new C1065940dqS(interfaceC1065950dqT));
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        C054G c054g = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZIZ = C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C1065920dqQ(this, null), 2);
    }
}
