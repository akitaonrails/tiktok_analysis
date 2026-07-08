package X;

import X.AbstractC20111213mY;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20109813mK<T extends AbstractC20111213mY> {
    public InterfaceC20109713mJ LIZ;
    public Executor LIZIZ;
    public InterfaceC2373909Rx LIZJ;
    public InterfaceC1888707aX LIZLLL;
    public InterfaceC20108913mB LJ;
    public InterfaceC20112313mj LJFF;
    public boolean LJI;
    public final String LJIIIIZZ = "default_business";
    public int LJII = 32;

    public abstract AbstractC20111213mY LIZIZ(String str, C20110313mP c20110313mP, C20110013mM c20110013mM);

    public final T LIZ() {
        InterfaceC1888707aX interfaceC1888707aX = this.LIZLLL;
        if (interfaceC1888707aX == null) {
            "configProvider must be provided.".toString();
            throw new IllegalStateException("configProvider must be provided.");
        }
        InterfaceC2373909Rx interfaceC2373909Rx = this.LIZJ;
        if (interfaceC2373909Rx == null) {
            "networkExecutor must be provided.".toString();
            throw new IllegalStateException("networkExecutor must be provided.");
        }
        Executor executor = this.LIZIZ;
        if (executor == null) {
            "workerExecutor must be provided.".toString();
            throw new IllegalStateException("workerExecutor must be provided.");
        }
        InterfaceC20112313mj interfaceC20112313mj = this.LJFF;
        if (interfaceC20112313mj != null) {
            C20111613mc.LIZ = interfaceC20112313mj;
        }
        C20110013mM c20110013mM = new C20110013mM(executor, interfaceC1888707aX, this.LJ);
        C20109113mD c20109113mD = new C20109113mD(this.LIZ, interfaceC2373909Rx, executor, this.LJII);
        T t = (T) LIZIZ(this.LJIIIIZZ, new C20110313mP(c20109113mD, c20110013mM, this.LJ), c20110013mM);
        if (this.LJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(e3.g);
            sbLIZ.append(t.hashCode());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20110013mM.LIZLLL = strLIZIZ;
            c20110013mM.LIZJ = true;
            C20109913mL c20109913mL = C20109913mL.LIZLLL;
            C603850NmJ<String, C20108713m9> c603850NmJ = c20109113mD.LIZ;
            c20109913mL.getClass();
            C01GW c01gw = C20109913mL.LIZJ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C20109913mL.LIZ;
            ((ConcurrentHashMap) c01gw.getValue()).put(strLIZIZ, c603850NmJ);
        }
        return t;
    }
}
