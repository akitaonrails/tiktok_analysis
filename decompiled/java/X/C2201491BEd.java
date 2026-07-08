package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2201491BEd {
    public boolean LIZ = true;
    public AbstractC2201681BEw LIZIZ;
    public List<InterfaceC2201661BEu> LIZJ;

    public final void LIZ(InterfaceC2201661BEu... interfaceC2201661BEuArr) {
        if (interfaceC2201661BEuArr.length != 0) {
            if (this.LIZJ == null) {
                this.LIZJ = new ArrayList();
            }
            for (InterfaceC2201661BEu interfaceC2201661BEu : interfaceC2201661BEuArr) {
                if (interfaceC2201661BEu != null) {
                    ((ArrayList) this.LIZJ).add(interfaceC2201661BEu);
                }
            }
        }
    }
}
