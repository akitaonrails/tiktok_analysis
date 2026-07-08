package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.05kP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1440305kP<MODEL> {
    public final List<InterfaceC1333005Jo<MODEL>> LIZ;
    public final C1601460rmC LIZIZ;
    public final MODEL LIZJ;
    public final AbstractC1604130rqV LIZLLL;

    public void LIZ() {
        for (InterfaceC1333005Jo<MODEL> interfaceC1333005Jo : this.LIZ) {
            try {
                interfaceC1333005Jo.LIZ(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZLLL.LJI("processor ".concat(interfaceC1333005Jo.getClass().getName()), e);
                C1AF0.LJFF(e, "feedapi");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1440305kP(List<? extends InterfaceC1333005Jo<MODEL>> list, C1601460rmC c1601460rmC, MODEL model, AbstractC1604130rqV abstractC1604130rqV) {
        this.LIZ = list;
        this.LIZIZ = c1601460rmC;
        this.LIZJ = model;
        this.LIZLLL = abstractC1604130rqV;
    }
}
