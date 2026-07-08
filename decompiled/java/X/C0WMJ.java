package X;

import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WMJ extends C0WMA<InterfaceC821980WMi> {
    public final List<InterfaceC821980WMi> LIZ = new ArrayList();

    public C0WMJ(List<? extends InterfaceC821980WMi> list) {
        for (InterfaceC821980WMi interfaceC821980WMi : list) {
            C0WMA.LIZJ(interfaceC821980WMi);
            ((ArrayList) this.LIZ).add(interfaceC821980WMi);
            C08XD.LJJ(this.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(41), 7));
        }
    }

    @Override // X.C0WMA
    public final List<InterfaceC821980WMi> LIZIZ(C0WMD c0wmd) {
        return C13LP.LLIIII(this.LIZ);
    }
}
